/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import duan.entyti.QLChitiethoadon;
import duan.entyti.QLHoaDon;
import duan.entyti.jdbchelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class QlChitietHDDAO {
   String INSERT_SQL = "INSERT INTO HoaDonChiTiet VALUES (?,?,?,?)";
    String UPDATE_SQL = "UPDATE HoaDonChiTiet SET MaHD=?, MaSP=?, SoLuonMua=?,MaKH=? WHERE MaHD=?";
    String DELETE_SQL = "DELETE FROM HoaDonChiTiet WHERE MaHD=?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonChiTiet";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonChiTiet WHERE MaHD=?"; 

    public void insert(QLChitiethoadon model) throws SQLException{
        jdbchelper.update(INSERT_SQL, model.getMaHD(),model.getMaSP(),model.getSoLuonMua(),model.getGia());
    }
   public void update(QLChitiethoadon model) throws SQLException{
      jdbchelper.update(UPDATE_SQL,model.getMaHD(),model.getMaSP(),model.getSoLuonMua(),model.getGia());
  
   }
   public void delete(String id) throws SQLException{
       jdbchelper.update(DELETE_SQL,id);
   }
   public List<QLChitiethoadon> selectByID(String id){
       List<QLChitiethoadon> listHD = this.selectBySQL(SELECT_BY_ID_SQL, id);
        return !listHD.isEmpty()?listHD: null;
       
   }
   public List<QLChitiethoadon> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
   }
   public List<QLChitiethoadon> selectByKEYwor(String Keywork){
       String sql = "Select * from HoaDon where (MaHD LIKE ? OR TongTien LIKE ? OR MaNV LIKE ?)";
       String key = "%" + Keywork + "%" ;
       return selectBySQL(sql,key,key,key);
   }
   
   public List<QLChitiethoadon> selectBySQL(String sql, Object...args){
       List<QLChitiethoadon> listHDCT = new ArrayList<>();
       try {
          ResultSet rs = jdbchelper.query(sql, args);
          while(rs.next()){
              QLChitiethoadon QLHDCT = new QLChitiethoadon();
          QLHDCT.setMaHD(rs.getString("MaHD"));
          QLHDCT.setMaSP(rs.getString("MaSP"));
          QLHDCT.setMaHD(rs.getString("SoLuonMua"));
          QLHDCT.setMaHD(rs.getString("Gia"));
          
           
            listHDCT.add(QLHDCT);
          }
          rs.getStatement().getConnection().close();
          return listHDCT;
       } catch (Exception e) {
           e.printStackTrace();
       }
        return null;
        
   
}
    
    
    
}
