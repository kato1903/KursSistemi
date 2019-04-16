/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurssistemi;

import java.util.Date;

/**
 *
 * @author Toprak
 */
public class KursBilgi {
    private Kurs Kursb;
    private Kursiyer Kursiyerb;
    private int fiyat;
    private boolean Aktif;
    private Date Tarih;

    

    public KursBilgi(Kurs aThis, Kursiyer kursiyer, int Fiyat) {
        this.Kursb = aThis;
        this.Kursiyerb = Kursiyerb;
        this.fiyat = fiyat;
        this.Aktif = true;
        this.Tarih = new Date();
    }
    
    public void KursBitir()
    {
        Aktif = false;
    }
    
    public Kurs getKursb() {
        return Kursb;
    }

    public void setKursb(Kurs Kursb) {
        this.Kursb = Kursb;
    }

    public Kursiyer getKursiyerb() {
        return Kursiyerb;
    }

    public void setKursiyerb(Kursiyer Kursiyerb) {
        this.Kursiyerb = Kursiyerb;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isAktif() {
        return Aktif;
    }

    public void setAktif(boolean Aktif) {
        this.Aktif = Aktif;
    }

    public Date getTarih() {
        return Tarih;
    }

    public void setTarih(Date Tarih) {
        this.Tarih = Tarih;
    }

   

    
    
    
    
    
}
