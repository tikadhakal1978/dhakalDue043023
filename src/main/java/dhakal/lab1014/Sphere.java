/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.lab1014;
import java.lang.Math.*;
/**
 *
 * @author tikad
 */
public class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    
    public Sphere(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return radius *radius * 4 * Math.PI;
    }
    
    @Override
    public double getVolume(){
        return radius * radius * radius * (4/3) * Math.PI;
    }
    
    
    @Override
    public String toString(){
        return "TA sphere is a geometrical object that is a three-dimensional analogue to a two-dimensional circle";
    }
    
    
}