package gui;

import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;


public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici{
    private final String KIMLIK_TEXT_ORIGINAL = "T.C. No / Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL = "*********";
   
    public GirisEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPanel = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Ekranı");

        girisEkraniPanel.setBackground(new java.awt.Color(153, 0, 153));
        girisEkraniPanel.setForeground(new java.awt.Color(242, 242, 242));

        hosgeldinizLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("SWEET BANK'A HOŞGELDİNİZ");

        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(153, 153, 153));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setForeground(new java.awt.Color(153, 153, 153));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        girisButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        girisButton.setText("Giriş");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        soruLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soruLabel.setText("Hala müşterimiz değilmisiniz?");

        basvurButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        basvurButton.setText("Başvur");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniPanelLayout = new javax.swing.GroupLayout(girisEkraniPanel);
        girisEkraniPanel.setLayout(girisEkraniPanelLayout);
        girisEkraniPanelLayout.setHorizontalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kimlikText)
                                .addComponent(sifreText))
                            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                                .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(basvurButton)))))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {basvurButton, girisButton});

        girisEkraniPanelLayout.setVerticalGroup(
            girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(girisEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        girisEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {basvurButton, soruLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPanel.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);
    }
    
    
    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        ButtonAyarlari.setBgFg(girisButton, Color.cyan, Color.yellow);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(girisButton);
    }//GEN-LAST:event_girisButtonMouseExited

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.cyan, Color.yellow);    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.checkTheTextFocusGained(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.checkTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.checkTheTextFocusGained(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.checkTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        
    }//GEN-LAST:event_girisButtonActionPerformed

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        
    }//GEN-LAST:event_basvurButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButton;
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
