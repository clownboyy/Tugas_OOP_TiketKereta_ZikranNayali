/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.penjualantiketkereta;

/**
 *
 * @author HYPE AMD
 */
public class PenjualanTiketKereta {

    public static void main(String[] args) {
        Tiket penumpang1 = new TiketEksekutif("Zikran", "EKS-17", 150000);
        
        penumpang1.tampilkanInfo();
    }
}
