/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleprosjekt;
import Kode.Database;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
    private int centerID;
    private String storeName;
    private int storeID;
    private ResultSet res;
    private ResultSet res2;
    private String navn;
    private boolean isViewed = false;
    private ArrayList<Integer> storeIDs = new ArrayList();
    private Database db = new Database();
    /**
     * Creates new form ViewCenter
     */
    public ViewCenter(String centerName, int centerID) {
        this.centerName = centerName;
        this.centerID = centerID;
        initComponents();
        this.searchStoresField = searchStoresField;
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        fyllButikker(null);
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
        infoArea = new javax.swing.JTextArea();
        helpFrame = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
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
        turnoverLabel = new javax.swing.JLabel();
        floorNumberLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        additionalInfoFrame.setTitle("Centre info");
        additionalInfoFrame.setMinimumSize(new java.awt.Dimension(380, 360));

        infoArea.setEditable(false);
        infoArea.setColumns(20);
        infoArea.setRows(5);
        infoArea.setText("Manager name:\nAnnual turnover:\nCenter adress:\nCenter phone:\nNumber of parking lots:\nNumber of stores:\nNumber of floors:");
        infoArea.setFocusable(false);
        jScrollPane1.setViewportView(infoArea);

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

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel1.setText("Your questions");

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Back");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel2.setText("Write your question here.");

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout helpFrameLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(helpFrameLayout);
        helpFrameLayout.setHorizontalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(57, 57, 57))
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(helpFrameLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpFrameLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );
        helpFrameLayout.setVerticalGroup(
            helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(helpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpFrameLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(helpFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Centre Info");

        viewStoresArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewStoresArea.setForeground(new java.awt.Color(60, 60, 60));
        viewStoresArea.setOpaque(true);

        storeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        storeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                storeSelected(evt);
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

        nameLabel.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Center Name");
        nameLabel.setToolTipText("");
        nameLabel.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backPressed(evt);
            }
        });

        managerLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        managerLabel.setText("Manager: ");

        descriptionLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        descriptionLabel.setText("Description");

        storeNumberLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        storeNumberLabel.setText("Number of stores:");

        turnoverLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        turnoverLabel.setText("Annual turnover:");

        floorNumberLabel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        floorNumberLabel.setText("Number of floors");

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setText("Service Centre");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpPressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceButton(evt);
            }
        });

        jButton2.setText("Additional Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalInfoButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turnoverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storeNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(floorNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchStoresField)
                            .addComponent(viewStoresArea)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(searchStoresField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void storeSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storeSelected
        if (storeList.getSelectedValue() != null) {
            this.storeName = storeList.getSelectedValue().toString();
            this.storeID = storeIDs.get(storeList.getSelectedIndex());
            showStore();
        }
    }//GEN-LAST:event_storeSelected

    private void helpPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpPressed
        /*ServiceCentre sc = new ServiceCentre(centerID);
        sc.run();
        this.setFocusable(false);*/
        
    }//GEN-LAST:event_helpPressed

    private void serviceButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceButton
        ServiceCentre sc = new ServiceCentre(centerID);
        sc.run();
       // this.setFocusable(false);
    }//GEN-LAST:event_serviceButton

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void additionalInfoButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalInfoButton
        additionalInfoFrame.setVisible(true);
        ekstraInfo();
    }//GEN-LAST:event_additionalInfoButton
    
    private void showStore() {
        if(isViewed){
            produktInfo();
        } else {
        nameLabel.setText("<html><font color=#ABABAB>"+centerName+": </font><font color=black>"+storeName+"</font></html>");
        viewStoresArea.setTitleAt(0, "Products");
        fyllProdukter();
        isViewed = true;
        }
    }
    
    private void showCenter() {
        nameLabel.setText(centerName);
        viewStoresArea.setTitleAt(0, "Stores");
        fyllButikker(null);
    }
    
    private void fyllButikker(String søkeOrd){ // Denne metoden legger elementer fra databasen(butikker) avhengig av senternavnet inn i jList2
        try{
            DefaultListModel DLM = new DefaultListModel();
            Statement setning = db.kobleTil().createStatement();

            if (søkeOrd == null) {
                res = setning.executeQuery("select store_name, store_id from store"
                        + " where centre_id = " + centerID);
            }
            else {
                res = setning.executeQuery("select store_name, store_id from store, shoppingcentre"
                    + " where UPPER(store_name) LIKE '"+søkeOrd.toUpperCase()+"%'"
                    + " and store.centre_id = shoppingcentre.centre_id"
                    + " and store.centre_id = " + centerID); //feil
            }
            storeIDs.clear();
            
            while (res.next()) {
                String navn = res.getString("store_name");
                int ID = res.getInt("store_id");
                storeIDs.add(ID);
                DLM.addElement(navn);
            }
            storeList.setModel(DLM);
            
            //manager name
            res = setning.executeQuery("select centremanager_name from shoppingcentre, centremanager where centre_name = '"+ centerName + "'"
                    + "and shoppingcentre.manager_id = centremanager.manager_id");
            res.next();
            String manager = res.getString("centremanager_name");
            
            //annual turnover
            res = setning.executeQuery("select turnover from shoppingcentre where centre_name = '"+ centerName + "'");
            res.next();
            String turnover = res.getString("turnover");
                        
            //number of stores
            res = setning.executeQuery("select count(store_id) as ant from shoppingcentre, store"
                    + " where shoppingcentre.centre_id = store.centre_id"
                    + " and shoppingcentre.centre_id = " + centerID);
            res.next();
            String antStores = res.getString("ant");
            
            //number of floors
            res = setning.executeQuery("select max(floor) as number from store, shoppingcentre where centre_name = '"+ centerName + "'"
                    + "and store.centre_id = shoppingcentre.centre_id");
            res.next();
            String floor = res.getString("number");
            
            //description
            res = setning.executeQuery("select description from shoppingcentre where centre_name = '"+ centerName + "'");
            res.next();
            String desc = res.getString("description");
            
            descriptionLabel.setText(desc);
            managerLabel.setText("Manager: " + manager);
            turnoverLabel.setText("Annual turnover: " + turnover);
            storeNumberLabel.setText("Number of stores: " + antStores);
            floorNumberLabel.setText("Number of floors: " + floor);
            
            
            db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }
    
    private void ekstraInfo(){
        try{
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select centre_name from shoppingcentre where centre_id = "+ centerID);
            res.next();
            String navn = res.getString("centre_name");
            res = setning.executeQuery("select county_name from shoppingcentre where centre_id = "+ centerID);
            res.next();
            String fylke = res.getString("county_name");
            res = setning.executeQuery("select turnover from shoppingcentre where centre_id = "+ centerID);
            res.next();
            double turnover = res.getDouble("turnover");
            res = setning.executeQuery("select total_area from shoppingcentre where centre_id = "+ centerID);
            res.next();
            String område = res.getString("total_area");
            res = setning.executeQuery("select phonenumber from shoppingcentre where centre_id = "+ centerID);
            res.next();
            int tlf = res.getInt("phonenumber");
            res = setning.executeQuery("select adress from shoppingcentre where centre_id = "+ centerID);
            res.next();
            String adresse = res.getString("adress");
            res = setning.executeQuery("select parkinglotsize from parkinglot where centre_id = "+ centerID);
            res.next();
            int parkering = res.getInt("parkinglotsize");
            String fyll = "Name: "+navn+"\n"
            + "County: "+fylke+"\n Turnover: "+turnover+"\n Total_area: "+ område+"\n Number Of Parkingspaces: "+ parkering+" \n Phone: "+tlf+"\n Adress: "+adresse;
            infoArea.setText(fyll);
            db.kobleFra();
        }catch(Exception e){
            System.out.println(e);
            db.kobleFra();
        }
    }
     
    private void fyllProdukter(){ // Denne metoden legger elementer fra databasen(butikker) avhengig av senternavnet inn i jList2
        
        try{
            DefaultListModel DLM = new DefaultListModel();
            storeList.setModel(DLM);
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select owner_id from store where store_id = "+storeID);
            res.next();
            int ownerID = res.getInt("owner_id");
            res = setning.executeQuery("select name from product join storelink "
                    + "on product.PRODUCT_NR = storelink.product_nr "
                    + "join store on store.owner_id = "+ownerID+" and store.STORE_ID = storelink.store_ID");
            while(res.next()){
                navn = res.getString("name");
                DLM.addElement(navn);
            }
                storeList.setModel(DLM);
            
            //store type
            res = setning.executeQuery("select store_type from store where store_id = "+ storeID);
            res.next();
            String storeType = res.getString("store_type");
            
            //store owner name
            res = setning.executeQuery("select owner_name from storeowner, store"
                    + " where store_id = "+ storeID
                    + " and storeowner.owner_id = store.owner_id");
            res.next();
            String storeOwner = res.getString("owner_name");
            
            //annual turnover
            res = setning.executeQuery("select turnover from store where store_id = " + storeID);
            res.next();
            String turnover = res.getString("turnover");
            
            //building
            
            res = setning.executeQuery("select building from store where store_id = " + storeID);
            res.next();
            String building = res.getString("building");
                        
            //floor
            res = setning.executeQuery("select floor from store where store_id = "+ storeID);
            res.next();
            String floor = res.getString("floor");
            

            
            descriptionLabel.setText(storeType);
            managerLabel.setText("Store owner: " + storeOwner);
            turnoverLabel.setText("Turnover: " + turnover);
            storeNumberLabel.setText("Building: " + building);
            floorNumberLabel.setText("Floor: " + floor);

            db.kobleFra();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
        
    }
    public void produktInfo(){
        try{
            Statement setning = db.kobleTil().createStatement();
            String navn = storeList.getSelectedValue().toString();
            res = setning.executeQuery("select description from product where name = '"+navn+"'");
            res.next();
            String productDescription = res.getString("description");
            
            //annual turnover
            res = setning.executeQuery("select Price from product where name = '"+navn+"'");
            res.next();
            String pris = res.getString("Price");
            
            //building
            
            res = setning.executeQuery("select quantity from product where name = '"+navn+"'");
            res.next();
            String antall = res.getString("quantity");
                        
            //floor
            res = setning.executeQuery("select manufacturer from product where name = '"+navn+"'");
            res.next();
            String produsent = res.getString("manufacturer");
            

            
            //descriptionLabel.setText(storeType);
            managerLabel.setText("Description: " + productDescription);
            turnoverLabel.setText("Price: " + pris);
            storeNumberLabel.setText("Quantity: " + antall);
            floorNumberLabel.setText("Manufacturer: "+ produsent);
            db.kobleFra();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Dette gikk galt: "+e);
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
                setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame additionalInfoFrame;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel floorNumberLabel;
    private javax.swing.JFrame helpFrame;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
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
            String søkeOrd = "";
            try {
                søkeOrd = e.getDocument().getText(0, e.getOffset()+1);
            } catch (BadLocationException ex) {
                Logger.getLogger(CustomerMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            fyllButikker(søkeOrd);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String søkeOrd = "";
            try {
                søkeOrd = e.getDocument().getText(0, e.getOffset()+1).trim();
            } catch (BadLocationException ex) {
                Logger.getLogger(ViewCenter.class.getName()).log(Level.SEVERE, null, ex);
            }
            fyllButikker(søkeOrd);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    }
}


