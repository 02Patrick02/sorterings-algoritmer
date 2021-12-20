/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.sorteringsalgoritmer;

import com.google.common.base.Stopwatch;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Elev
 */
public class Main {
    public static void main(String[] args){ 
        //Bubblesort bubbleSort = new Bubblesort();
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        Random rnd = new Random();
        int[] arrSort = new int[10];
        for(int i = 0;i < arrSort.length;i++){
            arrSort[i] = rnd.nextInt();
        }
        stopwatch.start();
        //Bubblesort.bubbleSort(arrSort);
        //Insertionsort.InsertionSort(arrSort);
        Shellsort.ShellSort(arrSort);
        //Mergesort.sort(arrSort, 0 , arrSort.length - 1);
        //Quicksort.sort(arrSort, 0, arrSort.length - 1);
        stopwatch.stop();
        System.out.println(stopwatch.elapsed(TimeUnit.NANOSECONDS));
        System.out.println(stopwatch.elapsed(TimeUnit.MICROSECONDS));
        System.out.println(stopwatch.elapsed(TimeUnit.SECONDS));
        /*for (int i = 0; i < arrSort.length; i++) {
            System.out.println(arrSort[i]);
        }*/ 
    }
}
