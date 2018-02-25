/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import Modelller.tblegitici;
import dboperations.dboperations;

/**
 *
 * @author vektorel
 */
public class runner {
    
    public static void main(String[] args) {
        
         tblegitici egitici = new tblegitici();
        dboperations  DB = new dboperations();
        
        egitici.setAd("Muhammet1");
        egitici.setSoyad("Hoca1");
       egitici.setIletisim("05455444855");
       egitici.setAdres("Ankara");
      
       
        DB.Kaydet(egitici);
        
        
        
        
    }
    
}
