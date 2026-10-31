# Tugas 7 - Tabel, Menu, dan Dialog (Aplikasi Daftar Kontak)

**Nama:** M. Radu Al-malikar
**NPM:** 2410010095

## Isi Proyek
- `Kategori`, `Kontak`, dan `KontakTableModel` (kelas model)
- `DialogKontak` (JDialog Form, file .java dan .form)
- `AplikasiKontak` (JFrame Form, file .java dan .form)

## Eksperimen Praktikum 5

1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu tambah kontak baru. Apakah tabel langsung berubah?

- Tidak. Kontak baru sudah masuk ke daftar di model, tetapi tabel tidak diberi tahu sehingga tidak menggambar ulang. Baris baru baru terlihat setelah tabel digambar ulang, misalnya saat mengurutkan kolom.

2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata "ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?

- Yang muncul nama Budi Santoso. Setelah dicari, Ahmad Fauzi ada di baris tampilan 1, tetapi di model ia berada di baris 2. Tanpa convertRowIndexToModel, nomor baris tampilan (1) dipakai sebagai nomor baris model sehingga yang terambil Budi Santoso.

3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka, coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?

- Jendela utama bisa diklik saat dialog terbuka, karena dialog tidak lagi mengunci jendela pemiliknya. setVisible(true) langsung lanjut ke baris berikutnya tanpa menunggu dialog ditutup, sehingga tampilkan() mengembalikan null dan kontak yang ditambahkan tidak masuk ke tabel.

4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?

- Karena perbaruiTombol() menonaktifkan ubahItem dan hapusItem saat tidak ada baris terpilih. Item menu yang nonaktif tidak merespons pintasan keyboard-nya. Ctrl+N tetap bekerja karena tambahItem selalu aktif.

5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di initComponents()?

- Baris hapusItem.setAccelerator(...) berubah: KeyEvent.VK_D menjadi KeyEvent.VK_DELETE, dan InputEvent.CTRL_DOWN_MASK menjadi 0 karena tanpa tombol Ctrl.

6. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan mengapa?

- Muncul error saat aplikasi dibuka: IllegalArgumentException: Cannot set a null TableModel. initComponents() dipanggil di awal konstruktor dan menjalankan kontakTable.setModel(model), padahal model masih null karena baru dibuat setelah initComponents(). Karena itu atribut model harus sudah dibuat saat dideklarasikan.
