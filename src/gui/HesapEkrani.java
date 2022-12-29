package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;

public class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public HesapEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        turkLirasiIcon = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCekIcon = new javax.swing.JLabel();
        paraCekButton = new javax.swing.JButton();
        paraYatirButton = new javax.swing.JButton();
        havaleIcon = new javax.swing.JLabel();
        odemelerIcon = new javax.swing.JLabel();
        odemelerButton = new javax.swing.JButton();
        havaleButton = new javax.swing.JButton();
        settingsIcon = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Ekranı");
        setPreferredSize(new java.awt.Dimension(850, 700));

        hesapEkraniPanel.setBackground(new java.awt.Color(153, 0, 153));
        hesapEkraniPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("HOŞGELDİN");

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[KULLANICI ADI SOYADI]");

        turkLirasiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/turkishLiraIcon.png"))); // NOI18N

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        bakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakiyeLabel.setText("[Bakiye]");

        paraCekIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paraCekIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/withdrawIcon.png"))); // NOI18N

        paraCekButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseExited(evt);
            }
        });
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        havaleIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        havaleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/transferIcon.png"))); // NOI18N

        odemelerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        odemelerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/paymentsIcon.png"))); // NOI18N

        odemelerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        odemelerButton.setText("Ödemeler");
        odemelerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseExited(evt);
            }
        });
        odemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemelerButtonActionPerformed(evt);
            }
        });

        havaleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleButton.setText("Havale");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/settingIcon.png"))); // NOI18N
        settingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsIconMouseClicked(evt);
            }
        });

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/logoutIcon.png"))); // NOI18N
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/depositIcon2.png"))); // NOI18N

        javax.swing.GroupLayout hesapEkraniPanelLayout = new javax.swing.GroupLayout(hesapEkraniPanel);
        hesapEkraniPanel.setLayout(hesapEkraniPanelLayout);
        hesapEkraniPanelLayout.setHorizontalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(logoutIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(hosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(settingsIcon))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(turkLirasiIcon)
                        .addGap(18, 18, 18)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paraCekButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paraCekIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(60, 60, 60)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(havaleIcon))
                        .addGap(60, 60, 60)
                        .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odemelerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odemelerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hesapEkraniPanelLayout.setVerticalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutIcon)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(hosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(settingsIcon))
                .addGap(4, 4, 4)
                .addComponent(kullaniciAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(turkLirasiIcon)))
                .addGap(49, 49, 49)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paraCekIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(havaleIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odemelerIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paraCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odemelerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    ** Buton renklendirmeleri ve icon değişimleri
    */
    
    
    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        ButtonAyarlari.setBgFg(paraCekButton, Color.cyan, Color.yellow);
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(paraCekButton);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseEntered
        ButtonAyarlari.setBgFg(paraYatirButton,Color.cyan, Color.yellow);
        
    }//GEN-LAST:event_paraYatirButtonMouseEntered

    private void paraYatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(paraYatirButton);
    }//GEN-LAST:event_paraYatirButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        ButtonAyarlari.setBgFg(havaleButton, Color.cyan, Color.yellow);
        
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(havaleButton);
    }//GEN-LAST:event_havaleButtonMouseExited

    private void odemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseEntered
        ButtonAyarlari.setBgFg(odemelerButton, Color.cyan, Color.yellow);
    }//GEN-LAST:event_odemelerButtonMouseEntered

    private void odemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(odemelerButton);
    }//GEN-LAST:event_odemelerButtonMouseExited
    
    /*
    ** Actionlar
    */
    
    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        ActionAyarlari.setVisitible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisitible(this, new HavaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void odemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemelerButtonActionPerformed
        ActionAyarlari.setVisitible(this, new OdemelerEkrani());
    }//GEN-LAST:event_odemelerButtonActionPerformed

    private void logoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconMouseClicked
        ActionAyarlari.setVisitible(this, new GirisEkrani());
    }//GEN-LAST:event_logoutIconMouseClicked

    private void settingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsIconMouseClicked
        ActionAyarlari.setVisitible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsIconMouseClicked

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisitible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JButton odemelerButton;
    private javax.swing.JLabel odemelerIcon;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCekIcon;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JLabel turkLirasiIcon;
    // End of variables declaration//GEN-END:variables
}
