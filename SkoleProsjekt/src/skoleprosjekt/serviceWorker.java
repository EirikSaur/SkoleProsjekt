/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleprosjekt;

import Kode.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sjur
 */
public class serviceWorker extends javax.swing.JFrame {
    private Database db = new Database();
    private ResultSet res;
    private ArrayList<Integer> questionIDs = new ArrayList();

    /**
     * Creates new form serviceWorker
     */
    public serviceWorker() {
        initComponents();
        loadValues("false");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerFrame = new javax.swing.JFrame();
        answerField = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        questionText = new java.awt.TextField();
        submitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionList = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        notAnsweredList = new javax.swing.JList();

        answerFrame.setMaximumSize(new java.awt.Dimension(600, 450));
        answerFrame.setMinimumSize(new java.awt.Dimension(600, 450));

        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Answer question here");

        questionText.setEnabled(false);
        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titleLabel.setText("Question title");

        backButton.setText("Back");

        javax.swing.GroupLayout answerFrameLayout = new javax.swing.GroupLayout(answerFrame.getContentPane());
        answerFrame.getContentPane().setLayout(answerFrameLayout);
        answerFrameLayout.setHorizontalGroup(
            answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(answerField, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(questionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(answerFrameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        answerFrameLayout.setVerticalGroup(
            answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(backButton))
                .addGap(23, 23, 23)
                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Search questions");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        questionList.setBackground(new java.awt.Color(242, 241, 240));
        questionList.setBorder(null);
        questionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Question1", "Question2", "Question3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        questionList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuestionSelected(evt);
            }
        });
        questionList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                questionListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(questionList);

        jTabbedPane1.addTab("Unanswered", jScrollPane2);

        notAnsweredList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        notAnsweredList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                notansweredShow(evt);
            }
        });
        jScrollPane1.setViewportView(notAnsweredList);

        jTabbedPane1.addTab("Answered", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(questionList.isSelectionEmpty() == true){
            questionText.setText("Please select a question before answering");
        }
        else{
            answerQuestion();
            questionText.setText("Question Answered!");
            //QuestionLabel.setText("Question Title");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
       
    }//GEN-LAST:event_questionTextActionPerformed

    private void questionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_questionListValueChanged

    }//GEN-LAST:event_questionListValueChanged

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void QuestionSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestionSelected
        answerFrame.setVisible(true);
        try {
            Statement statement = db.kobleTil().createStatement();
            int questionID = questionIDs.get(questionList.getSelectedIndex());
            res = statement.executeQuery("select title, question from questions where question_id =" + questionID);
            res.next();
            titleLabel.setText(res.getString("title"));
            questionText.setText(res.getString("question"));
            db.kobleFra();
            
        } catch (SQLException ex) {
            System.out.println("feil");
        }
    }//GEN-LAST:event_QuestionSelected

    private void notansweredShow(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notansweredShow
        
    }//GEN-LAST:event_notansweredShow

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 0) loadValues("false");
        if (jTabbedPane1.getSelectedIndex() == 1) loadValues("true");
    }//GEN-LAST:event_jTabbedPane1StateChanged
    private void loadValues(String answered){
        try{
            DefaultListModel dlm = new DefaultListModel();
            String query = "select question_id, title from QUESTIONS where answered = " + answered;
            Statement stmt = db.kobleTil().createStatement();
            res = stmt.executeQuery(query);
            questionIDs.clear();
            
            while(res.next()){
               int ID = res.getInt("question_id");
               
               questionIDs.add(ID);
               String title = res.getString("title");
               dlm.addElement(title);
            }
            if (answered == "true") {
                notAnsweredList.setModel(dlm);
            }
            else {
                questionList.setModel(dlm);
            }
            
            db.kobleFra();
        }catch(Exception e){
            System.out.println("her oppsto det en feil " + e);
        }
    }
    public void answerQuestion(){
        try{
            
        }catch(Exception e){
        
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void run() {
        
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
            java.util.logging.Logger.getLogger(serviceWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(serviceWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(serviceWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(serviceWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new serviceWorker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField answerField;
    private javax.swing.JFrame answerFrame;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList notAnsweredList;
    private javax.swing.JList questionList;
    private java.awt.TextField questionText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
