/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author martincorria
 */
public class FenetreQuiz extends javax.swing.JFrame {
    
    private Question[] questions;
    private int indexQuestionCourante = 0;
    private Question q;
    boolean win = false;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());
    
    

    
    public FenetreQuiz() {
        initComponents();
        
        questions = new Question[] {
        new Question("Capitale de la France ?", "Berlin", "Madrid", "Paris", "Rome", 3),
        new Question("Capitale de l'Espagne ?", "Lisbonne", "Madrid", "Barcelone", "Séville", 2),
        new Question("2 + 2 = ?", "3", "4", "5", "6", 2),
        new Question("Quel est le plus grand océan du monde ?","Atlantique","Indien","Arctique","Pacifique",4),
        new Question("Quel est l'élément chimique représenté par le symbole O ?","Or","Oxygène","Osmium","Ozone",2)
        };
        afficherQuestionCourante();
        
        
        
        
        
        
        
        
        


    }
    
    private void afficherQuestionCourante() {
        Question q = questions[indexQuestionCourante];

        
        intituleQ.setText(q.GetIntitule());
        rep1.setText(q.GetProposition1());
        rep2.setText(q.GetProposition2());
        rep3.setText(q.GetProposition3());
        rep4.setText(q.GetProposition4());
        feedback.setVisible(false);
        suivant.setVisible(false);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intituleQ = new javax.swing.JLabel();
        rep1 = new javax.swing.JButton();
        rep2 = new javax.swing.JButton();
        rep3 = new javax.swing.JButton();
        rep4 = new javax.swing.JButton();
        feedback = new javax.swing.JLabel();
        suivant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        intituleQ.setText("jLabel1");
        intituleQ.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                intituleQAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        rep1.setText("1");
        rep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep1ActionPerformed(evt);
            }
        });

        rep2.setText("2");
        rep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep2ActionPerformed(evt);
            }
        });

        rep3.setText("3");
        rep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep3ActionPerformed(evt);
            }
        });

        rep4.setText("4");
        rep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep4ActionPerformed(evt);
            }
        });

        feedback.setText("jLabel1");

        suivant.setText("Suivant");
        suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suivantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rep3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(rep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rep2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(rep4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(intituleQ)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(feedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(suivant)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(intituleQ)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rep1)
                            .addComponent(rep2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rep4)
                            .addComponent(rep3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(feedback)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suivant)
                        .addGap(44, 44, 44))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void rep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep3ActionPerformed
        feedback.setVisible(true);
        Question q = questions[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 3 ) {
            feedback.setText("T'es chaud");
            win = true;
        }
        if (q.getIndexBonneReponse() != 3 ) {
            feedback.setText(" non !");
            rep3.setVisible(false);
    } 
    
            
            
    }//GEN-LAST:event_rep3ActionPerformed

    private void intituleQAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_intituleQAncestorMoved
    }//GEN-LAST:event_intituleQAncestorMoved

    private void rep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep1ActionPerformed
        feedback.setVisible(true);
        Question q = questions[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 1 ) {
            feedback.setText("T'es chaud");
            win = true;
        }
        if (q.getIndexBonneReponse() != 1 ) {
            feedback.setText(" non !");
            rep1.setVisible(false);
    }
    
    }//GEN-LAST:event_rep1ActionPerformed

    private void rep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep2ActionPerformed
    feedback.setVisible(true);
    Question q = questions[indexQuestionCourante];
    if (q.getIndexBonneReponse() == 2 ) {
        feedback.setText("T'es chaud");
        win = true;
    }
    if (q.getIndexBonneReponse() != 2 ) {
        feedback.setText(" non !");
        rep2.setVisible(false);
    } 
    
    }//GEN-LAST:event_rep2ActionPerformed

    private void rep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep4ActionPerformed
        feedback.setVisible(true);
        Question q = questions[indexQuestionCourante];
        if (q.getIndexBonneReponse() == 4) {
            feedback.setText("T'es chaud");
            win = true;
        }
        if (q.getIndexBonneReponse() != 4 ) {
            feedback.setText(" non !");
            rep4.setVisible(false);
    } 
    
    }//GEN-LAST:event_rep4ActionPerformed

    private void suivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suivantActionPerformed
        if  (win == true) {
            suivant.setVisible(true);
            indexQuestionCourante += 1;
        }

    }//GEN-LAST:event_suivantActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        


        
        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel feedback;
    private javax.swing.JLabel intituleQ;
    private javax.swing.JButton rep1;
    private javax.swing.JButton rep2;
    private javax.swing.JButton rep3;
    private javax.swing.JButton rep4;
    private javax.swing.JButton suivant;
    // End of variables declaration//GEN-END:variables
}
