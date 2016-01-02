import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Danielle
 */
public class FullHouse extends javax.swing.JFrame {

    public static String query;
    public static String [] kolomnamen;
    public static String labeltekst;

    /**
     * Creates new form FullHouse
     */
    public FullHouse() {
        initComponents();
        geplandeToernooien();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        geplandeToernooien = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfToernooiSelectie = new javax.swing.JTextField();
        rbToernooiNietBetaald = new javax.swing.JRadioButton();
        rbToernooiWelBetaald = new javax.swing.JRadioButton();
        rbAlleNietBetaald = new javax.swing.JRadioButton();
        btOpenOverzicht = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btOverzichtSpelersAdres = new javax.swing.JButton();
        btOverzichtSpelersRating = new javax.swing.JButton();
        btTafelindelingRondeToernooi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FULL HOUSE");
        setMinimumSize(new java.awt.Dimension(1024, 768));

        geplandeToernooien.setAutoCreateRowSorter(true);
        geplandeToernooien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        geplandeToernooien.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                geplandeToernooienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(geplandeToernooien);

        jLabel3.setText("Geselecteerd toernooi: ");

        tfToernooiSelectie.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfToernooiSelectie.setEnabled(false);
        tfToernooiSelectie.setName("toernooiSelectie"); // NOI18N
        tfToernooiSelectie.setSelectionColor(new java.awt.Color(0, 0, 0));
        tfToernooiSelectie.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tfToernooiSelectieActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbToernooiNietBetaald);
        rbToernooiNietBetaald.setText("Overzicht  ingeschreven deelnemers voor geselecteerd toernooi - NOG NIET BETAALD");
        rbToernooiNietBetaald.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbToernooiNietBetaaldActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbToernooiWelBetaald);
        rbToernooiWelBetaald.setText("Overzicht ingeschreven deelnemers voor geselecteerd toernooi - WEL BETAALD");
        rbToernooiWelBetaald.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbToernooiWelBetaaldActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAlleNietBetaald);
        rbAlleNietBetaald.setSelected(true);
        rbAlleNietBetaald.setText("Overzicht ALLE ingeschreven deelnemers die NOG NIET BETAALD hebben");
        rbAlleNietBetaald.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbAlleNietBetaaldActionPerformed(evt);
            }
        });

        btOpenOverzicht.setText("Open overzicht");
        btOpenOverzicht.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btOpenOverzichtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfToernooiSelectie, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbToernooiNietBetaald)
                    .addComponent(rbToernooiWelBetaald)
                    .addComponent(rbAlleNietBetaald)
                    .addComponent(btOpenOverzicht))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfToernooiSelectie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbToernooiNietBetaald)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbToernooiWelBetaald)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAlleNietBetaald)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpenOverzicht)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Geplande toernooien", jPanel1);

        jLabel1.setText("Registreer nieuwe speler (inactief)");

        btOverzichtSpelersAdres.setText("Overzicht spelers - Adresgegevens");
        btOverzichtSpelersAdres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOverzichtSpelersAdres.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btOverzichtSpelersAdres.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btOverzichtSpelersAdresActionPerformed(evt);
            }
        });

        btOverzichtSpelersRating.setText("Overzicht spelers - Rating en gewonnen inleggeld");
        btOverzichtSpelersRating.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOverzichtSpelersRating.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btOverzichtSpelersRating.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btOverzichtSpelersRatingActionPerformed(evt);
            }
        });

        btTafelindelingRondeToernooi.setText("Overzicht tafelindeling (per ronde) - Toernooi");
        btTafelindelingRondeToernooi.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btTafelindelingRondeToernooiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btOverzichtSpelersAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btTafelindelingRondeToernooi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(btOverzichtSpelersRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btOverzichtSpelersAdres, btOverzichtSpelersRating});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOverzichtSpelersAdres)
                    .addComponent(btTafelindelingRondeToernooi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btOverzichtSpelersRating)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Spelers", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tafelindeling toernooi", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("lege tab", jPanel4);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("FullHouse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOverzichtSpelersRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOverzichtSpelersRatingActionPerformed
        spelersOverzichtRating();
    }//GEN-LAST:event_btOverzichtSpelersRatingActionPerformed

    private void btOverzichtSpelersAdresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOverzichtSpelersAdresActionPerformed
        spelersOverzichtAdres();
    }//GEN-LAST:event_btOverzichtSpelersAdresActionPerformed

    private void btOpenOverzichtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenOverzichtActionPerformed
                int selectie = geplandeToernooien.getSelectedRow();
        //check of er een toernooi is selecteerd en welke radiobutton is geselecteerd
        if ((selectie == -1) && !(rbAlleNietBetaald.isSelected())){
            geenToernooiGeselecteerd();
        }
        if (rbToernooiNietBetaald.isSelected()){
           overzichtPerToernooiNietBetaald(); 
        } else if (rbToernooiWelBetaald.isSelected()){
            overzichtPerToernooiWelBetaald();
        }else if (rbAlleNietBetaald.isSelected()){
            overzichtAlleNietBetaald();
        }
    }//GEN-LAST:event_btOpenOverzichtActionPerformed

    private void tfToernooiSelectieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfToernooiSelectieActionPerformed

    }//GEN-LAST:event_tfToernooiSelectieActionPerformed

    private void geplandeToernooienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geplandeToernooienMouseClicked
        selecteerToernooi();
    }//GEN-LAST:event_geplandeToernooienMouseClicked

    private void btTafelindelingRondeToernooiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btTafelindelingRondeToernooiActionPerformed
    {//GEN-HEADEREND:event_btTafelindelingRondeToernooiActionPerformed
        tafelindelingRonde();
    }//GEN-LAST:event_btTafelindelingRondeToernooiActionPerformed

    private void rbToernooiNietBetaaldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbToernooiNietBetaaldActionPerformed
    {//GEN-HEADEREND:event_rbToernooiNietBetaaldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbToernooiNietBetaaldActionPerformed

    private void rbAlleNietBetaaldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbAlleNietBetaaldActionPerformed
    {//GEN-HEADEREND:event_rbAlleNietBetaaldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlleNietBetaaldActionPerformed

    private void rbToernooiWelBetaaldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbToernooiWelBetaaldActionPerformed
    {//GEN-HEADEREND:event_rbToernooiWelBetaaldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbToernooiWelBetaaldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOpenOverzicht;
    private javax.swing.JButton btOverzichtSpelersAdres;
    private javax.swing.JButton btOverzichtSpelersRating;
    private javax.swing.JButton btTafelindelingRondeToernooi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable geplandeToernooien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbAlleNietBetaald;
    private javax.swing.JRadioButton rbToernooiNietBetaald;
    private javax.swing.JRadioButton rbToernooiWelBetaald;
    private javax.swing.JTextField tfToernooiSelectie;
    // End of variables declaration//GEN-END:variables

    private void geplandeToernooien() {
        try {
            Connection conn = SimpleDataSourceV2.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT Toernooi.toernooiID as 'Toernooi ID',toernooiSoort as 'Soort toernooi',\n + "
                    + "datum as 'Datum',hoogteInlegGeld as 'Inleggeld',maxAantalSpelers as 'Aantal Spelers',\n"
                    + "minimaleRatingMasterClass as 'Rating Masterclass',Toernooi.spelerId as 'Master voor Masterclass',\n"
                    + "locatieID as 'Locatie ID', COUNT(betaaldJN) as 'Ingeschreven', sum(Deelname.betaaldJN like 'J') as 'Reeds betaald'\n"
                    + "FROM Toernooi\n"
                    + "  left outer join Deelname on Toernooi.toernooiID = Deelname.spelerID \n"
                    + "  group by Toernooi.toernooiID");
            // vraag aantal kolommen uit metadata tabel
            ResultSetMetaData md = result.getMetaData();
            int aantalKolommen = md.getColumnCount();
            
            // maak lege Array voor kolomnamen
            String [] kolomnamen = new String [aantalKolommen];
            
            // maak een DefaultTableModel met de naam tabelmodel
            DefaultTableModel tabelmodel = new DefaultTableModel() {
                // maak typen in cel onmogelijk
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
                }
            };
            //vul Array kolomnamen
            for (int j=0; j< aantalKolommen; j++){
                    kolomnamen[j] = md.getColumnLabel(j+1);
                }
            //ken kolomnamen toe aan tabelmodel
            tabelmodel.setColumnIdentifiers(kolomnamen);
            while (result.next()) {
                Object[] rijgegevens = new Object[aantalKolommen];
                for (int i = 0; i < aantalKolommen; i++) {
                rijgegevens[i] = result.getObject(i + 1);
                //zet datum uit sql om naar weergave normale nl datum
                String datumsql = result.getString("datum");
                    try {
                        java.sql.Date sqlDate = dateStringToMySqlDate(datumsql);
                        String datum = mySqlDateToString(sqlDate);
                        //zet juiste datum terug in betreffende kolom: 2 bevat datum
                        rijgegevens[2] = datum;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                tabelmodel.addRow(rijgegevens);
            }
            geplandeToernooien.setModel(tabelmodel);
        }   catch (SQLException e) {
            System.out.println("SQL fout bij vullen lijst: " + e);
        }
    }

    private void spelersOverzichtAdres() {
        query = "SELECT spelerId as 'Speler ID', naam as 'Naam', straat as 'Straat en huisnr', postcode as 'Postcode', woonplaats as 'Plaats', emailadres as 'E-mail', telefoonnr as 'Tel.nr.' from Speler";
        //vul tekst voor label
        labeltekst = "Adresgegevens";           
        //creÃ«er nieuw frame
        spelersOverzicht overzicht = new spelersOverzicht();
        //centreer het frame:
        overzicht.setLocationRelativeTo(null);
        overzicht.setVisible(true);
    }

    private void spelersOverzichtRating() {
        query = "SELECT spelerId as 'Speler ID', naam as 'Naam', aantalRatingPuntenPoker as 'Tot. punten poker',totaalGewonnenBedragPoker as 'Tot. bedrag Poker', aantalRatingPuntenBridge as 'Tot. punten bridge',totaalGewonnenBedragBridge as 'Tot. bedrag Bridge',aantalRatingPuntenKlaverjassen as 'Tot. punten Klaverjassen',totaalGewonnenBedragKlaverjassen as 'Tot. bedrag Klaverjassen' from Speler";
        //vul tekst voor label
        labeltekst = "Overzicht Rating en Gewonnen Bedragen";           
        //creÃ«er nieuw frame
        spelersOverzicht overzicht = new spelersOverzicht();
        //centreer het frame:
        overzicht.setLocationRelativeTo(null);
        overzicht.setVisible(true);
    }
    
    private void tafelindelingRonde()
    {
        query = "SELECT spelerID as 'Speler ID', rondeNummer as 'Ronde Nr.', tafelNummer as 'Tafel Nr.',maxAantalSpelers as 'Aantal Spelers', tafelWinnaar as 'Winnaar Tafel' FROM Tafel";
        //creëer nieuw frame
        spelersOverzicht overzicht = new spelersOverzicht();
        //centreer het frame:
        overzicht.setLocationRelativeTo(null);
        overzicht.setVisible(true);
    }

    private void selecteerToernooi() {
        int selectie = geplandeToernooien.getSelectedRow();
        Object toernooiID = geplandeToernooien.getValueAt(selectie, 0);
        try {
            Connection conn = SimpleDataSourceV2.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT toernooiID, toernooiSoort, datum from Toernooi where toernooiID = '" + toernooiID + "'");
            while (result.next()) {
                int ID = result.getInt("toernooiID");
                String datumsql = result.getString("datum");
                try {
                    java.sql.Date sqlDate = dateStringToMySqlDate(datumsql);
                    String datum = mySqlDateToString(sqlDate);
                    String soort = result.getString("toernooiSoort");
                    String jTF = "Toernooi nr " + Integer.toString(ID) + ": " + soort + " op " + datum;
                    tfToernooiSelectie.setText(jTF);
                } catch (Exception e) {
                    /* je moet een try catch hebben anders klaagt de convert method dateStringToMySqlDate */
                    System.out.println(e);
                }

            }
        } catch (SQLException e) {
            System.out.println("SQL fout bij vullen lijst: " + e);
        }
    }


private String mySqlDateToString (java.sql.Date date) {
        /* ik schrijf de datum als dd-MM-yyyy */
        DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
        return df.format(date);
    }

private java.sql.Date dateStringToMySqlDate (String date) throws ParseException {
        /* ik verwacht de datum tekst als yyyy-MM-dd */
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        java.util.Date parsed = format.parse(date);
        return new java.sql.Date(parsed.getTime());
    }

    private void overzichtPerToernooiWelBetaald() {
        try {
            int selectie = geplandeToernooien.getSelectedRow();
            Object toernooiID = geplandeToernooien.getValueAt(selectie, 0);
            String ID = toernooiID.toString();
            query = "SELECT Speler.spelerID as 'Speler ID', Speler.naam as 'Speler', Deelname.betaaldJN as 'Betaald'\n"
                    + "  FROM Deelname \n"
                    + " left outer join Speler\n"
                    + "  on Deelname.SpelerID = Speler.SpelerID\n"
                    + "  where Deelname.toernooiID = '" + ID + "' AND Deelname.betaaldJN like 'J'";
            //vul tekst voor label
            labeltekst = tfToernooiSelectie.getText();
            //creÃ«er nieuw frame
            spelersOverzicht overzicht = new spelersOverzicht();
            //centreer het frame:
            overzicht.setLocationRelativeTo(null);
            overzicht.setVisible(true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
}
    }

    private void overzichtPerToernooiNietBetaald() {
        try {
            int selectie = geplandeToernooien.getSelectedRow();
            Object toernooiID = geplandeToernooien.getValueAt(selectie, 0);
            String ID = toernooiID.toString();
            query = "SELECT Speler.spelerID as 'Speler ID', Speler.naam as 'Speler', Deelname.betaaldJN as 'Betaald'\n"
                    + "  FROM Deelname \n"
                    + " left outer join Speler\n"
                    + "  on Deelname.SpelerID = Speler.SpelerID\n"
                    + "  where Deelname.toernooiID = '" + ID + "' AND Deelname.betaaldJN like 'N'";
            //vul tekst voor label
            labeltekst = tfToernooiSelectie.getText();
            //creÃ«er nieuw frame
            spelersOverzicht overzicht = new spelersOverzicht();
            //centreer het frame:
            overzicht.setLocationRelativeTo(null);
            overzicht.setVisible(true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    private void overzichtAlleNietBetaald() {
        try {
            query = "SELECT Speler.spelerID as 'Speler ID', Speler.naam as 'Speler', Deelname.toernooiID as 'Toernooi', Toernooi.datum as 'Datum', Deelname.betaaldJN as 'Betaald'\n"
                    + " FROM Deelname\n"
                    + " left outer join Speler\n"
                    + " on Deelname.SpelerID = Speler.SpelerID\n"
                    + " left outer join Toernooi\n"
                    + " on Toernooi.toernooiID = Deelname.toernooiID\n"
                    + " where Deelname.betaaldJN like 'N'";
            //vul tekst voor label
            labeltekst = "Alle spelers die zijn ingeschreven voor een toernooi maar die NOG NIET hebben betaald";
            //creÃ«er nieuw frame
            spelersOverzicht overzicht = new spelersOverzicht();
            //centreer het frame:
            overzicht.setLocationRelativeTo(null);
            overzicht.setVisible(true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

    private void geenToernooiGeselecteerd() {
        JOptionPane selecteerToernooi = new JOptionPane();
        selecteerToernooi.showMessageDialog(rootPane, "Selecteer een toernooi", "Selectie ontbreekt", 1);

    }
}
