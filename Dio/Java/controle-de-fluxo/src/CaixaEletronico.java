public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 29.0;

    System.out.println(saldo <= valorSolicitado);
    
    if (valorSolicitado < saldo)
      saldo -= valorSolicitado;
    else
      System.out.println("Saldo insuficiente!");

    System.out.println(saldo);
  }
}
