/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skoleprosjekt;

import Kode.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 * ServiceCentre - creates the service centre window visible for users that are not logged into the system
 * @author Eirik Saur
 */
public class ServiceCentre extends javax.swing.JFrame {
    private ResultSet res;
    private int id;
    private Database db = new Database();

    /**
     * Creates new form ServiceCentre
     * @param centre_id
     */
    public ServiceCentre(int centre_id) {
        try{
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select servicecentre_id from servicecentre where centre_id = "+centre_id+"");
            res.next();
            id = res.getInt("servicecentre_id");
            initComponents();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            
            db.kobleFra();
            fillQuestions(null);
        }catch(SQLException e){
            System.out.println("her " + e);
            db.kobleFra();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ansQuestionList = new javax.swing.JList();
        questionInputField = new javax.swing.JTextField();
        uploadQuestionButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        titleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        søkeFelt = new javax.swing.JTextField();
        Tekstlytter l = new Tekstlytter();
        søkeFelt.getDocument().addDocumentListener(l);
        jScrollPane2 = new javax.swing.JScrollPane();
        answerBox = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service Centre");

        ansQuestionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ansQuestionListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ansQuestionList);

        uploadQuestionButton.setBackground(new java.awt.Color(0, 204, 0));
        uploadQuestionButton.setText("Upload Question");
        uploadQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadQuestionButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Answered Questions");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Contact Us");

        søkeFelt.setText("Search FAQ..");
        søkeFelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                søkeFeltActionPerformed(evt);
            }
        });

        answerBox.setEditable(false);
        answerBox.setColumns(20);
        answerBox.setRows(5);
        jScrollPane2.setViewportView(answerBox);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Answer");

        jLabel5.setText("E-Mail");

        jLabel6.setText("Title");

        jLabel3.setText("Question");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(søkeFelt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 418, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(uploadQuestionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(questionInputField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(titleField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(søkeFelt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uploadQuestionButton)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uploadQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadQuestionButtonActionPerformed
        askQuestion();
    }//GEN-LAST:event_uploadQuestionButtonActionPerformed

    /**
     *
     */
    public void askQuestion(){
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to upload this question?","alert", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            makeQuestion();
            questionInputField.setText("Your question was sent succesfully.");
        }
    }
    private void ansQuestionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ansQuestionListValueChanged
        String questionAns = ansQuestionList.getSelectedValue().toString();
        fillAnswers(questionAns);
    }//GEN-LAST:event_ansQuestionListValueChanged

    private void søkeFeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_søkeFeltActionPerformed
        searchQuestions();
    }//GEN-LAST:event_søkeFeltActionPerformed

    /**
     *
     */
    public void searchQuestions(){
        try{ 
            Statement setning = db.kobleTil().createStatement();
            DefaultListModel DLM = new DefaultListModel();
            res = setning.executeQuery("select title from questions where UPPER title like UPPER('"+søkeFelt.getText()+"%' and servicecentre_id = "+id+"");
            while (res.next()) {
                    String tittel = res.getString("title");
                    DLM.addElement(tittel);
        }
        ansQuestionList.setModel(DLM);
        } catch(Exception e){
            System.out.println("Dette gikk ikke " + e);
        }
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * askQuestion - a method that lets a customer ask the service centre a question
     */
    private void makeQuestion(){
        try {
            
            Statement setning = db.kobleTil().createStatement();
            String title = titleField.getText();
            String email = emailField.getText();
            String question = questionInputField.getText();
            
            String insert = "insert into QUESTIONS(TITLE, QUESTION,EMAIL, servicecentre_id) VALUES('" + title +"', '" + question + "', '" + email + "', "+id+")";

            setning.executeUpdate(insert);
            
            db.kobleFra();
        }catch(SQLException e){
            System.out.println(e);
            db.kobleFra();
        }
    }
    
    /**
     * fillQuestions - a method that fills a JList with answered questions featuring a search field where a user can search in answered questions
     * @param søkeOrd - the string the user entered to the search-field
     */
        private void fillQuestions(String søkeOrd){
        try{
            Statement setning = db.kobleTil().createStatement();
            DefaultListModel DLM = new DefaultListModel();
            if (søkeOrd == null) {
                res = setning.executeQuery("select TITLE from QUESTIONS where ANSWER"
                        + " is not null and servicecentre_id = "+id+"");
            }
            else {
                res = setning.executeQuery("select TITLE from QUESTIONS where ANSWER"
                        + " is not null and servicecentre_id = "+id+""
                        + " and UPPER(TITLE) LIKE '" + søkeOrd.toUpperCase() + "%'");
            }
            
            while (res.next()) {
                    String tittel = res.getString("TITLE");
                    DLM.addElement(tittel);
            }
            ansQuestionList.setModel(DLM);
            db.kobleFra();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }
        
        /**
         * fillAnswers - a method that fills in the answer of a selected question 
         * @param question - the question the user has clicked to get an answer 
         */
        private void fillAnswers(String question){
        try{
            Statement setning = db.kobleTil().createStatement();
            res = setning.executeQuery("select ANSWER from QUESTIONS where TITLE = '"+question+"' and servicecentre_id = "+id+"");
            res.next();
            String settinn = res.getString("answer");
            answerBox.setText(settinn);
            db.kobleFra();
        
        
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Her oppsto det en feil" + e + "");
            db.kobleFra();
        }
    }
        
        
    /**
     */
    public void run() {
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
            java.util.logging.Logger.getLogger(ServiceCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JList ansQuestionList;
    private javax.swing.JTextArea answerBox;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField questionInputField;
    private javax.swing.JTextField søkeFelt;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton uploadQuestionButton;
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
            fillQuestions(søkeOrd);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String søkeOrd = "";
            try {
                søkeOrd = e.getDocument().getText(0, e.getOffset()+1).trim();
            } catch (BadLocationException ex) {
                Logger.getLogger(ViewCenter.class.getName()).log(Level.SEVERE, null, ex);
            }
            fillQuestions(søkeOrd);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    }
}


