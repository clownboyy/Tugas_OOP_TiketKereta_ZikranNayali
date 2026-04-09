/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.penjualantiketkereta;

/**
 *
 * @author HYPE AMD
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PenjualanTiketKereta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new TiketEksekutif("Zikran", "EKS-17", 150000, 50000));
        daftarTiket.add(new TiketEksekutif("Artemis", "EKS-02", 200000, 50000));
        daftarTiket.add(new TiketEksekutif("Ella", "EKS-07", 300000, 50000));
        daftarTiket.add(new TiketEksekutif("Apollo", "EKS-11", 196900, 50000));

        System.out.println("=== DAFTAR PENUMPANG ===");
        for (int i = 0; i < daftarTiket.size(); i++) {
            System.out.println((i + 1) + ". " + daftarTiket.get(i).getNama());
        }
        
        System.out.print("\nPilih nomor penumpang untuk lihat detail: ");
        int pilihan = input.nextInt();

        if (pilihan > 0 && pilihan <= daftarTiket.size()) {
            System.out.println("");

            daftarTiket.get(pilihan - 1).tampilkanInfo();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
