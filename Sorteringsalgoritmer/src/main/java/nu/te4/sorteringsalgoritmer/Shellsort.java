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
public class Shellsort {
    public static void ShellSort(int array[]){
        for(int i = array.length/2; i > 0; i /= 2){
            for(int a = i; a < array.length; a++){
                int key = array[a];
                int j = a;
                while(j >= i && array[j - i] > key){
                    array[j] = array[j - i];
                    j -= i;
                }
                array[j] = key;
            }
        }
    }
}
