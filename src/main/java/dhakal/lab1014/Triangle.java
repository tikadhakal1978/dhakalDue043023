/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.lab1014;

/**
 *
 * @author tikad
 */
public class Triangle extends TwoDimensionalShape {
    private double base ;
    private double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
     @Override
    public double getArea(){
        return (base * height) / 2;
    }
    
    @Override
    public String toString(){
        return "A triangle is a polygon with three edges and three vertices. It is one of the basic shapes in geometry.";
    }
}
