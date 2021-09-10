package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x[] = new int[5];
		
		int i, j, eleito;
		
		for(i = 0; i <= 4; i++) {
			System.out.print(" Digite o " +(i + 1)+ " número: ");
			x[i] = entrada.nextInt();
		}
//ORDENANDO DE FORMA CRECENTE LAÇO COM A QUANTIDADE DE ELEMENTOS DO VETOR - 1
		for(i = 1; i <= 4; i ++) {
			
			eleito = x[i];
			j = i - 1;
//LAÇO QUE PERCORRE OS ELEMENTOS A ESQUERDA DO NÚMERO ELEITO OU ATÉ ENCONTRAR A POSIÇÃO PARA RECOLOCAÇÃO DO NÚMERO 
//ELEITO RESPEITANDO A ORDENAÇÃO PROCURADA
			while(j >= 0 && x[j] > eleito) {
				
				x[j+1] = x[j];
				j = j - 1;
				
			}
			x[j + 1] = eleito;
		}
//MOSTRANDO O VETOR ORDENADO
		for(i = 0; i <=4; i++) {
			System.out.print(" Número: " + x[i]);
		}
		
	}

	

}
