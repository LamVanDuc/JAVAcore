package com.example.Baitap.collection.Baitap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Baitap1 {
    public static void main(String[] args) {
        Baitap1 baitap1 = new Baitap1();
        ArrayList<Integer> arrayListA = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        ArrayList<Integer> arrayListB = new ArrayList<>(Arrays.asList(1,4,2,3));

        baitap1.marge(arrayListA,arrayListB);




        for (int item:
                arrayListA) {
            System.out.print(item+" ");
        }
        for (int item:
             arrayListB) {
            System.out.print(item+" ");
        }

        System.out.println("\n---------------------------------");
        baitap1.intersection(arrayListA,arrayListB);



    }


    public void marge(ArrayList arrayListA , ArrayList arrayListB){

        Collections.sort(arrayListA, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });



        Collections.sort(arrayListB, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

    }

    public void  intersection(ArrayList arrayListA , ArrayList arrayListB){
        for (int i = 0 ; arrayListA.size() > i ; i++){
            for (int j= 0 ; arrayListB.size() > j ; j++){
                if (arrayListB.get(j).equals(arrayListA.get(i))) {
                    System.out.print(arrayListA.get(i)+" ");
                }
            }
        }
    }
}
