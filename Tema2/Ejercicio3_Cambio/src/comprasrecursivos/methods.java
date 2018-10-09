package comprasrecursivos;

public final class methods {
    private final double m0 = 200, m1 = 100, m2 = 50, m3 = 20, m4 = 10, m5 = 5, m6 = 2, m7 = 1;

    private double pagoCliente = 0;
    private double totalCompra = 0;
    int cantidadDeMonedas = 0;

    public methods(double pagoClient, double totalComp) {
        this.pagoCliente = pagoClient;
        this.totalCompra = totalComp;
        Evaluar(pagoCliente - totalCompra);
    }

    public void Evaluar(double cambio) {
        if (cambio >= m0) {
            Imprimir(cambio, totalCompra, m0);
        } else {
            if (cambio >= m1) {
                Imprimir(cambio, totalCompra, m1);
            } else {
                if (cambio >= m2) {
                    Imprimir(cambio, totalCompra, m2);
                } else {
                    if (cambio >= m3) {
                        Imprimir(cambio, totalCompra, m3);
                    } else {
                    if (cambio >= m4) {
                        Imprimir(cambio, totalCompra, m4);
                    } else {
                    if (cambio >= m5) {
                        Imprimir(cambio, totalCompra, m5);
                    } else {
                    if (cambio >= m6) {
                        Imprimir(cambio, totalCompra, m6);
                    } else {
                    if (cambio >= m7) {
                        Imprimir(cambio, totalCompra, m7);
                    } 
                }
                }
                } 
                }
                }
            }
        }
    }

    public void Imprimir(double cambio, double totalCompra, double tipoMoneda) {
        cantidadDeMonedas = (int) (cambio / tipoMoneda); 
        System.out.println(cantidadDeMonedas + " monedas de $" + tipoMoneda);
        Evaluar(cambio - tipoMoneda * cantidadDeMonedas);
        
    }
}
