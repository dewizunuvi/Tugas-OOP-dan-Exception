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
public class Segitiga implements BangunDatar {
    int alas, tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return alas/2*tinggi;
    }

    @Override
    public double keliling() {
        return alas+tinggi+((alas*alas)+(tinggi*tinggi));
    }
}
