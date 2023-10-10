import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = { "John", "Maria", "Gabriel", "Luiz", "Pablo", "Paulo", "Lucas", "Julia", "Adriano",
        "Josias" };
    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando) {
        tentativasRealizadas++;
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.println(ANSI_GREEN + "CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas
          + " TENTATIVA" + ANSI_RESET);
    } else {
      System.out.println(ANSI_RED + "NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ANSI_RESET);
    }
  }

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  static void selecaoCandidatos() {
    String[] candidatos = { "John", "Maria", "Gabriel", "Luiz", "Pablo", "Paulo", "Lucas", "Julia", "Adriano",
        "Josias" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();
      if (salarioPretendido >= salarioBase) {
        System.out.println(ANSI_GREEN + "O candidato " + candidato + " solicitou " + Math.round(salarioPretendido)
            + " e foi selecionado para a vaga" + ANSI_RESET);
        candidatosSelecionados++;
      } else {
        System.out.println(ANSI_RED + "O candidato " + candidato + " solicitou " + Math.round(salarioPretendido)
            + " e foi negado para a vaga" + ANSI_RESET);
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void analisarCandidato(double pretensaoSalarial, String candidato) {
    double salarioBase = 2000.0;
    String resultadoCandidato = pretensaoSalarial < salarioBase
        ? "LIGAR PARA O CANDIDATO " + candidato
        : pretensaoSalarial == salarioBase ? "LIGAR COM CONTRA PROPOSTA PARA O CANDIDATO " + candidato
            : "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS";

    System.out.println(resultadoCandidato);
  }
}