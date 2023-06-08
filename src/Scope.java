public class Scope {

  public static void main(String[] args) {

    int edad = 18;
    int cantidadPersonas = 2;

    boolean esPareja;

    if (cantidadPersonas > 1) {
      esPareja = true;
    } else {
      esPareja = false;
    }

    boolean puedeEntrar = edad >= 18 && esPareja;


    if (puedeEntrar) {
      System.out.println("Usted puede entrar");
    }
    else {
      System.out.println("Usted no tiene permitido entrar");
    }
  }
  
}
