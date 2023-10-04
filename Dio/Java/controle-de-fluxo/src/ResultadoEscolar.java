public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 1;

    // if (nota >= 7) // Estruturas condicionais sempre precisam retornar true ou
    // System.out.println("Aprovado");
    // else if (nota >= 5 && nota < 7)
    // System.out.println("Recuperação");
    // else
    // System.out.println("Reprovado");

    // Código refatorado

    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);

  }
}
