public class SimpanPadatBesar implements SimpanStrategy {
    private Gudang gudang = Gudang.getInstance();

    @Override
    public void simpanBarang(String namaBarang, int jumlah, int beratKg, String jenisBarang) {
        Barang barang = new Barang(namaBarang, jumlah, beratKg, jenisBarang);

        gudang.jumlahPadatBesarTersimpan += jumlah;
        gudang.totalBeratbarang += barang.beratSatuan*barang.jumlah;
        gudang.daftarBarang.add(barang);
    }
}
