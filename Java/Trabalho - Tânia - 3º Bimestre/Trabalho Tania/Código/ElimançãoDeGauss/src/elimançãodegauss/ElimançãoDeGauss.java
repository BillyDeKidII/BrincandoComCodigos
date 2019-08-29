/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elimançãodegauss;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ElimançãoDeGauss {

    double m32, m21, m31;
    double a11, a12, a13, a21, a22, a23, a31, a32, a33, b1, b2, b3;
    double x;
    double y;
    double z;

    double x1;
    double x2;
    double x3;

    double[][] matrizL;
    double[][] matrizU;
    double[][] c;

    public ElimançãoDeGauss(double a11, double a12, double a13, double a21, double a22, double a23, double a31,
            double a32, double a33, double b1, double b2, double b3) {
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    public void mostrar() {
        System.out.println(a11);
    }

    public void eliminacaoDeGauss() {
        double pivo;
        double teste;
        double teste2;
        if (a11 != 0) {
            pivo = a11;

            m21 = a21 / pivo;
            a21 = a21 - (m21 * a11);
            a22 = a22 - (m21 * a12);
            a23 = a23 - (m21 * a13);
            b2 = b2 - (m21 * b1);

            m31 = a31 / pivo;
            a31 = a31 - (m31 * a11);
            a32 = a32 - (m31 * a12);
            a33 = a33 - (m31 * a13);
            b3 = b3 - (m31 * b1);

            JOptionPane.showMessageDialog(null, "[ " + a11 + " ]  [ " + a12 + " ] [ " + a13 + " ]   |   [ " + b1 + " ] \n"
                    + "[ " + a21 + " ]  [ " + a22 + " ] [ " + a23 + " ]   |    [ " + b2 + " ]  \n"
                    + "[ " + a31 + " ]  [ " + a32 + " ] [ " + a33 + " ]    |    [ " + b3 + " ] ", "Primeira Interação - K = 1", 1);

            eliminacaoDeGauss2();

        } else {
            if (a21 != 0 && a31 != 0) {
                double aux1 = a21;
                double aux2 = a22;
                double aux3 = a23;
                double aux4 = b2;

                a21 = a11;
                a22 = a12;
                a23 = a13;
                b2 = b1;

                a11 = aux1;
                a12 = aux2;
                a13 = aux3;
                b1 = aux4;
            } else if (a21 == 0) {
                double aux1 = a31;
                double aux2 = a32;
                double aux3 = a33;
                double aux4 = b3;

                a31 = a11;
                a32 = a12;
                a33 = a13;
                b3 = b1;

                a11 = aux1;
                a12 = aux2;
                a13 = aux3;
                b1 = aux4;
            } else if (a31 == 0) {
                double aux1 = a21;
                double aux2 = a22;
                double aux3 = a23;
                double aux4 = b2;

                a21 = a11;
                a22 = a12;
                a23 = a13;
                b2 = b1;

                a11 = aux1;
                a12 = aux2;
                a13 = aux3;
                b1 = aux4;
            } else {
                JOptionPane.showMessageDialog(null, "Toda primeira linha = 0");
            }

            pivo = a11;

            double m21 = a21 / pivo;
            a21 = a21 - (m21 * a11);
            a22 = a22 - (m21 * a12);
            a23 = a23 - (m21 * a13);
            b2 = b2 - (m21 * b1);

            double m31 = a31 / pivo;
            a31 = a31 - (m31 * a11);
            a32 = a32 - (m31 * a12);
            a33 = a33 - (m31 * a13);
            b3 = b3 - (m31 * b1);

            JOptionPane.showMessageDialog(null, "[ " + a11 + " ]  [ " + a12 + " ] [ " + a13 + " ]   |   [ " + b1 + " ] \n"
                    + "[ " + a21 + " ]  [ " + a22 + " ] [ " + a23 + " ]   |    [ " + b2 + " ]  \n"
                    + "[ " + a31 + " ]  [ " + a32 + " ] [ " + a33 + " ]    |    [ " + b3 + " ]  \n"
                    + "(Troca de Linha por a11 ou a12 ou a13 = 0.)", "Primeira Interação - K = 1", 1);

            eliminacaoDeGauss2();

        }

    }

    public void eliminacaoDeGauss2() {
        double pivo = a22;
        m32 = a32 / pivo;

        a31 = a31 - (m32 * a21);
        a32 = a32 - (m32 * a22);
        a33 = a33 - (m32 * a23);
        b3 = b3 - (m32 * b2);

        JOptionPane.showMessageDialog(null, "[ " + a11 + " ]  [ " + a12 + " ] [ " + a13 + " ]   |   [ " + b1 + " ] \n"
                + "[ " + a21 + " ]  [ " + a22 + " ] [ " + a23 + " ]   |    [ " + b2 + " ]  \n"
                + "[ " + a31 + " ]  [ " + a32 + " ] [ " + a33 + " ]    |    [ " + b3 + " ] ", "Segunda Interação - K = 2", 1);

        calcuarTriangulo();

    }

    public void calcuarTriangulo() {

        z = b3 / a33;

        y = (b2 - a23 * z) / a22;

        x = (b1 - (a12 * y) - (a13 * z)) / a11;

        JOptionPane.showMessageDialog(null, "[ " + a11 + " " + a12 + " " + a13 + " ]     [ " + x + " ]   |   [ " + b1 + " ] \n"
                + "[ " + a21 + " " + a22 + " " + a23 + " ]  x  [ " + y + " ]   |    [ " + b2 + " ]  \n"
                + "[ " + a31 + " " + a32 + " " + a33 + " ]     [ " + z + " ]    |    [ " + b3 + " ] ", "U (UPPER)", 1);

    }

    public void calcuarTrianguloU() {

        matrizU = new double[3][3];
        matrizU[0][0] = a11;
        matrizU[0][1] = a12;
        matrizU[0][2] = a13;
        matrizU[1][0] = a21;
        matrizU[1][1] = a22;
        matrizU[1][2] = a23;
        matrizU[2][0] = a31;
        matrizU[2][1] = a32;
        matrizU[2][2] = a33;

        JOptionPane.showMessageDialog(null, "[ " + a11 + " " + a12 + " " + a13 + " ]     [ " + x + " ]  \n"
                + "[ " + a21 + " " + a22 + " " + a23 + " ]  x  [ " + y + " ] \n "
                + "[ " + a31 + " " + a32 + " " + a33 + " ]     [ " + z + " ] ", "U (UPPER)", 1);
    }

    public void eliminacaoDeGaussL() {

        matrizL = new double[3][3];
        matrizL[0][0] = 1;
        matrizL[0][1] = 0;
        matrizL[0][2] = 0;
        matrizL[1][0] = m21;
        matrizL[1][1] = 1;
        matrizL[1][2] = 0;
        matrizL[2][0] = m31;
        matrizL[2][1] = m32;
        matrizL[2][2] = 1;

        JOptionPane.showMessageDialog(null, "[ 1 ]  [ 0 ] [ 0 ]    \n"
                + "[ " + m21 + " ]  [ 1 ] [ 0 ]   \n"
                + "[ " + m31 + " ]  [ " + m32 + " ] [ 1 ]   ", "L (LOWER)", 1);

    }

    public void Multiplicacao() {

        c = new double[3][3];
        for (int i = 0; i < matrizL.length; i++) {
            for (int j = 0; j < matrizL.length; j++) {
                c[i][j] = matrizL[i][j] * matrizU[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "[ " + c[0][0] + " " + c[0][1] + " " + c[0][2] + " ]  \n"
                + "[ " + c[1][0] + " " + c[1][1] + " " + c[1][2] + " ]  \n "
                + "[ " + c[2][0] + " " + c[2][1] + " " + c[2][2] + " ]   ", "Multiplicação", 1);

    }

    public void gaussJacobi(double epsilon) {

    }

}
