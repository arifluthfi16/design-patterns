import java.util.ArrayList;

public class SelaiShipment implements Shipment {

    private String tujuan;
    private int shippingNumber;
    private String status;
    private ArrayList<SelaiShipment> selaiShipments = new ArrayList<>();

    public SelaiShipment() {

    }

    private SelaiShipment(String tujuan, int shippingNumber, String status) {
        this.tujuan = tujuan;
        this.shippingNumber = shippingNumber;
        this.status = status;
    }

    @Override
    public void addShipment(String tujuan, int shippingNumber, String status) {
        SelaiShipment selaiShipment = new SelaiShipment(tujuan, shippingNumber, status);
        selaiShipments.add(selaiShipment);
        System.out.println("Berhasil mengirimkan selai baru ke : " + tujuan);
    }

    @Override
    public void checkShipment() {
        for (int i = 0; i < selaiShipments.size(); i++) {
            System.out.println("===Pengiriman Selai===");
            System.out.println("Tujuan : " + selaiShipments.get(i).tujuan);
            System.out.println("Nomor Pengiriman : " + selaiShipments.get(i).shippingNumber);
            System.out.println("Status : " + selaiShipments.get(i).status);
        }
    }

    @Override
    public void updateShipment(int shippingNumber, String status) {
        for (int i = 0; i < selaiShipments.size(); i++) {
            if (selaiShipments.get(i).shippingNumber == shippingNumber) {
                selaiShipments.get(i).status = status;
            }
        }
    }
}
