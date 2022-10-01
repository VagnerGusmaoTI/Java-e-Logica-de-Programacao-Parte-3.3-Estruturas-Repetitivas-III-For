import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa5 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Exercício - teste de mesa 5

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = 4;
		y = 0;
		
		for (i = 0; i < x; i++) {
			System.out.print(i);
			System.out.println(x);
			y = y + 10;
		}

		sc.close();

	}

}
