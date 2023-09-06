/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author HP
 */
public class SketchPenFactory implements PenFactory {
   
    @Override
    public Tube createtube() {
    return new FiberTube();
    }

    
    @Override
    public Refill createrefill() {
    return new SpongeRefill();
    }
    
}
