import java.util.ArrayList;

public class RotiShipment implements Shipment {

    private String tujuan;
    private int shippingNumber;
    private String status;
    private ArrayList<RotiShipment> rotiShipments = new ArrayList<>();

    public RotiShipment() {

    }

    private RotiShipment(String tujuan, int shippingNumber, String status) {
        this.tujuan = tujuan;
        this.shippingNumber = shippingNumber;
        this.status = status;
    }

    @Override
    public void addShipment(String tujuan, int shippingNumber, String status) {
        RotiShipment rotiShipment = new RotiShipment(tujuan, shippingNumber, status);
        rotiShipments.add(rotiShipment);
        System.out.println("Berhasil mengirimkan roti baru ke : " + tujuan);
    }

    @Override
    public void checkShipment() {
        for (int i = 0; i < rotiShipments.size(); i++) {
            System.out.println("===Pengiriman Roti===");
            System.out.println("Tujuan : " + rotiShipments.get(i).tujuan);
            System.out.println("Nomor Pengiriman : " + rotiShipments.get(i).shippingNumber);
            System.out.println("Status : " + rotiShipments.get(i).status);
        }
    }

    @Override
    public void updateShipment(int shippingNumber, String status) {
        for (int i = 0; i < rotiShipments.size(); i++) {
            if (rotiShipments.get(i).shippingNumber == shippingNumber) {
                rotiShipments.get(i).status = status;
            }
        }
    }
}
