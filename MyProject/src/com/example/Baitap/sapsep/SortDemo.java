package com.example.Baitap.sapsep;

import java.util.ArrayList;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {5,9,55,10,48,56,79,2,58,11,99,100};

        System.out.println(arr[5]);
        SortDemo sortDemo = new SortDemo();
        sortDemo.selectionSort(arr);
        for (int i = 0 ; arr.length > i ; i++){
            System.out.print(arr[i] + " - ");
        }

    }

    public int[] bubbleSort(int[] a){

       for (int i = a.length; i > 0 ; i--){

           for (int j = 1 ; i-1 >j ; j++){

               if (a[j-1] > a[j]){
                   int temp = a[j-1];
                   a[j-1] = a[j] ;
                   a[j] = temp;
               }
           }
       }
       return a;

    }

    public void selectionSort(int[] a){

        int min ;
        for (int i=0; a.length > i ; i++){
            min = i;
            for (int j = i+1 ; a.length > j ; j++){
                if (a[j] < a[min]){
                    min= j;
                }
            }
            int temp = a[i];
            a[i] = a[min] ;
            a[min] = temp;
        }
    }

}
