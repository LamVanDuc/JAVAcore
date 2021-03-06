package com.example.Baitap.Baitap4;

public class CongNhan extends CanBo{
    private int capBac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);

    }

    @Override
    public String toString() {
        return "Ho Ten : "+ getHoTen() +" Tuoi : "+getTuoi() + " Gioi tinh : "+getGioiTinh() +" Dia chi : "+getDiaChi()+" Cap bac : "+getCapBac();
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }
}
