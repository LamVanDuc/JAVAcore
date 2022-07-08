package com.example.Baitap.Baitap3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThucPham {
    private String maHang;
    private String tenHang;
    private String ngaySanXuat;
    private String ngayHetHan;

    public ThucPham(String maHang, String tenHang, String ngaySanXuat, String ngayHetHan) {
        if (checkValidate(maHang)){
            if (checkValidate(tenHang)){
                if (checkValidate(formatDate(ngaySanXuat))){
                    if (checkValidate(formatDate(ngayHetHan))){
                        if (ngayHetHan.compareTo(ngaySanXuat)> 0){
                            this.maHang = maHang;
                            this.tenHang = tenHang;
                            this.ngaySanXuat = formatDate(ngaySanXuat);
                            this.ngayHetHan = formatDate(ngayHetHan);
                        }else{
                            System.out.println("ngay san xuat sau ngay het han !");
                        }
                    }else{
                        System.out.println("nhap ngay het han !");
                    }
                }else{
                    System.out.println("nhap ngay san xuat !");
                }
            }else{
                System.out.println("nhap ten hang !");
            }
        }else{
            System.out.println("nhap ma hang !");
        }
    }

    public ThucPham(String maHang) {
        this.maHang = maHang;
    }


    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (checkValidate(tenHang)){
            this.tenHang = tenHang;
        }else {
            System.out.println("set ten hang khong thanh cong");
        }
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        if (checkValidate(ngaySanXuat)){
            this.ngaySanXuat = formatDate(ngaySanXuat);
        }else {
            System.out.println("set ngay san xuat khong thanh cong");
        }

    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        if (checkValidate(ngayHetHan)){
            this.ngayHetHan = formatDate(ngayHetHan);
        }else {
            System.out.println("set ngay het han khong thanh cong");
        }

    }





    public String formatDate(String dateTime){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(dateTime);
        String strDate = simpleDateFormat.format(date);
        return strDate;
    }


    public long day(String dateStart , String dateEnd){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date start = new Date(dateStart);
        Date end = new Date(dateEnd);

        long abs = Math.abs(start.getTime() - end.getTime());
        long stra = (abs /(24*60*60*1000));
        return stra;
    }

    public boolean checkValidate(String value){
        if (value.isEmpty() ||value.isBlank()){
            return false;
        }else {
            return true;
        }
    }
}
