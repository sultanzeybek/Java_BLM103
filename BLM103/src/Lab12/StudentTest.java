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
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Sultan", "Zeybek", "1234567",100,99,98);
        
        Student s2 = new Student("Ahmet", "Ak");
        s2.setNo("123456789");
        s2.setMatnot(95);
        s2.setFiznot(85);
        s2.setTurknot(90);
       
        Student s3 = new Student();
        s3.setAd("Ali");
        s3.setSoyad("Karaca");
        s3.setNo("987456321");
        s3.setMatnot(45);
        s3.setFiznot(65);
        s3.setTurknot(70);
        
        s1.printStudent();
        s1.printStudent(s2);
        s2.printStudent();
        s2.printStudent(s2);
        
        System.out.println(s3.printStudent(s3, s3.getNo()));
        
        System.out.println("s1 öğrencinin ders ortalaması= "+s1.ortBul());
        System.out.println("s1 öğrencinin en iyi ders notu= "+s1.maxNotBul(s1));
        System.out.println("En başarılı öğrenci "+s1.maxOrt(s1, s2, s3));

    }
    
}
