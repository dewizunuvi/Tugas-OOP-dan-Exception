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
public class Persegi implements BangunDatar {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }    
    
    @Override
    public double luas() {
        return sisi*sisi;
    }

    @Override
    public double keliling() {
        return sisi*4;
    }
}
