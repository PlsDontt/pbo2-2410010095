/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package id.ac.uniska.pbo2.p08;
/**
 *
 * Nama : M.Radu al-malikar
 * NPM : 2410010095
 * 
 */
import java.util.Locale;

public record NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {

    public double nilaiAkhir() {
        return (tugas * 30 + uts * 30 + uas * 40) / 100.0;
    }

    public String hurufMutu() {
        double akhir = nilaiAkhir();
        if (akhir >= 80) {
            return "A";
        }
        if (akhir >= 75) {
            return "B+";
        }
        if (akhir >= 70) {
            return "B";
        }
        if (akhir >= 65) {
            return "C+";
        }
        if (akhir >= 60) {
            return "C";
        }
        if (akhir >= 40) {
            return "D";
        }
        return "E";
    }

    public static String formatNilai(double nilai) {
        return String.format(Locale.forLanguageTag("id-ID"), "%.2f", nilai);
    }
}