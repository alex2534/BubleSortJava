package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
//INSTANCIANDO UM VETOR E DECLARANDO O SEU TAMANHO
		int x[] = new int[5];
//DECLARANDO VARIAVEIS 
		int i, j, eleito, menor, pos;
//INSTANCIANDO UM OBJ SCANNER
		Scanner entrada = new Scanner(System.in);
//CARREGANDO OS NÚMEROS NO VETOR
		for(i =  0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			x[i] = entrada.nextInt();
		}
//ORDENANDO DE FORMA CRESCENTE LAÇO QUE PERCORRE DA PRIMEIRA POSIÇÃO A PENÚLTIMA POSIÇÃO DO VETOR 
//ELEGENDO UM NÚMERO PARA SER COMPARADO 
		for(i = 0; i <= 3; i++) {
			eleito = x[i];
//ENCONTRANDO O MENOR NÚMERO Á DIREITA DO ELEITO COM SUA RESPECTIVA POSIÇÃO, POSIÇÃO DO ELEITO = i PRIMEIRO
//NÚMERO Á DIREITA DO ELEITO NA POSIÇÃO = I + 1
			menor = x[i + 1];
			pos = i + 1;
//LAÇO QUE PERCORRE OS ELEMENTOS QUE ESTÃO Á DIREITA DO NÚMERO ELEITO, RETORNANDO O MENOR NÚMERIO A DIREITA
// A SUA POSIÇÃO 
			for(j = i + 2; j <= 4; j ++) {
				if(x[j] < menor) {
					menor = x[j];
					pos = j;
				}
			}
				if(menor < eleito) {
					x[i] = x[pos];
					x[pos] = eleito;
				}
			}

//MOSTRANDO O VETOR ORDENADO 
			for(i = 0; i<= 4; i++) {
				System.out.print(" Número: " + x[i]);
			
		}
		entrada.close();
	}

}
