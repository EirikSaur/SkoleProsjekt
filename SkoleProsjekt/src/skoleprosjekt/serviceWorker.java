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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Sjur
 */
public class serviceWorker extends javax.swing.JFrame {
    private Database db = new Database();
    private ResultSet res;
    private String answered = "false";
    private int questionID;
    private ArrayList<Integer> questionIDs = new ArrayList();
    private String username;
    
    /**
     * Creates new form serviceWorker
     */
    public serviceWorker(String username) {
        this.username = username;
        
        initComponents();
        loadValues(answered, null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        questionText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        answerField = new javax.swing.JTextArea();
        questSearchField = new javax.swing.JTextField();
        Tekstlytter l = new Tekstlytter();
        questSearchField.getDocument().addDocumentListener(l);
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionList = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        notAnsweredList = new javax.swing.JList();

        answerFrame.setMaximumSize(new java.awt.Dimension(600, 450));
        answerFrame.setMinimumSize(new java.awt.Dimension(600, 450));

        jLabel2.setText("Answer question here");

        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Question title");

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
        });

        questionText.setBackground(null);
        questionText.setColumns(20);
        questionText.setForeground(null);
        questionText.setRows(5);
        jScrollPane3.setViewportView(questionText);

        answerField.setColumns(20);
        answerField.setRows(5);
        answerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                answerFieldKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(answerField);

        javax.swing.GroupLayout answerFrameLayout = new javax.swing.GroupLayout(answerFrame.getContentPane());
        answerFrame.getContentPane().setLayout(answerFrameLayout);
        answerFrameLayout.setHorizontalGroup(
            answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerFrameLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, answerFrameLayout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, answerFrameLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        answerFrameLayout.setVerticalGroup(
            answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questSearchFieldActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 1, true));
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

        notAnsweredList.setBackground(new java.awt.Color(242, 241, 240));
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
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        answerQuestion();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void questionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_questionListValueChanged

    }//GEN-LAST:event_questionListValueChanged

    private void questSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questSearchFieldActionPerformed

    private void QuestionSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestionSelected
        answerFrame.setVisible(true);
        try {
            Statement statement = db.kobleTil().createStatement();
            questionID = questionIDs.get(questionList.getSelectedIndex());
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
        if (jTabbedPane1.getSelectedIndex() == 0) answered = "false";
        if (jTabbedPane1.getSelectedIndex() == 1) answered = "true";
        loadValues(answered, "");
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        answerFrame.setVisible(false);
        answerFrame.dispose();
    }//GEN-LAST:event_backButtonMousePressed

    private void answerFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerFieldKeyTyped
        submitButton.setEnabled(true);
    }//GEN-LAST:event_answerFieldKeyTyped
    private void loadValues(String answered, String søkeOrd){
        try{
            DefaultListModel dlm = new DefaultListModel();
            Statement stmt = db.kobleTil().createStatement();
            questionIDs.clear();
            
            if (søkeOrd == null) {
                res = stmt.executeQuery("select question_id, title from QUESTIONS where answered = " + answered);
            }
            else {
                res = stmt.executeQuery("select question_id, title from QUESTIONS where answered = " + answered
                    + " and UPPER(title) LIKE '"+søkeOrd.toUpperCase()+"%'");
            }
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
            String title = titleLabel.getText();
            String answer = answerField.getText();
            String query = "update questions set answered = true where question_id = " + questionID;
            Statement stmt = db.kobleTil().createStatement();
            stmt.executeUpdate(query);
        }catch(Exception e){
            System.out.println("feil");
        }
    }
    /**
     * @param args the command line arguments
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
                new serviceWorker(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerField;
    private javax.swing.JFrame answerFrame;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList notAnsweredList;
    private javax.swing.JTextField questSearchField;
    private javax.swing.JList questionList;
    private javax.swing.JTextArea questionText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
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
            loadValues(answered, søkeOrd);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            try {
                if (e.getDocument().getText(0, e.getOffset()+1).trim().isEmpty()) {
                    loadValues(answered, null);
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
