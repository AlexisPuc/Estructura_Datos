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
import java.util.Stack;
public class Palabra 
{
    
    private Stack<Character>pila = new Stack<Character>();
    
            public void Invertir_Palabra(String cadena)
    {
        char letras[] = cadena.toCharArray();
        for(int i=0;i<letras.length;i++)
        {
            pila.push(letras[i]);
            System.out.println("ingresando carter::"+letras[i]);
        }
        while(!pila.empty())
        {
            
            System.out.print(pila.pop());
        }
    }
   
            }
