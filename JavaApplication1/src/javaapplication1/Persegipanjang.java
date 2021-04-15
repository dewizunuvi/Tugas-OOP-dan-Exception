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
public class Persegipanjang implements BangunDatar {
    int panjang;
    int lebar;

    public Persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {    
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }
    
}
