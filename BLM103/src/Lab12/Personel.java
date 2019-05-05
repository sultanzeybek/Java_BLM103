/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

/**
 *
 * @author FSMBLM1
 */
public class Personel {
    String ad;
    String soyad;
    int maas;
    char cinsiyet;
    int yas;
    int calismaSuresi;

    public Personel() {
    }

    public Personel(String ad, String soyad, int maas){
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        
    }
    
    public Personel(String ad, String soyad, int maas, char cinsiyet, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }
    
    public void isimGoster() {
        System.out.println(this.ad + " " + this.soyad);
    }

    public String ismi_Bul() {
        return this.ad + " " +this.soyad;
    }
    
    public void maas_Hesapla(Personel p) {
        if (p.calismaSuresi < 10) {
            p.maas = 3000;
        } else if (p.calismaSuresi >= 10) {
            p.maas = 4000;
        }
        if (p.yas > 50) {
            p.maas = 5000;
        }
    }

}
