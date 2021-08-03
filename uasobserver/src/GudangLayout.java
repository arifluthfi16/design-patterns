import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GudangLayout extends JFrame {

    private JPanel panels;
    private JButton rotiTambah;
    private JButton rotiKurang;
    private JLabel rotiValue;
    private JButton selaiTambah;
    private JLabel selaiValue;
    private JButton selaiKurang;

    private RotiObserver rotiObserver;
    private SelaiObserver selaiObserver;

    public GudangLayout(String title) {
        super(title);
        Subject subject = new Subject();

        selaiObserver = new SelaiObserver(subject);
        rotiObserver = new RotiObserver(subject);

        // Init Jumlah Awal Hard Coded -> 5
        subject.setJumlahRoti(5);
        subject.setJumlahSelai(5);

        rotiValue.setText("Jumlah Roti : " + subject.getJumlahRoti());
        selaiValue.setText("Jumlah Selai : " + subject.getJumlahSelai());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panels);
        this.pack();

        rotiTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subject.addRoti();
                subject.notifyAllObserver();
                rotiValue.setText("Jumlah Roti : " + subject.getJumlahRoti());
            }
        });

        rotiKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(subject.getJumlahRoti() <= 0){
                    JOptionPane.showMessageDialog(panels,"Roti Habis!");
                    return;
                }

                subject.decRoti();
                subject.notifyAllObserver();
                rotiValue.setText("Jumlah Roti : " + subject.getJumlahRoti());
            }
        });

        selaiTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subject.addSelai();
                subject.notifyAllObserver();
                selaiValue.setText("Jumlah Selai : " + subject.getJumlahSelai());
            }
        });

        selaiKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(subject.getJumlahSelai() <= 0){
                    JOptionPane.showMessageDialog(panels,"Selai Habis!");
                    return;
                }

                subject.decSelai();
                subject.notifyAllObserver();
                selaiValue.setText("Jumlah Selai : " + subject.getJumlahSelai());
            }
        });
    }

    public void setRotiTargetLayout(RotiSubscriberLayout layout){
        rotiObserver.setLayout(layout);
    }

    public void setSelaiTargetLayout(SelaiSubscriberLayout layout){
        selaiObserver.setLayout(layout);
    }

}
