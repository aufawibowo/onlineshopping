/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

/**
 *
 * @author muhau
 */
public class localUsername{
    private String var;
    localUsername(String var){
        this.var = var;
    }
       
    public void setUsername(String var){
        this.var = var;
    }
    
    public String getUsername(){
        return this.var;
    }
}