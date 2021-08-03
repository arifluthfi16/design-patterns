public class PajakAdapterEropa implements ITargetPajak{
    PajakEropa pajakEropa;

    public PajakAdapterEropa(PajakEropa pajakEropa){
        this.pajakEropa = pajakEropa;
    }

    @Override
    public double hitungPajak(int berat, int jarak) {
        return this.pajakEropa.hitungPajakEropa(berat, jarak);
    }
}
