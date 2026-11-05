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
public final class Validator {

    private Validator() {
    }

    public static String npm(String npm) {
        if (!npm.trim().matches("\\d{10}")) {
            return "NPM harus 10 digit angka";
        }
        return null;
    }

    public static String nama(String nama) {
        if (nama.isBlank()) {
            return "Nama wajib diisi";
        }
        return null;
    }

    public static String nilai(String teks, String namaNilai) {
        String t = teks.trim();
        if (!t.matches("\\d{1,3}") || Integer.parseInt(t) > 100) {
            return "Nilai " + namaNilai + " harus angka bulat 0 sampai 100";
        }
        return null;
    }
}