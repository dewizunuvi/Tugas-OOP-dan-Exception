/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Silinder implements BangunDatar, BangunRuang {
int r2, tinggii;
final double pi = 3.14;

    public Silinder(int r, int tinggii) {
        this.r2 = r2;
        this.tinggii = tinggii;
    }

    
    @Override
    public double luas() {
        System.out.println("Luas alas : ");
        return pi*r2*r2;
    }

    @Override
    public double keliling() {
        System.out.println("Keliling : ");
        return 2*pi*r2;
    }

    @Override
    public double volume() {
        System.out.println("Volume : "); 
        return pi*r2*r2*tinggii;
    }

    @Override
    public double luasPermukaan() {
        System.out.println("Luas permukaan");
        return 2*pi*r2*(r2+tinggii);
    }
    
}
