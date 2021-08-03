import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class Layout extends JFrame{
    private JTextField namaField;
    private JTextField jumlahField;
    private JTextField beratField;
    private JPanel panel;
    private JComboBox<String> jenisSelector;
    private JButton simpanButton;
    private JTable table1;
    private JList listGudang;

    private String namaBarang;
    private int jumlahBarang;
    private int beratSatuan;
    private String jenisBarang;
    private static Context context = new Context();
    private Gudang gudang = Gudang.getInstance();
    private DefaultTableModel tableModel;

    public Layout(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        jenisSelector.addItem("Padat");
        jenisSelector.addItem("Cair");

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namaBarang = namaField.getText();
                jumlahBarang = Integer.parseInt(jumlahField.getText());
                beratSatuan = Integer.parseInt(beratField.getText());
                jenisBarang = Objects.requireNonNull(jenisSelector.getSelectedItem()).toString();

                // Validate and Select Strategy
                if(jenisBarang.equals("Cair")){
                    context.setSimpanStrategy(new SimpanCair());
                }else{
                    if(beratSatuan >= 50){
                        context.setSimpanStrategy(new SimpanPadatBesar());
                    }else{
                        context.setSimpanStrategy(new SimpanPadatKecil());
                    }
                }

                // Execute Selected Strategy
                context.executeStrategy(namaBarang, jumlahBarang, beratSatuan, jenisBarang);
                updateTable();
                cleanInput();
            }
        });
    }

    private void updateTable(){
        List<Barang> daftarBarang = gudang.getDaftarBarang();
        cleanTable();

        for (int i=0; i<daftarBarang.size(); i++)
        {
            Object[] data = new Object[]{
                    i,
                    daftarBarang.get(i).nama,
                    daftarBarang.get(i).jumlah,
                    daftarBarang.get(i).beratSatuan,
                    daftarBarang.get(i).jenis,
            };

            tableModel.addRow(data);
        }
    }

    private void cleanInput(){
        namaField.setText("");
        jumlahField.setText("");
        beratField.setText("");
        jenisSelector.setSelectedIndex(0);

    }

    private void cleanTable(){
        int rowCount = tableModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    }

    private void initTableModel(){
        this.tableModel.addColumn("#");
        this.tableModel.addColumn("Nama Barang");
        this.tableModel.addColumn("Jumlah Barang");
        this.tableModel.addColumn("Berat Satuan");
        this.tableModel.addColumn("Jenis Barang");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        tableModel = new DefaultTableModel();
        initTableModel();
        table1 = new JTable(this.tableModel);
    }
}
