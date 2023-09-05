/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory.method;

public class FactoryMethod {
    public static void main(String[] args) {
       ShapeFactory cf = new CircleFactory();
       Shape obj = cf.createShape();
       obj.draw();
       
       
       ShapeFactory sf = new SquareFactory();
       Shape obj1 = sf.createShape();
       obj1.draw();
    }
    
}
