package sistemperpustakaan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LayananPerpustakaan {

    // 1. Array 1D: Kategori Buku
    private String[] kategori = {"Pemrograman", "Matematika", "Jaringan Komputer", "Basis Data"};

    // 2. Array 2D: Jumlah peminjaman (4 Kategori x 7 Hari)
    private int[][] dataPeminjaman = new int[4][7];

    // 4. ArrayList: Daftar Buku Dinamis
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    // 5. Stack (LIFO): Riwayat Transaksi
    private Stack<String> riwayatTransaksi = new Stack<>();

    // 6. Queue (FIFO): Antrean Mahasiswa
    private Queue<String> antreanMahasiswa = new LinkedList<>();

    public LayananPerpustakaan() {
        // Inisialisasi data sampel awal untuk ArrayList
        daftarBuku.add(new Buku("Java Programming"));
        daftarBuku.add(new Buku("Kalkulus Dasar"));
        daftarBuku.add(new Buku("Jaringan Komputer Lanjut"));
    }

    // Array 1D & 2D Operations
    public void tampilkanKategoriDanStatistik() {
        System.out.println("\n--- DAFTAR KATEGORI BUKU (Array 1D) ---");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }

        System.out.println("\n--- REKAP PEMINJAMAN MINGGUAN (Array 2D) ---");
        System.out.println("Kategori\t\tSen\tSel\tRab\tKam\tJum\tSab\tMin");
        for (int i = 0; i < dataPeminjaman.length; i++) {
            System.out.print(kategori[i] + (i == 2 ? "\t" : "\t\t"));
            for (int j = 0; j < dataPeminjaman[i].length; j++) {
                System.out.print(dataPeminjaman[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void updatePeminjamanHarian(int katIdx, int hariIdx, int jumlah) {
        if (katIdx >= 0 && katIdx < kategori.length && hariIdx >= 0 && hariIdx < 7) {
            dataPeminjaman[katIdx][hariIdx] += jumlah;
            catatTransaksi("Update data peminjaman kategori " + kategori[katIdx]);
            System.out.println("Data peminjaman berhasil diperbarui.");
        } else {
            System.out.println("Indeks kategori atau hari tidak valid!");
        }
    }

    // ArrayList Operations
    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku saat ini:");
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada koleksi buku.");
        } else {
            for (int i = 0; i < daftarBuku.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBuku.get(i).getJudul());
            }
        }
    }

    public void tambahBuku(String judulBaru) {
        daftarBuku.add(new Buku(judulBaru));
        catatTransaksi("Menambah buku: " + judulBaru);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void hapusBuku(int index) {
        if (index >= 0 && index < daftarBuku.size()) {
            Buku dihapus = daftarBuku.remove(index);
            catatTransaksi("Menghapus buku: " + dihapus.getJudul());
            System.out.println("Buku '" + dihapus.getJudul() + "' berhasil dihapus.");
        } else {
            System.out.println("Nomor buku tidak ditemukan!");
        }
    }

    // Stack Operations (LIFO)
    private void catatTransaksi(String ket) {
        riwayatTransaksi.push(ket);
    }

    public void lihatTransaksiTerakhir() {
        if (!riwayatTransaksi.isEmpty()) {
            System.out.println("Transaksi Terakhir: " + riwayatTransaksi.peek());
        } else {
            System.out.println("Belum ada riwayat transaksi.");
        }
    }

    public void batalkanTransaksi() {
        if (!riwayatTransaksi.isEmpty()) {
            String batal = riwayatTransaksi.pop();
            System.out.println("Berhasil membatalkan transaksi: " + batal);
        } else {
            System.out.println("Riwayat transaksi kosong, tidak ada yang dibatalkan.");
        }
    }

    // Queue Operations (FIFO)
    public void masukAntrean(String nama) {
        antreanMahasiswa.add(nama);
        System.out.println(nama + " berhasil masuk antrean.");
    }

    public void layaniMahasiswa() {
        if (!antreanMahasiswa.isEmpty()) {
            String dilayani = antreanMahasiswa.poll();
            catatTransaksi("Melayani peminjaman mhs: " + dilayani);
            System.out.println("Mahasiswa dilayani: " + dilayani);
        } else {
            System.out.println("Antrean kosong!");
        }
    }

    public void lihatAntrean() {
        System.out.println("Daftar Antrean Saat Ini: " + antreanMahasiswa);
    }

    public String[] getKategori() {
        return kategori;
    }
}