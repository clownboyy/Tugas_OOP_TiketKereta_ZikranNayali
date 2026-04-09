package com.mycompany.penjualantiketkereta;

public class TiketEksekutif extends Tiket {
    
    private double biayaLayananTambahan; 

    public TiketEksekutif(String nama, String kursi, double harga, double biayaLayanan) {
        super(nama, kursi, harga);
        this.biayaLayananTambahan = biayaLayanan;
    }

    @Override
    public double hitungTotalHarga() {
        return hargaDasar + biayaLayananTambahan;
    }

    public void tampilkanInfo() {
        System.out.println("=== DETAIL TIKET EKSEKUTIF ===");
        System.out.println("Nama Penumpang : " + getNama());
        System.out.println("Nomor Kursi    : " + getKursi());
        System.out.println("Total Bayar    : Rp" + hitungTotalHarga());
        System.out.println("==============================");
    }
}