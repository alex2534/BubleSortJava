# Buble_Sort_Java_melhorado
Cada elemento de posição será comparado dom o de psosição i - 1, e quando a ordenação procurada (crecente ou decrescente) é encontrada uma troca de posições etnre os elementos é feita. Assim, Um laço com a quantidade de elementos do vetor menos um será executado (for(j = 1; j < n; j++)) e dentro dele, um outro laço que percorre da última posição j, fazendo com que as posições já ordenadas não sejam mais percorridas (for(i = n -1; i >= j; i --1)).
# Buble_sort_Melhorado_2
Cada elemento de paosição i será comparado com o de posição i + 1 e, quando a ordenação que se busca (cresente ou decrescente) é encontrada, uma troca de posições entre os dados é feita. Assim, um laçco com a quantidadde de elementos do vetor, enquanto houver trocas, será executado( j = 1) e (while (j <= n && troca == 1)), e dentro dele, outro laço que percorre da primeira á penúltima posição do vetor (for(i = 0 ; i <n -1; i++)).
# Insertion_Sort_1
  Neste algoritmo de ordenação será eleito o segundo número do vetor para iniciar as comparações. Assim, os elementos á esquerda do número eleito estão sempre ordenadas de forma crescente ou decrescente. Logo, um laço com as comparações será executado do segundo elemento ao último, ou seja , na quantidade de vezes  igual ao número de elementos do vetor menos um (for(i = 1; i < n; i ++)). Enquanto existirem elementos á esquerda do número eleito para comparações e a posição que atende a ordenação que se busca não for encontrada, o laço será executado. O número eleito esta na posiçao i. Os números á esquerda do eleito estão nas posições de i -1 à 0, o laço a ser executado será (j = i - 1) e (while(j >= 0 && elemento [j] > eleito)).

# Selection_Sort
Neste algoritmo de ordenação cada número do vetor, a partir do primeiro, será eleito e comparado com o menor ou maior, dependendo da ordenação desejada, número dentre aqueles que estão à direita do eleito. Nessas comparações procura-se um número menor que o eleito (quando a ordenação for crescente) ou um maior que o eleito (quando a ordenação for decrescente ). Quando um número satisfaz as condições da ordenação desejada ( menor ou maior que o eleito), este trocará de posição com o eleito, assim, todos os números à esquerda do eleito ficam sempre ordenados. Nesse algoritmo, um laço com as comparações será executado do primerio ao penúltimo elemento, ou seja, na quantidade de vezes itual ao número de elementos do vetor menos um (for(i = 0; i < n -1; i ++)), pois as comparações são realizadas com os elementos à direita do número eleito, e o número da última posição não tem elemento à direita.
  O número eleito está na posição i. Os números à direita do eleito esão nas posições de ( i + 1 à n - 1), sendo n o número de elementos do vetor. Logo, o laço a ser executado para encontrar o menor elemento á direita do eleito será (for(j = i + 2; j <= n -1; j++)). 
  Lembrando que o primeiro elemento à direita do número eleito começa sendo considerado o menor número.


# Array_Merge_sort

  Neste algoritimo de ordenação, o vetor é dividido em vetores com a metade do tamanho do original por meio de um procedimento recursivo. Essa divisão ocorre até que o vetor fique com apenas um elemento e estes sejam orenados e intercalados. 
   Neste algoritmo, será aplicada a técnica da divisão e conquista, uma técnica recursiva que envolve três passos em cada nível da recursão:
      °Dividir o problema em um certo número de subproblemas.
      °Conquistar 



# Quick Sort
Ordenação em ordem crescente com buble sort
Estudando sobre ordenação de array em java
