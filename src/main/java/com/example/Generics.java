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

class caja<T>{
    private T contenido;

    public void ponerContenido(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }

}

class dosTipos<T,U>{
    private T primer;
    private U segundo;

    public dosTipos(T primer, U segundo) {
        this.primer = primer;
        this.segundo = segundo;
    }
    public T getPrimer() {
        return primer;
    }
    public void setPrimer(T primer) {
        this.primer = primer;
    }
    public U getSegundo() {
        return segundo;
    }
    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }
    @Override
    public String toString() {
        return "dosTipos [primer=" + primer + ", segundo=" + segundo + "]";
    }    
    
}
public class Generics {
    public static void main(String[] args) {
      GenericsMethods<String> impStr = new GenericsMethods<String>("Hola mundo");
      impStr.imprimir();
  
      GenericsMethods<Integer> impInt = new GenericsMethods<Integer>(143);
      impInt.imprimir_Reves();

      caja<String> cajita = new caja<>();
      cajita.ponerContenido("Hola");
      System.out.println(cajita.obtenerContenido());

      caja <Integer> cajaNums = new caja<>();
      cajaNums.ponerContenido(1);
      cajaNums.ponerContenido(3);
      System.out.println(cajaNums.obtenerContenido());

      // genericos con multiples parametros
      dosTipos<String, Integer> numsAndStr = new dosTipos<>("Hello", 1);
      dosTipos<Double, Character> par2 = new dosTipos<>(3.1416, 'A');

      System.out.println("Par 1 " + numsAndStr);
      System.out.println("Par 2: " + par2);

    }


  }