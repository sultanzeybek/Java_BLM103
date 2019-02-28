/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses_Interfaces;

/**
 *
 * @author szeybek
 */
public abstract class Figure {
    int size1;
    int size2;
   
    
   abstract double Area();

    public Figure(int size1, int size2) {
        this.size1 = size1;
        this.size2 = size2;
    }
   
    
}
