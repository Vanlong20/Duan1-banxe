/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import duan.entyti.QLThongKe;
import duan.entyti.QlSanPham;
import duan.entyti.jdbchelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class QLSanPhamDAO {
    String INSERT_SQL = "INSERT INTO SanPhamDaBan VALUES (?,?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SanPhamDaBan SET TenXe=?, SoKM=?, NgayBan=?, Gia=?,Mau=?,TinhTrang=?,Anh=?,SoLuong=?,MaNCC=? WHERE MaSP=?";
    String DELETE_SQL = "DELETE FROM SanPhamDaBan WHERE MaSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPhamDaBan";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPhamDaBan WHERE MaSP=?";
    
    public void insert(QlSanPham model) throws SQLException{
        jdbchelper.update(INSERT_SQL, model.getMaSP(),model.getTenXe(),model.getSoKM(),model.getNgayBan(),model.getGia(),model.getMau(),model.getTinhTrang(),model.getAnh(),model.getSoKM(),model.getMaNCC());
    }
   public void update(QlSanPham model) throws SQLException{
      jdbchelper.update(UPDATE_SQL,model.getTenXe(),model.getSoKM(),model.getNgayBan(),model.getGia(),model.getMau(),model.getTinhTrang(),model.getAnh(),model.getSoKM(),model.getMaNCC(),model.getMaSP());
  
   }
   public void delete(String id) throws SQLException{
       jdbchelper.update(DELETE_SQL,id);
   }
   public QlSanPham selectByID(String id){
       List<QlSanPham> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return (QlSanPham) this.selectBySQL(SELECT_ALL_SQL);
       
   }
   public List<QlSanPham> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
   }
   public List<QlSanPham> selectByKEYwor(String Keywork){
       String sql = "Select * from SanPhamDaBan where (MaSP LIKE ? OR TenXe LIKE ? OR NgayBan LIKE ? OR Gia LIKE ?)";
       String key = "%" + Keywork + "%" ;
       return selectBySQL(sql,key,key,key,key);
   }
   
   public List<QlSanPham> selectBySQL(String sql, Object...args){
       List<QlSanPham> listSP = new ArrayList<>();
       try {
          ResultSet rs = jdbchelper.query(sql, args);
          while(rs.next()){
           QlSanPham QLTK = new QlSanPham();
           QLTK.setMaSP(rs.getString("MaSP"));
           QLTK.setTenXe(rs.getString("TenXe"));
           QLTK.setSoKM(rs.getString("SoKM"));
           QLTK.setNgayBan(rs.getString("NgayBan"));
           QLTK.setGia(rs.getDouble("Gia"));
           QLTK.setMau(rs.getString("Mau"));
           QLTK.setTinhTrang(rs.getString("TinhTrang"));
           QLTK.setAnh(rs.getString("Anh"));
           QLTK.setSoLuong(rs.getString("SoLuong"));
           QLTK.setMaNCC(rs.getString("MaNCC"));
            listSP.add(QLTK);
          }
          rs.getStatement().getConnection().close();
          return listSP;
       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;
        
   
}
}
