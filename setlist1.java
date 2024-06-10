package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setlist1 {

	public static void main(String[] args) {
		
		// Collection Set
		
		Set<Integer> valorIn = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int numIn = 10;

		System.out.println("Digite 10 valores inteiros não repetidos: ");

		for (int i = 0; i < numIn; i++) {
			valorIn.add(sc.nextInt());
		}
		
		System.out.println("Valores inseridos no Set: " + valorIn);
		
				
		sc.close();

	}

}
