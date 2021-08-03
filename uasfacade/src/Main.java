public class Main {

    public static void main(String[] args) {
        ShipmentTracker tracker = new ShipmentTracker();

        System.out.println("Menambahkan Pengiriman Baru");
        tracker.addRotiShipment("Bandung",1101,"Mengirim");
        tracker.addRotiShipment("Bali",420,"Mengirim");
        tracker.addSelaiShipment("Jakarta",69,"Mengirim");
        System.out.println("");

        System.out.println("Cek Semua Pengiriman");
        tracker.checkAllShipment();
        System.out.println("");

        System.out.println("Perbarui Status Pengiriman===");
        tracker.updateSelaiShipment(69,"Terkirim");
        tracker.updateRotiShipment(1101,"Bad Address");
        System.out.println("");

        System.out.println("Cek Pengiriman lagi");
        tracker.checkAllShipment();
    }
}
