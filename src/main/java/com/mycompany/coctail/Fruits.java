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
public class Fruits extends Ingrediants{
    private int volume ;
    private Color color;

    public Fruits(int volume, Color color, String name, int calories) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return  super.getInfo() + "\n" + "Volume: " + this.volume + "\ncolor" + this.color;
    }
    
            
}
