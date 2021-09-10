package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
//INSTANCIANDO UM VETOR E DECLARANDO O SEU TAMANHO 
	static int x[] = new int  [11];
//INSTANCIANDO UM OBJ SCANNER 
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
//DECLARANDO VARIAVEIS	
		int i, qtde;
//CARREGANDO OS NÚMEROS NO VETOR ATRAVEZ DA VAIAVEL ENTRADA PASSANDO ASSIM O VALOR PARA O VETOR X[I]
		for(i = 1; i <= 10; i++) {
			System.out.print("Digite o " +i+ " número: ");
			x[i] = entrada.nextInt();
		}
		
/*TRANSFORMA O VETOR DIGITADO EM UM HEAP CADA NÓ PAI É MAIOR QUE SEUS FILHOS		
 * CHAMA CLASSE QTDE
 */
		qtde = 10;
		transforma_heap(qtde);
//ORDENANDO DE FORMA CRESCENTE CHAMA A CLASSE ORDENA 
		ordena(qtde);
//MOSTRANDO O VETOR ORDENADO 
		for(i = 1; i <= 10; i++) {
			System.out.print(" número : " + x[i]);
		}
		entrada.close();
	}
	public static void transforma_heap(int qtde) {
//CRIANDO VARIAVEIS
		int i, pai, aux;
/*USANDO O FOR LOOP PARA CHECAR SE A VARIAVEL ( I )COM O VALOR DE DA VARIAVEL ( QTDE ) DIVIDIDO POR 2 E MAIOR OU
 * IGUAL A O VALOR DA VARIAVEL ( I )   		
 */
		for( i = qtde / 2; i >= 1; i --) {
/*
 * SE O VALOR DE ( I ) FOR MAIOR OU IGUAL A ( QTDE ) DIVIDIDO POR 2 ENTAO A CLASSE HEAP_FICA( ) RECEBE   
 * O VALOR DE ( I, QTDE )
 */
			heap_fica(i, qtde);			
		}
	}
	public static void heap_fica(int i, int qtde) {
//CRIARNDO VARIAVEIS 
		int f_esq, f_dir, maior, aux;
//A VARIAVEL MAIOR RECEBE O VALOR DA VARIAVEL I		
		maior = i;
//O IF STAITMENT CHECA SE 2 VEZES O VALOR DA VARIAVEL I MAIS 1 E MENOR OU MAIOR QUE O VALOR DA VARIAVEL QTDE		
		if(2 * i + 1 <= qtde) 
		{
//O NÓ QUE ESTÁ SENDO ANALISADO TEM FILHOS PARA ESQURDA E DIREITA
/*
 * SE O IF STATEMENT QUE CHECA SE DOIS VEZES O VALOR DA VARIAVEL ( I )  MAIS UM E MENOR OU IGUAL AO VALOR DA VARIAVEL
 * QTDE E VERDADE, SE FOR VERDADE ENTÃO A VARIAVEL F_ESQ QUE E RESPONSAVEL PELO LADO ESQUREDO DO VETOR  
 * (QUE E UM  NÓ) VAI RECECEBER O VALOR DE 2 VEZES O VALOR DA VARIAVEL ( I ) MAIS UM, E A VARIAVEL F_DIR QUE 
 * E RESPONSAVEL PELO LADO DIREITO DO VETOR ( F_DIR E UM NÓ) TAMBÉM RECEBE O 2 VEZES 1;
 */			f_esq = 2 * i + 1;
			f_dir = 2 * i;
			if(x[f_esq] >= x[f_dir] && x[f_esq] > x[i]) 
				maior = 2 * i +  1;
			else if(x[f_dir] > x[f_esq] && x[f_dir] > x[i]) 
				maior = 2 * i;
		}	
		else if(2 * i <= qtde)  {
			f_dir = 2 * i;
// O NÓ QUE ESTÁ SENDO ANALISADO TEM FILHO APENAS PARA A DIREITA 
			

			if( x[f_dir] > x[i]) 
				maior = 2 * i;
			}
			if(maior != i) {
				aux = x[i];
				x[i] = x[maior];
				x[maior] = aux;
				heap_fica(maior, qtde);
			}
		
	}
	
	public static void ordena(int qtde) {
		int i, aux, ultima_posi;
		for (i = qtde; i >= 2; i --) {
			aux = x[1];
			x[1] = x[i];
			x[i] = aux;
			ultima_posi = i - 1;
			heap_fica(1, ultima_posi);
		}
	}
	
	
	

}
