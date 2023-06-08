public class Condicionales {
  public static void main(String[] args) {

    int edad = 12;
    int personas = 1;

    if (edad >= 18) {
      System.out.println("Usted puede entrar");
      System.out.println("Bienvenido");
    }
    else {
      if (personas >=2) {
        System.out.println("Usted es menor de edad, pero tiene permitido entrar ");
      } else {
        System.out.println("Usted no tiene permitido entrar");
      }
    }
  }
}
