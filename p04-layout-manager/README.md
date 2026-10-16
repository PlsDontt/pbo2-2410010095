# Tugas 4 

**Nama:** M. Radu Al-malikar
**NPM:** 2410010095


Eksperimen Pratikum 2:
1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris
mana di initComponents() yang ikut berubah?

- Button berubah ketengah saat jendela dikecilkan lalu baris berubah di flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8));

2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?

- karena rows nya 0 dia otomatis mengisi columns yaitu 2 lalu button akan ke baris berikutnya

3. Pada boxPanel, isi properti maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan
tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut dari kategori Swing Fillers di
antara tombol.

- Lebar tombol berubah dari selebar teksnya menjadi memenuhi lebar panel, karena BoxLayout mengikuti ukuran maximumSize. Saat jendela dilebarkan, keempat tombol ikut melebar. 

Eksperimen Pratikum 4:
1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?

- Tidak ada perubahan, namaField tetap ikut melebar. Di GridBagLayout, pembagian sisa lebar dihitung per kolom dari Weight X terbesar di kolom itu. Isian lain di kolom 1 masih 1.0, jadi kolomnya tetap melebar dan namaField yang Fill-nya Horizontal tetap memenuhi selnya.

2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa perbedaannya?

- Saat jendela ditinggikan, formPanel ikut mengisi seluruh tinggi isiPanel sehingga baris-baris form turun ke tengah dan ada ruang kosong di atas dan bawah. Dengan North, formPanel hanya setinggi isinya sehingga baris form tetap menempel di atas.

3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian mana yang rusak lebih dulu?

- Tanpa setMinimumSize, jendela bisa dikecilkan sampai lebih kecil dari ukuran awalnya. Isian dan teks mulai terpotong, lalu bagian bawah form ikut tertutup. Dengan setMinimumSize, jendela berhenti di ukuran awal sehingga semua komponen tetap terlihat.


