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
public class Personel {
    String name, surname;
    int salary, experience;
    
    
    void ConcatName(){
        System.out.println(name + " " + surname);
    }
    
    String personelInformation(){
    return name + " " + surname;
}
    
    void calculateSalary(){
        if(experience<10) salary = 3000;
        else if (experience >= 10) salary = 10000;
    }
    
    void setSalary(int salary){
        this.salary = salary;
    }
    
    int getSalary(){
        return salary;
    }
    
}
