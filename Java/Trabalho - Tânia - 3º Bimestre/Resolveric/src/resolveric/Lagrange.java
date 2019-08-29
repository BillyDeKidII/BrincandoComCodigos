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
 * @author Rafinha
 */
public class Lagrange {
    
     ArrayList<Double> cI, cXi, cFxi;
    double x, primeiro, segundo, terceiro, quarto, pLagrange;
            
    public Lagrange(ArrayList cI, ArrayList cXi, ArrayList cFxi, double x){
        this.cI = cI;
        this.cXi = cXi;
        this.cFxi = cFxi;
        this.x = x;
    }
    
    public void resolver(){
        
        
        primeiro = ((x - cXi.get(1)) / (cXi.get(0) - cXi.get(1))) * ((x - cXi.get(2)) / (cXi.get(0) - cXi.get(2))) * ((x - cXi.get(3)) / (cXi.get(0) - cXi.get(3)));
        
        segundo = ((x - cXi.get(0)) / (cXi.get(1) - cXi.get(0))) * ((x - cXi.get(2)) / (cXi.get(1) - cXi.get(2))) * ((x - cXi.get(3)) / (cXi.get(1) - cXi.get(3)));
        
        terceiro = ((x - cXi.get(1)) / (cXi.get(2) - cXi.get(1))) * ((x - cXi.get(0)) / (cXi.get(2) - cXi.get(0))) * ((x - cXi.get(3)) / (cXi.get(0) - cXi.get(3)));
        
        quarto = ((x - cXi.get(1)) / (cXi.get(3) - cXi.get(1))) * ((x - cXi.get(2)) / (cXi.get(3) - cXi.get(2))) * ((x - cXi.get(0)) / (cXi.get(3) - cXi.get(0)));
        
        
    
        
        pLagrange = (primeiro*cFxi.get(0)) + (segundo*cFxi.get(1)) + (terceiro*cFxi.get(2)) + (quarto*cFxi.get(3));
        
        JOptionPane.showMessageDialog(null, pLagrange);
        System.out.println(pLagrange);
        
    }
    
}
