package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
//DECALRANDO UM ARRAY E ESTABELECENDO O TMANHO DELE		
		int x[] = new int[5];
//DECLARANDO VARIAVEIS		
		int n, i, aux;
//INSTANCIANDO O OBJ SCANNER
		Scanner entrada = new Scanner(System.in);
//CARREGANDO OS NÚMEROS NO VETOR
		for(i = 0; i <= 4; i++) {
			System.out.print("Digite o " +(i + 1)+ " número: ");
			x[i] = entrada.nextInt();
		}
//ORDENANDO DE FORMA CRESCENTE LAÇO COM A QUANTIDADE DE ELEMENTOS DO VETOR
		for(n = 1; n <= 5; n++) {			
//LAÇO QUE PERCORRE DA PRIMEIRA Á PENÚLTIMA POSIÇÃO DO VETOR
			for(i = 0; i <=3; i++) {
				if(x[i] > x[i + 1]) {
//SE X[I] FOR MAIOR QUE X[I + 1] aux VAI RECEBER O VALOR DE x[i];
					aux = x[i];
//O X[I] VAI RECEBER O VALOR DE X[I + 1] AQUI
					x[i] = x[i + 1];
// E POR FIM X[I + 1] VAI RECEBER O VALOR DE AUX 
					x[i + 1] = aux;
				}
		}
	}
//MOSTRANDO O VETOR ORDENADO 
	for(i = 0; i <= 4; i++) {
		System.out.print( " número : " +x[i] );
	}
 }
}

