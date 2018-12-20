/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author muhau
 */
public class Produk {
    private String idProduk;
    private String namaproduk;
    private int hargaproduk;
    private String deskripsiproduk;
    
    public Produk{
    
    }
    
    public String getProduk(){
        return namaproduk;
    }
    
    public setProduk(String input){
        this.namaproduk = input;
    }
    
    public String getIDProduk(){
        return idProduk;
    }
    
    public setIDProduk(String input){
        this.idProduk = input;
    }
    
    public String getHargaProduk(){
        return hargaproduk;
    }
    
    public setHargaProduk(String input){
        this.hargaproduk = input;
    }
    
    public String getDeskripsiProduk(){
        return deskripsiproduk;
    }
    
    public setDeskripsiProduk(String input){
        this.deskripsiproduk = input;
    }
}
