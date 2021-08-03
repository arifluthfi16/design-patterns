public class Context {
    private SimpanStrategy simpanStrategy;

    public void setSimpanStrategy(SimpanStrategy strategy){
        simpanStrategy = strategy;
    }

    public void executeStrategy(String namaBarang, int jumlah, int beratKg, String jenisBarang){
        simpanStrategy.simpanBarang(namaBarang, jumlah, beratKg, jenisBarang);
    }
}
