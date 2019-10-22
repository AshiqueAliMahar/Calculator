
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("About the Developer");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(100, 200, 277, 336));
        setFocusable(false);
        setFocusableWindowState(false);
        setPreferredSize(new java.awt.Dimension(284, 352));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 110);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("This is made by Ashique Ali mahar \nNo One Should copyRight this and\nthis idea is given by my friend \n\nFriend Name:Sadaquat Hussain\n\tDeveloper Detail:\nStudying at:Mehran University \nJamshoro\nRoll No:2k16CS13\n");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 110, 400, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
