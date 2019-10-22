
import javax.swing.JOptionPane;

public class Converter extends javax.swing.JFrame {

    public Converter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmb1 = new javax.swing.JComboBox<>();
        lblCmb1 = new javax.swing.JLabel();
        txtCmb1 = new javax.swing.JTextField();
        lblCmb2 = new javax.swing.JLabel();
        btnConvert = new javax.swing.JButton();
        cmb2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFarhen = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimeter", "feet", "inches", "meters", "MilliMeters", "yards" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        lblCmb1.setText("Centimeter");

        lblCmb2.setText("Centimeter =");

        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        cmb2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cmb2.setForeground(new java.awt.Color(255, 0, 51));
        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimeter", "feet", "inches", "meters", "MilliMeters", "yards" }));
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setText("To");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCmb1)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCmb1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCmb2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConvert)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCmb1)
                    .addComponent(txtCmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConvert)
                .addGap(40, 40, 40)
                .addComponent(lblCmb2)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Length", jPanel1);

        jLabel2.setText("Celsius:");

        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        jLabel3.setText("Fahrenheit");

        txtFarhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFarhenActionPerformed(evt);
            }
        });

        txtKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelvinActionPerformed(evt);
            }
        });

        jLabel4.setText("kelvin");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untitled.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untitled.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(txtFarhen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(151, 151, 151))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFarhen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Temperature", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed

        lblCmb1.setText(cmb1.getSelectedItem().toString());

    }//GEN-LAST:event_cmb1ActionPerformed

    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed
        lblCmb2.setText(cmb2.getSelectedItem().toString());
    }//GEN-LAST:event_cmb2ActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed

        String cmbOne = cmb1.getSelectedItem().toString();
        String cmbTwo = cmb2.getSelectedItem().toString();
        double result;
        if (cmbOne.equalsIgnoreCase(cmbTwo)) {

            lblCmb2.setText(1.0 * Float.parseFloat(txtCmb1.getText()) + "");

        } else if (cmbOne.equalsIgnoreCase("inches") && cmbTwo.equalsIgnoreCase("Centimeter")) {
            lblCmb2.setText(2.54 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("inches") && cmbTwo.equalsIgnoreCase("Feet")) {
            lblCmb2.setText(0.0833333 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("inches") && cmbTwo.equalsIgnoreCase("yards")) {
            lblCmb2.setText(0.0277778 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("inches") && cmbTwo.equalsIgnoreCase("meters")) {
            lblCmb2.setText(0.0254 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("inches") && cmbTwo.equalsIgnoreCase("millimeters")) {
            lblCmb2.setText(25.4 * Float.parseFloat(txtCmb1.getText()) + "");
        } //Centimeter
        else if (cmbOne.equalsIgnoreCase("Centimeter") && cmbTwo.equalsIgnoreCase("Inches")) {
            lblCmb2.setText(0.393701 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Centimeter") && cmbTwo.equalsIgnoreCase("Feet")) {
            lblCmb2.setText(0.0328084 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Centimeter") && cmbTwo.equalsIgnoreCase("Yards")) {
            lblCmb2.setText(0.0109361 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Centimeter") && cmbTwo.equalsIgnoreCase("meters")) {
            lblCmb2.setText(0.01 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Centimeter") && cmbTwo.equalsIgnoreCase("millimeters")) {
            lblCmb2.setText(10.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } //Feet
        else if (cmbOne.equalsIgnoreCase("Feet") && cmbTwo.equalsIgnoreCase("Inches")) {
            lblCmb2.setText(12.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Feet") && cmbTwo.equalsIgnoreCase("Centimeter")) {
            lblCmb2.setText(30.48 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Feet") && cmbTwo.equalsIgnoreCase("Yards")) {
            lblCmb2.setText(0.3333333 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Feet") && cmbTwo.equalsIgnoreCase("Meters")) {
            lblCmb2.setText(0.3048 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Feet") && cmbTwo.equalsIgnoreCase("Millimeters")) {
            lblCmb2.setText(304.8 * Float.parseFloat(txtCmb1.getText()) + "");
        } //yards
        else if (cmbOne.equalsIgnoreCase("Yards") && cmbTwo.equalsIgnoreCase("Inches")) {
            lblCmb2.setText(36.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Yards") && cmbTwo.equalsIgnoreCase("Centimeter")) {
            lblCmb2.setText(91.44 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Yards") && cmbTwo.equalsIgnoreCase("Feet")) {
            lblCmb2.setText(3.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Yards") && cmbTwo.equalsIgnoreCase("Meters")) {
            lblCmb2.setText(0.9144 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Yards") && cmbTwo.equalsIgnoreCase("Millimeters")) {
            lblCmb2.setText(914.4 * Float.parseFloat(txtCmb1.getText()) + "");
        } //meters
        else if (cmbOne.equalsIgnoreCase("Meters") && cmbTwo.equalsIgnoreCase("Inches")) {
            lblCmb2.setText(39.3701 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Meters") && cmbTwo.equalsIgnoreCase("Centimeter")) {
            lblCmb2.setText(100.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Meters") && cmbTwo.equalsIgnoreCase("Feet")) {
            lblCmb2.setText(3.28084 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Meters") && cmbTwo.equalsIgnoreCase("Yards")) {
            lblCmb2.setText(1.09361 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("Meters") && cmbTwo.equalsIgnoreCase("Millimeters")) {
            lblCmb2.setText(1000.0 * Float.parseFloat(txtCmb1.getText()) + "");
        } //millimeters
        else if (cmbOne.equalsIgnoreCase("MilliMeters") && cmbTwo.equalsIgnoreCase("Inches")) {
            lblCmb2.setText(0.0393701 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("MilliMeters") && cmbTwo.equalsIgnoreCase("Centimeter")) {
            lblCmb2.setText(0.1 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("MilliMeters") && cmbTwo.equalsIgnoreCase("Feet")) {
            lblCmb2.setText(0.00328084 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("MilliMeters") && cmbTwo.equalsIgnoreCase("Yards")) {
            lblCmb2.setText(0.00109361 * Float.parseFloat(txtCmb1.getText()) + "");
        } else if (cmbOne.equalsIgnoreCase("MilliMeters") && cmbTwo.equalsIgnoreCase("Meters")) {
            lblCmb2.setText(0.001 * Float.parseFloat(txtCmb1.getText()) + "");
        }


    }//GEN-LAST:event_btnConvertActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed

        try {
            txtFarhen.setText((1.8 * Float.parseFloat(txtCel.getText()) + 32) + "");
            txtKelvin.setText(273 + Float.parseFloat(txtCel.getText()) + "");
        } catch (NumberFormatException e) {

            txtCel.setText(JOptionPane.showInputDialog(rootPane, "Enter Correct Value"));

        }
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtFarhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFarhenActionPerformed
        try {
            txtCel.setText(((Float.parseFloat(txtFarhen.getText()) - 32) * 0.5555) + "");
            txtKelvin.setText((273.0 + Float.parseFloat(txtCel.getText())) + "");
            System.out.println(((Float.parseFloat(txtFarhen.getText()) - 32) * 0.5555));
        } catch (NumberFormatException e) {
            txtFarhen.setText(JOptionPane.showInputDialog(rootPane, "Enter Correct Value"));
        }
    }//GEN-LAST:event_txtFarhenActionPerformed

    private void txtKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelvinActionPerformed

        try {
            txtCel.setText(Float.parseFloat(txtKelvin.getText()) - 273 + "");
            txtFarhen.setText((9 / 5 * Float.parseFloat(txtCel.getText()) + 32) + "");
        } catch (NumberFormatException e) {
            txtFarhen.setText(JOptionPane.showInputDialog(rootPane, "Enter Correct Value"));
        }
    }//GEN-LAST:event_txtKelvinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCmb1;
    private javax.swing.JLabel lblCmb2;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCmb1;
    private javax.swing.JTextField txtFarhen;
    private javax.swing.JTextField txtKelvin;
    // End of variables declaration//GEN-END:variables
}
