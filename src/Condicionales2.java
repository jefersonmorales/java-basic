public class Condicionales2 {
  public static void main(String[] args) {

    int edad = 18;
    int cantidadPersonas = 2;

    boolean acompanado = cantidadPersonas >= 2;
    boolean permisoEntrar = edad >= 18 && acompanado;
    

    if (permisoEntrar) {
      System.out.println("Usted puede entrar");
    }
    else {
      System.out.println("Usted no tiene permitido entrar");
    }
  }
}
