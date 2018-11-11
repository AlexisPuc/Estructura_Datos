/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_invertido;

/**
 *
 * @author AlexisPuc
 */
import java.util.Scanner;
public class Ejercicio1_invertido {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      String palabra;
        
       Scanner teclado=new Scanner(System.in);
       System.out.print("Escribe una palabra\n");
       palabra = teclado.nextLine();
       Palabra p = new Palabra();
       System.out.print("la palabra es::\n");
       p.Invertir_Palabra(palabra);
       System.out.print("\n");
       
       
       
        
    }
    
    }
    

