public class MataKuliah02 {
    String kodeMK,nama;
    int sks, jumlahJam;

    public MataKuliah02() {
        this.kodeMK = "JDK25";
        this.nama = "Basis Data";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah02(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("=========================");
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("=========================");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam - jam >= 0) {
            this.jumlahJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak valid");
        }
    }
}
