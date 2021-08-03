import java.util.ArrayList;
import java.util.List;

public class GudangSingleton {
    private static GudangSingleton instance;

    private int jumlahRoti;
    private int jumlahSelai;

    public static GudangSingleton getInstance() {
        if (instance == null) {
            instance = new GudangSingleton();
        }
        return instance;
    }

    public int getJumlahRoti() {
        return jumlahRoti;
    }

    public int getJumlahSelai() {
        return jumlahSelai;
    }

    public void addRoti(){
        jumlahRoti++;
    }

    public void addSelai(){
        jumlahSelai++;
    }

    public void decRoti(){
        if(jumlahRoti <= 0){
            return;
        }
        jumlahRoti--;
    }

    public void decSelai(){
        if(jumlahSelai <= 0){
            return;
        }
        jumlahSelai--;
    }
}
