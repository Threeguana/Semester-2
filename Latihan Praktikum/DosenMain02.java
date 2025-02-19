public class DosenMain02 {
    public static void main(String[] args) {
        Dosen02 dosen1 = new Dosen02();
        dosen1.tampilInformasi();
        
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Sistem Informasi");
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.tampilInformasi();
        
        Dosen02 dosen2 = new Dosen02("D002", "Dr. Budi", true, 2010, "Machine Learning");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");

        dosen2.ubahKeahlian("Kecerdasan Buatan");
        dosen2.tampilInformasi();
    }
}
