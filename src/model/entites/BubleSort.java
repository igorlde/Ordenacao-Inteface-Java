package model.entites;

import model.service.EstrategiaOrdenacao;

public class BubleSort implements EstrategiaOrdenacao {

	int[] array;

	public BubleSort() {
	}


	@Override
	public void ordenacao(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {

					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

}
