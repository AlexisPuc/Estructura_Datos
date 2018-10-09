  package comprasrecursivos;

import java.util.Scanner;

public class ComprasRecursivo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese total de la compra: ");
        double c = sc.nextDouble();
        System.out.println("Ingrese el monto depositado: ");
        double m = sc.nextDouble();
        System.out.println("Cambio en monedas de: \n");
        methods mt = new methods(m, c);
    }
}
