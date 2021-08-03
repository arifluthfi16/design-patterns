public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        ContainerBuilder builder = new ContainerBuilder();
        director.createContainerCair(builder);

        Container containerCair = builder.getContainer();

        director.createContainerPadat(builder);
        Container containerPadat = builder.getContainer();

        System.out.println("==== Print Informasi Container Baru Dibuat ===============");
        System.out.println("= Container 1 ====");
        System.out.println("= Jenis         : "+containerCair.getJenis());
        System.out.println("= Tinggi        : "+containerCair.getTinggi());
        System.out.println("= Lebar         : "+containerCair.getLebar());
        System.out.println("= Material      : "+containerCair.getMaterial());
        System.out.println("= Water Proof   : "+containerCair.isWaterProof());
        System.out.println("= Container 2 ====");
        System.out.println("= Jenis         : "+containerPadat.getJenis());
        System.out.println("= Tinggi        : "+containerPadat.getTinggi());
        System.out.println("= Lebar         : "+containerPadat.getLebar());
        System.out.println("= Material      : "+containerPadat.getMaterial());
        System.out.println("= Water Proof   : "+containerPadat.isWaterProof());
        System.out.println("==========================================================");

    }
}
