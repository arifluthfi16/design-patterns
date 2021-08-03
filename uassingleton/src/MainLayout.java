import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayout extends JFrame{
    private JPanel mainPanel;
    private JButton tambahRoti;
    private JButton tambahSelai;
    private JLabel jumlahRoti;
    private JLabel jumlahSelai;
    private JButton kurangSelaiButton;
    private JButton kurangRotiButton;

    private GudangSingleton gudang = GudangSingleton.getInstance();

    public MainLayout(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        tambahRoti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gudang.addRoti();
                jumlahRoti.setText("Jumlah Roti : "+gudang.getJumlahRoti());
            }
        });

        tambahSelai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gudang.addSelai();
                jumlahSelai.setText("Jumlah Selai : "+gudang.getJumlahSelai());
            }
        });

        kurangRotiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gudang.decRoti();
                jumlahRoti.setText("Jumlah Roti : "+gudang.getJumlahRoti());
            }
        });

        kurangSelaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gudang.decSelai();
                jumlahSelai.setText("Jumlah Selai : "+gudang.getJumlahSelai());
            }
        });

    }
}


