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
public class Cube extends ThreeDimensionalShape{
    private double side;
    
    public Cube(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return Math.pow(side, 2) * 6;
    }
     
    @Override
    public double getVolume(){
        return Math.pow(side, 3);
    }
    
    
     @Override
    public String toString(){
        return "In geometry, a cube is a three-dimensional solid object bounded by sis square faces, facets or sides with three meeting at each vertex";
    }
}
    