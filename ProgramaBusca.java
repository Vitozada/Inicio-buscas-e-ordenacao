package listas;
//---BUSCA ORDENADA E BUSCA LINEAR---
public class ProgramaBusca {
	public static void main(String[] args) {
		
		//criaremos um array de exemplo (para fazer a busca)
			int [] listaNumeros = {10,20,30,40,50,60,70,80,90,100};
			int alvo = 70;
			
			System.out.println("\n---Iniciando os testes de busca---");
			//testando a busca linear
			
			int posLinear = buscaLinear(listaNumeros, alvo);
			System.out.println("\nBusca linear: Elemento encontrado na posição: " + posLinear);
			
			//Testando Busca binária
			int posBinaria = buscaBinaria(listaNumeros,alvo);
					System.out.println("\nBusca binária: Elemento encontrado na posição: " + posBinaria);
			
	}
	
	public static int buscaLinear(int [] array,int elementoProcurado) {
		
		//Iniciamos um laço de repetição do primeiro ao ultimo indice
		for(int i = 0; i < array.length; i++) {
			//se o conteudo do indice atual for igual ao que procuramos ...
			if (array[i] == elementoProcurado) {
				return i;
			}
		}
		
		//se o laço terminar e nao encontrar o elemento procurado retornamos -1
		return -1;
	}
	
	//implementando a busca binaria!
	
	public static int buscaBinaria(int [] array, int elementoProcurado) {
		int inicio = 0; //Ponteiro para o começo da lista (ponto de partida)
		int fim = array.length - 1; // ponteiro para o fim da lista
		
		//enquanto houver um intervalo válido para procurar ...
		while(inicio <= fim) {
			//Calculamos o indice do meio para dividir a lista
			int meio = inicio + (fim - inicio) /2;
			
			//caso 1: O elemento esta exatamente no meio
			if (array[meio] == elementoProcurado) {
				return meio; //sucesso
			}
			
			//caso 2: O elemento procurado é maior que o meio 
			if (array[meio] < elementoProcurado) {
				inicio = meio+1; //descartamos a mentade da esquerda
			}
			
			//caso3: O elemento procurado é menor que o meio
			else {
				fim = meio - 1;
			}
			
		}
		
		//se o ponteiro "inicio" ultrapassar o "fim" o elemento não existe na lista
		return -1;
		
	}
	
}
