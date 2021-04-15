/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String args[]) {
        char ulang;
        boolean yn;
        
        do{
         yn=false;
        System.out.println("Menu");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Kubus");
        System.out.println("6. Silinder");
        System.out.println("7. Balok");
        System.out.println("0. Sudahi sajaa");
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
        
            switch(pilih) {
                case 0 : {System.exit(0);}
                case 1 :
                    int sisi;
                    System.out.println("Persegi");
                    System.out.print("Masukkan sisi : ");
                    sisi = input.nextInt();

                    Persegi persegi = new Persegi(sisi);

                    System.out.println("Luas : " + persegi.luas());
                    System.out.println("Keliling : " + persegi.keliling());
                    break;

                case 2 :
                    int r;
                    System.out.println("Lingkaran");
                    System.out.print("Masukkan jari-jari : ");
                    r = input.nextInt();

                    Lingkaran lingkaran = new Lingkaran(r);
                    System.out.println("Luas : " + lingkaran.luas());
                    System.out.println("Keliling : " + lingkaran.keliling());

                    break;

                case 3 :
                    int panjang, lebar;
                    System.out.println("Persegi Panjang");
                    System.out.print("Masukkan panjang : ");
                    panjang = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    lebar = input.nextInt();

                    Persegipanjang persegipanjang = new Persegipanjang(panjang, lebar);

                    System.out.println("Luas : " + persegipanjang.luas());
                    System.out.println("Keliling : " + persegipanjang.keliling());
                    break;

                case 4 :
                    int alas, tinggi;
                    System.out.println("Segitiga");
                    System.out.print("Masukkan alas : ");
                    alas = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi = input.nextInt();

                    Segitiga segitiga = new Segitiga(alas, tinggi);

                    System.out.println("Luas : " + segitiga.luas());
                    System.out.println("Keliling : " + segitiga.keliling());
                    break;

                case 5 :
                    int sisii;
                    System.out.println("Kubus");
                    System.out.print("Masukkan sisi : ");
                    sisii = input.nextInt();

                    Kubus kubus = new Kubus(sisii);

                    System.out.println("Luas : " + kubus.luas());
                    System.out.println("Keliling : " + kubus.keliling());
                    System.out.println("Volume: " + kubus.volume());
                    System.out.println("Luas Permukaan : " + kubus.luasPermukaan());
                    break;

                case 6 :
                    int r2, tinggii;
                    System.out.println("Silinder");
                    System.out.print("Masukkan jari-jari : ");
                    r2 = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggii = input.nextInt();

                    Silinder silinder = new Silinder(r2, tinggii);

                    System.out.println("Luas : " + silinder.luas());
                    System.out.println("Keliling : " + silinder.keliling());
                    System.out.println("Volume: " + silinder.volume());
                    System.out.println("Luas Permukaan : " + silinder.luasPermukaan());
                    break;

                case 7 :
                    int panjang1, lebar1, tinggi1;
                    System.out.println("Balok");
                    System.out.print("Masukkan panjang : ");
                    panjang1 = input.nextInt();
                    System.out.print("Masukkan lebar : ");
                    lebar1 = input.nextInt();
                    System.out.print("Masukkan tinggi : ");
                    tinggi1 = input.nextInt();

                    Balok balok = new Balok(panjang1, lebar1, tinggi1);

                    System.out.println("Luas : " + balok.luas());
                    System.out.println("Keliling : " + balok.keliling());
                    System.out.println("Volume: " + balok.volume());
                    System.out.println("Luas Permukaan : " + balok.luasPermukaan());

                    break;
                default : System.out.println("Angka yang anda masukkan salah");
            }
            System.out.println("Mau lagi?(y/n) : ");
        }catch(Exception e){
            System.out.println("Maaf, anda salah input");
            yn=true;
        }
        ulang=input.next().charAt(0);
            System.out.println();
        }while(yn || ulang=='y');
    }
}
