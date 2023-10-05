public class ExemploFor {
  public static void main(String[] args) {
    String alunos[] = { "Eduardo", "Ihully", "Josias" };

    // Para cada aluno em alunos
    for (String aluno : alunos) {
      System.out.println("O nome do aluno é: " + aluno);
    }

    // for (int index = 0; index < alunos.length; index++) {
    // System.out.println("O aluno do índice " + index + " é " + alunos[index]);
    // }
  }
}
