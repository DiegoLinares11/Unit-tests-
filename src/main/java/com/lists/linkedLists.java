package com.lists;

class Nodo {
    String valor;
    Nodo siguiente;
    
    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEncadenada {
    Nodo cabeza;
    
    public ListaEncadenada() {
        cabeza = null;
    }
    
    // Insertar al final de la lista
    public void insertar(String valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
    
    // Mostrar los elementos de la lista
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }
}

public class linkedLists {
    public static void main(String[] args) {
        ListaEncadenada lista = new ListaEncadenada();
        lista.insertar("Java");
        lista.insertar("Python");
        lista.insertar("JavaScript");
        
        // Mostrar los elementos de la lista
        lista.mostrar();
    }
}

