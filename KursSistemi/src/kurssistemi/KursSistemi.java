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
public class KursSistemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kursiyer Ali = new Kursiyer("Ali","Kaya","a","a","a","a");
        Kursiyer Ahmet = new Kursiyer("Ahmet","Kaya","a","a","a","a");
        Kursiyer Onur = new Kursiyer("Onur","Kaya","a","a","a","a");
        ArrayList<String> Dersler = new ArrayList();
        Dersler.add("Boyama");
        Dersler.add("Oymacılık");
        Egitmen Veli = new Egitmen(Dersler,50,100,"Veli","Kaya","a","a","a","a");
        Egitmen Veli2 = new Egitmen(Dersler,75,150,"Veli2","Kaya","a","a","a","a");
        Kurs yeniKurs = new Kurs("SuperKurs",100,false,Dersler,3);
        Kurs yeniKurs2 = new Kurs("SuperKurs2",100,false,Dersler,4);
        yeniKurs.KatilimciEkle(Ali);
        yeniKurs.KatilimciEkle(Ahmet);
        yeniKurs.setFiyat(500);
        yeniKurs.KatilimciEkle(Onur);
        yeniKurs.KatilimciListele();
        System.out.println(yeniKurs.getToplamGelir());
        yeniKurs.EgitmenEkle(Veli2);
        yeniKurs.EgitmenListele();
        Ali.TumKurslariListele();
        Ahmet.GuncelKursleriListele();
        yeniKurs.KursTamamla();
        System.out.println("1 ------");
        Ali.TumKurslariListele();
        System.out.println("2 ------");
        Ali.EskiKursleriListele();
        System.out.println("3 ------");
        Ali.GuncelKursleriListele();
        yeniKurs2.EgitmenEkle(Veli);
        yeniKurs2.KatilimciEkle(Onur);
        Onur.GuncelKursleriListele();
        yeniKurs2.KatilimciListele();
        
    }
    
}
