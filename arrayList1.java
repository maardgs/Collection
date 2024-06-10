package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList1 {

	public static void main(String[] args) {
		
		// Collection ArrayList de Objetos da Classe String.

		
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 5 cores que deseja: ");
			for(int i = 0; i < 5; i++) {
				System.out.print("Cor" + (i+1) + ": \n");
				cores.add(sc.nextLine());				
				
		}
		
		System.out.println(cores);
		
		Collections.sort(cores);
		
		System.out.println("Cores ordenadas: " + cores);
		
		sc.close();
		
		}

}
