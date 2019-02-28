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
public class Test {
    public static void main(String[] args) {
        Figure myRectangle = new Rectangle(4, 5);
        Triangle myTriangle = new Triangle(5, 6);
        
        ((Rectangle)myRectangle).k=0;
        
        System.out.println("The area of rectangle is " +myRectangle.Area());
        System.out.println("The area of triangle is " + myTriangle.Area());
        
        Square square = new Square(4);
        System.out.println("The area of square is " +square.getArea());
        
        IsoscelesTriangle isoTriangle = new IsoscelesTriangle(4,6);
        System.out.println("The area of the isolesces Triangle is " + isoTriangle.getArea());
        
        
        
    }
    
}
