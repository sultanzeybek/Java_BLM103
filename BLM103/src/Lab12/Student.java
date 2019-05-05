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
public class Student {
    private String ad;
    private String soyad;
    private String no;
    private double matnot,fiznot,turknot;

    public double getMatnot() {
        return matnot;
    }

    public void setMatnot(double matnot) {
        if(matnot >= 0 && matnot <=100) this.matnot = matnot;
    }

    public double getFiznot() {
        return fiznot;
    }

    public void setFiznot(double fiznot) {
        if(fiznot >= 0 && fiznot <=100) this.fiznot = fiznot;
    }

    public double getTurknot() {
        return turknot;
    }

    public void setTurknot(double turknot) {
       if(turknot >= 0 && turknot <=100)  this.turknot = turknot;
    }
    
    public double maxNotBul(Student s){
        if(s.getMatnot()> s.getFiznot() && s.getMatnot()>s.getTurknot())
            return s.getMatnot();
        else if(s.getFiznot() > s.getMatnot() && s.getFiznot() > s.getTurknot())
            return s.getFiznot();
        else return s.getTurknot();
            } 
    
    public double ortBul(){
        return (this.matnot+this.fiznot+this.turknot)/3.0;
    }
    
    public String maxOrt(Student s1, Student s2, Student s3){
        double o1 = s1.ortBul();
        double o2 = s2.ortBul();
        double o3 = s3.ortBul();

        if (o1 > o2 && o1 > o3) {
            return s1.getAd() + " " + s1.getSoyad();
        } else if (o2 > o1 && o2 > o3) {
            return s2.getAd() + " " + s2.getSoyad();
        } else {
            return s3.getAd() + " " + s3.getSoyad();
        }

    }

    
    
    
    public Student(String ad, String soyad, String no,double matNot, double fizNot, double turkNot) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
        this.matnot = matNot;
        this.fiznot = fizNot; 
        this.turknot = turkNot;
    }
    
    public Student(){
    }
    
    public Student(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;
    }
    
    public void setAd(String ad){
        this.ad = ad;
    }
    public String getAd(){
        return this.ad;
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
    
    public void printStudent(Student s){
        System.out.println(s.getAd() + " "+ s.getSoyad() + " "+ s.getNo());
    }
    
    public void printStudent(){
        System.out.println(this.ad + " " + this.soyad + " " + this.no);
    }
    
    public String printStudent(Student s, String no){
        return s.getAd()+ " " + s.getSoyad() + " " + s.getNo();
    }
}
