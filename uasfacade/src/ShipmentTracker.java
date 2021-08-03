public class ShipmentTracker {
    private Shipment rotiTracker;
    private Shipment selaiTracker;

    public ShipmentTracker() {
        rotiTracker = new RotiShipment();
        selaiTracker = new SelaiShipment();
    }

    public void addRotiShipment(String tujuan, int shippingNumber, String status) {
        rotiTracker.addShipment(tujuan, shippingNumber, status);
    }

    public void checkAllShipment() {
        rotiTracker.checkShipment();
        selaiTracker.checkShipment();
    }

    public void updateRotiShipment(int shippingNumber, String status) {
        rotiTracker.updateShipment(shippingNumber, status);
    }

    public void addSelaiShipment(String tujuan, int shippingNumber, String status) {
        selaiTracker.addShipment(tujuan, shippingNumber, status);
    }

    public void updateSelaiShipment(int shippingNumber, String status) {
        selaiTracker.updateShipment(shippingNumber, status);
    }
}
