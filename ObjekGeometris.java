/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan8_9;

/**
 *
 * @author marif
 */
public class ObjekGeometris {
    private String warna = "putih";
    private boolean diisi;

    // Konstruktor default
    public ObjekGeometris() {
    }

    // Konstruktor dengan parameter
    public ObjekGeometris(String warna, boolean diisi) {
        this.warna = warna;
        this.diisi = diisi;
    }

    // Getter dan setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isDiisi() {
        return diisi;
    }

    public void setDiisi(boolean diisi) {
        this.diisi = diisi;
    }

    // Method toString()
    @Override
    public String toString() {
        return "Warna: " + warna + " Diisi: " + diisi;
    }
}

