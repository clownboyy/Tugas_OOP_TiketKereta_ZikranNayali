package com.mycompany.penjualantiketkereta;

public class TiketEksekutif extends Tiket {
    
    private double biayaLayananTambahan = 50000; 

    public TiketEksekutif(String nama, String kursi, double harga) {
        super(nama, kursi, harga);
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