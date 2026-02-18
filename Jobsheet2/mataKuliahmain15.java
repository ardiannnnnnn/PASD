public class mataKuliahmain15 {
    public static void main(String[] args) {

        mataKuliah15 mk1 = new mataKuliah15();
        mk1.kodeMK = "ALSD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        mataKuliah15 mk2 = new mataKuliah15(
                "BD02",
                "Basis Data",
                3,
                6);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
    }
}
