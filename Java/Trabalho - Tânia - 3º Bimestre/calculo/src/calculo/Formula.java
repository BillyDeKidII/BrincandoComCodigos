package calculo;

import java.io.PrintStream;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Formula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, xm, Erro = 0.01, iteracoes, Errox;
        double fa, fxm;
        int i = 0, k = 0, cont = 0;

        System.out.println("\tALGORITMO DA BISSECÇÃO:");
        System.err.println("\tAlunos: Henrique\n");

        System.out.printf("Digite o intervalo A: ");
        a = input.nextDouble();

        System.out.printf("Digite o intervalo B: ");
        b = input.nextDouble();

        xm = (a + b) / 2;

        iteracoes = (((log10(b - a)) - log10(Erro)) / log10(2));
        System.out.printf("\nNúmero de iteracoes = %.1f \n", iteracoes);

        System.err.println("\tIterações: A(n)    B(n)      X(n)      Erro(n)    f(a)     F(xm)");

        if (xm == 0) {
            System.out.println("Raiz = 0 ou possui mais de 1 raiz");
        } else {
            for (i = i + 0; i <= iteracoes + 1; i++) {
                k = i + 0;
                xm = (a + b) / 2;
                Errox = b - a;

                System.out.printf("\nIterações: %d    %.2f       %.2f      %.2f      %.2f       %.2f    %.2f", i, a, b, xm, Errox, fa = funcao(a), fxm = funcao(a) * funcao(xm));

                if (funcao(a) * funcao(xm) < 0) {
                    a = a;
                    b = xm;
                } else {
                    a = xm;
                    b = b;
                }
            }
        }
        System.err.println("Raiz = " + xm + " após " + k + " iterações:\n");
    }

    public static double funcao(double x) {
        return pow(x, 3) - 2 * x;
    }
}
