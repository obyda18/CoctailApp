package com.mycompany.coctail;

public class Cup {

    private int capacity;

    private int calories;

    public Cup() {
    }

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Cup(int capacity, int calories) {
        this.capacity = capacity;
        this.calories = calories;
    }
    
    public void setCalories(int calories){
        this.calories = calories;
    }

    
    public String getInfo() {
        return "Cup info:" + "capacity=" + capacity + ", calories=" + calories ;
    }
    
    
    
}