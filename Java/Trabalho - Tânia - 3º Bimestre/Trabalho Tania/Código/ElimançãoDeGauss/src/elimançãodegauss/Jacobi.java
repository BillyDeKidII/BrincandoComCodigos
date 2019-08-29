/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elimançãodegauss;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Jacobi {
    double a11, a12, a13, a14, a21, a22, a23, a24, a31, a32, a33, a34;
    double episilon, x1, x2, x3;

    public Jacobi(double a11, double a12, double a13, double a14, double a21, double a22, double a23, double a24, double a31, double a32, double a33, double a34, double x1, double x2, double x3, double episilon) {
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a24 = a24;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;
        this.a34 = a34;
        this.episilon = episilon;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    
    public double[][] gausJacobi(){
        double n1 = 1, n2 = 2, n3 = 3;
        System.out.println("Cheguei aqui, o epsilon é " + episilon);
        while(Math.abs(x1) > episilon && Math.abs(x2) > episilon && Math.abs(x3) > episilon){
            n1 = (a14 + (a12*x2-1) + (a13*x3-1)) / a11;
            System.out.println("X1 aqui vale: " + n1);
            n2 = (a24 + (a21*x1*-1) + (a23*x3*-1)) / a22;
            System.out.println("X2 aqui vale: " + n2);
            n3 = (a34 + (a32*x2*-1) + (a31*x1*-1)) / a33;
            System.out.println("X3 aqui vale: " + n3);
            x1 = n1;
            x2 = n2; 
            x3 = n3;
        }
        double matriz [][] = new double [3][5];
        
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[0][2] = a13;
        matriz[0][3] = a14;
        
        matriz[0][4] = x1;
        
        matriz[1][0] = a21;
        matriz[1][1] = a22;
        matriz[1][2] = a23;
        matriz[1][3] = a24;
        
        matriz[1][4] = x2;
        
        matriz[2][0] = a31;
        matriz[2][1] = a32;
        matriz[2][2] = a33;
        matriz[2][3] = a34;
        
        matriz[2][4] = x3;
        
        return matriz;
    }
   
  
}
