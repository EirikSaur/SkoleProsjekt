/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleprosjekt;
import Kode.Database;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author vderibas
 */
public class ViewCenter extends javax.swing.JFrame {
    private String centerName;
    private String storeName;
    private ResultSet res;
    private boolean isViewed = false;
    private Database db = new Database();
    /**
     * Creates new form ViewCenter
     */
    public ViewCenter(String centerName) {
        this.centerName = centerName;
        initComponents();
        this.searchStoresField = searchStoresField;
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fyllButikker();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        additionalInfoFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        viewStoresArea = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        storeList = new javax.swing.JList();
        searchStoresField = new javax.swing.JTextField();
        Tekstlytter l = new Tekstlytter();
        searchStoresField.getDocument().addDocumentListener(l);
        nameLabel = new javax.swing.JLabel();
        nameLabel.setText(centerName);
        jButton1 = new javax.swing.JButton();
        managerLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        storeNumberLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        turnoverLabel = new javax.swing.JLabel();
        floorNumberLabel = new javax.swing.JLabel();

        additionalInfoFrame.setMaximumSize(new java.awt.Dimension(1000, 1000));
        additionalInfoFrame.setMinimumSize(new java.awt.Dimension(380, 360));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Manager name:\nAnnual turnover:\nCenter adress:\nCenter phone:\nNumber of parking lots:\nNumber of stores:\nNumber of floors:");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout additionalInfoFrameLayout = new javax.swing.GroupLayout(additionalInfoFrame.getContentPane());
        additionalInfoFrame.getContentPane().setLayout(additionalInfoFrameLayout);
        additionalInfoFrameLayout.setHorizontalGroup(
            additionalInfoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInfoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );
        additionalInfoFrameLayout.setVerticalGroup(
            additionalInfoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionalInfoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewStoresArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        storeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        storeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                llistItemSelected(evt);
            }
        });
        jScrollPane2.setViewportView(storeList);
        storeList.getAccessibleContext().setAccessibleName("storeList");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewStoresArea.addTab("Stores", jPanel2);

        searchStoresField.setToolTipText("");
        searchStoresField.setSelectionEnd(0);

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setToolTipText("");
        nameLabel.setFocusable(false);

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backPressed(evt);
            }
        });

        managerLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        managerLabel.setText("Manager: ");

        descriptionLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        descriptionLabel.setText("Description");

        storeNumberLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        storeNumberLabel.setText("Number of stores:");

        jButton2.setText("View additional info");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                additionalInfoPressed(evt);
            }
        });

        turnoverLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        turnoverLabel.setText("Annual turnover:");

        floorNumberLabel.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        floorNumberLabel.setText("Number of floors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turnoverLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(floorNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchStoresField)
                        .addComponent(viewStoresArea))
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewStoresArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(managerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnoverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(storeNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(floorNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jButton2))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchStoresField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        storeNumberLabel.getAccessibleContext().setAccessibleName("Number of stores:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPressed
        if (isViewed) {
            showCenter();
            isViewed = false;
            return;
        }
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backPressed

    private void llistItemSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llistItemSelected
        this.storeName = storeList.getSelectedValue().toString();
        showStore(storeName);
    }//GEN-LAST:event_llistItemSelected

    private void additionalInfoPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_additionalInfoPressed
        additionalInfoFrame.setVisible(true);
        additionalInfoFrame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_additionalInfoPressed
    
    private void showStore(String storeName) {
        this.storeName = storeName;
        nameLabel.setText(storeName);
        viewStoresArea.setTitleAt(0, "Products");
        fyllProdukter();
        isViewed = true;
    }
    
    private void showCenter() {
        nameLabel.setText(centerName);
        viewStoresArea.setTitleAt(0, "Stores");
        fyllButikker();
    }
    
    private void fyllButikker(){ // Denne metoden legger elementer fra databasen(butikker) avhengig av senternavnet inn i jList2
        try{
            DefaultListModel DLM = new DefaultListModel();
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select centre_id from shoppingcentre where centre_name = '"+ centerName + "'");
            res.next();
            int centreID = res.getInt("centre_id");
            res = setning.executeQuery("select store_name from store where centre_id = "+centreID+"");
            while (res.next()) {
                String navn = res.getString("store_name");
                DLM.addElement(navn);
            }
            storeList.setModel(DLM);
            
            //manager name
            res = setning.executeQuery("select centremanager_name from shoppingcentre, centremanager where centre_name = '"+ centerName + "'"
                    + "and shoppingcentre.manager_id = centremanager.manager_id");
            res.next();
            managerLabel.setText("Manager: " + res.getString("centremanager_name"));
            
            //annual turnover
            res = setning.executeQuery("select turnover from shoppingcentre where centre_name = '"+ centerName + "'");
            res.next();
            turnoverLabel.setText("Annual turnover: " + res.getString("turnover"));
            
            //number of stores
            
            storeNumberLabel.setText("Number of stores: " + storeList.getModel().getSize());
            
            //number of floors
            res = setning.executeQuery("select max(floor) as number from store, shoppingcentre where centre_name = '"+ centerName + "'"
                    + "and store.centre_id = shoppingcentre.centre_id");
            res.next();
            floorNumberLabel.setText("Number of floors: " + res.getString("number"));
            
            //description
            res = setning.executeQuery("select description from shoppingcentre where centre_name = '"+ centerName + "'");
            res.next();
            descriptionLabel.setText(res.getString("description"));
            
        db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }
     
    private void fyllProdukter(){ // Denne metoden legger elementer fra databasen(butikker) avhengig av senternavnet inn i jList2
        
        try{
            DefaultListModel DLM = new DefaultListModel();
            storeList.setModel(DLM);
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select product_nr from store JOIN storelink ON"
                    + "(store.store_id = storelink.store_id)"
                    + "WHERE store_name = '"+ storeName + "'");
            
            //select product_nr from product JOIN storelink ON (product.product_nr = storelink.product_nr)
            if(res.next()) {
                int productID = res.getInt("product_nr");
                res = setning.executeQuery("select name from product where product_nr = "+productID+"");
                while (res.next()) {
                    String navn = res.getString("name");
                    DLM.addElement(navn);
                }
                storeList.setModel(DLM);
                db.kobleFra();
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
        
    }
    /**
     * @param args the command line arguments
     */
    void run() {
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
            java.util.logging.Logger.getLogger(ViewCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCenter(centerName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame additionalInfoFrame;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel floorNumberLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel managerLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField searchStoresField;
    private javax.swing.JList storeList;
    private javax.swing.JLabel storeNumberLabel;
    private javax.swing.JLabel turnoverLabel;
    private javax.swing.JTabbedPane viewStoresArea;
    // End of variables declaration//GEN-END:variables

    class Tekstlytter implements DocumentListener{
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        try{ 
            DefaultListModel DLM = new DefaultListModel(); 
            String søkeOrd = e.getDocument().getText(0, e.getOffset()+1);
            
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select store_name from store, shoppingcentre"
                    + " where UPPER(store_name) LIKE '"+søkeOrd.toUpperCase()+"%'"
                    + "and store.centre_id = shoppingcentre.centre_id");
            while (res.next()) { 
                String navn = res.getString("store_name");
                DLM.addElement(navn);
            } 
            storeList.setModel(DLM);
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + er + "");
            db.kobleFra();
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        try {
            if (e.getDocument().getText(0, e.getOffset()+1).trim().isEmpty()) {
                fyllButikker();
                return;
            }
        } catch (BadLocationException ex) {
            Logger.getLogger(ViewCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }
    
    
}
}


