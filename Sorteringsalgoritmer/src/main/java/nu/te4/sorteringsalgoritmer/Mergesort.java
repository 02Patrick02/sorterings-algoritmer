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
public class Mergesort {
    public static void mergeSort(int[] array, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        for(int i = 0; i < n1; i++){
            L[i] = array[l + i];
        }
        for(int j = 0; j < n2;j++){
            R[j] = array[m + 1 + j];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i < n1 && j  < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void sort(int[] array, int l, int r){
        if(l < r){
            int m = (l + r)/2;
            
            sort(array, l, m);
            sort(array, m + 1, r);
            mergeSort(array, l, m, r);
                    
        }
    }
}
