package com.example.Baitap.sapsep;

import java.util.*;

public class Baitap3 {
    static Map<String,String> tinh = new HashMap<>();
    public static void main(String[] args) {
        while (true){

            try{
                System.out.println("\n1 : them tinh");
                System.out.println("2 : sep sep theo ma tinh");
                System.out.println("3 : xoa ma tinh le va hien thi ma tinh chan");
                System.out.println("4 : thoat khoi chuong trinh");
                System.out.println("chon : ");
                int i = new Scanner(System.in).nextInt();
                switch (i){
                    case 1 :Baitap3.insert();
                        break;
                    case 2 :
                        Baitap3.sortMatinh(tinh);
                        break;
                    case 3: Baitap3.removeOdd();
                        break;
                    case 4: System.exit(0);
                        break;
                    default:
                        System.out.println("Chon sai vui long chon lai !");
                        break;
                }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }

        }
    }
    public static void insert(){
        System.out.println("Nhap ma tinh : ");
        String id = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten tinh : ");
        String name = new Scanner(System.in).nextLine();
        tinh.put(id,name);
        System.out.println("Them thanh cong !");
    }

    public static void sortMatinh(Map<String, String> tinh){


        tinh  = new TreeMap<>(tinh);

        for (Map.Entry item: tinh.entrySet()) {
            System.out.print(item.getKey()+"-" +item.getValue() + ", ");
        }
    }
    public static void removeOdd(){

        ArrayList<String> key = new ArrayList<>(tinh.keySet());

        for (int i=0 ; tinh.size() >= i ; i++) {
            int number  = Integer.parseInt(key.get(i));
            if (number %2 == 1){
                tinh.remove(key.get(i));
            }
        }
        for (Map.Entry item:
                tinh.entrySet()) {
            System.out.print(item.getValue() + " ,");
        }

    }
}
