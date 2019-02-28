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
public class Square implements FigureInterface {
    
    int edge_size;

    public Square(int edge_size) {
        this.edge_size = edge_size;
    }
    

    @Override
    public int getArea() {
        return edge_size * edge_size;
    }
    
}
