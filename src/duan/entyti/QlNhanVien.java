/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

/**
 *
 * @author ACER
 */
public class QlNhanVien {
   String MaNV;
   String TenNv;
   String Email;
   String DiaChi;
   Boolean GioiTinh;
   String SoDT;
   Boolean Chucvu;
   String NamSinh;

    public QlNhanVien() {
    }

    public QlNhanVien(String MaNV, String TenNv, String Email, String DiaChi, Boolean GioiTinh, String SoDT, Boolean Chucvu, String NamSinh) {
        this.MaNV = MaNV;
        this.TenNv = TenNv;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.SoDT = SoDT;
        this.Chucvu = Chucvu;
        this.NamSinh = NamSinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
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

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public Boolean getChucvu() {
        return Chucvu;
    }

    public void setChucvu(Boolean Chucvu) {
        this.Chucvu = Chucvu;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

}
