public class SelaiObserver extends Observer{
    private SelaiSubscriberLayout selaiSubscriberLayout;
    private boolean isNotified = false;

    public SelaiObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    public void setLayout(SelaiSubscriberLayout selaiSubscriberLayout){
        this.selaiSubscriberLayout = selaiSubscriberLayout;
        this.selaiSubscriberLayout.updateJumlahSelaiSub("Jumlah Selai : "+subject.getJumlahSelai());
    }

    @Override
    public void update() {
        selaiSubscriberLayout.updateJumlahSelaiSub("Jumlah Selai : "+subject.getJumlahSelai());
        if(subject.getJumlahSelai() <= 0 && !isNotified){
            isNotified = true;
            selaiSubscriberLayout.alert("Selai Habis!");
        }
        if(subject.getJumlahSelai() > 0){
            isNotified = false;
        }
    }
}


