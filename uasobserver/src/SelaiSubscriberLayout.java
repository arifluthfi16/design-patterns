import javax.swing.*;

public class SelaiSubscriberLayout extends JFrame{
    JLabel jumlahSelaiSub;
    JPanel selaiSubscriberPanel;

    public SelaiSubscriberLayout(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(selaiSubscriberPanel);
        this.pack();
    }

    public void updateJumlahSelaiSub(String text){
        jumlahSelaiSub.setText(text);
    }

    public void alert(String alertContent){
        JOptionPane.showMessageDialog(selaiSubscriberPanel, alertContent);
    }
}
