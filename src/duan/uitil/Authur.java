/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan.uitil;

import duan.entyti.TaiKhoan;

/**
 *
 * @author ACER
 */
public class Authur {
     public static TaiKhoan user = null;
   public static void clear(){
       Authur.user = null;
   }
   public static boolean isLogin(){
       return Authur.user !=null;
   }
   public static boolean isManager(){
       return Authur.isLogin() && true;
   }
}
