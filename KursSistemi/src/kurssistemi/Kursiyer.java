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
public class Kursiyer extends Kisi {
    private List<KursBilgi> KursBilgileri;
    
    public Kursiyer(String Ad, String Soyad, String EvTel, String CepTel, String Adres, String EMail) {
        super(Ad, Soyad, EvTel, CepTel, Adres, EMail);
        KursBilgileri = new ArrayList<KursBilgi>();
    } 

    public List<KursBilgi> getKursBilgileri() {
        return KursBilgileri;
    }

    public void setKursBilgileri(List<KursBilgi> KursBilgileri) {
        this.KursBilgileri = KursBilgileri;
    }
    
    public int KursAra(Kurs kurs)
    {
        for(int i = 0; i < KursBilgileri.size(); i++)
        {
            if(KursBilgileri.get(i).getKursb() == kurs)
                return i;
        }
        return 0;
    }
    
    public void KursBitir(Kurs kurs)
    {
        int index = KursAra(kurs);
        KursBilgileri.get(index).KursBitir();
    }
    
    public void KursBilgileriEkle(KursBilgi bilgi)
    {
        KursBilgileri.add(bilgi);
    }
    
    public void OdemeYap()
    {
        ;
    }
    
    public void TumKurslariListele()
    {
        for(int i = 0; i < KursBilgileri.size(); i++){
            System.out.println(KursBilgileri.get(i).getKursb());
        }
    }
    
    public void EskiKursleriListele()
    {
        for(int i = 0; i < KursBilgileri.size(); i++){
            if(!KursBilgileri.get(i).isAktif())
            System.out.println(KursBilgileri.get(i).getKursb());
        }
    }
    
    public void GuncelKursleriListele()
    {
        for(int i = 0; i < KursBilgileri.size(); i++){
            if(KursBilgileri.get(i).isAktif())
            System.out.println(KursBilgileri.get(i).getKursb());
        }
    }
    
}

