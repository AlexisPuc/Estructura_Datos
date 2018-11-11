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
public class Cola {
    protected Implementacion frente;
    protected Implementacion fin;
    
    public Cola()
    {
        frente = fin = null;
    }
    
    public void insertar(String elemento)
    {
        Implementacion a;
        a = new Implementacion(elemento);
        if (colaVacia()) 
        {
            frente = a;
        } else {
            fin.siguiente = a;
        }
            fin = a;
    }
    
    public String quitar()
    {
        String aux;
        if (!colaVacia())
        {
            aux = frente.elemento;
            frente = frente.siguiente;
        } else {
            return "";
        }
            return aux;
    }
    
    public boolean colaVacia()
    {
        if(frente==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
    
}

