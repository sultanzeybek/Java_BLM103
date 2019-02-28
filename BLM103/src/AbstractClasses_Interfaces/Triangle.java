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
public class Triangle extends Figure{

    public Triangle(int size1, int size2) {
        super(size1, size2);
    }

    @Override
    double Area() {
        return (size1 * size2) / 2.0;
    }
    
}
