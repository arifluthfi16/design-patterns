import javax.swing.*;

public class RotiObserver extends Observer{
    private RotiSubscriberLayout rotiSubscriberLayout;
    private boolean isNotified = false;

    public RotiObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void setLayout(RotiSubscriberLayout rotiSubscriberLayout){
        this.rotiSubscriberLayout = rotiSubscriberLayout;
        this.rotiSubscriberLayout.updateJumlahRotiSub("Jumlah Roti : "+subject.getJumlahRoti());
    }

    @Override
    public void update() {
        rotiSubscriberLayout.updateJumlahRotiSub("Jumlah Roti : "+subject.getJumlahRoti());
        if(subject.getJumlahRoti() <= 0 && !isNotified){
            isNotified = true;
            rotiSubscriberLayout.alert("Roti Habis!");
        }

        if(subject.getJumlahRoti() > 0){
            isNotified = false;
        }
    }
}
