package com.example.Baitap.Baitap3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        ThucPham thucPham = new ThucPham("T001" , "002","1995/08/12" , "1997/09/13");
        System.out.println(thucPham.getTenHang() + " - NSX: "+thucPham.getNgaySanXuat() +" het han:  "+ thucPham.getNgayHetHan());
    }
}
