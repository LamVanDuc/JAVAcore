package com.example.Baitap.collection.Baitap2;

import com.example.Baitap.collection.Baitap1.Baitap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Baitap2 {
    static ArrayList<Integer> arrayListA = new ArrayList<>();
   static ArrayList<Integer> arrayListB = new ArrayList<>();
    public static void main(String[] args) {
        Baitap2 baitap2 = new Baitap2();
        System.out.println("Nhap so cho mang Array:");
        String a = new Scanner(System.in).nextLine();

        System.out.println("Nhap so cho mang B");
        String b = new Scanner(System.in).nextLine();

        baitap2.inputValue(a,b);

        System.out.println("-----------------------");
        baitap2.marge(arrayListA,arrayListB);
        for (int item:
                arrayListA) {
            System.out.print(item+" ");
        }
        for (int item:
                arrayListB) {
            System.out.print(item+" ");
        }

        System.out.println("\n--------------- Intersection---------------");
        baitap2.intersection(arrayListA,arrayListB);
    }

    public void inputValue(String numberA , String numberB){

        String[] a = numberA.split(",");
        String[] b = numberB.split(",");

        for (String item: a) {
            arrayListA.add(Integer.parseInt(item));
        }
        for (String item: b) {
            arrayListB.add(Integer.parseInt(item));
        }



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
