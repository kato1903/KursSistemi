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
public class Egitmen extends Kisi {
    
    private List<String> Dersler;
    private int hici;
    private int hsonu;
    private List<Kurs> GuncelKurslar;
    private List<Kurs> EskiKurslar;

    public Egitmen(List<String> Dersler, int hici, int hsonu, String Ad, String Soyad, String EvTel, String CepTel, String Adres, String EMail) {
        super(Ad, Soyad, EvTel, CepTel, Adres, EMail);
        this.Dersler = Dersler;
        this.hici = hici;
        this.hsonu = hsonu;
        GuncelKurslar = new ArrayList<Kurs>();
        EskiKurslar = new ArrayList<Kurs>();
    }
    
    public void DersEkle(String ders)
    {
        if(!Dersler.contains(ders))
        Dersler.add(ders);
    }
    
    public void DersSil(String ders)
    {
        if(Dersler.contains(ders))
        Dersler.remove(ders);
    }
    
    public void KursEkle(Kurs kurs)
    {
        GuncelKurslar.add(kurs);
    }
    
    
    
    public Egitmen(String Ad, String Soyad, String EvTel, String CepTel, String Adres, String EMail) {
        super(Ad, Soyad, EvTel, CepTel, Adres, EMail);
    }

    

    
    
    
    
}
