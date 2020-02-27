package forca.pro.judas;

import java.util.Scanner;

public class ForcaProJudas {

    public static void main(final String[] args) {
      final Scanner keyboard = new Scanner(System.in);
      final String secreta = "microfone";
      final char[] copia = new char[secreta.length()];
      System.out.println(secreta);
      for (int i = 0; i < secreta.length(); i++) {
        // System.out.print("_ ");
        copia[i] = '_';
        System.out.print(copia[i] + " ");
      }
      do {
        System.out.println("");
        System.out.println(" Insira a letra ");
        final char tentativa = keyboard.next().charAt(0);
        for (int i = 0; i < secreta.length(); i++)
        {
          if(tentativa == secreta.charAt(i))
            {
              copia[i] = tentativa;             
            }
          System.out.print(copia[i] + " ");
          }
          }while(true);
        }
    }   