package listas.simples;

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public void insertarAlInicio(int valor) {
        Nodo n = new Nodo(valor);
        n.siguiente = cabeza; 
        cabeza = n;           
    }

    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}