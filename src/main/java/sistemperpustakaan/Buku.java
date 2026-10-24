package sistemperpustakaan;

public class Buku {
    private String judul;

    // Constructor dengan parameter judul
    public Buku(String judul) {
        this.judul = judul;
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Setter untuk judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Override
    public String toString() {
        return judul;
    }
}