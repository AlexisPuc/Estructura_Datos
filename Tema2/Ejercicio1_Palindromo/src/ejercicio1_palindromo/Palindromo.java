
package ejercicio1_palindromo;

public class Palindromo {
    String cadena;
    int tamano;
    
    //Método recursivo
    public static boolean palindromo(String cadena, int a, int z) {
        if (a!=cadena.length()/2){
            if (cadena.charAt(a)==cadena.charAt(z))
                return palindromo(cadena, a+1, z-1);
            else
                return false;
        }
        return true;
    }
            
}
