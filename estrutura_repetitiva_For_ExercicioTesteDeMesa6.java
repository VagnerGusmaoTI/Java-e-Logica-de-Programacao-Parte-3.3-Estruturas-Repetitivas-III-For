import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa6 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 6

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = 4;
		y = 0;

		for (i = 0; i < x; i++) {
			y = y + i;
		}
		System.out.println(y);

		sc.close();

	}

}
