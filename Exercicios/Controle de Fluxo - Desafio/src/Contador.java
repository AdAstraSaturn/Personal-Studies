import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			// Se o primeiro parâmetro for MAIOR que o segundo parâmetro,
			// a exceção ParametrosInvalidosException será lançada com a mensagem adequada.
			System.err.println(exception.getMessage()); // Imprime a mensagem da exceção.
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// Verifica se parametroUm é MAIOR que parametroDois e lança a exceção se for
		// verdade.
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		for (int index = 0; index <= contagem; index++) {
			// Imprime os números dentro do intervalo.
			System.out.println(parametroUm + index);
		}
	}
}
