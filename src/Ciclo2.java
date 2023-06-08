public class Ciclo2 {
  public static void main(String[] args) {
    int contador = 0;
    int total = 0;
    
    while (contador <= 10) {
      total = total + contador;
      contador++;

    // Mostrara cada contador con la suma por estar dentro del while
    System.out.println(total); 
      
    }    

    // Mostrara el total general sin mostrar cada contador 
    System.out.println(total);
  }
}
