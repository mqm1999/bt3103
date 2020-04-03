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
public class Complex {
    int Re, Im;
    public Complex(){
        
    }
    
    public Complex(int Re){
        this.Re = Re;
    }
    
    public Complex(int Re, int Im){
        this.Re = Re;
        this.Im = Im;
    }
    
    void add2Complex(Complex p){
        this.Re = this.Re + p.Re;
        this.Im = this.Im + p.Im;
    }
    
    void subtract2Complex(Complex p){
        this.Re = this.Re - p.Re;
        this.Im = this.Im - p.Re;
    }
    
    void product2Complex(Complex p){
        this.Re = this.Re * p.Re - this.Im * p.Im;
        this.Im = this.Im * p.Re + this.Re * p.Im;
    }
    
    void division2Complex(Complex p){
        this.Re = (this.Re * p.Re + this.Im * p.Im) / (p.Re * p.Re - p.Im * p.Im);
        this.Im = (this.Im * p.Re - this.Re * p.Im) / (p.Re * p.Re - p.Im * p.Im);
    }
    
    public void show(){
        System.out.println(this.Re + " + " + this.Im + ".i");
    }    
    
}
