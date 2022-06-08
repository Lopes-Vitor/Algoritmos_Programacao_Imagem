package exercicios;

import java.util.Scanner;

public class imagem {

	public static void main(String[] args) {
		int i, j, m[][] = new int[16][16]; // declarando variaveis e a matriz
		Scanner leitor = new Scanner(System.in); // declarando o scanner
		System.out.println("Voce podera utilizar quatro cores : Branco(0); Preto(1); Vermelho(2) e Bege(3)"); // imprimindo
																												// uma
																												// mensagem
		for (i = 0; i < 16; i++) { // Loop FOR (Enquanto i<16, +1 Faca)
			System.out.printf("Informe os elementos %da. linha ", (i + 1)); // imprimindo uma mensagem
			for (j = 0; j < 16; j++) { // Loop FOR (Enquanto j<16, +1 Faca)
				System.out.printf("m[%d][%d]", i, j); // imprimindo uma mensagem
				m[i][j] = leitor.nextInt(); // recebendo a resposta dentro da matriz
			}
			System.out.printf("\n"); // imprimindo uma mensagem
		}
		System.out.printf("\n");
		for (i = 0; i < 16; i++) { // Loop FOR (Enquanto i<16, +1 Faca)
			System.out.printf("%da. linha: ", (i + 1)); // imprimindo uma mensagem
			for (j = 0; j < 16; j++) { // Loop FOR (Enquanto j<16, +1 Faca)
				System.out.printf("%d ", m[i][j]); // imprimindo uma mensagem
			}
			System.out.printf("\n"); // imprimindo uma mensagem
		}
	}

}
