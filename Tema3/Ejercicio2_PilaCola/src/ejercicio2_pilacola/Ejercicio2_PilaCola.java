/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_pilacola;

/**
 *
 * @author AlexisPuc
 */
import java.util.Scanner;
public class Ejercicio2_PilaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        Pilas p = new Pilas();
        Cola c = new Cola();
        System.out.print ("Introduce el número de elementos a ingresar: ");
        int n = Teclado.nextInt();
        System.out.println ("\n==Introduce Elementos de la Pila");
        String e;
        for (int i=1; i<=n; i++)
        {
            System.out.println("Posicion "+i+": ");
            e=Teclado.next();
            p.insertar(e);
        }
        System.out.println ("\nEsta Correcto");
        System.out.println ("Pasando datos de la pila a una cola");
        System.out.println ("Datos introducidos a la cola correctamente");
        
        System.out.println ("\nImpresión de los elementos de la cola");        
        for (int i=1; i<=n; i++)
        {
            c.insertar(p.quitar());
            System.out.println ("Posicion "+i+": "+c.quitar());
        }
    }
    
}
