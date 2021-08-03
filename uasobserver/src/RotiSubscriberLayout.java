import javax.swing.*;

public class RotiSubscriberLayout extends JFrame{
    private JLabel jumlahRotiSub;
    private JPanel rotiSubscriberPanel;

    public RotiSubscriberLayout(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(rotiSubscriberPanel);
        this.pack();
    }

    public void updateJumlahRotiSub(String text){
        jumlahRotiSub.setText(text);
    }

    public void alert(String alertContent){
        JOptionPane.showMessageDialog(rotiSubscriberPanel, alertContent);
    }
}
