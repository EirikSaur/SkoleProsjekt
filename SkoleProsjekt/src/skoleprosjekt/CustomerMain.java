/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleprosjekt;

import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Kode.Database;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author vderibas
 */
public class CustomerMain extends javax.swing.JFrame {
    private ResultSet res;
    private Database db = new Database();
    private ArrayList<Integer> centerIDs = new ArrayList();
    
    /**
     * Creates new form NewJFrame
     */
    public CustomerMain() {
        initComponents();
        fyllFylker();
        //fyllSenter();
        fyllSenter(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centerSearchField = new javax.swing.JTextField();
        //Tekstlytter f = new Tekstlytter();
        //centerSearchField.getDocument().addDocumentListener(f);
        jScrollPane1 = new javax.swing.JScrollPane();
        centerList = new javax.swing.JList();
        Tekstlytter f = new Tekstlytter();
        centerSearchField.getDocument().addDocumentListener(f);
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose Centre");

        centerSearchField.setColumns(1);
        centerSearchField.setToolTipText("Søk etter navn på senter");
        centerSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                centerSearchFieldKeyTyped(evt);
            }
        });

        centerList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Center 1", "Center 2", "Center 3", "Center 4", "Center 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        centerList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                centerSelected(evt);
            }
        });
        jScrollPane1.setViewportView(centerList);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Countys" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countySelected(evt);
            }
        });

        jLabel1.setText("Search For Centres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(centerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centerSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centerSelected(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_centerSelected
        if (!evt.getValueIsAdjusting()) {
            ViewCenter v = new ViewCenter(centerList.getSelectedValue().toString(),
            centerIDs.get(centerList.getSelectedIndex()));
            v.run();
            //jList1.getSelectedValue().toString();
        }
    }//GEN-LAST:event_centerSelected

        //Sørger for att man kan sortere senter etter fylker (velger man "Fylker" får man alle sentrene
    private void countySelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countySelected
        try{
            Object fylke = jComboBox1.getSelectedItem();
            fylke = fylke.toString();
            Statement setning = db.kobleTil().createStatement();
            DefaultListModel DLM = new DefaultListModel();
            if(fylke.equals("Fylker")){
                res = setning.executeQuery("select centre_name from shoppingcentre");
                while (res.next()) {
                    String navn = res.getString("centre_name");
                    DLM.addElement(navn);
                }
                centerList.setModel(DLM);
            }else{
                res = setning.executeQuery("select centre_name from shoppingcentre where county_name = '"+fylke+"'");
                while (res.next()) {
                    String navn = res.getString("centre_name");
                    DLM.addElement(navn);
                }
                centerList.setModel(DLM);
            }
        db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }//GEN-LAST:event_countySelected

    private void centerSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_centerSearchFieldKeyTyped

    }//GEN-LAST:event_centerSearchFieldKeyTyped
    
    private void fyllFylker(){ // Denne metoden legger elementer fra databasen inn i Comboboxen
        try{
        Statement setning = db.kobleTil().createStatement();
        //System.out.println("ok");
        res = setning.executeQuery("select county_name from county");
        while (res.next()) {
            String navn = res.getString("county_name");
            jComboBox1.addItem(navn);
        }
        db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }
    
    /*private void fyllSenter(){
        try{
            Statement setning = db.kobleTil().createStatement();
            DefaultListModel DLM = new DefaultListModel();
            res = setning.executeQuery("select centre_name from shoppingcentre");
            while (res.next()) {
                String navn = res.getString("centre_name");
                DLM.addElement(navn);
            }
            centerList.setModel(DLM);
            db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }*/
    
    private void fyllSenter(String søkeOrd){
        try{ 
            DefaultListModel DLM = new DefaultListModel(); 

            Statement setning = db.kobleTil().createStatement();
            if (søkeOrd != null) {
                res = setning.executeQuery("select centre_name, centre_id from shoppingcentre"
                    + " where UPPER(centre_name) LIKE '"+søkeOrd.trim().toUpperCase()+"%'");
            }
            else {
                res = setning.executeQuery("select centre_name, centre_id from shoppingcentre");
            }
            
            centerIDs.clear();
            
            while (res.next()) {
                String navn = res.getString("centre_name");
                int ID = res.getInt("centre_id");
                centerIDs.add(ID);
                DLM.addElement(navn);
            } 
            centerList.setModel(DLM);

            db.kobleFra();
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + er + "");
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
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList centerList;
    private javax.swing.JTextField centerSearchField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    class Tekstlytter implements DocumentListener{
    
        @Override
        public void insertUpdate(DocumentEvent e) {
            String søkeOrd = "";
            try {
                søkeOrd = e.getDocument().getText(0, e.getOffset()+1);
            } catch (BadLocationException ex) {
                Logger.getLogger(CustomerMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            //updateList(søkeOrd);
            fyllSenter(søkeOrd);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            try {
                if (e.getDocument().getText(0, e.getOffset()+1).trim().isEmpty()) {
                    fyllSenter(null);
                    return;
                }
                else {
                    String søkeOrd = "";
                    try {
                        søkeOrd = e.getDocument().getText(0, e.getOffset()+1);
                    } catch (BadLocationException ex) {
                        Logger.getLogger(CustomerMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //updateList(søkeOrd);
                    fyllSenter(søkeOrd);
                }
            } catch (BadLocationException ex) {
                Logger.getLogger(ViewCenter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
        /*public void updateList(String søkeOrd) {
            
            try{ 
                DefaultListModel DLM = new DefaultListModel(); 

                Statement setning = db.kobleTil().createStatement();
                res = setning.executeQuery("select centre_name from shoppingcentre"
                        + " where UPPER(centre_name) LIKE '"+søkeOrd.trim().toUpperCase()+"%'");
                while (res.next()) { 
                    String navn = res.getString("centre_name");
                    DLM.addElement(navn);
                } 
                centerList.setModel(DLM);
                db.kobleFra();
            }
            catch(Exception er){
                JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + er + "");
                db.kobleFra();
            }
        }*/
    }
	
}

