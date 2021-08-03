public class Container {
    private int tinggi;
    private int lebar;
    private String jenis;
    private String material;
    private boolean waterProof;

    public Container(int tinggi, int lebar, String jenis, String material, boolean waterProof) {
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.jenis = jenis;
        this.material = material;
        this.waterProof = waterProof;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public String getJenis() {
        return jenis;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isWaterProof() {
        return waterProof;
    }
}
