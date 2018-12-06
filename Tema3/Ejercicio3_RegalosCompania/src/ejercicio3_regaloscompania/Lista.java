package ejercicio3_regaloscompania;

public class Lista {
    protected Nodo inicio, fin; //Punteros para saber donde está el inicio y el fin
    public Lista() {
        inicio= null;
        fin= null;
    }
    
    //Metodo para agregar un nodo al inicio de la lista
    public void AgregarAlInicio(String d, String t) {
        //Creando al nodo
        inicio = new Nodo(d, t, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.Nombre+", "+recorrer.Telefono+"]-->");
            recorrer=recorrer.siguiente;
        }
    }
    
    public String quitar()
    {
        String aux;
        if (!listaVacia())
        {
            aux = inicio.Nombre;
            inicio = inicio.siguiente;
        } else {
            return "";
        }
            return aux;
    }
    
    public boolean listaVacia()
    {
        if(inicio==null)
        {
            return true;                   
        }else {
            return false;
        }
    }
}
