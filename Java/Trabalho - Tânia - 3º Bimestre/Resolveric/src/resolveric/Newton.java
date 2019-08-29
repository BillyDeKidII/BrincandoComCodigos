/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolveric;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Newton {
    
    ArrayList<Double> cI, cXi, cFxi;
    double x, fx0x1, fx1x2, fx2x3, fx0x1x2, fx1x2x3, fx0x1x2x3, pNewton;
            
    public Newton(ArrayList cI, ArrayList cXi, ArrayList cFxi, double x){
        this.cI = cI;
        this.cXi = cXi;
        this.cFxi = cFxi;
        this.x = x;
    }
    
    public void resolver(){
        fx0x1 = (cFxi.get(1) - cFxi.get(0)) / (cXi.get(1) - cXi.get(0));
        
        fx1x2 = (cFxi.get(2) - cFxi.get(1)) / (cXi.get(2) - cXi.get(1));
        
        fx2x3 = (cFxi.get(3) - cFxi.get(2)) / (cXi.get(3) - cXi.get(2));
        
        fx0x1x2 = (fx1x2 - fx0x1) / (cXi.get(2) - cXi.get(0));
        
        fx1x2x3 = (fx2x3 - fx1x2) / (cXi.get(3) - cXi.get(1));
        
        fx0x1x2x3 = (fx1x2x3 - fx0x1x2) / (cXi.get(3) - cXi.get(0));   
    
        
        pNewton = cFxi.get(0) + (x - cXi.get(0))* fx0x1 +
                (x - cXi.get(0))*(x-cXi.get(1))*fx0x1x2 +
                (x - cXi.get(0))*(x-cXi.get(1))*(x - cXi.get(2))*fx0x1x2x3;
        
        JOptionPane.showMessageDialog(null, pNewton);
        System.out.println(pNewton);
        
    }
    
    
    
}
