public class Client {
    public static void main(String[] args) {
        MainLayout mainLayout = new MainLayout("Main Control");
        ItemDisplay itemDisplay = new ItemDisplay("Item Display");

        mainLayout.setLocation(250,50);
        itemDisplay.setLocation(550,50);

        mainLayout.setSize(300,300);
        mainLayout.setResizable(false);
        mainLayout.setVisible(true);

        itemDisplay.setSize(300,300);
        itemDisplay.setResizable(false);
        itemDisplay.setVisible(true);

    }
}
