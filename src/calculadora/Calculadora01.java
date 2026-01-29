package calculadora;

import java.util.Scanner;

public class Calculadora01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {

			System.out.printf("***CALCULADORA***%nDigite o primeiro número: ");

			double num1 = entrada.nextDouble();

			System.out.print("Digite o segundo número: ");

			double num2 = entrada.nextDouble();

			System.out.printf("""
					Selecione a operação:
					1 - Adição
					2 - Subtração
					3 - Multiplicação
					4 - Divisão
					""");

			int operacao = entrada.nextInt();

			double resultadoFinal;

			switch (operacao) {
			case 1:
				resultadoFinal = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + resultadoFinal);
				break;
			case 2:
				resultadoFinal = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + resultadoFinal);
				break;
			case 3:
				resultadoFinal = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + resultadoFinal);
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("Erro: divisão por zero");
					break;
				}
				resultadoFinal = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + resultadoFinal);
				break;
			default:
				System.out.println("Operação inválida");
			}

			System.out.print("Deseja fazer outra conta? (s/n): ");

			String resposta = entrada.next();

			if (!resposta.equalsIgnoreCase("s")) {
				continuar = false;
			}
		}

		entrada.close();

		System.out.println("\nCalculadora encerrada.");
	}
}