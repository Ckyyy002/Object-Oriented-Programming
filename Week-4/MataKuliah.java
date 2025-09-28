public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String nama, int sks, Dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS) | Dosen: " + dosenPengampu;
    }
}
