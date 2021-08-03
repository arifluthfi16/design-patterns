import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        GudangLayout gudangLayout = new GudangLayout("Gudang Main");
        RotiSubscriberLayout rotiSubscriberLayout = new RotiSubscriberLayout("Roti Subscriber");
        SelaiSubscriberLayout selaiSubscriberLayout = new SelaiSubscriberLayout("Selai Subscriber");

        gudangLayout.setResizable(false);
        rotiSubscriberLayout.setResizable(false);
        selaiSubscriberLayout.setResizable(false);

        gudangLayout.setSize(new Dimension(600,200 ));
        rotiSubscriberLayout.setSize(new Dimension(600,200 ));
        selaiSubscriberLayout.setSize(new Dimension(600,200 ));

        gudangLayout.setLocation(200,650/2);
        rotiSubscriberLayout.setLocation(850,650/2-650/4);
        selaiSubscriberLayout.setLocation(850,650/2+650/4);

        gudangLayout.setRotiTargetLayout(rotiSubscriberLayout);
        gudangLayout.setSelaiTargetLayout(selaiSubscriberLayout);
        gudangLayout.setVisible(true);
        rotiSubscriberLayout.setVisible(true);
        selaiSubscriberLayout.setVisible(true);
    }

}
