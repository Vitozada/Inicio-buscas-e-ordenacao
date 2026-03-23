package ado1;

import java.util.Arrays;

public class Ex1 {
	public static void main(String[] args) {
		
		
		double [] temperaturas = {18.0, 28.0, 20.0, 26.5, 19.0, 27.5, 21.0, 25.5};
		
		bubbleSort(temperaturas);
		
		double temperaturaMinima = temperaturas[0];
		double temperaturaMaxima = temperaturas[7];
		
		double mediana = (temperaturas[3] + temperaturas[4]) / 2;
		
		double amplitudeTermica = temperaturaMaxima - temperaturaMinima;
		String status = "NORMAL";
		
		if (amplitudeTermica > 15.0 && amplitudeTermica <18.0 || amplitudeTermica > 32.0	) {
			status = "CRITICO";
		}else if (amplitudeTermica >= 10.0 && amplitudeTermica <= 15.0) {
			status = "ALERTA";
		}
		
	System.out.printf("Minima: %.1f%nMaxima: %.1f%nMediana: %.1f%nAmplitude termica: %.1f%nStatus: %s", temperaturaMinima, temperaturaMaxima, mediana, amplitudeTermica, status);
		String resultado = Arrays.toString(temperaturas);
		
		System.out.println("\n" + resultado);
	
	}

	public static void bubbleSort(double[] array) {

		int n = array.length;
		boolean trocou;

		for (int i = 0; i < n - 1; i++) {
			trocou = false;

			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[j + 1]) {

					double temporario = array[j];

					array[j] = array[j + 1];
					array[j + 1] = temporario;

					trocou = true;

				}

			}

			if (!trocou) {
				break;
			}

		}

	}

}
