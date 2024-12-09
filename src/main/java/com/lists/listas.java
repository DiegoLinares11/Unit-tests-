package com.lists;

import java.util.ArrayList;

public class listas {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("JavaScript");
        
        System.out.println(lista.get(1)); 
        
        lista.remove("Java");
        
        for (String lenguaje : lista) {
            System.out.println(lenguaje);
        }
    }
}
