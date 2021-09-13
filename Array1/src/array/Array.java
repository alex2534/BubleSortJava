package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
//INSTANCIANDO O SCANNER
		Scanner entrada = new Scanner(System.in);
//INSTANCIANDO UM ARRAY COM TAMAMHO ESPECIFICO		
		int x[] = new int[5];
//DECLARANDO VARIAVEIS 
		int j, i, aux;
//CARREGANDO OS NÚMEROS NO VETOR
		for(i = 0; i <= 4; i++) {
//ENTRE OS VALORES - ESSE (I + 1 ) E PARA MOSTRAR CADA POSIÇÃO QUE O NÚMERO ESTA			
			System.out.print("Digite o "+ (i + 1)+ "número: ");
			x[i] = entrada.nextInt();
		}
//ORDENA DE FORMA CRESCENTE LAÇO COM A QUANTIDADE DE ELEMENTOS DO VETOR -1
		for(j = 1; j <= 4; j++) {
			
//ESSLE LAÇO QUE PERCORRE DA ÚLTIMA POSIÇÃO Á POSIÇÃO J DO VETOR
		for(i = 4; i >= j; i --) {
//SE O ( X ARRAY NO INDEX) FOR MAIOR QUE O (ARRAY X NO INDEX - 1)
			if(x[i] < x[i - 1]) {
//A VARIÁVEL AUX RECEBE O VALOR DO ARRAY X[I]
				aux = x[i];
//O ARRAY X[I] RECEBE O VALOR DO ARRAY X [I - 1]
				x[i] = x[i - 1];
//E O ARRAY X[I - 1] RECEBE O VALOR DA VARIAVEL AUX
				x[i - 1] = aux;
			}
		}
	  }
		//MOSTRANDO O VETOR ORDENADO
		for(i = 0; i <=4; i++) {
			System.out.print( " número: " + x[i]);
		}
	}

}

