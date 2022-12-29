package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;

public final class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public BasvuruEkrani() {
        initComponents();
        getEdits();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        kisiselBilgilerLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNolabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        gucenlikBilgileriLabel = new javax.swing.JLabel();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox<>();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Başvuru Ekranı");
        setBackground(new java.awt.Color(153, 0, 153));

        basvuruEkraniPanel.setBackground(new java.awt.Color(153, 0, 153));
        basvuruEkraniPanel.setForeground(new java.awt.Color(242, 242, 242));

        kisiselBilgilerLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel.setText("Kişisel Bilgiler");

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad :");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tcNolabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNolabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNolabel.setText("T.C. No :");

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No :");

        gucenlikBilgileriLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gucenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gucenlikBilgileriLabel.setText("Güvenlik Bilgileri");

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvenlik Sorusu :");

        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "İlkokul öğretmeninizin soyadı nedir?", "Yaşamak istediğiniz yer neresidir?", "Ya da rastgele cümle girin(önerilir)" }));

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cevap :");

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(guvenlikSorusu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(gucenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(tcNolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(kisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tcNolabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(gucenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikSorusu, guvenlikSorusuLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.cyan, Color.yellow);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Başvurunuz kabul edilmiştir...");
        ActionAyarlari.setVisitible(this, new GirisEkrani());
    }//GEN-LAST:event_basvurButtonActionPerformed

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);
    }

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel gucenlikBilgileriLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JComboBox<String> guvenlikSorusu;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel tcNolabel;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
