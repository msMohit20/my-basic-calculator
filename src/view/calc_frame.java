/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author PC1
 */
public class calc_frame extends javax.swing.JFrame {

    /**
     * Creates new form calc_frame
     */
    public calc_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        m10 = new javax.swing.JButton();
        m11 = new javax.swing.JButton();
        m12 = new javax.swing.JButton();
        m13 = new javax.swing.JButton();
        m14 = new javax.swing.JButton();
        m15 = new javax.swing.JButton();
        m16 = new javax.swing.JButton();
        m17 = new javax.swing.JButton();
        m18 = new javax.swing.JButton();
        m19 = new javax.swing.JButton();
        m20 = new javax.swing.JButton();
        m21 = new javax.swing.JButton();
        m22 = new javax.swing.JButton();
        m23 = new javax.swing.JButton();
        m24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jText.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jText.setAlignmentX(0.0F);
        jText.setAlignmentY(0.0F);
        getContentPane().add(jText);

        jPanel1.setLayout(new java.awt.GridLayout(6, 4, 1, 1));

        m1.setText("%");
        jPanel1.add(m1);

        m2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m2.setText("SQRT");
        jPanel1.add(m2);

        m3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m3.setText("square");
        jPanel1.add(m3);

        m4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m4.setText("1/x");
        jPanel1.add(m4);

        m5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m5.setText("CE");
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });
        jPanel1.add(m5);

        m6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m6.setText("C");
        jPanel1.add(m6);

        m7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m7.setText("backspace");
        jPanel1.add(m7);

        m8.setText("/");
        jPanel1.add(m8);

        m9.setText("7");
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });
        jPanel1.add(m9);

        m10.setText("8");
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m10ActionPerformed(evt);
            }
        });
        jPanel1.add(m10);

        m11.setText("9");
        m11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m11ActionPerformed(evt);
            }
        });
        jPanel1.add(m11);

        m12.setText("*");
        jPanel1.add(m12);

        m13.setText("4");
        m13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m13ActionPerformed(evt);
            }
        });
        jPanel1.add(m13);

        m14.setText("5");
        m14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m14ActionPerformed(evt);
            }
        });
        jPanel1.add(m14);

        m15.setText("6");
        m15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m15ActionPerformed(evt);
            }
        });
        jPanel1.add(m15);

        m16.setText("-");
        jPanel1.add(m16);

        m17.setText("1");
        m17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m17ActionPerformed(evt);
            }
        });
        jPanel1.add(m17);

        m18.setText("2");
        m18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m18ActionPerformed(evt);
            }
        });
        jPanel1.add(m18);

        m19.setText("3");
        m19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m19ActionPerformed(evt);
            }
        });
        jPanel1.add(m19);

        m20.setText("+");
        m20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m20ActionPerformed(evt);
            }
        });
        jPanel1.add(m20);

        m21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        m21.setText("+/-");
        jPanel1.add(m21);

        m22.setText("0");
        m22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m22ActionPerformed(evt);
            }
        });
        jPanel1.add(m22);

        m23.setText(".");
        m23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m23ActionPerformed(evt);
            }
        });
        jPanel1.add(m23);

        m24.setText("=");
        m24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m24ActionPerformed(evt);
            }
        });
        jPanel1.add(m24);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   int sum=0;
   void add(String s)
   {
       sum = sum + Integer.parseInt(s);
   }
    private void m11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m11ActionPerformed
       jText.setText(jText.getText()+"9");
       
    }//GEN-LAST:event_m11ActionPerformed

    private void m14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m14ActionPerformed
       jText.setText(jText.getText()+"5");
    }//GEN-LAST:event_m14ActionPerformed

    private void m24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m24ActionPerformed
        add(jText.getText());
        jText.setText("");
        System.out.println(sum+" is answer..");
        jText.setText(sum+"");
        sum=0;
        
    }//GEN-LAST:event_m24ActionPerformed

    private void m23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m23ActionPerformed
        jText.setText(jText.getText()+".");
    }//GEN-LAST:event_m23ActionPerformed

    private void m22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m22ActionPerformed
        jText.setText(jText.getText()+"0");
    }//GEN-LAST:event_m22ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
       jText.setText(jText.getText()+"7");
    }//GEN-LAST:event_m9ActionPerformed

    private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
        jText.setText(jText.getText()+"8");
    }//GEN-LAST:event_m10ActionPerformed

    private void m13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m13ActionPerformed
        jText.setText(jText.getText()+"4");
    }//GEN-LAST:event_m13ActionPerformed

    private void m15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m15ActionPerformed
        jText.setText(jText.getText()+"6");
    }//GEN-LAST:event_m15ActionPerformed

    private void m17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m17ActionPerformed
        jText.setText(jText.getText()+"1");
    }//GEN-LAST:event_m17ActionPerformed

    private void m18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m18ActionPerformed
        jText.setText(jText.getText()+"2");
    }//GEN-LAST:event_m18ActionPerformed

    private void m19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m19ActionPerformed
        jText.setText(jText.getText()+"3");
    }//GEN-LAST:event_m19ActionPerformed

    private void m20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m20ActionPerformed
        add(jText.getText());
        jText.setText("");
        
    }//GEN-LAST:event_m20ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        jText.setText("");
    }//GEN-LAST:event_m5ActionPerformed
    
    /**
     * 
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
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jText;
    private javax.swing.JButton m1;
    private javax.swing.JButton m10;
    private javax.swing.JButton m11;
    private javax.swing.JButton m12;
    private javax.swing.JButton m13;
    private javax.swing.JButton m14;
    private javax.swing.JButton m15;
    private javax.swing.JButton m16;
    private javax.swing.JButton m17;
    private javax.swing.JButton m18;
    private javax.swing.JButton m19;
    private javax.swing.JButton m2;
    private javax.swing.JButton m20;
    private javax.swing.JButton m21;
    private javax.swing.JButton m22;
    private javax.swing.JButton m23;
    private javax.swing.JButton m24;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    // End of variables declaration//GEN-END:variables
}
