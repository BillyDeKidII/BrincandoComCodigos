/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinômios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Polinômios {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public Polinômios(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    
    int descobrirGrau(int a, int b, int c, int d, int e, int f){
        int i = 5;
        if(a == 0){
            i--;
            if(b == 0){
                i--;
                if (c == 0){
                    i--;
                    if(d == 0){
                        i--;
                        if(e == 0){
                            i--;
                        }
                    }
                }
            }
        }
        
        return i;
    }
    
    String calcularBaskhara(int a, int b, int c, int d, int e, int f){
        int grau = descobrirGrau(a,b,c,d,e,f);
        ArrayList divisores = new ArrayList();
        ArrayList divisoresf = new ArrayList();
        
        for(int i = 1; i <= f; i++){
                    if(f%i == 0){
                        divisoresf.add(i);
           
                    }
                }
        switch (grau) {
            case 5:
                for(int i = 1; i <= a; i++){
                    if(a%i == 0){
                        divisores.add(i);
           
                    }
                }   break;
            case 4:
                for(int i = 1; i <= b; i++){
                    if(b%i == 0){
                        divisores.add(i);
                    }
                }   break;
            case 3:
                for(int i = 1; i <= c; i++){
                    if(c%i == 0){
                        divisores.add(i);
                    }
                }   break;
            case 2:
                for(int i = 1; i <= d; i++){
                    if(d%i == 0){
                        divisores.add(i);
                    }
                }   break;
            case 1:
                for(int i = 1; i <= e; i++){
                    if(e%i == 0){
                        divisores.add(i);
                    }
                }   break;
            default:
                break;
        }
        
        Set PsobreQ = new HashSet();
        
        for(int i = 0; i < divisoresf.size(); i++){
            for(int j = 0; j < divisores.size(); j++){
                double numeropsobreq = (int)divisoresf.get(i) / (int)divisores.get(j);
                PsobreQ.add((double)numeropsobreq); 
            }
        }
        
        
        
        
        
    return divisoresf + "\n" + divisores + "\n" + 
            "p/q:" + PsobreQ;
    }
    
    
    
}


