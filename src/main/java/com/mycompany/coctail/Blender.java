package com.mycompany.coctail;

import java.awt.Color;
import java.util.ArrayList;

public class Blender {

    private ArrayList<Ingrediants> ingredients=new ArrayList<>();

    private int capacity;
    private int volume;
    private int calories;
    private Color color;
    private double calPerMl;
    private Cup cup;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
    }

    public void add(Ingrediants ingredient) throws BlenderOverFlowException {
        if (this.volume + ingredient.getVolume() > this.capacity) {
            throw new BlenderOverFlowException();
        } else {
            this.ingredients.add(ingredient);
            this.volume += ingredient.getVolume();
        }
    }

    public ArrayList<Ingrediants> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingrediants> ingredients) {
        this.ingredients = ingredients;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCalPerMl(double calPerMl) {
        this.calPerMl = calPerMl;
    }

    public void blend() {
       
        int totalR = 0;
        int totalG = 0;
        int totalB = 0;

        for (Ingrediants ing : this.ingredients) {
            totalR += ing.getColor().getRed();
            totalG += ing.getColor().getGreen();
            totalB += ing.getColor().getBlue();

            this.calories += ing.getCalories();
           
        }
        
        
        int avgR = totalR / this.ingredients.size();
        int avgG = totalG / this.ingredients.size();
        int avgB = totalB / this.ingredients.size();

        this.color = new Color(avgR, avgG, avgB);
        this.calPerMl = (double) this.calories / (double) this.volume;
        ingredients.clear();
    }

    public void pour(Cup cup) throws BlenderIsEmptyException {
        if (this.volume > 0) {
            if (this.volume < cup.getCapacity()) {
                cup.setCalories((int) (this.volume * this.calPerMl));
                this.volume = 0;
            } else {
                this.volume -= cup.getCapacity();
                cup.setCalories((int) (cup.getCapacity() * this.calPerMl));
            }
        } else {
            throw new BlenderIsEmptyException();
        }
    }
    
// public int getTotalV() {
//    int totalV = 0;
//    for (Ingrediants ing : this.ingredients) {
//        if (ing instanceof Milk milk) {
//            totalV += milk.getVolume();
//        } else if (ing instanceof Suger suger) {
//            totalV += suger.getVolume();
//        } else if (ing instanceof Fruits fruits) {
//            totalV += fruits.getVolume();
//        }
//    }
//    return totalV;
//}
    public int getCapacity() {
        return capacity;
    }

    public int getVolume() {
        return volume;
    }

    public int getCalories() {
        return calories;
    }

    public Color getColor() {
        return color;
    }

    public double getCalPerMl() {
        return calPerMl;
    }
 
   
    public String getInfo() 
    {
        return "calories: " + this.calories + "\n" + "Volum:" + this.volume + "\nCalories per cup: " + this.calPerMl ;
    }
    
}
