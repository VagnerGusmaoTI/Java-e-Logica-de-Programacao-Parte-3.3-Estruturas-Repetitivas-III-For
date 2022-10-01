import java.util.Scanner;

public class estrutura_repetitiva_1_For {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// � uma estrutura de controle que repete um bloco de comandos para um certo
		// intervalo de valores.

		// Quando usar: quando se sabe previamente a quantidade de
		// repeti��es, ou o intervalo de valores.

		// Sintaxe / regra

		// in�cio = Executa somente na primeira vez
		// condi��o = V: executa e volta, F: pula fora
		// incremento = Executa toda vez depois de voltar

		// for ( in�cio ; condi��o ; incremento) {
		// comando 1
		// comando 2
		// }

		// Exemplo:
		// Fazer um programa que l� um valor inteiro N (a quantidade den�meros que vai
		// digitar) e depois N n�meros inteiros.
		// Ao final, mostra a soma dos N n�meros lidos/digitados

		// Entrada: 3(o tr�s refere-se a quantidade den�meros que vai digitar) 5 2 4 /
		// Sa�da: 11

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

		// Perceba que a estrutura "para" � �tima para se fazer uma repeti��o
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
		// Usar quando se sabe previamente a quantidade de repeti��es
		// �timo para fazer contagens (progressiva ou regressiva)

		sc.close();

	}

}
