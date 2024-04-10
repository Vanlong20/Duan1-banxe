

package duan.entyti;

 
public class TaiKhoan {
      String MaTK;
      String MatKhau;
      boolean VaiTro;

    public TaiKhoan(String MaTK, String MatKhau, boolean VaiTro) {
        this.MaTK = MaTK;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public TaiKhoan() {
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
 
}
