import java.util.ArrayList;
import java.util.List;

public class Gudang {
    private static Gudang gudangInstance = null;
    List<Barang> daftarBarang = new ArrayList<Barang>();;
    int jumlahPadatBesarTersimpan=0;
    int jumlahPadatKecilTersimpan=0;
    int jumlahCairTersimpan=0;
    int totalBeratbarang=0;

    public static Gudang getInstance(){
        if (gudangInstance == null)
            gudangInstance = new Gudang();

        return gudangInstance;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }
}
