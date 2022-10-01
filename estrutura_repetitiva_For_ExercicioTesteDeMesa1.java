import java.util.Scanner;

public class estrutura_repetitiva_For_ExercicioTesteDeMesa1 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA
		
		//Exercício - teste de mesa 1
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, i;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(i = 0; i < x; i ++) {
			System.out.print(i + ",");
			y = y+5;
			System.out.println(y);
		}
		
		
		
		sc.close();

	}

}
