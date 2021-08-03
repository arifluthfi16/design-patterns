public interface Shipment {
    public void addShipment(String tujuan, int shippingNumber, String status);
    public void checkShipment();
    public void updateShipment(int shippingNumber, String status);
}
