import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int berat = 0;
        int jarak = 0;

        Scanner sc= new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.000");

        PajakUSA pajakUSA = new PajakUSA(0.000070);
        PajakEropa pajakEropa = new PajakEropa(0.000059);


        PajakAdapterUSA adapterUSA = new PajakAdapterUSA(pajakUSA);
        PajakAdapterEropa adapterEropa = new PajakAdapterEropa(pajakEropa);

        System.out.println("=== Perhitungan Pajak Pengiriman Barang antar Gudang ===========");
        System.out.print("Jarak (km) : ");
        jarak = Integer.parseInt(sc.nextLine());
        System.out.print("Berat (kg) : ");
        berat = Integer.parseInt(sc.nextLine());
        System.out.println("================================================================");
        System.out.println("Pajak Pengiriman Antar Gudang di USA");
        System.out.println("$USD : $"+formatter.format(adapterUSA.hitungPajak(berat,jarak)));
        System.out.println("Pajak Pengiriman Antar Gudang di Eropa");
        System.out.println("€EUR : €"+formatter.format(adapterEropa.hitungPajak(berat,jarak)));
        System.out.println("================================================================");
    }
}
