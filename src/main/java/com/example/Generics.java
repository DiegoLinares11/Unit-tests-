package com.example;

class GenericsMethods<T> {
    private T objeto;

    public GenericsMethods(T objeto){
        this.objeto = objeto;
    }

    public void setObjeto(T objeto){
        this.objeto = objeto;
    }

    public T getObjeto(){
        return objeto;
    }

    public void imprimir(){
        System.out.println(objeto.toString());
    }

    public void imprimir_Reves(){
        StringBuffer sb = new StringBuffer(objeto.toString());
        System.out.println(sb.reverse());
    }
}

public class Generics {
    public static void main(String[] args) {
      GenericsMethods<String> impStr = new GenericsMethods<String>("Hola mundo");
      impStr.imprimir();
  
      GenericsMethods<Integer> impInt = new GenericsMethods<Integer>(143);
      impInt.imprimir_Reves();
    }
  }