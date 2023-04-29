/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dhakal.lab1014;

/**
 *
 * @author tikad
 */
public class Square extends TwoDimensionalShape {
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return side * side;
    }
    
    @Override
    public String toString(){
        return "a square is a regular quadrilateral, which means that it has four equal sides and four equal angles. " ;
    }
}
