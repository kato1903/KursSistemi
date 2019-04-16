/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurssistemi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toprak
 */
public class Kurs {
    private String Isım;
    private int Fiyat;
    private ArrayList<Egitmen> Egitmen;
    private ArrayList<Kursiyer> Kursiyer;
    private String Zaman;
    private boolean Hici;
    private int ToplamGelir;
    private ArrayList<String> Dersler;
    private boolean Aktif;
    private int limit;
    
    public Kurs(String Isım, int Fiyat, boolean Hici, ArrayList<String> Dersler,int limit) {
        this.Isım = Isım;
        this.Fiyat = Fiyat;
        this.Hici = Hici;
        this.Dersler = Dersler;
        Egitmen = new ArrayList<Egitmen>();
        Kursiyer = new ArrayList<Kursiyer>();
        ToplamGelir = 0;
        Aktif = true;
        this.limit = limit;
    }
    
    public void KursTamamla()
    {
        Aktif = false;        
        for(int i = 0; i < Kursiyer.size(); i++)
        {
            Kursiyer.get(i).KursBitir(this);
        }
    }
    
    public String toString()
    {
        return "Kurs Adı " + Isım;
    }
    
    public void EgitmenEkle(Egitmen egitmen)
    {
        Egitmen.add(egitmen);        
        egitmen.KursEkle(this);
    }
    
    public String EgitmenListele()
    {
        String List = "";
        for(int i = 0; i < Egitmen.size(); i++)
        {
            System.out.println(Egitmen.get(i));
            List += " " + Egitmen.indexOf(i);
        }
        return List;
    }
    
    public void KatilimciEkle(Kursiyer kursiyer)
    {
        if(Kursiyer.size() < limit)
        {
            Kursiyer.add(kursiyer);
            ToplamGelir += this.Fiyat;
            KursBilgi bilgi = new KursBilgi(this,kursiyer,this.Fiyat);
            kursiyer.KursBilgileriEkle(new KursBilgi(this,kursiyer,this.Fiyat));
        }
        else
        {
            System.out.println("Kapasite Dolu");
        }
                       
    }
    
    public String KatilimciListele()
    {
        String List = "";
        for(int i = 0; i < Kursiyer.size(); i++)
        {
            System.out.println(Kursiyer.get(i));
            List += " " + Kursiyer.indexOf(i);
        }
        return List;
    }

    public int getToplamGelir() {
        return ToplamGelir;
    }

    public void setToplamGelir(int ToplamGelir) {
        this.ToplamGelir = ToplamGelir;
    }
    
    
    
    public boolean isHici() {
        return Hici;
    }

    public void setHici(boolean Hici) {
        this.Hici = Hici;
    }
    
    public String getIsım() {
        return Isım;
    }

    public void setIsım(String Isım) {
        this.Isım = Isım;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int Fiyat) {
        this.Fiyat = Fiyat;
    }    

    public String getZaman() {
        return Zaman;
    }

    public void setZaman(String Zaman) {
        this.Zaman = Zaman;
    }
    
    
    
}
