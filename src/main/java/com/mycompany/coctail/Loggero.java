/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coctail;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author smart
 */
public class Loggero implements  Log{
    private  String filpath ;

    public Loggero(String filpath) {
        this.filpath = filpath;
    }

    @Override
    public void log(String msg) {
        try {
            FileWriter file= new FileWriter(this.filpath,true);
            file.write(msg+"\n");
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
}
