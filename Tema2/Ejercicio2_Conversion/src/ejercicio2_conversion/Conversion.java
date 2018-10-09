
package ejercicio2_conversion;

public class Conversion {
    int Decimal;
    long Binario;
    public long binario(int n){
        if (n<2)
            return n;
        else
            return (n%2)+(binario(n/2))*10;
    }
}
