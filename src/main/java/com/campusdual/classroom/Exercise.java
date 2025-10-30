package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise {


    public static int[] createAndInitializeArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = i + 1;
        }
        return array;
    }
    public static void showInlineArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // imprimir el número
            if (i < array.length - 1) {
                System.out.print(" "); // espacio entre números
            }
        }
        System.out.println(); // salto de línea al final
    }

    public static void main(String[] args) {
        int n = Utils.integer("Introduce la cantidad de número naturales: ");
        int[] numbers = createAndInitializeArray(n);
        showInlineArray(numbers);

    }
}
