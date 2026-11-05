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
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class NilaiTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};
    private final List<NilaiMahasiswa> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        NilaiMahasiswa n = daftar.get(baris);
        return switch (kolom) {
            case 0 -> n.npm();
            case 1 -> n.nama();
            case 2 -> n.tugas();
            case 3 -> n.uts();
            case 4 -> n.uas();
            case 5 -> NilaiMahasiswa.formatNilai(n.nilaiAkhir());
            default -> n.hurufMutu();
        };
    }

    public void tambah(NilaiMahasiswa data) {
        daftar.add(data);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public boolean adaNpm(String npm) {
        for (NilaiMahasiswa n : daftar) {
            if (n.npm().equals(npm)) {
                return true;
            }
        }
        return false;
    }

    public double rataRataAkhir() {
        if (daftar.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (NilaiMahasiswa n : daftar) {
            total += n.nilaiAkhir();
        }
        return total / daftar.size();
    }
}