/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

/**
 *
 * @author ACER
 */
public class QlKhachHang {
    String MaKH;
    String TenKH;
    String SoDT;
    String Email;
    String DiaChi;

    public QlKhachHang() {
    }

    public QlKhachHang(String MaKH, String TenKH, String SoDT, String Email, String DiaChi) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SoDT = SoDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    

}
