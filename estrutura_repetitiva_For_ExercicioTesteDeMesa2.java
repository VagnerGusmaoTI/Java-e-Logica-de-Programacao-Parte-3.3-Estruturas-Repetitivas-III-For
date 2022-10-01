import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa2 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 2

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = 4;
		y = x + 2;

		for (i = 0; i < x; i++) {
			System.out.print(x + " " + y);
			y = y + i;
		}

		sc.close();

	}

}
