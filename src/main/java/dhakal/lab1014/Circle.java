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
public class Circle extends TwoDimensionalShape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return radius *radius * Math.PI;
    }
    
    @Override
    public String toString(){
        return "the circle is round-shaped figure that has no corners or edges";
    
    }
    
    
    
    
}
