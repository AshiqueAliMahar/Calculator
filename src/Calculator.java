
import javax.swing.UIManager;


public class Calculator extends javax.swing.JFrame {
    
    NewJFrame ob=new NewJFrame();
    Converter conv=new Converter();
    private String FNum = "";
    int Fnum;
    int Snum;
    double fnum;
    static int NoOfpoint;
    int result;
    private String SNum;

    public Calculator() {
        initComponents();
    }

    private void btnDisable() {

        btnSub.setEnabled(false);
        btnMod.setEnabled(false);
        btnDiv.setEnabled(false);
        btnPlus.setEnabled(false);
        btnRoot.setEnabled(false);
        btnMul.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miConvert = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextPane();
        btnMod = new javax.swing.JButton();
        btnRoot = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnpoint = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");

        jMenuItem1.setText("about");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("More");

        miConvert.setText("Converters");
        miConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConvertActionPerformed(evt);
            }
        });
        jMenu5.add(miConvert);

        jMenuBar1.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 51));
        setBounds(new java.awt.Rectangle(200, 300, 280, 380));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(255, 204, 51));
        setMaximumSize(new java.awt.Dimension(276, 308));
        setMinimumSize(new java.awt.Dimension(276, 308));
        setPreferredSize(new java.awt.Dimension(276, 336));
        setResizable(false);
        setSize(new java.awt.Dimension(200, 300));
        getContentPane().setLayout(null);

        txtOutput.setEditable(false);
        txtOutput.setFont(new java.awt.Font("Symbol", 0, 11)); // NOI18N
        txtOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(txtOutput);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 237, 55);

        btnMod.setText("%");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        getContentPane().add(btnMod);
        btnMod.setBounds(140, 160, 56, 27);

        btnRoot.setText("√");
        btnRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRootActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoot);
        btnRoot.setBounds(140, 130, 56, 27);

        btnClear.setText("Clr");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(10, 160, 122, 27);

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv);
        btnDiv.setBounds(200, 130, 50, 27);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(10, 200, 61, 27);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(80, 200, 55, 27);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(140, 200, 56, 27);

        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        getContentPane().add(btnMul);
        btnMul.setBounds(200, 160, 50, 27);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(10, 230, 61, 27);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 230, 55, 27);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(140, 230, 55, 27);

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub);
        btnSub.setBounds(200, 190, 50, 27);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(10, 260, 61, 27);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(80, 260, 55, 27);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(140, 260, 56, 27);

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus);
        btnPlus.setBounds(200, 220, 50, 27);

        btnPlusMinus.setText("+-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlusMinus);
        btnPlusMinus.setBounds(10, 290, 61, 27);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(80, 290, 55, 27);

        btnpoint.setText(".");
        btnpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpointActionPerformed(evt);
            }
        });
        getContentPane().add(btnpoint);
        btnpoint.setBounds(140, 290, 56, 27);

        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(btnEqual);
        btnEqual.setBounds(200, 260, 50, 60);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(10, 130, 122, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WDF_2032075.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 60, 260, 260);

        jButton1.setText("Converter");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 0, 130, 27);

        jButton2.setText("About");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 120, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        FNum += "1";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        FNum += "2";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();


    }//GEN-LAST:event_btn2ActionPerformed

    private void checkchar() {

        for (int i = 1; i < FNum.length(); i++) {

            switch (FNum.charAt(i)) {

                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                    btnDisable();

            }

        }
    }


    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        FNum += "3";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();

    }//GEN-LAST:event_btn3ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed

        FNum += "+";
        txtOutput.setText(FNum);
        dsblPoint();
        btnDisable();

    }//GEN-LAST:event_btnPlusActionPerformed
    private void dsblPoint() {

        if (NoOfpoint > 0) {

            NoOfpoint--;

        }
    }

    private void enablesTrue() {

        btnSub.setEnabled(true);
        btnClear.setEnabled(true);
        btnDiv.setEnabled(true);
        btnMul.setEnabled(true);
        btnRoot.setEnabled(true);
        btnPlus.setEnabled(true);
        btnMod.setEnabled(true);

    }


    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed

        int index = 0;
        boolean chckOper = true;
        for (int i = 1; i < FNum.length(); i++) {

            if (FNum.charAt(i) == '+') {

                if (FNum.charAt(index) == '-') {

                    fnum += -Float.parseFloat(FNum.substring(index + 1, i));
                    index = i + 1;
                    fnum += Float.parseFloat(FNum.substring(index, FNum.length()));

                } else {

                    fnum += Float.parseFloat(FNum.substring(index, i));
                    index = i + 1;
                    fnum += Float.parseFloat(FNum.substring(index, FNum.length()));

                }

            } else if (FNum.charAt(i) == '-') {

                if (FNum.charAt(index) == '-') {

                    fnum += -Float.parseFloat(FNum.substring(index + 1, i));
                    index = i + 1;
                    fnum -= Float.parseFloat(FNum.substring(index, FNum.length()));

                } else {

                    fnum += Float.parseFloat(FNum.substring(index, i));
                    index = i + 1;
                    fnum -= Float.parseFloat(FNum.substring(index, FNum.length()));

                }

            } else if (FNum.charAt(i) == '*') {

                if (FNum.charAt(index) == '-') {

                    fnum += -Float.parseFloat(FNum.substring(index + 1, i));
                    index = i + 1;
                    fnum *= Float.parseFloat(FNum.substring(index, FNum.length()));

                } else {

                    fnum += Float.parseFloat(FNum.substring(index, i));
                    index = i + 1;
                    fnum *= Float.parseFloat(FNum.substring(index, FNum.length()));

                }

            } else if (FNum.charAt(i) == '/') {

                if (FNum.charAt(index) == '-') {

                    fnum += -Float.parseFloat(FNum.substring(index + 1, i));
                    index = i + 1;
                    fnum /= Float.parseFloat(FNum.substring(index, FNum.length()));

                } else {

                    fnum += Float.parseFloat(FNum.substring(index, i));
                    index = i + 1;
                    fnum /= Float.parseFloat(FNum.substring(index, FNum.length()));

                }

            } else if (FNum.charAt(i) == '%') {

                if (FNum.charAt(index) == '-') {

                    fnum += -Float.parseFloat(FNum.substring(index + 1, i));
                    index = i + 1;
                    fnum %= Float.parseFloat(FNum.substring(index, FNum.length()));

                } else {

                    fnum += Float.parseFloat(FNum.substring(index, i));
                    index = i + 1;
                    fnum %= Float.parseFloat(FNum.substring(index, FNum.length()));

                }

            }
            if (FNum.charAt(i) == '+' || FNum.charAt(i) == '-' || FNum.charAt(i) == '*' || FNum.charAt(i) == '/' || FNum.charAt(i) == '%') {

                chckOper = false;

            }

        }
        if (chckOper) {

            if (FNum.charAt(index) == '-') {

                fnum = -Float.parseFloat(FNum.substring(index + 1, FNum.length()));

            } else {

                fnum = Float.parseFloat(FNum.substring(index, FNum.length()));

            }

        }

        FNum = fnum + "";
        enablesTrue();
        txtOutput.setText("" + FNum);
        fnum = 0;
        for (int i = 0; i < FNum.length(); i++) {

            if (FNum.charAt(i) == '.') {

                if (NoOfpoint >= 0 && NoOfpoint < 1) {

                    NoOfpoint++;

                }

            }

        }


    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed

        FNum += "-";
        txtOutput.setText(FNum);
        dsblPoint();
        btnDisable();


    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed

        FNum += "*";
        txtOutput.setText(FNum);
        dsblPoint();
        btnDisable();


    }//GEN-LAST:event_btnMulActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        FNum += "0";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        FNum += "4";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        FNum += "5";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        FNum += "6";
        txtOutput.setText(FNum);
        enablesTrue();

        checkchar();

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        FNum += "7";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        FNum += "8";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:

        FNum += "9";
        txtOutput.setText(FNum);
        enablesTrue();
        checkchar();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed

        FNum = "-" + FNum;
        txtOutput.setText(FNum);


    }//GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed

        FNum = FNum + "/";
        txtOutput.setText(FNum);
        dsblPoint();
        btnDisable();
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        FNum = 0 + "";
        txtOutput.setText(FNum);
        dsblPoint();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRootActionPerformed

        txtOutput.setText(Math.sqrt(Float.parseFloat(FNum)) + "");
        FNum = txtOutput.getText();


    }//GEN-LAST:event_btnRootActionPerformed

    private void btnpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpointActionPerformed
        if (NoOfpoint == 0) {

            FNum += ".";
            txtOutput.setText(FNum);
            NoOfpoint++;

        }

    }//GEN-LAST:event_btnpointActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed

        FNum += "%";
        txtOutput.setText(FNum);


    }//GEN-LAST:event_btnModActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        if (FNum.length() > 0) {
            if ((FNum.substring(FNum.length() - 1, FNum.length())).equals("+") || FNum.substring(FNum.length() - 1, FNum.length()).equals("-") || FNum.substring(FNum.length() - 1, FNum.length()).equals("*") || FNum.substring(FNum.length() - 1, FNum.length()).equals("/") || FNum.substring(FNum.length() - 1, FNum.length()).equals("%")) {

                enablesTrue();
                FNum = FNum.substring(0, FNum.length() - 1);
                txtOutput.setText(FNum);
                dsblPoint();
                
            } else {
                FNum = FNum.substring(0, FNum.length() - 1);
                txtOutput.setText(FNum);
                dsblPoint();
            }

        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
        
        ob.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConvertActionPerformed
        
        
        conv.setVisible(true);
        
    }//GEN-LAST:event_miConvertActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conv.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        Calculator ob = new Calculator();
        
        ob.btnDisable();
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        ob.setVisible(true);
    }

    ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnRoot;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnpoint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miConvert;
    private javax.swing.JTextPane txtOutput;
    // End of variables declaration//GEN-END:variables
}
