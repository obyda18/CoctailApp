/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coctail;

import java.awt.Color;

/**
 *
 * @author smart
 */
public abstract class Ingrediants {
    private String name ;
    private int calories ;

    public Ingrediants(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
        public abstract int getVolume();
 public abstract Color getColor();
    
    public  String getInfo(){
        return "Ingrediants info:" + this.getName() +"/n" + "Calories" + this.calories ;
    } 
}
