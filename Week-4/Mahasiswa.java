import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nrp;
    private ArrayList<MataKuliah> daftarMatkul;
    private static final int MAKS_SKS = 24; // batas maksimum SKS

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
        this.daftarMatkul = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        int totalSksSekarang = hitungTotalSks();
        if (totalSksSekarang + mk.getSks() <= MAKS_SKS) {
            daftarMatkul.add(mk);
            System.out.println("Mata kuliah " + mk.getNama() + " berhasil ditambahkan.");
        } else {
            System.out.println("Gagal menambahkan " + mk.getNama() +
                               ". Total SKS melebihi batas (" + MAKS_SKS + ").");
        }
    }

    public void hapusMataKuliah(MataKuliah mk) {
        if (daftarMatkul.remove(mk)) {
            System.out.println("Mata kuliah " + mk.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("Mata kuliah tidak ditemukan dalam FRS.");
        }
    }

    public void tampilkanFRS() {
        System.out.println("\nFRS Mahasiswa: " + nama + " (NRP: " + nrp + ")");
        int totalSks = 0;
        for (MataKuliah mk : daftarMatkul) {
            System.out.println("- " + mk);
            totalSks += mk.getSks();
        }
        System.out.println("Total SKS: " + totalSks + "/" + MAKS_SKS);
    }

    private int hitungTotalSks() {
        int total = 0;
        for (MataKuliah mk : daftarMatkul) {
            total += mk.getSks();
        }
        return total;
    }
}
