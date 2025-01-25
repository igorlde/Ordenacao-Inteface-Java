package model.entites;

import model.service.EstrategiaOrdenacao;

public class OrdenacaoQuickSort implements EstrategiaOrdenacao {

	public OrdenacaoQuickSort() {
	}

	@Override
	public void ordenacao(int[] array) {
		ordenacaoQuick(array, 0, array.length - 1);

	}

	public void ordenacaoQuick(int[] array, int i, int j) {
		if (i < j) {
			int pi = partition(array, i, j);

			ordenacaoQuick(array, i, pi - 1);
			ordenacaoQuick(array, pi + 1, j);

		}
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;

			}
		}
		int aux = array[i + 1];
		array[i + 1] = array[high];
		array[high] = aux;
		return i + 1;
	}

}
