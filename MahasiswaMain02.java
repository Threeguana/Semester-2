public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa02 mhsAndini = new Mahasiswa02("Andini", "244107060140", "SIB 1E", 3.80);

        Mahasiswa02 mhs1 = new Mahasiswa02();
        
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa02 mhs2 = new Mahasiswa02("Annisa Nabila", "2141720160", 3.25, "TI 2L");

        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}
