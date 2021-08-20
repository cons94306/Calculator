
package Calculator_MenuBar;

public class Calculator_MenuBar extends javax.swing.JFrame {
    
    CalculatorControlStd ctrlStd;
    CalculatorControlEng ctrlEng;
    PanelStd panelStd;
    PanelEng panelEng;

    public Calculator_MenuBar() {
        initComponents();
        ctrlStd = new CalculatorControlStd();
        ctrlEng = new CalculatorControlEng();
        panelStd = ctrlStd.getPanel();
        panelEng = ctrlEng.getPanel();
        add(panelStd);
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemStd = new javax.swing.JMenuItem();
        jMenuItemEng = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("選擇");

        jMenuItemStd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemStd.setText("標準型");
        jMenuItemStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCalculator(evt);
            }
        });
        jMenu1.add(jMenuItemStd);

        jMenuItemEng.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEng.setText("工程型");
        jMenuItemEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCalculator(evt);
            }
        });
        jMenu1.add(jMenuItemEng);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeCalculator(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCalculator
        if (evt.getSource() == jMenuItemStd) {
            remove(panelEng);
            add(panelStd);
            pack();
            repaint();
        } else if (evt.getSource() == jMenuItemEng) {
            remove(panelStd);
            add(panelEng);
            pack();
            repaint();
        }
    }//GEN-LAST:event_changeCalculator

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator_MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_MenuBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_MenuBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEng;
    private javax.swing.JMenuItem jMenuItemStd;
    // End of variables declaration//GEN-END:variables
}
