public class PajakAdapterUSA implements ITargetPajak {
    PajakUSA pajakUSA;

    public PajakAdapterUSA(PajakUSA pajakUSA) {
        this.pajakUSA = pajakUSA;
    }

    @Override
    public double hitungPajak(int berat, int jarak) {
        return this.pajakUSA.hitungPajakUSA(berat, jarak);
    }

}
