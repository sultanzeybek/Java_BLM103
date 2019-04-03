/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab08;

/**
 *
 * @author szeybek
 */
public class TestPersonel {
    public static void main(String[] args) {
        Personel p = new Personel();
        p.name = "Sultan";
        p.surname = "Zeybek";
        p.experience = 23;
        
        System.out.println(p.personelInformation());
        p.ConcatName();
        p.calculateSalary();
        System.out.println(p.salary);
        
        p.setSalary(200000);
        System.out.println("New salary= " + p.getSalary());
        
    }
}
