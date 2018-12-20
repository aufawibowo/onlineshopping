/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

/**
 *
 * @author muhau
 * 
 * 0 is for Pembeli
 * 1 is for Penjual
 */
public class Session {
    int stat = 0;
    public Session(){
        this.stat = 0;
    }
    
    public int getSession(){
        
        return stat;
    }
    
    public void setSession(int var){
        stat = var;
    }
}
