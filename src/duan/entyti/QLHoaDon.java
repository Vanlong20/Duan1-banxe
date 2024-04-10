/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

import java.util.List;

/**
 *
 * @author ACER
 */
public class QLHoaDon {

    String MaHD;
    String NgayMua;
    String GhiChu;
    String MaNV;
    String MaKH;
    String SanPham;
//    List<QLChitiethoadon> listSP;
    String TongTien;

    public QLHoaDon() {
    }

    public QLHoaDon(String MaHD, String NgayMua, String GhiChu, String MaNV, String MaKH, String SanPham, String TongTien) {
        this.MaHD = MaHD;
        this.NgayMua = NgayMua;
        this.GhiChu = GhiChu;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.SanPham = SanPham;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayMua() {
        return NgayMua;
    }

    public void setNgayMua(String NgayMua) {
        this.NgayMua = NgayMua;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String SanPham) {
        this.SanPham = SanPham;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

   
}
