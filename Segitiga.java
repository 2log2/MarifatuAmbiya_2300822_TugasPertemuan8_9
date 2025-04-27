/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan8_9;

/**
 *
 * @author marif
 */
public class Segitiga extends ObjekGeometris {
    private double sisi1 = 1.0;
    private double sisi2 = 1.0;
    private double sisi3 = 1.0;

    // Konstruktor default
    public Segitiga() {
    }

    // Konstruktor dengan parameter sisi
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Getter untuk sisi
    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    // Menghitung luas menggunakan rumus Heron
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    // Menghitung keliling
    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    // Overriding method toString
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}

