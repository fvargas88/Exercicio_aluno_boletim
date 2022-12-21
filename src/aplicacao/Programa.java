package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Studante;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Studante estudante = new Studante();
		
		estudante.nome = sc.nextLine();
		estudante.trimestre1 = sc.nextDouble();
		estudante.trimestre2 = sc.nextDouble();
		estudante.trimestre3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", estudante.notaFinal());
		if(estudante.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("FALTA %.2f pontos%n", estudante.pontofaltante());
		}else {
			
			System.out.println("APROVADO");
		}
		
		
		sc.close();
	}

}
