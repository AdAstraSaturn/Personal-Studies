public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 20.0;

    if (valorSolicitado < saldo)
      saldo -= valorSolicitado;

    System.out.println(saldo);
  }
}
