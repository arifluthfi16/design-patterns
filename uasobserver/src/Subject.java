import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    private int jumlahSelai;
    private int jumlahRoti;

    public int getState() {
        return state;
    }

    public int getJumlahSelai(){
        return jumlahSelai;
    }

    public void setJumlahSelai(int jumlahSelai) {
        this.jumlahSelai = jumlahSelai;
    }

    public int getJumlahRoti() {
        return jumlahRoti;
    }

    public void setJumlahRoti(int jumlahRoti) {
        this.jumlahRoti = jumlahRoti;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void addSelai(){
        this.jumlahSelai++;
    }

    public void addRoti(){
        this.jumlahRoti++;
    }

    public void decSelai(){
        if(this.jumlahSelai <= 0){
            return;
        }
        this.jumlahSelai--;
    }

    public void decRoti(){
        if(this.jumlahRoti <= 0){
            return;
        }
        this.jumlahRoti--;
    }

    public void notifyAllObserver() {
        for (Observer observer:  observers) {
            observer.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
