public class Director {
    public void createContainerPadat(ContainerBuilder builder){
        builder.setTinggi(30);
        builder.setLebar(30);
        builder.setJenis("Padat");
        builder.setMaterial("PVC");
        builder.setWaterProof(false);
    }

    public void createContainerCair(ContainerBuilder builder){
        builder.setTinggi(30);
        builder.setLebar(30);
        builder.setJenis("Cair");
        builder.setMaterial("Aluminium");
        builder.setWaterProof(true);
    }
}
