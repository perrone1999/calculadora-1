/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precalc;

/**
 *
 * @author francescaperrone
 *
 * Nota: Los sombreado no se puede modificar Nota2: el design es un archivo que
 * se llama .form
 */
public class CalculadoraPrevia extends javax.swing.JFrame { //definicion de la clase

    /**
     * Creates new form CalculadoraPrevia
     */
    public CalculadoraPrevia() {//constructor
        initComponents();
        expre = "";

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelN = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JTextField();
        PanelS = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelC = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnMen = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnParI = new javax.swing.JButton();
        btnParD = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnIg = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Previa");

        PanelN.setBackground(new java.awt.Color(51, 102, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pantalla");

        Pantalla.setColumns(20);

        javax.swing.GroupLayout PanelNLayout = new javax.swing.GroupLayout(PanelN);
        PanelN.setLayout(PanelNLayout);
        PanelNLayout.setHorizontalGroup(
            PanelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        PanelNLayout.setVerticalGroup(
            PanelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(PanelN, java.awt.BorderLayout.PAGE_START);

        PanelS.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SignPainter", 0, 24)); // NOI18N
        jLabel3.setText("- Maracuyá -");

        javax.swing.GroupLayout PanelSLayout = new javax.swing.GroupLayout(PanelS);
        PanelS.setLayout(PanelSLayout);
        PanelSLayout.setHorizontalGroup(
            PanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        PanelSLayout.setVerticalGroup(
            PanelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        getContentPane().add(PanelS, java.awt.BorderLayout.PAGE_END);

        PanelC.setBackground(new java.awt.Color(0, 102, 0));
        PanelC.setLayout(new java.awt.GridLayout(4, 5, 1, 1));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        PanelC.add(btn0);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        PanelC.add(btn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        PanelC.add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        PanelC.add(btn3);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        PanelC.add(btn4);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        PanelC.add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        PanelC.add(btn6);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        PanelC.add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        PanelC.add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        PanelC.add(btn9);

        btnM.setText("+");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });
        PanelC.add(btnM);

        btnMen.setText("-");
        btnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenActionPerformed(evt);
            }
        });
        PanelC.add(btnMen);

        btnP.setText("*");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });
        PanelC.add(btnP);

        btnD.setText("/");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        PanelC.add(btnD);

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        PanelC.add(btnPunto);

        btnParI.setText("(");
        btnParI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParIActionPerformed(evt);
            }
        });
        PanelC.add(btnParI);

        btnParD.setText(")");
        btnParD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParDActionPerformed(evt);
            }
        });
        PanelC.add(btnParD);

        btnClr.setText("Clr");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });
        PanelC.add(btnClr);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        PanelC.add(jPanel1);

        btnIg.setText("=");
        btnIg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgActionPerformed(evt);
            }
        });
        PanelC.add(btnIg);

        getContentPane().add(PanelC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        expre += "0";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        expre += "+";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnMActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        expre += ".";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        expre += "1";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        expre += "2";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        expre += "3";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        expre += "4";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        expre += "5";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        expre += "6";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        expre += "7";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        expre += "8";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        expre += "9";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenActionPerformed
        expre += "-";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnMenActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        expre += "*";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnPActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        expre += "/";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnDActionPerformed

    private void btnParIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParIActionPerformed
        expre += "(";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnParIActionPerformed

    private void btnParDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParDActionPerformed
        expre += ")";
        Pantalla.setText(expre);
    }//GEN-LAST:event_btnParDActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        Pantalla.setText("");
        expre = "";
    }//GEN-LAST:event_btnClrActionPerformed

    private void btnIgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgActionPerformed
        ClaseConjunta resultado = new ClaseConjunta(expre);
        Pantalla.setText(resultado.calcular());
        expre = "";
    }//GEN-LAST:event_btnIgActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {//Main QUE NO SE TOCA
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
            java.util.logging.Logger.getLogger(CalculadoraPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPrevia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelC;
    private javax.swing.JPanel PanelN;
    private javax.swing.JPanel PanelS;
    private javax.swing.JTextField Pantalla;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnIg;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnMen;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnParD;
    private javax.swing.JButton btnParI;
    private javax.swing.JButton btnPunto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    String expre;

}