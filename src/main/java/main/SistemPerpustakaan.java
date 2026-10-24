package main;

import java.util.Scanner;
import sistemperpustakaan.LayananPerpustakaan;
import sistemperpustakaan.LokasiPenyimpanan;

public class SistemPerpustakaan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LayananPerpustakaan layanan = new LayananPerpustakaan();
        LokasiPenyimpanan lokasi = new LokasiPenyimpanan(2, 3, 5);
        
        int pilihan = 0;

        while (pilihan != 7) {
            System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN KAMPUS ===");
            System.out.println("1. Kelola Kategori & Stat Peminjaman (Array 1D & 2D)");
            System.out.println("2. Cek Lokasi Rak Buku (Array 3D)");
            System.out.println("3. Kelola Daftar Buku Dinamis (ArrayList)");
            System.out.println("4. Kelola Riwayat Transaksi (Stack - LIFO)");
            System.out.println("5. Kelola Antrean Peminjam (Queue - FIFO)");
            System.out.println("6. Tambah Data Peminjaman Harian (Array 2D)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Input harus angka!");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    layanan.tampilkanKategoriDanStatistik();
                    break;

                case 2:
                    System.out.println("\n--- CEK LOKASI BUKU (Array 3D) ---");
                    System.out.print("Masukkan Lantai (1-2): ");
                    int l = scanner.nextInt() - 1;
                    System.out.print("Masukkan Nomor Rak (1-3): ");
                    int r = scanner.nextInt() - 1;
                    System.out.print("Masukkan Posisi Slot (1-5): ");
                    int p = scanner.nextInt() - 1;
                    scanner.nextLine();

                    lokasi.cekLokasi(l, r, p);
                    break;

                case 3:
                    System.out.println("\n--- MANAJEMEN DAFTAR BUKU (ArrayList) ---");
                    System.out.println("1. Tampilkan Buku");
                    System.out.println("2. Tambah Buku");
                    System.out.println("3. Hapus Buku");
                    System.out.print("Pilih sub-menu: ");
                    int subMenu = scanner.nextInt();
                    scanner.nextLine();

                    if (subMenu == 1) {
                        layanan.tampilkanDaftarBuku();
                    } else if (subMenu == 2) {
                        System.out.print("Masukkan judul buku baru: ");
                        String bukuBaru = scanner.nextLine();
                        layanan.tambahBuku(bukuBaru);
                    } else if (subMenu == 3) {
                        System.out.print("Masukkan nomor buku yang dihapus: ");
                        int idx = scanner.nextInt() - 1;
                        scanner.nextLine();
                        layanan.hapusBuku(idx);
                    }
                    break;

                case 4:
                    System.out.println("\n--- RIWAYAT TRANSAKSI (Stack - LIFO) ---");
                    System.out.println("1. Lihat Riwayat Terakhir");
                    System.out.println("2. Batalkan Transaksi Terakhir (Pop)");
                    System.out.print("Pilih sub-menu: ");
                    int subStack = scanner.nextInt();
                    scanner.nextLine();

                    if (subStack == 1) {
                        layanan.lihatTransaksiTerakhir();
                    } else if (subStack == 2) {
                        layanan.batalkanTransaksi();
                    }
                    break;

                case 5:
                    System.out.println("\n--- ANTREAN MAHASISWA (Queue - FIFO) ---");
                    System.out.println("1. Masuk Antrean");
                    System.out.println("2. Layani Mahasiswa");
                    System.out.println("3. Lihat Daftar Antrean");
                    System.out.print("Pilih sub-menu: ");
                    int subQueue = scanner.nextInt();
                    scanner.nextLine();

                    if (subQueue == 1) {
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        String nama = scanner.nextLine();
                        layanan.masukAntrean(nama);
                    } else if (subQueue == 2) {
                        layanan.layaniMahasiswa();
                    } else if (subQueue == 3) {
                        layanan.lihatAntrean();
                    }
                    break;

                case 6:
                    System.out.println("\n--- INPUT DATA PEMINJAMAN HARIAN ---");
                    System.out.println("Pilih Kategori:");
                    String[] kat = layanan.getKategori();
                    for (int i = 0; i < kat.length; i++) {
                        System.out.println((i + 1) + ". " + kat[i]);
                    }
                    System.out.print("Pilihan (1-4): ");
                    int katIdx = scanner.nextInt() - 1;

                    System.out.println("Pilih Hari (1:Sen, 2:Sel, 3:Rab, 4:Kam, 5:Jum, 6:Sab, 7:Min): ");
                    int hariIdx = scanner.nextInt() - 1;

                    System.out.print("Masukkan Jumlah Peminjaman: ");
                    int jml = scanner.nextInt();
                    scanner.nextLine();

                    layanan.updatePeminjamanHarian(katIdx, hariIdx, jml);
                    break;

                case 7:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}