package com.lists;

class Nodo {
    String valor;
    Nodo siguiente;
    Nodo anterior;
    
    // Constructor
    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
}

class DoublyLinkedList {
    Nodo cabeza;
    Nodo cola;
    
    // Constructor
    public DoublyLinkedList() {
        cabeza = null;
        cola = null;
    }

    // Insertar un nodo al final de la lista
    public void insertarAlFinal(String valor) {
        Nodo nuevoNodo = new Nodo(valor);
        
        if (cabeza == null) { // Si la lista está vacía
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else { 
            // Insertar al final de la lista
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    // Eliminar un nodo
    public void eliminar(String valor) {
        Nodo actual = cabeza;
        
        while (actual != null) {
            if (actual.valor.equals(valor)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente; // Si es el primer nodo
                }
                
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    cola = actual.anterior; // Si es el último nodo
                }
                
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Mostrar los elementos de la lista desde la cabeza hacia la cola
    public void mostrarDesdeCabeza() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }

    // Mostrar los elementos de la lista desde la cola hacia la cabeza
    public void mostrarDesdeCola() {
        Nodo actual = cola;
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.anterior;
        }
    }
}

public class EjemploDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();
        
        // Insertar elementos
        lista.insertarAlFinal("Java");
        lista.insertarAlFinal("Python");
        lista.insertarAlFinal("JavaScript");
        
        // Mostrar la lista desde la cabeza
        System.out.println("Lista desde la cabeza:");
        lista.mostrarDesdeCabeza();
        
        // Mostrar la lista desde la cola
        System.out.println("\nLista desde la cola:");
        lista.mostrarDesdeCola();
        
        // Eliminar un nodo
        lista.eliminar("Python");
        System.out.println("\nLista después de eliminar 'Python':");
        lista.mostrarDesdeCabeza();
    }
}
