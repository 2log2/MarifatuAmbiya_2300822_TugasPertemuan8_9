/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan8_9;

/**
 *
 * @author marif
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan sisi segitiga
        System.out.print("Masukkan sisi pertama: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi kedua: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi ketiga: ");
        double sisi3 = input.nextDouble();

        // Masukkan warna
        System.out.print("Masukkan warna: ");
        String warna = input.next();

        // Masukkan apakah diisi
        System.out.print("Apakah segitiga diisi? (true/false): ");
        boolean diisi = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setDiisi(diisi);

        // Menampilkan hasil
        System.out.println("\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Diisi: " + segitiga.isDiisi());
    }
}

