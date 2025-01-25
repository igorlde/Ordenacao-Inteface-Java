package aplication;

import model.entites.OrdenacaoJavaSort;
import model.entites.OrdenacaoQuickSort;

public class Program {
	public static void main(String[] args) {
		int[] array = new int[1000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}

		System.out.println("\nQuick sort");
		OrdenacaoQuickSort quick = new OrdenacaoQuickSort();
		quick.ordenacao(array);
		for (int aux : array) {
			System.out.print(aux + "  ");
		}
		System.out.println("\nJava Sort");
		OrdenacaoJavaSort javaSort = new OrdenacaoJavaSort();
		javaSort.ordenacaoSort(array);
		quick.ordenacao(array);
		for (int aux : array) {
			System.out.print(aux + "  ");
		}
	}
}
