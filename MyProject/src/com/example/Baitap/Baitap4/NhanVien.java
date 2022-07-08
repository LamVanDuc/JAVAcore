package com.example.Baitap.Baitap4;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    @Override
    public String toString(){
        return "Ho Ten : "+ getHoTen() +" Tuoi : "+getTuoi() + " Gioi tinh : "+getGioiTinh() +" Dia chi : "+getDiaChi()+" Cong viec :"+getCongViec();
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
