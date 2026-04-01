/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.penjualantiketkereta;

public abstract class Tiket {
    private String namaPenumpang;
    private String nomorKursi;
    protected double hargaDasar;

public Tiket(String nama, String kursi, double harga) {
    this.namaPenumpang = nama;
    this.nomorKursi = kursi;
    this.hargaDasar = harga;
}

public String getNama() {
    return namaPenumpang;
}

public String getKursi(){
    return nomorKursi;
}
public abstract double hitungTotalHarga();
public abstract void tampilkanInfo();
}