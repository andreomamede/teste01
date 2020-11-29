package com.teste01.exercicio02;

/**
 * Classe responsável pelo cálculo de ordenação de um array.
 */
public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 7, 1, 0, 6};

        System.out.println("Array antes da ordenação");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//executando a ordenação do array de input

        System.out.println("Array depois da ordenação");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}