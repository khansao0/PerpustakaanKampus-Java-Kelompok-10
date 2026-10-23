# PerpustakaanKampus-Java-Kelompok-10

# Judul : Sistem Manajemen Perpustakaan Kampus

---

## 1. Deskripsi Singkat Program
Pada Program Sistem Manajemen Perpustakaan Kampus ini merupakan aplikasi berbasis Java yang dirancang untuk mengelola koleksi buku, lokasi penyimpanan spasial, rekap statistik peminjaman harian, antrean pelayanan mahasiswa, serta pencatatan riwayat transaksi secara terintegrasi. Program ini diimplementasikan dengan memisahkan modul ke dalam struktur package (Main dan Business Logic) untuk menerapkan prinsip Pemrograman Berorientasi Objek (PBO) serta mengintegrasikan 6 struktur data utama: Array 1D, Array 2D, Array 3D, ArrayList, Stack (LIFO), dan Queue (FIFO).

---

## 2. Informasi Tugas & Pengampu
- Mata Kuliah : Pemrograman Berorientasi Objek
- Dosen Pengampu : M. Ibadurrahman Arrasyid Supriyanto M.Kom.
- Program Studi : Sistem Informasi
- Angkatan : 2025
- Kelompok : 10

---

## 3. Anggota Kelompok 10
1. Nazmi Ramadani - 2509116031 (Kelas A)
2. Atha Rina Sarwahita - 2509116047 (Kelas B)
3. Naisyla Auliya Rahmi Putri - 2509116078 (Kelas B)
4. Qonitah Khansa’ Ayu Madani A. - 2509116113 (Kelas C)

---

## 4. Penjelasan Class & Atribut
Pada proyek ini, struktur program dibagi ke dalam dua package utama sesuai konsep pemisahan antar muka dan logika bisnis:

Pada Package sistemperpustakaan :

- Buku
  * Atribut: judul (private String)
  * Method: Buku(String judul), getJudul(), setJudul(String judul), toString()

- LokasiPenyimpanan
  * Atribut: lokasiBuku (private String[][][] Array 3D)
  * Method: LokasiPenyimpanan(int lantai, int rak, int posisi), cekLokasi(int lantai, int rak, int posisi)

- LayananPerpustakaan
  * Atribut: kategori (private String[] Array 1D), dataPeminjaman (private int[][] Array 2D), daftarBuku (
  * Method: tampilkanKategoriDanStatistik(), updatePeminjamanHarian(), tampilkanDaftarBuku(), tambahBuku(), hapusBuku(), catatTransaksi(), lihatTransaksiTerakhir(), batalkanTransaksi(), masukAntrean(), layaniMahasiswa(), lihatAntrean(), getKategori()

Pada Package main :

- SistemPerpustakaan (Main Class & Entry Point)
  * Atribut: scanner (Scanner), layanan (Objek LayananPerpustakaan), lokasi (Objek LokasiPenyimpanan), pilihan (int)
  * Method: main(String[] args)

---

## 5. Penjelasan Struktur Package
Struktur package pada proyek ini disusun untuk memisahkan kelas sesuai perannya:
- main : Berisi kelas utama SistemPerpustakaan.java yang menangani alur eksekusi program, antarmuka pengguna CLI, dan navigasi menu interaktif menggunakan Scanner.
- sistemperpustakaan : Berisi kelas entitas data (Buku.java), pengelola struktur data lokasi spasial (LokasiPenyimpanan.java), dan kelas pengelola logika bisnis layanan transaksi perpustakaan (LayananPerpustakaan.java).

---

## 6. Penjelasan Implementasi 6 Struktur Data
Program wajib mengimplementasikan enam konsep struktur data yang saling terintegrasi:
1. Array 1 Dimensi (1D): Digunakan pada variabel kategori untuk menyimpan daftar kategori buku linier berukuran tetap (Pemrograman, Matematika, Jaringan Komputer, Basis Data).
2. Array 2 Dimensi (2D): Digunakan pada variabel dataPeminjaman matriks [4][7] untuk merekapitulasi statistik jumlah peminjaman buku berdasarkan 4 kategori dan 7 hari harian.
3. Array 3 Dimensi (3D): Digunakan pada variabel lokasiBuku [2][3][5] untuk merepresentasikan posisi fisik penyimpanan buku berdasarkan koordinat lantai, nomor rak, dan slot posisi.
4. ArrayList: Digunakan pada daftarBuku bertipe objek ArrayList<Buku> untuk mengelola koleksi buku secara dinamis mencakup penambahan, penampilan, dan penghapusan data.
5. Stack (LIFO): Digunakan pada riwayatTransaksi bertipe Stack<String> untuk mencatat log aktivitas sistem sehingga transaksi terakhir dapat dilihat (peek) atau dibatalkan (pop).
6. Queue (FIFO): Digunakan pada antreanMahasiswa bertipe Queue<String> (LinkedList) untuk mengelola antrean layanan peminjaman mahasiswa berdasarkan urutan pertama masuk pertama dilayani.

---

## 7. Penjelasan Alur Program
Alur jalannya sistem perpustakaan kampus adalah sebagai berikut:
1. Program pertama kali dijalankan dari kelas SistemPerpustakaan.java pada package main yang menginisialisasi objek LayananPerpustakaan, LokasiPenyimpanan, dan Scanner.
2. Program menampilkan antarmuka menu interaktif CLI dengan 7 pilihan menu utama:
   - 1. Kelola Kategori & Stat Peminjaman (Array 1D & 2D): Menampilkan daftar kategori buku beserta tabel matriks rekapitulasi jumlah peminjaman mingguan harian.
   - 2. Cek Lokasi Rak Buku (Array 3D): Pengguna memasukkan nomor lantai, nomor rak, dan slot posisi untuk mencari ketersediaan buku pada koordinat ruang 3D.
   - 3. Kelola Daftar Buku Dinamis (ArrayList): Menyediakan sub-menu untuk menampilkan seluruh daftar buku, menambahkan buku baru ke dalam koleksi, atau menghapus buku berdasarkan nomor indeks.
   - 4. Kelola Riwayat Transaksi (Stack - LIFO): Menyediakan sub-menu untuk melihat log aktivitas terakhir (peek) atau membatalkan transaksi paling atas (pop).
   - 5. Kelola Antrean Peminjam (Queue - FIFO): Menyediakan sub-menu untuk mendaftarkan nama mahasiswa ke antrean (enqueue), melayani peminjaman mahasiswa urutan terdepan (dequeue), atau melihat daftar antrean.
   - 6. Tambah Data Peminjaman Harian (Array 2D): Pengguna memilih kategori buku, hari, dan menginputkan jumlah peminjaman baru untuk memperbarui data matriks peminjaman.
   - 7. Keluar: Menghentikan perulangan menu dan menutup aplikasi dengan pesan terima kasih.

---

## 8. Penjelasan Penerapan Encapsulation & PBO
- Encapsulation: Seluruh atribut pada class Buku, LokasiPenyimpanan, dan LayananPerpustakaan dideklarasikan dengan access modifier private. Akses dan manipulasi data dari luar class hanya dilakukan melalui method getter, setter, atau method operasi publik.
- Modular Architecture: Pemisahan package antara kelas main dan kelas bisnis logic menjamin keamanan struktur kode dan mempermudah pemeliharaan program.

---

## 9. Dokumentasi Output Program & Implementasi Code

### 1. Tampilan Awal Menu Utama <br>
<img width="834" alt="image" src="https://github.com/user-attachments/assets/cb85840d-1149-46cc-9560-da0cd0f264d1" /> <br>
Gambar 1: Tampilan menu interaktif utama program saat pertama kali dijalankan dari SistemPerpustakaan.java.

---

### 2. Cek Kategori & Statistik Peminjaman (Array 1D & 2D) <br>
<img width="832" alt="image" src="https://github.com/user-attachments/assets/b857e7d7-ac64-4e99-b16f-f94a2676dd09" /> <br>
Gambar 2: Eksekusi Menu 1 yang menampilkan daftar kategori buku (Array 1D) dan tabel matriks rekap peminjaman harian (Array 2D).

---

### 3. Cek Lokasi Buku (Array 3D) <br>
<img width="754" alt="image" src="https://github.com/user-attachments/assets/b9ae8639-b855-4290-b709-c7f09586cc81" /> <br>
Gambar 3: Eksekusi Menu 2 pencarian lokasi buku berdasarkan input lantai, rak, dan posisi slot pada Array 3D.


---

### 4. Kelola Daftar Buku Dinamis (ArrayList) <br>
<img width="658" alt="image" src="https://github.com/user-attachments/assets/44c3024a-097e-4576-a2c7-03dbe1acc500" /> <br>
Gambar 4: Tampilan koleksi buku awal pada Menu 3 Sub-menu 1. <br>

<img width="775" alt="image" src="https://github.com/user-attachments/assets/98835d7b-96d5-441e-8096-725beaa34e80" /> <br>
Gambar 5: Proses penambahan buku baru "Struktur Data" melalui Menu 3 Sub-menu 2. <br>

<img width="803" alt="image" src="https://github.com/user-attachments/assets/5e0a116e-37c9-4005-bae1-e87a57ba4512" /> <br>
Gambar 6: Bukti terverifikasi bahwa buku "Struktur Data" telah masuk ke urutan ke-4 daftar koleksi buku.

---

### 5. Antrean Mahasiswa (Queue / FIFO) <br>
<img width="589" alt="image" src="https://github.com/user-attachments/assets/4c5db2ad-d865-4c95-880a-837c22eef372" /> <br>
Gambar 7: Tampilan pengecekan awal saat antrean mahasiswa masih kosong. <br>

<img width="589" alt="image" src="https://github.com/user-attachments/assets/e978efac-d462-4268-a4eb-cf1888947ddd" /> <br>
Gambar 8: Proses memasukkan nama mahasiswa ke dalam antrean (enqueue). <br>

<img width="653" alt="image" src="https://github.com/user-attachments/assets/16794662-d417-430a-8c20-c5950a72ae10" /> <br>
Gambar 9: Memproses peminjaman untuk mahasiswa urutan terdepan sesuai prinsip FIFO

---

### 6. Riwayat Transaksi <br>
<img width="631" alt="image" src="https://github.com/user-attachments/assets/d4d7a335-a61f-4cb8-9e1f-caa088df1384" /> <br>
gambar 10: Melihat riwayat transaksi yang udah dilayani tadi

<img width="723" alt="image" src="https://github.com/user-attachments/assets/06eb6bd8-f1b7-4e43-b0dd-a11b118986db" /> <br>
gambar 11: Ingin membatalkan transaksi terakhir dan muncul output “Berhasil membatalkan transaksi : Melayani peminjaman mhs: Rama ketua capstone”

---

### 7. Update Data Peminjaman Harian (Array 2D) <br>
<img width="625" alt="image" src="https://github.com/user-attachments/assets/c2039c5d-e2a2-47a9-a0c4-e71f64f5f18c" /> <br>
gambar 12: Sudah memilih kategori peminjaman, hari, dan jumlah peminjaman dan muncul output 
“Data peminjaman berhasil diperbarui” setelah menginputkan angka peminjaman harian. <br>

---

### 8. Keluar Program <br>
<img width="739" alt="image" src="https://github.com/user-attachments/assets/5158cc1a-8391-4fa4-8bd8-19cfe94def8a" /> <br>
gambar 13: Tampilan pesan penutup aplikasi saat pengguna memilih menu 7.


