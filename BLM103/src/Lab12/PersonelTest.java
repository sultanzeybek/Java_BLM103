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
public class PersonelTest {
    public static void main(String[] args) {
        Personel p1 = new Personel();
        p1.ad = "Sultan";
        p1.soyad = "Zeybek";
        p1.calismaSuresi = 12;
        p1.isimGoster();
        System.out.println(p1.ismi_Bul());
        p1.maas_Hesapla(p1);
        
        System.out.println(p1.maas);
        
        Personel p2 = new Personel("Ahmet", "Ak", 4000);
        p2.yas =60;
        p2.isimGoster();
        p2.maas_Hesapla(p2);
        System.out.println(p2.maas);
        

        
      Personel p3 = new Personel("Ayse", "Sari", 4000, 'E', 30);
    }
}
