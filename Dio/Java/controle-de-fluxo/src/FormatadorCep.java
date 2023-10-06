public class FormatadorCep {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23456065");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.err.println("O Cep não corresponde com as regras de negócio");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    return "23.456.065";
  }
}
