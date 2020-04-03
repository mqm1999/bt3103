/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author HP Pavilion
 */
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Complex p1 = new Complex();
    p1.show();
    Complex p2 = new Complex(1);
    p2.show();
    Complex p3 = new Complex(2,1);
    p3.show();
    Complex p4 = new Complex(1,2);
    p4.show();
    p3.add2Complex(p4);
    p3.show();
    p3.subtract2Complex(p4);
    p3.show();
    p3.division2Complex(p4);
    p3.show();
    p3.product2Complex(p4);
    p3.show();
    }
    
}
