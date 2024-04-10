/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

/**
 *
 * @author ACER
 */
public class QlSanPham {
   String MaSP;
   String TenXe;
   String SoKM;
   String NgayBan;
   Double Gia;
   String Mau;
   String TinhTrang;
   String Anh;
   String SoLuong;
   String MaNCC;

    public QlSanPham() {
    }

    public QlSanPham(String MaSP, String TenXe, String SoKM, String NgayBan, Double Gia, String Mau, String TinhTrang, String Anh, String SoLuong, String MaNCC) {
        this.MaSP = MaSP;
        this.TenXe = TenXe;
        this.SoKM = SoKM;
        this.NgayBan = NgayBan;
        this.Gia = Gia;
        this.Mau = Mau;
        this.TinhTrang = TinhTrang;
        this.Anh = Anh;
        this.SoLuong = SoLuong;
        this.MaNCC = MaNCC;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getSoKM() {
        return SoKM;
    }

    public void setSoKM(String SoKM) {
        this.SoKM = SoKM;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

   

}
