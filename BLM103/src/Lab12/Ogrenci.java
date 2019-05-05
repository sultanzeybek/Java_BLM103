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
public class Ogrenci {
   private String ad,soyad,no;
   private double matnot,fiznot,turknot;

    public Ogrenci(String ad, String soyad, String no, double matnot, double fiznot, double turknot) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
        this.matnot = matnot;
        this.fiznot = fiznot;
        this.turknot = turknot;
    }

    public void setFiznot(double fiznot) {
        if(fiznot>=0 && fiznot<=100 )
        this.fiznot = fiznot;
    }
    public double maxNotbul(Ogrenci o1){
        if(o1.getFiznot()>o1.getMatnot() && o1.getFiznot()>o1.getTurknot() )
            return o1.getFiznot();
        else if(o1.getMatnot()>o1.getFiznot() && o1.getMatnot()>o1.getTurknot())
                return o1.getMatnot();
        else 
            return o1.getTurknot();
    }
    public double ortBul(Ogrenci o1){
        return (o1.getFiznot()+o1.getMatnot()+o1.getTurknot())/3.0;
    }
    public double getTurknot() {
        return turknot;
    }

    public double getMatnot() {
        return matnot;
    }
    public String maxOrt(Ogrenci o1, Ogrenci o2, Ogrenci o3){
        double ort1=this.ortBul(o1);
        double ort2=this.ortBul(o2);
        double ort3=this.ortBul(o3);
        double max;
        if(ort1>ort2 && ort1 >ort3)
            return o1.getAd()+" "+o1.getSoyad();
        else if(ort2>ort3 && ort2 >ort1)
            return o2.getAd()+" "+o2.getSoyad();
        else 
            return o3.getAd()+" "+o3.getSoyad();
        
    }

    public double getFiznot() {
        return fiznot;
    }

    public void setTurknot(double turknot) {
        if(turknot>=0 && turknot<=100 )
        this.turknot = turknot;
    }

    public void setMatnot(double matnot) {
        if(matnot>=0 && matnot<=100 )
        this.matnot = matnot;
    }
   

    public Ogrenci(String ad, String soyad, String no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getAd(){
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
   public void printOgrenci(Ogrenci o1) {
       System.out.println(o1.getAd()+" "+o1.getSoyad()+" "+o1.getNo()+" "+o1.getFiznot()+" "+o1.getMatnot()+" "+o1.getTurknot());
   }
   public void printOgrenci(){
       System.out.println(ad+" "+soyad+" "+no+" "+matnot+" "+" "+turknot+" "+fiznot);
   }
   
}
