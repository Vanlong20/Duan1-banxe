/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

/**
 *
 * @author ACER
 */
public class QLChitiethoadon {

    String MaHD;
    String MaSP;
    int SoLuonMua;
    Double Gia;

    public QLChitiethoadon() {
    }

    public QLChitiethoadon(String MaHD, String MaSP, int SoLuonMua, Double Gia) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SoLuonMua = SoLuonMua;
        this.Gia = Gia;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuonMua() {
        return SoLuonMua;
    }

    public void setSoLuonMua(int SoLuonMua) {
        this.SoLuonMua = SoLuonMua;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

}
