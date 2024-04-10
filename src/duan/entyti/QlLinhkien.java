/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;


public class QlLinhkien {
  String MaLK;
   int SoLuongLK;
   String NgayNhapLK;
    String AnhLK;
    String GiaLK;
    String TenLK;

    public QlLinhkien() {
    }

    public QlLinhkien(String MaLK, int SoLuongLK, String NgayNhapLK, String AnhLK, String GiaLK, String TenLK) {
        this.MaLK = MaLK;
        this.SoLuongLK = SoLuongLK;
        this.NgayNhapLK = NgayNhapLK;
        this.AnhLK = AnhLK;
        this.GiaLK = GiaLK;
        this.TenLK = TenLK;
    }

    public String getMaLK() {
        return MaLK;
    }

    public void setMaLK(String MaLK) {
        this.MaLK = MaLK;
    }

    public int getSoLuongLK() {
        return SoLuongLK;
    }

    public void setSoLuongLK(int SoLuongLK) {
        this.SoLuongLK = SoLuongLK;
    }

    public String getNgayNhapLK() {
        return NgayNhapLK;
    }

    public void setNgayNhapLK(String NgayNhapLK) {
        this.NgayNhapLK = NgayNhapLK;
    }

    public String getAnhLK() {
        return AnhLK;
    }

    public void setAnhLK(String AnhLK) {
        this.AnhLK = AnhLK;
    }

    public String getGiaLK() {
        return GiaLK;
    }

    public void setGiaLK(String GiaLK) {
        this.GiaLK = GiaLK;
    }

    public String getTenLK() {
        return TenLK;
    }

    public void setTenLK(String TenLK) {
        this.TenLK = TenLK;
    }

   
}
