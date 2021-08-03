public class PajakEropa {
    private double rateEuroToIDR;

    public PajakEropa(double rateEuroToIDR) {
        this.rateEuroToIDR = rateEuroToIDR;
    }

    public double getRateEuroToIDR() {
        return rateEuroToIDR;
    }

    public void setRateEuroToIDR(double rateEuroToIDR) {
        this.rateEuroToIDR = rateEuroToIDR;
    }

    public double hitungPajakEropa(int berat, int jarak){
        int hargaJarak = 0;

        if(jarak <= 10 ){
            hargaJarak = 10000;
        }else{
            hargaJarak = (jarak-10)*2000+10000;
        }

        return Math.round((berat*hargaJarak)*getRateEuroToIDR()*0.3);
    }
}
