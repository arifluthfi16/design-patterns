public class ContainerBuilder implements Builder {
    private int tinggi;
    private int lebar;
    private String jenis;
    private String material;
    private boolean waterProof;

    @Override
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setWaterProof(boolean waterProof) {
        this.waterProof = waterProof;
    }

    @Override
    public Container getContainer() {
        return new Container(tinggi, lebar, jenis, material, waterProof);
    }
}
