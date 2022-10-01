import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa7 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 7

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = 8;
		y = 3;

		for (i = 0; y < x; i++) {
			x = x - 2;
			y = y + 1;
			System.out.println(i);
		}

		sc.close();

	}

}
