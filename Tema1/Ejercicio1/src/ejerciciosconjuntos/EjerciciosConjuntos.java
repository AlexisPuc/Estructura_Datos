
package ejerciciosconjuntos;
import java.io.*;
import OperacionesC.Vectores;


public class EjerciciosConjuntos {
    public static void main(String[] args) throws IOException {
       Vectores tabla = new Vectores();
       
       System.out.println("Conjunto vacio sin ningun elemento");
       tabla.conjuntoVacio();
       tabla.LLenar();
       
       tabla.Mostrar();
       
       System.out.println("Union conjunto a y b ");
       tabla.Union();
       System.out.println("Interseccion conjunto a y b");
       tabla.Interseccion();
       System.out.println("Diferencia conjunto a y b");
       tabla.Diferencia();
       
       tabla.insertarElemento();
       //System.out.println("Teoria del producto");
       //miercoles.Producto();
       //System.out.println("Teoria del complemento");
       //miercoles.Complemento();
        
    }
    
}
