import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa4 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 4

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		y = 10;
		
		for (i = 0; i < 4; i++) {
			System.out.print(i);
			y = y + i;
			System.out.println(y);
		}

		sc.close();

	}

}
