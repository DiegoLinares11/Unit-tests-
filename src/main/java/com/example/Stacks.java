package com.example;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack();    
        stack.push(30);
        stack.push(2);
        stack.push(21);

        System.out.println("Elemento superior: " + stack.peek());

        System.out.println("Eliminando un elemento: "+ stack.pop());

        System.out.println("Nuevo elemento superior: "+ stack.peek());

        System.out.println("Esta vacio? " + stack.isEmpty());

        System.out.println("El tamaño es: " + stack.size());
    }
}
