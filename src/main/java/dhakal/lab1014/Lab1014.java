/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.lab1014;

/**
 *
 * @author tikad
 */
public class Lab1014 {

    public static void main(String[] args) {
       Shape[] shapes = new Shape[6];
       
       shapes[0] = new Circle(8.45);
       shapes[1] = new Square(9.50);
       shapes[2] = new Triangle(5.6, 7.4);
       shapes[3] = new Sphere(4.4);
       shapes[4] = new Cube(3.3);
       shapes[5] = new Tetrahedron(2.2);
       
       for(int i = 0; i < 6; i++){
           System.out.println(shapes[i]);
           System.out.println("Area: " + shapes[i].getArea());
           if (shapes[i] instanceof ThreeDimensionalShape) {
               System.out.println("Volume: " + shapes[i].getVolume());
           }
       }
       
    }
}
