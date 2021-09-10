package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//INSTANCIANDO UM ARRAY E DECLARANDO O TAMANHO DELE
		int x[] = new int[10];
//DECLARANDO UMA VARIAVEL
		int i;
//INSTANCIANDO UM OBJ SCANNER 
		Scanner entrada = new Scanner(System.in);
//CARREGANDO OS NÚMEROS NO VETOR 
		for(i = 0; i <= 9; i++) {
			System.out.print("Digite o " + (i + 1)+ " número: ");
			x[i] = entrada.nextInt();
		}
//ORDENANDO O VETOR DE FORMA CRESCENTE 
		quicksort(x, 0 , 9);
//MOSTRANDO O VETOR ORDENADO
		System.out.print("Vetor Ordenado ");
//FOR LOOP
		for ( i = 0 ; i <= 9; i++) {
			System.out.print(" " + x[i]);
		}
		
	}
	
	public static void troca(int x[], int i, int j) {
//DECLARANDO VARIVEIS 		
		int aux;
		aux = x[i];
		x[i] = x[j];
		x[j] = aux;
		
	}
	
	public static int particao(int x[], int p, int r) {
//DECLARANDO VARIAVEIS
		int pivo, i, j;
		pivo = x[(p+r)/2];
		i = p - 1;
		j = r +1;
//WHILE LOOP VERIFICA SE I E MENOR QUE J SE FOR O LOOP RODA
		while(i < j) {
			do {
//sE I FOR MENOR QUE O J ENTÃO O J RECEBE ELE MESMO E SUBTRAI UM 
				j = j -1;
			}
//WHILE LOOP VERIFICA SE O ARRAY X COM O VALOR DA VARIAVEL J E MAIOR QUE PIVO SE FOR O LOOP RODA 
			while(x[j] > pivo);
			do {
//SE O ARRAY X COM O VALOR DA VARIAVEL J FOR MAIOR QUE PIVO ENTÃO A VARIAVEL I RECEBE ELA MESMA E ADICIONA UM
				i = i + 1;
			}
//WHILE LLP VERIFICA SE O VETOR X COM O VALOR DA VARIAVEL I E MENOR QUE A VARIAVEL PIVO SE FOR O LOOP RODA
			while (x[i] < pivo);
//IF ESTATMENT VERIFICA SE A VARIAVEL I E MENOR QUE A VARIAVEL J SE FOR A ENTÃO A CLASSE TROCA E IGUAL  X, I, J
			if(i < j ) troca(x, i, j);
		}
//E RETORNA O J 
		return j;
		
	}
	public static void quicksort(int x[], int p, int r) {
		int q;
		if(p < r) {
			q = particao(x,p,r);
			quicksort(x,p,q);
			quicksort(x,q+1,r);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
