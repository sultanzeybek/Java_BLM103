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
public class OgrenciTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ogrenci o1=new Ogrenci("ahmet","karaca","345656",50,65,87);
        Ogrenci o2=new Ogrenci("okan","kara","945256",65,76,98);
        Ogrenci o3=new Ogrenci("mehmet","kar","745656",54,76,32);
        o1.printOgrenci(o1);
        o2.printOgrenci(o2);
        o2.printOgrenci(o3);
        System.out.println();
        o2.printOgrenci();
        System.out.println(o2.maxNotbul(o2));
        System.out.println(o1.maxNotbul(o2));
        System.out.println(o1.maxOrt(o1, o2, o3));
        o1.setFiznot(123);
        System.out.println(o1.getFiznot());
        o2.setMatnot(-50);
        System.out.println(o2.getMatnot());
        o1.setFiznot(100);
        o1.setMatnot(90);
        System.out.println(o1.maxOrt(o1, o2, o3));
        System.out.println(o1.ortBul(o1));
        System.out.println(o1.maxNotbul(o3));
        o1.printOgrenci(o1);
        o2.printOgrenci(o2);
        o2.printOgrenci(o3);
        System.out.println(o2.maxOrt(o1, o2, o3));
    }
    
}
