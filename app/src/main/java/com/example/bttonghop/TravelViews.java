package com.example.bttonghop;

public class TravelViews {
    private int HinhAnh;
    private String Ten,Mota;

    public TravelViews(int hinhAnh, String ten, String mota) {
        HinhAnh = hinhAnh;
        Ten = ten;
        Mota = mota;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }
}
