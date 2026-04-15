import java.util.Scanner;

public class exemploQuickSort {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Quantas pessoas deseja cadastrar no ranking?");
		int num = scr.nextInt();
		
		int [] pontuacao = new int[num];
		
		for (int i = 0; i < pontuacao.length; i++) {
			System.out.println("digite a pontuação de cada jogador "+(i+1));
			pontuacao[i]= scr.nextInt();
		}
			System.out.println("Ranking original (ordem de inserção)");
			exibirVetor(pontuacao);
			// Chamada do QuickSort: vetor indice inicial (0) e indice final (tamanho -1)
			executarquicksort(pontuacao, 0, pontuacao.length - 1);
	 
			System.out.println("\n Ranking atualizado (ordenado pelo quicksort)");
			exibirVetor(pontuacao);
	 
			scr.close();
		}
		
		//metodo principal do quicksort - divida o problema
		public static void executarquicksort(int[] vetor, int inicio, int fim) {
			//se o indice de inicio for menor que o fim, ainda há elementos para ordenar
			if(inicio<fim) {
				//a "posição" organiza o vetor em torno de um pivô e retorna o indice dele
				int indicepivo = particionar(vetor,inicio,fim);
				//chamada recursiva para ordenar os elementos à ESQUERDA do pivo
				executarquicksort(vetor,inicio,indicepivo-1);
				//chamada recursiva para ordenar os elementos à DIREITA do pivo
				executarquicksort(vetor,indicepivo+1,fim);
			}
		}
		
		//metodo que organiza os elementos em relação ao pivo
		public static int particionar(int[] vetor,int inicio, int fim) {
			//Escolhemos o último elemento do pivo (estrategia comum)
			int pivo = vetor[fim];
			//o indice I marca a posição do último elemento menor que o pivô encontrado
			int i = (inicio-1);
			//Percorre o subvetor do inicio até o penultimo elemento
			for (int j = inicio; j < fim; j++) {
				//se o elemento atual for igual ou menor ao pivô
				if(vetor[j] <= pivo) {
					i++;//Incrementa o indice de menor elemento
					
					//realiza a troca(swap) entre o elemento na posição i e j
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				
			}
			//Após o laço coloca o pivô na sua posição correta (Logo após o ultimo Menor)
			int tempPivo = vetor[i+1];
			vetor[i+1] = vetor[fim];
			vetor[fim] = tempPivo;
			//retorna a posição exata onde o pivo ficou estacionado
			return i+1;
		}
		
		//metodo auxiliar para imprimir o vetor no console
		public static void exibirVetor(int[] v) {
			for(int valor : v) {
				System.out.println("\n"+valor+" ");
			}
			System.out.println();
		}
	 
	

	}
