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
public class Balok implements BangunDatar, BangunRuang {
    int panjang1, lebar1, tinggi1;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang1 = panjang1;
        this.lebar1 = lebar1;
        this.tinggi1 = tinggi1;
    }
    
    @Override
    public double luas() {
        return panjang1*lebar1;
    }

    @Override
    public double keliling() {
        return 2*(panjang1+lebar1);
    }

    @Override
    public double volume() {
        return panjang1*lebar1*tinggi1;
    }

    @Override
    public double luasPermukaan() {
        return 2*(panjang1*lebar1+panjang1*tinggi1+lebar1*tinggi1);
    }
}
