package listas;

import java.util.Arrays;

public class ProgramaBusca2 {
	public static void main(String[] args) {
		int [] dados = {85,12,59,45,72,51};
		int alvo = 12;
		
		System.out.println("\nLista Atual: " + Arrays.toString(dados));
		System.err.println("\nProcurando pelo número: "+alvo);
		
		// 1. teste com busca linear
		int resLinear = buscaLinear(dados,alvo);
		
		System.out.println("\n[Busca Linear] - Resultado: " 
		+ (resLinear != -1 ? "encontrado no indice " + resLinear : "não encontrado"));
		
		// 2. teste com busca binária (Sem ordenar)
		int resBinariaErro = buscaBinaria(dados, alvo);
		
		System.out.println("\n[Busca Binária sem ordenar] - Resultado: " 
				+ (resBinariaErro != -1 ? "encontrado no indice " + resBinariaErro : "não encontrado(Falha)"));
		
		// 3. O jeito certo: ordenar antes da busca
		
		System.out.println("\nOrdenando a lista para a busca binária");
		Arrays.sort(dados);
		System.out.println("\nLista Ordenada: " + Arrays.toString(dados));
				
		int resBinarioCerto = buscaBinaria(dados,alvo);
		
		System.out.println("\n[Busca Binária após ordenar] - Resultado: " 
				+ (resBinarioCerto != -1 ? "encontrado no indice " + resBinarioCerto : "não encontrado"));
	}
	
	// Metodo de busca linear (Funciona Sempre)
	public static int buscaLinear (int array[], int elementoProcurado) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elementoProcurado) {
				return i;
			}
		}
		return -1;
	}
	
	//Metodo de busca binária (Requer ordenação)
	public static int buscaBinaria(int array[], int elementoProcurado) {
		int inicio = 0, fim = array.length - 1;
		
		while(inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			
			if (array[meio] == elementoProcurado) {
				return meio;
			}
			
			if (array[meio] < elementoProcurado) {
				inicio = meio+1;
			}
			else {
				fim = meio-1;
			}
			
		}
		return -1;
		
	}
	
}
