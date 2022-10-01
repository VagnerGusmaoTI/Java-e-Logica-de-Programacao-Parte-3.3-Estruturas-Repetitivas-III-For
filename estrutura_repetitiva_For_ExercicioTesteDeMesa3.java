import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa3 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 3

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		for (i = 1; i < 5; i++) {
			y = i - 1;
			x = i * 10;
			System.out.print(i);
		}

		sc.close();

	}

}
