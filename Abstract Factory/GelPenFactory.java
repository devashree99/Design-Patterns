/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author HP
 */
public class GelPenFactory implements PenFactory {
    @Override
    public Tube createtube() {
         return new MetalTube();
    
    }

    @Override
    public Refill createrefill() {
        return new PlasticRefill(); 
    }
}
