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
public class IsoscelesTriangle  implements FigureInterface {
    
    int base_size;
    int height_size;

    public IsoscelesTriangle(int base_size, int height_size) {
        this.base_size = base_size;
        this.height_size = height_size;
    }
    
    

    @Override
    public int getArea() {
        return (base_size * height_size) / 2;
    }
    
}
