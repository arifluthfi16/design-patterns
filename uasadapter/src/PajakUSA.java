public class PajakUSA {
    private double rateUSDToIDR;

    public PajakUSA(double rateUSDToIDR) {
        this.rateUSDToIDR = rateUSDToIDR;
    }

    public double getRateUSDToIDR() {
        return rateUSDToIDR;
    }

    public void setRateUSDToIDR(int rateUSDToIDR) {
        this.rateUSDToIDR = rateUSDToIDR;
    }



    public double hitungPajakUSA(int berat, int jarak){
        int hargaJarak = 0;

        if(jarak <= 5 ){
            hargaJarak = 10000;
        }else{
            hargaJarak = (jarak-5)*2000+10000;
        }

        return Math.round((berat*hargaJarak)*getRateUSDToIDR()*0.5);
    }
}
