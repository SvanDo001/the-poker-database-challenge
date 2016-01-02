import java.sql.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danielle
 */
public class spelersOverzicht extends javax.swing.JFrame {

    /**
     * Creates new form spelersOverzicht
     */
    public spelersOverzicht() {
        initComponents();
        labelOverzicht.setText(FullHouse.labeltekst);
        //vul de tabel met gegevens uit de database
        try {
            Connection conn = SimpleDataSourceV2.getConnection();
            Statement stat = conn.createStatement();
            String query = FullHouse.query;
            ResultSet result = stat.executeQuery(query);
            // vraag aantal kolommen uit metadata tabel
            ResultSetMetaData md = result.getMetaData();
            int aantalKolommen = md.getColumnCount();
            // maak lege Array voor kolomnamen
            String []  kolomnamen = new String [aantalKolommen];
            // maak een DefaultTableModel met de naam tabelmodel
            DefaultTableModel tabelmodel = new DefaultTableModel() {
                                // maak typen in cel onmogelijk
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
                }
            };
            // vul Array kolomnamen
            for (int j=0; j< aantalKolommen; j++){
                    kolomnamen[j] = md.getColumnLabel(j+1);
                }
            //ken kolomnamen toe aan tabelmodel
            tabelmodel.setColumnIdentifiers(kolomnamen);
            while (result.next()){
                Object [] rijgegevens = new Object [aantalKolommen];
                for (int i=0; i< aantalKolommen; i++){
                    rijgegevens[i]= result.getObject(i+1);
                }
            tabelmodel.addRow(rijgegevens);
            }
            
            tabelSpelers.setModel(tabelmodel);
            
        } catch (SQLException e) {
            System.out.println("SQL fout bij vullen lijst: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSpelers = new javax.swing.JTable();
        labelOverzicht = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FULL HOUSE");
        setMinimumSize(new java.awt.Dimension(1024, 768));

        tabelSpelers.setAutoCreateRowSorter(true);
        tabelSpelers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelSpelers.setFillsViewportHeight(true);
        tabelSpelers.setName(""); // NOI18N
        jScrollPane1.setViewportView(tabelSpelers);

        labelOverzicht.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelOverzicht.setText("Spelersoverzicht");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelOverzicht)
                        .addGap(0, 731, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOverzicht)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(spelersOverzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(spelersOverzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(spelersOverzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(spelersOverzicht.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spelersOverzicht().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelOverzicht;
    private javax.swing.JTable tabelSpelers;
    // End of variables declaration//GEN-END:variables
}


//            tabelSpelers.setEnabled(false);
//            tabelSpelers.setRowSelectionAllowed(true);
//            System.out.println(tabelSpelers.getRowSelectionAllowed());
//            System.out.println(tabelSpelers.getSelectedRow());
//            System.out.println(tabelSpelers.isEnabled());