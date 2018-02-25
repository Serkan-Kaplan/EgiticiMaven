/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelller;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */

@Entity
@Table()
public class tblegitici implements Serializable{
    
    
    
    @Id
    @SequenceGenerator(name = "egiticiid",sequenceName = "sqegiticiid",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "egiticiid") 
    private int id;
    
     @Column(name = "Ad",length = 50)
   private String Ad;
     @Column(name = "Soyad",length = 50)
   private String Soyad;
     @Column(name = "iletisim",length = 50)
   private String iletisim;
     @Column(name = "Adres",length = 250) 
   private String Adres;

    /**
     * @return the Ad
     */
    public String getAd() {
        return Ad;
    }

    /**
     * @param Ad the Ad to set
     */
    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    /**
     * @return the Soyad
     */
    public String getSoyad() {
        return Soyad;
    }

    /**
     * @param Soyad the Soyad to set
     */
    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    /**
     * @return the iletisim
     */
    public String getIletisim() {
        return iletisim;
    }

    /**
     * @param iletisim the iletisim to set
     */
    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }

    /**
     * @return the Adres
     */
    public String getAdres() {
        return Adres;
    }

    /**
     * @param Adres the Adres to set
     */
    public void setAdres(String Adres) {
        this.Adres = Adres;
    }
   
    
    
}
