/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.*;
import Configs.DBConnection;
import Halaman.HalamanUtama;
import Halaman.HalamanMengelolaProduk;
/**
 *
 * @author muhau
 */
public class LoginController {
    DBConnection db = new DBConnection();
    Connection conn = null;
    
    public LoginController(){
       try{
           Statement stmt = conn.createStatement();
           ResultSet username = stmt.executeQuery("select lg_uname from login");
           ResultSet password = stmt.executeQuery("select lg_pwd from login");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
    public void sebagaiPenjual(){
        //pergi ke HalamanMengelola();
        HalamanMengelolaProduk hp = new HalamanMengelolaProduk();
        hp.setVisible(true);
    }
    
    public void sebagaiPembeli(){
        //pergi ke HalamanUtama();
        HalamanUtama he = new HalamanUtama();
        he.setVisible(true);
    }
    
    public boolean isUnameTrue(String input){
        try{
            Statement stmt = conn.createStatement();
            ResultSet username = stmt.executeQuery("select lg_uname from login");
            System.out.println(username);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean isPwdTrue(String input){
        try{
            Statement stmt = conn.createStatement();
            ResultSet password = stmt.executeQuery("select lg_pwd from login");
            System.out.println(password);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
