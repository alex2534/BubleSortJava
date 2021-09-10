package array;
//IMPORTANDO SCANNER DA LIVRADIA DO JAVA UTIL
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
//INICIANDO UM ARRAY E INSTANCIANDO O TAMANHO DO ARRAY
		int x[] =  new int[10];
		int i;
//INSTANCIANDO UM OBJ SCANNER 
		Scanner entrada = new Scanner(System.in);
//RECEBENDO INFORMAÇÕES E CARREGANDO O VETOR 
		for(i = 0; i < 9; i++) {
		System.out.print(" Digite o " +(i + 1)+" número: ");
//RECEBENDO OS VALORES E PASSOANDO PARA O X[I]
		x[i] = entrada.nextInt();
		}
//ORDENANDO DE FORMA CRESCENTE
		merge(x, 0, 9);
//MOSTRANDO O VETOR ORDENADO
		for(i = 0; i <= 9; i++) {
			System.out.print(" número: " + x[i]);
		}
				
	}
	
	public static void merge(int x[], int inicio, int fim) {
		
		int meio;
		if(inicio < fim) {
//SE O INICIO FOR MENOR QUE O FIM,  O MEIO RECEBE O (inicio + fim)
			meio = (inicio + fim) / 2;
//A QUI MERGE VAI VAI TER O VALOR DE    merge(x,inicio,meio)
			merge(x, inicio, meio);
//DEPOIS O MERGER VAI TER O VALOR DE    merge(x,meio, + 1, fim);
			merge(x, meio + 1, fim);
//E O INTERCALADO VAI TER O VALOR DE 
			intercala(x, inicio, fim, meio);
		}
	}
	
	public static void intercala(int x[], int inicio, int fim, int meio) {
		
//DECLARANDO AS VARIAVEIS		
		int poslivre, inicio_vetor1, inicio_vetor2, i;
//INSTANCIANDO UM VETOR E DECLARANDO O TAMANHO DELE		
		int aux[] = new int[10];
//A VARIAVEL INICIO_VETOR1 RECEBE O VALOR DA VARIAVEL INICIO
		inicio_vetor1 = inicio;
//A VARIAVEL INICIO_VETOR2 RECEBE O VALOR DA VARIAVEL MEIO MAIS UM
		inicio_vetor2 = meio + 1;
//A VARIAVEL POSLIVRE RECEBE O VALOR DA VARIAVEL INICIO
		poslivre = inicio;
/*
 * O WHILE LOOP VAI CHECAR SE A VARIAVEL, INICIO_VETOR1 E MENOR OU IGUAL A VARIAVEL MEIO E TAMBÉM SE A VAIAVEL
 * INICIO_VETOR2 <= A VARIAVEL FIM
 * 
 */
		while(inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
/*
 * O IF STATEMENT VAIR VERIFICAR SE O ARRAY X COM O VALOR DA VARIAVEL INICIO_VETOR1 = X[INICIO_VETOR1] 
 * E MENOR OU IGUAL AO ARRAY X COM O VALOR DA VARIAVEL INICIO_VETOR2 = X[INICIO_VETOR2] 
 */			if(x[inicio_vetor1] <= x[inicio_vetor2]) {
/*
 * 	SE O ARRAY X COM O VALOR DA VARIAVEL INICIO_VETOR1 = x[inicio_vetor1]  FOR MENOR OU IGUAL AO ARRAY 
 * X COM O VALOR DA VARIAVEL INICIO_VETOR2 =  x[inicio_vetor2] ENTÃO O ARRAY AUX RECEBE O VALOR DA 
 * VARIAVEL POSLIVRE QUE RECEBE O VALOR DO ARRAY X COM O VALOR DA VARIAVEL INICIO_VETOR1 E ENTÃO A VARIAVEL 
 * INICIO_VETOR1 VAI RECEBER ELA MESMA MAIS UM
 * 
 */
				aux[poslivre] = x[inicio_vetor1];
			
				inicio_vetor1 = inicio_vetor1 + 1;
			
			}else {
/*
*SE O ARRAY X COM O VALOR DA VARIAVEL INICIO_VETOR1 NÃO FOR MENOR OU IGUAL AO ARRAY X COM O VALOR DA VARIAVEL
*INICIO_VETOR2 ENTAO O ARRAY AUX COM O VALOR DA VARIAVEL POSLIVRE RECEBE O VALOR DO ARRAY X COM O VALOR DA VARIAVEL
*INICIO2 E TANBÉM A VARIVAVEL INICIO_VETOR2 VAI RECEBER O VALOR DELA MESMA MAIS UM 
*/				aux[poslivre] = x[inicio_vetor2];
				inicio_vetor2 = inicio_vetor2 + 1;
			}
 
// E A VARIAVEL POSLIVRE VAI RECEBER ELA MESMA MAIS UM
 			poslivre = poslivre + 1;
		}
/*SE AINDA EXISTM NḾEROS NO PRIMEIRO VETOR QUE NÃO FORAM INTERCALADOS ENTÃO COM OUTRO FOR LOOP VAMOS VERIFICAR SE
 * A VARIAVEL I RECEBENDO A VARIVAEL_VETOR1 E MENOR OU IGUAL A VARIAVEL MEIO ENTÃO O ARRAY AUX COM O VALOR DA
 * VARIAVEL POSLIVRE VAI RECEBER O VALOR DO ARRAY X QUE TEM O VALOR DA VARIAVEL I, E A VARIAVEL POSLIVRE VAI 
 * RECEBER ELA MESMA MAIS UM  
 */
		for(i = inicio_vetor1; i <= meio; i++) {
			
			aux[poslivre] = x[i];
			poslivre = poslivre + 1;
		}
/*
 * SE AINDA EXISTEM NÚMEROS NO SEGUNDO VETOR QUE NÃO FORAM INTERCALADOS ENTÃO COM OUTRO FOR LOOP VAMOS VERIFICA SE
 * A VARIAVEL I COM O VALOR DA VARIAVEL INICIO_VETOR2 E MAIOR OU IGUAL A VARIAVEL FIM SE FOR ENTÃO O ARRAY 
 * AUX COM O VALOR DA VARIAVEL POSLIVRE RECEBE O VALOR DO ARRAY X COM O VALOR DA VARIAVEL I E A VARIAVEL 
 * POSLIVRE RECEBE ELA MESMA MAIS UM
 */
		for( i = inicio_vetor2; i <= fim; i++) {
			aux[poslivre] = x[i];
			poslivre = poslivre + 1;
		}
//RETORNA OS VALORES DO VETOR AUX PARA O VETOR X 
		for(i = inicio; i <= fim; i++) {
			x[i] = aux[i];
		}
		
	}	
}
