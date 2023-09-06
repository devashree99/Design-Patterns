/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package abstractfactory;

import java.util.Scanner;

public class AbstractFactory {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Pen You Want (Gelpen or Sketchpen)");
        
        String pen = s.next(); 
        
        PenFactory factory = null; 
        
        if(pen.equals("Gelpen")) {
            factory = new GelPenFactory();
        } else if (pen.equals("Sketchpen")) {
            factory = new SketchPenFactory();
        } else {
            System.out.println("Enter valid choice");
            return; 
        }
        
        Tube tube = factory.createtube(); 
        Refill refill = factory.createrefill();
        System.out.println(tube.getTubeMaterial());
        System.out.println(refill.getRefillMaterial());
        System.out.println("GelPen Created");
    }
}
