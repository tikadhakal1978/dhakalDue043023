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
public class Tetrahedron extends ThreeDimensionalShape {
    private double edge;
    
public Tetrahedron(double edge){
        this.edge = edge;
    }
    
    @Override
    public double getArea(){
        return Math.pow(edge, 2) * Math.sqrt(3);
    }
     
    @Override
    public double getVolume(){
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }
    
    
    @Override
    public String toString(){
        return "This shape is a Terahedron with an area of " + getArea() + " and a volume of " + getVolume();
    }
    
}