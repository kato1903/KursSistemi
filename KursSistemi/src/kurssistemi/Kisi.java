/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurssistemi;

/**
 *
 * @author Toprak
 */
public abstract class Kisi {
    private String Ad;
    private String Soyad;
    private String EvTel;
    private String CepTel;
    private String Adres;
    private String EMail;

    public Kisi(String Ad, String Soyad, String EvTel, String CepTel, String Adres, String EMail) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.EvTel = EvTel;
        this.CepTel = CepTel;
        this.Adres = Adres;
        this.EMail = EMail;
    }
    
    
    public String toString()
    {
        return "Adım " + Ad;
    }
    
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
     * @return the EvTel
     */
    public String getEvTel() {
        return EvTel;
    }

    /**
     * @param EvTel the EvTel to set
     */
    public void setEvTel(String EvTel) {
        this.EvTel = EvTel;
    }

    /**
     * @return the CepTel
     */
    public String getCepTel() {
        return CepTel;
    }

    /**
     * @param CepTel the CepTel to set
     */
    public void setCepTel(String CepTel) {
        this.CepTel = CepTel;
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

    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail;
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    
    
    
}
