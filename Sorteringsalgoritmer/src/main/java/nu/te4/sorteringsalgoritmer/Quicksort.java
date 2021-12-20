/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.sorteringsalgoritmer;

/**
 *
 * @author Elev
 */
public class Quicksort {
    public static int quickSort(int arrayNumbers[], int low, int high){
        int pivot = arrayNumbers[high];
        int a = (low - 1);
        
        for(int b = low; b < high; b++){
            if(arrayNumbers[b] < pivot){
                a++;
                int temp = arrayNumbers[a];
                arrayNumbers[a] = arrayNumbers[b];
                arrayNumbers[b] = temp;
                
            }
        }
        int temp = arrayNumbers[a + 1];
        arrayNumbers[a + 1] = arrayNumbers[high];
        arrayNumbers[high] = temp;
        return a + 1;
    }
    public static void sort(int arrayNumbers[], int low, int high){
        if(low < high){
            int p = quickSort(arrayNumbers, low, high);
            sort(arrayNumbers, low, p - 1);
            sort(arrayNumbers, p + 1, high);
        }
    }
}
