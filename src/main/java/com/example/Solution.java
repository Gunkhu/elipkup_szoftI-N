/*
* File: Solution.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

public class Solution {
    public static double calcVolume(double radius1,double radius2, double height){
        double volume = Math.PI*radius1*radius2*height/3;
        return volume;
    }
}
