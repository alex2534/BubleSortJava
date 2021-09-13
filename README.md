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
      °Conquistar os subproblemas solucionando-os recursivamente. Se os tamanhos dos subproblemas são suficientemente pequenos, então, solucionar os subproblemas de forma simples.
      Combinar as soluções dos subproblemas na solução de problema original.
          Assim, no algoritimo de ordenação por intercalação. MERGER SORT, tem-se a técnica da divisão e conquista da seguinte forma:
      Dividir: dividir a sequência de n elementos a serem ordenados em duas subsequências de n/2 elementos cada.
      Conquistar: Intercalar as duas subsequências recursivamente utilizando a ordenação por intercalação.
      Combinar: intercalar as duas subsequências ordenadas para produzir a solução.



# Quick Sort
  Neste algoritimo de ordenação o vetor ẽ particionado em dois por meio de um procedimento recursivo. Essa divisão ocorre até que o vetor fique com apenas um elemento, enquanto os demais ficam oredenados à medida que ococrre o particionamento.
  Esse algoritimo também é baseado na técnica da divisão e conquista mencionada na seção do algoritmo MERGE SORT.
  Assim, no algoritmo de ordenação rápida, QUICK SORT, tem-se a técnica da divisão e conquista da seguinte forma:
  
  Dividir: o vetor(ESSE E O VETOR COMPLETO x[p...r]) é particionado (rearranjando) em dois subvetores não vazios(ESSE E O VETOR QUE TEM A PRIMEIRA METADE DO VETOR COMPLETO x[inicio ... meio]) e (ESSE E A SEGUNDA METADE DO VETOR COMPLETO ([meio + 1 ... fim]). O índice meio é calculado como parte do processo de particionamento. Para determinar o índece meio, escolhe-se o elemento que se encontra na metade do vetor original, chamado de pivô, e rearranjam-se os elementos do vetor de forma que os que ficaram á direita de meio são maiores (ou iguauis) ao pivô.
  
  Conquistar: Os dois subvetores são ordenados (ESSA E A PRIMERIA METADE DO VETOR x[incio...meio] e  ESSA E A SEGUNDA METADE DO VETOR x[inicio+1...fim] por chamadas recursivas ao QUICK SORT.
  Combinar: durante o processo recursivo, os elementos vão sendo ordenados no próprio vetor, não exigindo nenhum processamento nesta etapa.
  
