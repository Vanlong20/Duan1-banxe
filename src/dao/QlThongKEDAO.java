package dao;


import duan.entyti.QLThongKe;
import duan.entyti.QLThongKe;
import duan.entyti.edusys;
import duan.entyti.jdbchelper;
import duan.entyti.jdbchelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class QlThongKEDAO {
    String INSERT_SQL = "INSERT INTO SanPhamDaBan VALUES (?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SanPhamDaBan SET TenXe=?, SoKM=?, NgayBan=?, Gia=?,Mau=?,TinhTrang=?,Anh=?,SoLuong=?,MaNCC=? WHERE MaSP=?";
    String DELETE_SQL = "DELETE FROM SanPhamDaBan WHERE MaSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPhamDaBan";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPhamDaBan WHERE MaSP=?";
    
    public void insert(QLThongKe model) throws SQLException{
        jdbchelper.update(INSERT_SQL, model.getMaSPTK(),model.getTenXeTK(),model.getSoKMTK(),model.getNgayBanTK(),model.getGiaTK(),model.getMauTK(),model.getTinhTrangTK(),model.getAnhTK(),model.getSoKMTK(),model.getMaNCCTK());
    }
   public void update(QLThongKe model) throws SQLException{
      jdbchelper.update(UPDATE_SQL,model.getTenXeTK(),model.getSoKMTK(),model.getNgayBanTK(),model.getGiaTK(),model.getMauTK(),model.getTinhTrangTK(),model.getAnhTK(),model.getSoKMTK(),model.getMaNCCTK(),model.getMaSPTK());
  
   }
   public void delete(String id) throws SQLException{
       jdbchelper.update(DELETE_SQL,id);
   }
   public QLThongKe selectByID(String id){
       List<QLThongKe> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return (QLThongKe) this.selectBySQL(SELECT_ALL_SQL);
       
   }
   public List<QLThongKe> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
   }
   public List<QLThongKe> selectByKEYwor(String Keywork){
       String sql = "Select * from SanPhamDaBan where (MaSP LIKE ? OR TenXe LIKE ? OR NgayBan LIKE ? OR Gia LIKE ?)";
       String key = "%" + Keywork + "%" ;
       return selectBySQL(sql,key,key,key,key);
   }
   
   public List<QLThongKe> selectBySQL(String sql, Object...args){
       List<QLThongKe> listk = new ArrayList<>();
       try {
          ResultSet rs = jdbchelper.query(sql, args);
          while(rs.next()){
           QLThongKe QLTK = new QLThongKe();
           QLTK.setMaSPTK(rs.getString("MaSP"));
           QLTK.setTenXeTK(rs.getString("TenXe"));
           QLTK.setSoKMTK(rs.getString("SoKM"));
           QLTK.setNgayBanTK(rs.getString("NgayBan"));
           QLTK.setGiaTK(rs.getDouble("Gia"));
           QLTK.setMauTK(rs.getString("Mau"));
           QLTK.setTinhTrangTK(rs.getString("TinhTrang"));
           QLTK.setAnhTK(rs.getString("Anh"));
           QLTK.setSoLuongTK(rs.getString("SoLuong"));
           QLTK.setMaNCCTK(rs.getString("MaNCC"));
            listk.add(QLTK);
          }
          rs.getStatement().getConnection().close();
          return listk;
       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;
        
   
}
}


