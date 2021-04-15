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
public class Kubus implements BangunDatar, BangunRuang {
    int sisii;

    public Kubus(int sisi) {
        this.sisii = sisii;
    }
    
    @Override
    public double luas() {
        return sisii*sisii;
    }

    @Override
    public double keliling() {
        return sisii*4;
    }

    @Override
    public double volume() {
        return sisii*sisii*sisii;
    }

    @Override
    public double luasPermukaan() {
        return 6*(sisii*sisii);
    }
}
