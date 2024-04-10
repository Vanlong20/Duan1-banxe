/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import duan.entyti.QLHoaDon;
import duan.entyti.QLThongKe;
import duan.entyti.jdbchelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class QlHoaDonDAO {
   String INSERT_SQL = "INSERT INTO HoaDon VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDon SET NgayMua=?, GhiChu=?, MaNV=?,MaKH=?,SanPham=?,SoTien=? WHERE MaHD=?";
    String DELETE_SQL = "DELETE FROM HoaDon WHERE MaHD=?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDon";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaSP=?"; 

    public void insert(QLHoaDon model) throws SQLException{
        jdbchelper.update(INSERT_SQL, model.getMaHD(),model.getNgayMua(),model.getGhiChu(),model.getMaNV(),model.getMaKH(),model.getSanPham(),model.getTongTien());
    }
   public void update(QLHoaDon model) throws SQLException{
      jdbchelper.update(UPDATE_SQL,model.getNgayMua(),model.getGhiChu(),model.getMaNV(),model.getMaKH(),model.getSanPham(),model.getTongTien());
  
   }
   public void delete(String id) throws SQLException{
       jdbchelper.update(DELETE_SQL,id);
   }
   public QLHoaDon selectByID(String id){
       List<QLHoaDon> listHD = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return !listHD.isEmpty()?listHD.get(0): null;
       
   }
   public List<QLHoaDon> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
   }
   public List<QLHoaDon> selectByKEYwor(String Keywork){
       String sql = "Select * from HoaDon where (MaHD LIKE ? OR SoTIen LIKE ? OR MaNV LIKE ?)";
       String key = "%" + Keywork + "%" ;
       return selectBySQL(sql,key,key,key);
   }
   
   public List<QLHoaDon> selectBySQL(String sql, Object...args){
       List<QLHoaDon> listHD = new ArrayList<>();
       try {
          ResultSet rs = jdbchelper.query(sql, args);
          while(rs.next()){
           QLHoaDon QLTK = new QLHoaDon();
           QLTK.setMaHD(rs.getString("MaHD"));
           QLTK.setNgayMua(rs.getString("NgayMua"));
           QLTK.setGhiChu(rs.getString("GhiChu"));
           QLTK.setMaNV(rs.getString("MaNV"));
           QLTK.setMaKH(rs.getString("MaKH"));
           QLTK.setSanPham(rs.getString("SanPham"));
           QLTK.setTongTien(rs.getString("SoTien"));
           
            listHD.add(QLTK);
          }
          rs.getStatement().getConnection().close();
          return listHD;
       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;
        
   
}

}
