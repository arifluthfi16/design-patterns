import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemDisplay extends JFrame{
    private JPanel mainPanel;
    private JButton updateButton;
    private JLabel jumlahSelai;
    private JLabel jumlahRoti;

    private GudangSingleton gudang = GudangSingleton.getInstance();

    public ItemDisplay(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jumlahRoti.setText("Jumlah Roti : "+gudang.getJumlahRoti());
                jumlahSelai.setText("Jumlah Selai : "+gudang.getJumlahSelai());
            }
        });
    }
}
