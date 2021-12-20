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
public class Insertionsort {
    
   public static void InsertionSort(int array[]){

        for(int a = 1; a < array.length;a++){
            int keyValue = array[a];
            int b = a - 1;
            while(b >= 0 && array[b] > keyValue){
                array[b + 1] = array[b];
                b = b - 1;
            }
            array[b + 1] = keyValue;
        }
    }
}
