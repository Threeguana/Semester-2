public class MataKuliahMain02 {
    public static void main(String[] args) {
        MataKuliah02 mk1 = new MataKuliah02();
        mk1.tampilInformasi();

        MataKuliah02 mk2 = new MataKuliah02("IF101", "Algoritma", 3, 45);
        mk2.tampilInformasi();

        mk1.ubahSKS(2);
        mk1.tambahJam(20);
        mk1.tampilInformasi();

        mk2.tambahJam(5);
        mk2.kurangiJam(10);
        mk2.tampilInformasi();
    }
}
