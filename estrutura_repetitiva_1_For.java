import java.util.Scanner;

public class estrutura_repetitiva_1_For {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// É uma estrutura de controle que repete um bloco de comandos para um certo
		// intervalo de valores.

		// Quando usar: quando se sabe previamente a quantidade de
		// repetições, ou o intervalo de valores.

		// Sintaxe / regra

		// início = Executa somente na primeira vez
		// condição = V: executa e volta, F: pula fora
		// incremento = Executa toda vez depois de voltar

		// for ( início ; condição ; incremento) {
		// comando 1
		// comando 2
		// }

		// Exemplo:
		// Fazer um programa que lê um valor inteiro N (a quantidade denúmeros que vai
		// digitar) e depois N números inteiros.
		// Ao final, mostra a soma dos N números lidos/digitados

		// Entrada: 3(o três refere-se a quantidade denúmeros que vai digitar) 5 2 4 /
		// Saída: 11

		Scanner sc = new Scanner(System.in);

		int n, i, soma, x;

		n = sc.nextInt();

		soma = 0;

		for (i = 0; i < n; i = i + 1 /* ou i++ */) {
			x = sc.nextInt();
			soma = soma + x;

		}

		System.out.println(soma);
		System.out.println('\n');

		// Importante

		// Perceba que a estrutura "para" é ótima para se fazer uma repetição
		// baseada em uma CONTAGEM:

		// Contagem progressiva:

		// Resultado na tela:

		// Valor de i: 0
		// Valor de i: 1
		// Valor de i: 2
		// Valor de i: 3
		// Valor de i: 4

		for (int y = 0; y < 5; y++) {
			System.out.println("Valor de i: " + y);
		}

		System.out.println('\n');

		// Contagem regressiva:

		// Resultado na tela:

		// Valor de i: 4
		// Valor de i: 3
		// Valor de i: 2
		// Valor de i: 1
		// Valor de i: 0

		for (int a = 4; a >= 0; a--) {
			System.out.println("Valor de i: " + a);
		}

		// Resumo da aula

		// Estrutura repetitiva "para" - for
		// Usar quando se sabe previamente a quantidade de repetições
		// Ótimo para fazer contagens (progressiva ou regressiva)

		sc.close();

	}

}
