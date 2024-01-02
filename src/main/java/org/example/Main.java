package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 4, 7, 6, 5, 5, 7, 1, 9,1,1,1,1,1,1,2,4,4,5,6,7,5,4,6,5,3,4,6,34,5,56,6,6,6,6,6,6,7,7,7};
        pulisciArray(array1);
    }

    public static void pulisciArray(int[] array) {
        int[] array2 = new int[array.length];
        int indice2 = 0;
        for (int i = 0; i < array.length; i++) {
            boolean duplicato = false;
            for (int x = 0; x < indice2; x++) {
                if (array[i] == array2[x]) {
                    duplicato = true;
                    break;
                }
            }
            if (duplicato == false) {
                array2[indice2] = array[i];
                indice2++;
            }
        }
        int[] array3 = new int[indice2];
        for (int i = 0; i < indice2; i++) {
            array3[i] = array2[i];
            System.out.println(array3[i]);
        }
    }
}