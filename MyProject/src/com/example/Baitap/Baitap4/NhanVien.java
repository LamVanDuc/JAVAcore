package com.example.Baitap.Baitap4;

public class NhanVien extends KySu{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, int capBac, String nganhDaoTao, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi, capBac, nganhDaoTao);
        this.congViec = congViec;
    }
    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }


    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
