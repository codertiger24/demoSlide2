package com.example.myapplication;

public class SanPham {
    private int masp;
    private String tensp;
    private int price;
    private String linkAnh;

    public SanPham(String tensp, int price, String linkAnh) {
        this.masp = 0;
        this.tensp = tensp;
        this.price = price;
        this.linkAnh = linkAnh;
    }

    // Constructor nhận 2 tham số
//    public SanPham(String tensp, int price) {
//        this.masp = 0; // Giá trị mặc định cho masp (có thể là 0 hoặc giá trị nào đó bạn muốn)
//        this.tensp = tensp;
//        this.price = price;
//    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "masp=" + masp +
                ", tensp='" + tensp + '\'' +
                ", price=" + price +
                '}';
    }

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        this.linkAnh = linkAnh;
    }
}
