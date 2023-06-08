public class Testing {
  public static void main(String[] args) {
    
    // Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.

    double descuentoCantidad10 = 10;
    
    // Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.

    double descuentoCantidad15 = 15;

    // Para compras superiores a $300.0, el descuento es del 20%.

    double descuentoCantidad30 = 30;

    double subTotal = 199.99;

    if(subTotal>=100.00 && subTotal<= 199.99) {
      double total = subTotal - (subTotal * (descuentoCantidad10 / 100));
      System.out.println("Su total a pagar es " + total);
    } else if (subTotal>=200.00 && subTotal<= 299.99) {
      double total = subTotal - (subTotal * (descuentoCantidad15 / 100));
      System.out.println("Su total a pagar es " + total);
    } else if (subTotal>=300.00) {
      double total = subTotal - (subTotal * (descuentoCantidad30 / 100));
      System.out.println("Su total a pagar es " + total);
    }
    
    
  }
}
