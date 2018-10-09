/*
 * TEMA 2. RECURSIVIDAD
 * Ejercicio 1: Realiza un programa para determinar si una palabra o frase es un palíndromo
 * Fecha: 02/10/2018
 * Alumno: Puc Huchim Roberto Alexis
 */

package ejercicio1_palindromo;

import java.util.Scanner;

public class Ejercicio1_Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Palindromo palindromo1 = new Palindromo();
        System.out.println("Introduce una palabra o frase (todas minúsculas o mayúsculas por completo): ");
        String texto=Teclado.nextLine();
        texto=texto.replaceAll(" ", "");
        palindromo1.cadena=texto;
        palindromo1.tamano=texto.length()-1;
        if (Palindromo.palindromo(palindromo1.cadena, 0, palindromo1.tamano)){
            System.out.println("Es un palíndromo");
        } else{
            System.out.println("No es un palíndromo");
        }
    }
    
}
