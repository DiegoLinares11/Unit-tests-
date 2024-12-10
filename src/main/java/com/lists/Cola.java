package com.lists;

public class Cola<T> {
    private T[] cola;
    private int frente, finalCola, tamaño;

    public Cola(int tamaño) {
        this.tamaño = tamaño;
        cola = (T[]) new Object[tamaño];
        frente = 0;
        finalCola = 0;
    }

    public void enqueue(T valor) {
        if (finalCola == tamaño) {
            System.out.println("La cola está llena");
        } else {
            cola[finalCola] = valor;
            finalCola++;
            System.out.println("Elemento " + valor + " agregado a la cola.");
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null; 
        } else {
            T valor = cola[frente];
            for (int i = 0; i < finalCola - 1; i++) {
                cola[i] = cola[i + 1];
            }
            finalCola--; 
            return valor;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            return cola[frente];
        }
    }

    public boolean isEmpty() {
        return finalCola == 0;
    }

    public int size() {
        return finalCola;
    }

    public static void main(String[] args) {
        Cola<Integer> colaEnteros = new Cola<>(5);
        
        colaEnteros.enqueue(10);
        colaEnteros.enqueue(20);
        colaEnteros.enqueue(30);

        System.out.println("El primer elemento es: " + colaEnteros.peek());

        System.out.println("Elemento eliminado: " + colaEnteros.dequeue());

        System.out.println("Tamaño de la cola: " + colaEnteros.size());

        Cola<String> colaStrings = new Cola<>(3);

        colaStrings.enqueue("Hola");
        colaStrings.enqueue("Mundo");

        System.out.println("El primer elemento en cola de Strings es: " + colaStrings.peek());

        System.out.println("Elemento eliminado de la cola de Strings: " + colaStrings.dequeue());
    }
}
