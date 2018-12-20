/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.*;
import Configs.DBConnection;
/**
 *
 * @author muhau
 */
public class LoginController {
    DBConnection db = new DBConnection();
    Connection conn = null;
    
    public LoginController(){
        conn = db.newConnection();
    }
    
    public sebagaiPenjual(){
    
    }
    
    public sebagaiPembeli(){
    
    }
    
}
