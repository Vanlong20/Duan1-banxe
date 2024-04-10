/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.entyti;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class taikhoanDao extends edusys<TaiKhoan, String>{
    String INSERT_SQL = "INSERT INTO TaiKhoan(MaTK,MatKhau,VaiTro)VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE TaiKhoan SET MatKhau=?,VaiTro =? WHERE MaTK=?";
    String DELETE_SQL = "DELETE FROM TaiKhoan WHERE MaTK =?";
    String SELECT_ALL_SQL = "SELECT * FROM TaiKhoan";
    String SELECT_BY_ID_SQL = "SELECT * FROM TaiKhoan WHERE MaTK =?";
    @Override
    public void insert(TaiKhoan entity) {
        try {
            jdbchelper.update(INSERT_SQL,
                    entity.getMaTK(),entity.getMatKhau(),entity.isVaiTro()); // isvaitro lỗi 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(TaiKhoan entity) {
        try {
            jdbchelper.update(UPDATE_SQL,
                    entity.getMatKhau(),entity.isVaiTro(),entity.getMaTK());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbchelper.update(DELETE_SQL,id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

   
    @Override
    public TaiKhoan selectById(String id) {
        List<TaiKhoan> list = this.selectBySql(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
        
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
           List<TaiKhoan>list = new ArrayList<TaiKhoan>();
        try {
            ResultSet rs = jdbchelper.query(sql, args);
            while(rs.next()){
                TaiKhoan entity = new TaiKhoan();
                entity.setMaTK(rs.getString("MaTK"));
               
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
                
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
} 
}
