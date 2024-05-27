/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coctail;

public class BlenderIsEmptyException extends Exception {

    public BlenderIsEmptyException() {
        super("The blender is empty!");
    }

}
