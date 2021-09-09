package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] ars) {
//INSTANCIANDO O OBJ SCANNER 
		Scanner entrada = new Scanner(System.in);
//INSTANCIANDO O ARRAY DE DECLARANDO O TAMAHO DELE
		int x[] = new int[5];
//DECLARANDO VARIAVEIS
		int n, i, aux, troca;
//CARREGANDO O NÚMEROS NO VETOR
		for(i = 0; i <= 4; i++) {
			System.out.print("Digite o " + (i + 1) + " número: ");
			x[i] = entrada.nextInt();
			
		}
//ORDENANDO DE FORMA DECRESCENTE LAÇO COM A QUANTIDADE DE ELEMENTOS DO VETOR E EQUANTO HOUVER TROCA
		n = 1;
		troca = 1;
//ENQUANTO N FOR MENOR OU IGUAL A 5 E TROCA FOR IGUAL A 1 O LOOP CONTINUA 
		while(n <= 5 && troca == 1) {
			troca = 0;
//ENQUANTO I FOR MENOR OU ITUAL A 3 O LOOP CONTINUA 
			for(i = 0; i <= 3; i++) {
				
				if(x[i] < x[i + 1]) {
//SE X[I] FOR MENOR QUE X[I + 1] TROCA RECEBE 1
					troca = 1;
//SE X[I] FOR MENOR QUE X[I + 1] AUX RECEBE 1
					aux = x[i];
//SE X[I] FOR MENOR QUE X[I + 1] ENTÃO X[I] RECEBE X[I + 1]
					x[i] = x[i + 1];
//SE X[I] FOR MENOR QUE X[I + 1] ENTÃO O X[I + 1] RECEBE AUX
					x[i + 1] = aux;
				}
			}
			n = n + 1;
		}
//MOSTRANDO O VETOR ORDENADO
		for(i = 0; i <= 4; i ++) {
			System.out.print(" Número : " + x[i]);
		}
		entrada.close();
	}

}

