public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Pak Yudhi", "111111");
        Dosen d2 = new Dosen("Pak Fajar", "222222");
        Dosen d3 = new Dosen("Pak Imam", "333333");
        Dosen d4 = new Dosen("Pak Supeno", "444444");
        Dosen d5 = new Dosen("Bu Bilqis", "555555");

        MataKuliah mk1 = new MataKuliah("IF101", "Dasar Pemrograman", 4, d1);
        MataKuliah mk2 = new MataKuliah("IF102", "Sistem Digital", 3, d4);
        MataKuliah mk3 = new MataKuliah("IF201", "Sistem Basis Data", 4, d3);
        MataKuliah mk4 = new MataKuliah("IF202", "Aljabar Linear", 3, d5);
        MataKuliah mk5 = new MataKuliah("IF303", "Kalkulus 1", 3, d2);
    
        Mahasiswa mhs = new Mahasiswa("Lucky Himawan", "5025241147");

        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        mhs.tambahMataKuliah(mk3);
        mhs.tambahMataKuliah(mk4);
        mhs.tambahMataKuliah(mk5);

        mhs.tampilkanFRS();
    }
}
