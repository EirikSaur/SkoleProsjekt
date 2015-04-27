/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skoleprosjekt;

import Kode.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
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
    private int questionID;
    private boolean pressedAnsw = false;
    private ArrayList<Integer> questionIDs = new ArrayList();
    private String username;
    private int servicecentreId;
    
    /**
     * Creates new form serviceWorker
     * @param swID - the ID of a selected service worker
     */
    public serviceWorker(int swID) {
        try{
            this.username = username;
            Statement stmt = db.kobleTil().createStatement();
            res = stmt.executeQuery("select servicecentre_id from serviceworker where serviceworker_id = " + swID);
            res.next();     
            servicecentreId = res.getInt("servicecentre_id");
            initComponents();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            answerFrame.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            System.out.println(servicecentreId);
            loadValues(null);
        }catch(Exception e){
            System.out.println(e);
        }
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

        answerFrame.setMinimumSize(new java.awt.Dimension(600, 470));

        jLabel2.setText("Answer question here");

        submitButton.setBackground(new java.awt.Color(0, 204, 0));
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

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backButtonMousePressed(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        questionText.setColumns(20);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Service Worker");

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
                notAnsweredListMousePressed(evt);
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        submitAnswer();
    }//GEN-LAST:event_submitButtonActionPerformed

    public void submitAnswer(){
        if (submitButton.getText() == "Submit") answerQuestion();
        if (submitButton.getText() == "Edit" && !pressedAnsw) editAnswer();
        else {
            pressedAnsw = false;
        }
    }
    private void questionListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_questionListValueChanged

    }//GEN-LAST:event_questionListValueChanged

    private void questSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questSearchFieldActionPerformed

    /**
     * QuestionSelected - method that fills a question either into a "Answered" or "Not answered" list
     * @param evt 
     */
    private void QuestionSelected(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestionSelected
        chooseQuestion();
    }//GEN-LAST:event_QuestionSelected

    public void chooseQuestion(){
        answerFrame.setVisible(true);
        try {
            Statement statement = db.kobleTil().createStatement();
            
            if (jTabbedPane1.getSelectedIndex() == 0) {
                questionID = questionIDs.get(questionList.getSelectedIndex());
                res = statement.executeQuery("select title, question from questions where question_id =" + questionID);
                res.next();
                titleLabel.setText(res.getString("title"));
                questionText.setText(res.getString("question"));
                answerField.setText("");
                answerField.setEnabled(true);
                submitButton.setText("Submit");
            }
            else {
                questionID = questionIDs.get(notAnsweredList.getSelectedIndex());
                res = statement.executeQuery("select title, question, answer from questions where question_id =" + questionID);
                res.next();
                titleLabel.setText(res.getString("title"));
                questionText.setText(res.getString("question"));
                answerField.setText(res.getString("answer"));
                answerField.setEnabled(false);
                submitButton.setText("Edit");
                submitButton.setEnabled(true);
            }
            db.kobleFra();
            
        } catch (SQLException ex) {
            System.out.println("feil");
        }
    }
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        loadValues(null);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void backButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMousePressed
        answerFrame.setVisible(false);
        answerFrame.dispose();
        loadValues(null);
    }//GEN-LAST:event_backButtonMousePressed

    private void answerFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerFieldKeyTyped
        submitButton.setEnabled(true);
    }//GEN-LAST:event_answerFieldKeyTyped

    private void notAnsweredListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notAnsweredListMousePressed
        QuestionSelected(evt);
    }//GEN-LAST:event_notAnsweredListMousePressed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        loadValues(null);
    }//GEN-LAST:event_backButtonActionPerformed
    private void editAnswer() {
        submitButton.setText("Submit");
        answerField.setEnabled(true);
    }
    
    /**
     * loadValues - method that fills titles of questions to a JList featuring a search option
     * @param søkeOrd - string the user has entered to the search field
     */
    private void loadValues(String søkeOrd){
        try{
            DefaultListModel dlm = new DefaultListModel();
            Statement stmt = db.kobleTil().createStatement();
            questionIDs.clear();
            String answered = "";
            
            if (jTabbedPane1.getSelectedIndex() == 0) answered = "null";
            if (jTabbedPane1.getSelectedIndex() == 1) answered = "not null";
            
            if (søkeOrd == null) {
                res = stmt.executeQuery("select question_id, title from QUESTIONS where answer is " + answered+" and servicecentre_id= "+servicecentreId);
            }
            else {
                res = stmt.executeQuery("select question_id, title from QUESTIONS where answer is " + answered
                    + " and UPPER(title) LIKE '"+søkeOrd.toUpperCase()+"%' and servicecentre_id= "+servicecentreId+"");
            }
            while(res.next()){
               int ID = res.getInt("question_id");
               
               questionIDs.add(ID);
               String title = res.getString("title");
               dlm.addElement(title);
            }
            if (jTabbedPane1.getSelectedIndex() == 1) {
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
    
    /**
     * answerQuestion - method that lets a service worker answer an unanswered question
     */
    public void answerQuestion(){
        try{
            answerField.setEnabled(false);
            submitButton.setText("Edit");
            answerField.setEnabled(false);
            pressedAnsw = true;
            String query = "update questions set answer = '"+ answerField.getText() +"' where question_id = " + questionID;
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
                setVisible(true);
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
            loadValues(søkeOrd);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            String søkeOrd = "";
            try {
                søkeOrd = e.getDocument().getText(0, e.getOffset()+1);
            } catch (BadLocationException ex) {
                Logger.getLogger(CustomerMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadValues(søkeOrd);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    }
}
