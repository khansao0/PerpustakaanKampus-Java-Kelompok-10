# PerpustakaanKampus-Java-Kelompok-10

# Judul : Sistem Manajemen Perpustakaan Kampus

---

## 1. Deskripsi Singkat Program
Program Sistem Manajemen Perpustakaan Kampus ini merupakan aplikasi berbasis Java CLI yang dirancang untuk mengelola koleksi buku, lokasi penyimpanan spasial, rekap statistik peminjaman harian, antrean pelayanan mahasiswa, serta pencatatan riwayat transaksi secara terintegrasi. Program ini diimplementasikan dengan memisahkan modul ke dalam struktur package (Main dan Business Logic) untuk menerapkan prinsip Pemrograman Berorientasi Objek (PBO) serta mengintegrasikan 6 struktur data utama: Array 1D, Array 2D, Array 3D, ArrayList, Stack (LIFO), dan Queue (FIFO).

---

## 2. Informasi Tugas & Pengampu
- Mata Kuliah : Pemrograman Berorientasi Objek
- Dosen Pengampu : M. Ibadurrahman Arrasyid Supriyanto M.Kom.
- Program Studi : Sistem Informasi
- Angkatan : 2025
- Kelompok : 10

---

## 3. Anggota Kelompok 10
1. Nazmi Ramadani - 2509116031 - Kelas C
2. Atha Rina Sarwahita - 2509116047 - Kelas C
3. Naisyla Auliya Rahmi Putri - 2509116078 - Kelas C
4. Qonitah Khansa’ Ayu Madani A. - 2509116113 - Kelas C

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
