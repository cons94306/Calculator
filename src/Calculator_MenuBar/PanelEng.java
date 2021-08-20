
package Calculator_MenuBar;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PanelEng extends javax.swing.JPanel {

    public PanelEng() {
        initComponents();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public JPanel getPanel(){
        return jPanelDigitArea;
    }
    
    public JTextField getSharedDisplay(){
        return this.display;
    }
    
    public JTextField getSharedDisplay2(){
        return this.display2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        jPanelDigitArea = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnNegate = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMutiplier = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        display2 = new javax.swing.JTextField();

        display.setEditable(false);
        display.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setBorder(null);
        display.setFocusable(false);

        jPanelDigitArea.setLayout(new java.awt.GridLayout(5, 4));

        btnBack.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        btnBack.setText("←");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanelDigitArea.add(btnBack);

        btnC.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.setToolTipText("");
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setFocusPainted(false);
        btnC.setFocusable(false);
        jPanelDigitArea.add(btnC);

        btnCE.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnCE.setText("CE");
        btnCE.setToolTipText("");
        btnCE.setBorder(null);
        btnCE.setBorderPainted(false);
        btnCE.setFocusPainted(false);
        btnCE.setFocusable(false);
        jPanelDigitArea.add(btnCE);

        btnNegate.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnNegate.setText("±");
        btnNegate.setToolTipText("");
        btnNegate.setBorder(null);
        btnNegate.setBorderPainted(false);
        btnNegate.setFocusPainted(false);
        btnNegate.setFocusable(false);
        jPanelDigitArea.add(btnNegate);

        btn7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setFocusPainted(false);
        btn7.setFocusable(false);
        jPanelDigitArea.add(btn7);

        btn8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setFocusPainted(false);
        btn8.setFocusable(false);
        jPanelDigitArea.add(btn8);

        btn9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setFocusPainted(false);
        btn9.setFocusable(false);
        jPanelDigitArea.add(btn9);

        btnPlus.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorder(null);
        btnPlus.setBorderPainted(false);
        btnPlus.setFocusPainted(false);
        btnPlus.setFocusable(false);
        jPanelDigitArea.add(btnPlus);

        btn4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setFocusPainted(false);
        btn4.setFocusable(false);
        jPanelDigitArea.add(btn4);

        btn5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setFocusPainted(false);
        btn5.setFocusable(false);
        jPanelDigitArea.add(btn5);

        btn6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setFocusPainted(false);
        btn6.setFocusable(false);
        jPanelDigitArea.add(btn6);

        btnMinus.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setBorder(null);
        btnMinus.setBorderPainted(false);
        btnMinus.setFocusPainted(false);
        btnMinus.setFocusable(false);
        jPanelDigitArea.add(btnMinus);

        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        jPanelDigitArea.add(btn1);

        btn2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setFocusPainted(false);
        btn2.setFocusable(false);
        jPanelDigitArea.add(btn2);

        btn3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);
        btn3.setFocusable(false);
        jPanelDigitArea.add(btn3);

        btnMutiplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnMutiplier.setText("*");
        btnMutiplier.setBorder(null);
        btnMutiplier.setBorderPainted(false);
        btnMutiplier.setFocusPainted(false);
        btnMutiplier.setFocusable(false);
        jPanelDigitArea.add(btnMutiplier);

        btn0.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setFocusPainted(false);
        btn0.setFocusable(false);
        jPanelDigitArea.add(btn0);

        btnDot.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnDot.setText(".");
        btnDot.setBorder(null);
        btnDot.setBorderPainted(false);
        btnDot.setFocusPainted(false);
        btnDot.setFocusable(false);
        jPanelDigitArea.add(btnDot);

        btnEqual.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnEqual.setText("=");
        btnEqual.setToolTipText("");
        btnEqual.setBorder(null);
        btnEqual.setBorderPainted(false);
        btnEqual.setFocusPainted(false);
        btnEqual.setFocusable(false);
        jPanelDigitArea.add(btnEqual);

        btnDivide.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnDivide.setText("/");
        btnDivide.setBorder(null);
        btnDivide.setBorderPainted(false);
        btnDivide.setFocusPainted(false);
        btnDivide.setFocusable(false);
        jPanelDigitArea.add(btnDivide);

        display2.setEditable(false);
        display2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        display2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display2.setBorder(null);
        display2.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDigitArea, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display2)
                    .addComponent(display))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDigitArea, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMutiplier;
    private javax.swing.JButton btnNegate;
    private javax.swing.JButton btnPlus;
    private javax.swing.JTextField display;
    private javax.swing.JTextField display2;
    private javax.swing.JPanel jPanelDigitArea;
    // End of variables declaration//GEN-END:variables
}
