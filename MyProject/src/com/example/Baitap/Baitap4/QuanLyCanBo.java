package com.example.Baitap.Baitap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyCanBo {

    ArrayList<NhanVien> nhanViens = new ArrayList<>();
    public static void main(String[] args) {
            QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while (true){

            try{
                System.out.println("1 : them can bo");
                System.out.println("2 : tim can bo theo ten");
                System.out.println("3 : Hien thi tat ca");
                System.out.println("4 : thoat khoi chuong trinh");
                System.out.println("chon : ");
                int i = new Scanner(System.in).nextInt();
                switch (i){
                    case 1 :quanLyCanBo.themCanBo();
                    break;
                    case 2 :
                        System.out.println("nhap ten can bo :");
                        String name = new Scanner(System.in).next();
                        quanLyCanBo.timKiemNhanVienTheoTen(name);
                        break;
                    case 3: quanLyCanBo.hienThiTatCa();
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

    public void themCanBo(){
        System.out.println("Nhap Ten can Bo : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhap tuoi : ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Nhap gioi tinh : ");
        String gioitinh = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi : ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhap cap bac : ");
        int capbac = new Scanner(System.in).nextInt();
        if (capbac >=1 && capbac <=10){
            System.out.println("Nhap nganh dao tao : ");
            String nghanh = new Scanner(System.in).nextLine();
            System.out.println("Nhap cong viec : ");
            String congviec = new Scanner(System.in).nextLine();

            boolean check = nhanViens.add(new NhanVien(name , age , gioitinh , diaChi , capbac , nghanh , congviec));
            if (check){
                System.out.println("Add successfully !");
            }else {
                System.out.println("Add false !");
            }
        }else{
            System.out.println("Cap bac lon hon 1  hoac nho hon 10");
        }

    }


    public void timKiemNhanVienTheoTen(String name){
        int count = 0;
        for (NhanVien item: nhanViens) {
            if (item.getHoTen().contains(name)){
                System.out.println(item.getHoTen()+" - " + item.getTuoi()+" - " + item.getGioiTinh()+" - " + item.getDiaChi() +" - " +item.getCapBac());
                count = 1;
            }
        }
        if (count == 0){
            System.out.println("khong tim thay nhan vien ten = "+name);
        }
    }


    public void hienThiTatCa(){
        for (NhanVien item: nhanViens) {
            System.out.println(item.getHoTen()+" - " + item.getTuoi()+" - " + item.getGioiTinh()+" - " + item.getDiaChi());
        }
    }


}
