package sistemperpustakaan;

public class LokasiPenyimpanan {
    // Array 3D: [Lantai][Rak][Posisi]
    private String[][][] lokasiBuku;

    public LokasiPenyimpanan(int lantai, int rak, int posisi) {
        this.lokasiBuku = new String[lantai][rak][posisi];
        
        // Inisialisasi data sampel awal
        lokasiBuku[0][0][0] = "Java Programming";
        lokasiBuku[0][1][2] = "Kalkulus Dasar";
        lokasiBuku[1][0][1] = "Jaringan Komputer Lanjut";
    }

    public void cekLokasi(int lantai, int rak, int posisi) {
        if (lantai >= 0 && lantai < lokasiBuku.length && 
            rak >= 0 && rak < lokasiBuku[0].length && 
            posisi >= 0 && posisi < lokasiBuku[0][0].length) {
            
            String buku = lokasiBuku[lantai][rak][posisi];
            if (buku != null) {
                System.out.println("Buku di lantai " + (lantai + 1) + 
                                   ", rak " + (rak + 1) + 
                                   ", slot " + (posisi + 1) + ": " + buku);
            } else {
                System.out.println("Slot di lantai " + (lantai + 1) + 
                                   ", rak " + (rak + 1) + 
                                   ", slot " + (posisi + 1) + " masih kosong.");
            }
        } else {
            System.out.println("Indeks lokasi tidak valid!");
        }
    }
}