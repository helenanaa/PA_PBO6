/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import entitas.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Lihatdataproduk extends javax.swing.JFrame {
    private Database db;
    /**
     * Creates new form Lihatdataproduk
     */
    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
       model.setRowCount(0); // Mengosongkan tabel
       model.setColumnIdentifiers(new Object[]{"ID Produk", "Nama Produk", "Jenis Produk", "Tanggal Panen", "Stok (Kg)", "ID Admin"});
   

       try {
            Database db = new Database();
            db.openConnection();
            db.statement = db.connection.createStatement();
           
            String query = "SELECT * FROM dataproduk";
            ResultSet resultSet = db.statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_Produk");
                String nama = resultSet.getString("Nama_Produk");
                String jenis = resultSet.getString("Jenis_Produk");
                String tgl = resultSet.getString("Tanggal_Panen");
                String stok = resultSet.getString("Stok_Kg");
                String id_admin = resultSet.getString("ADMIN_ID_USER");
                model.addRow(new Object[]{id, nama, jenis, tgl, stok, id_admin});
            }

            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle exceptions
        }    
   }
    
    public Lihatdataproduk() {
        initComponents();
        populateTable();
        db = new Database();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACK = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 60, 20));

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 520, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lihat Data Produk (Owner).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
        this.dispose(); // Menutup jendela login
        Menuowner start = new Menuowner();
        start.setVisible(true);
    }//GEN-LAST:event_BACKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lihatdataproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lihatdataproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lihatdataproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lihatdataproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lihatdataproduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    // End of variables declaration//GEN-END:variables
}