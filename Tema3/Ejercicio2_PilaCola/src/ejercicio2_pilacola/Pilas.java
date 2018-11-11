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
public class Pilas {
     private Implementacion cima;
 
    public Pilas()
    {
        cima = null;
    }
    
    public void insertar(String elemento)
    {
        Implementacion nuevo;
        nuevo = new Implementacion(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
       
    public String quitar()
    {                 
        String aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
}
