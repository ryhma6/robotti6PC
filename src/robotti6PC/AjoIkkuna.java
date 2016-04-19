package robotti6PC;


import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class AjoIkkuna extends javax.swing.JFrame {

    NXT_Connection nxtc;
    boolean keyreleased = false;
    private Updater updater = new Updater();

    /**
     * Creates new form AjoIkkuna
     */
    public AjoIkkuna() {
        initComponents();
        jPanel1.setLayout(null);
        nxtc = new NXT_Connection();
        //nxtc.Connect();

        // Käynnistetään säie
        if (!updater.isRunning) {
            updater.start();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_sonicAngle = new javax.swing.JLabel();
        colorPanel = new javax.swing.JPanel();
        jPanel_screen = new javax.swing.JPanel();
        jLabel_info = new javax.swing.JLabel();
        jLabel_sonicValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                //formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 352));

        jLabel_sonicAngle.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel_sonicAngle.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_sonicAngle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_sonicAngle.setText("ET : ");
        jLabel_sonicAngle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        colorPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel_screen.setBackground(new java.awt.Color(0, 102, 0));
        jPanel_screen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_screen.setForeground(new java.awt.Color(51, 255, 51));

        jLabel_info.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel_info.setForeground(new java.awt.Color(51, 255, 51));
        jLabel_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_info.setText("-");

        javax.swing.GroupLayout jPanel_screenLayout = new javax.swing.GroupLayout(jPanel_screen);
        jPanel_screen.setLayout(jPanel_screenLayout);
        jPanel_screenLayout.setHorizontalGroup(
            jPanel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_screenLayout.setVerticalGroup(
            jPanel_screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel_sonicValue.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel_sonicValue.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_sonicValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_sonicValue.setText("sonic");
        jLabel_sonicValue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel_sonicAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 128, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel_sonicValue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel_sonicValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel_sonicAngle)
                .addGap(27, 27, 27)
                .addComponent(jPanel_screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Lähettää ohjausdataa robotille (eteen, taakse, oikealle, vasemmalle)
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (!keyreleased) {
            int code = evt.getKeyCode();
            if (code == KeyEvent.VK_UP) {
                nxtc.sendPC_Data(0);
            }
            if (code == KeyEvent.VK_DOWN) {
                nxtc.sendPC_Data(1);
            }
            if (code == KeyEvent.VK_RIGHT) {
                nxtc.sendPC_Data(2);
            }
            if (code == KeyEvent.VK_LEFT) {
                nxtc.sendPC_Data(3);
            }
            if (code == KeyEvent.VK_SPACE) {
                nxtc.sendPC_Data(4);
            }
        }
        keyreleased = true;
    }//GEN-LAST:event_formKeyPressed
    /**
     * Lähettää ohjausdataa robotille (pysäytys)
     */
    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        nxtc.sendPC_Data(5);
        keyreleased = false;
    }//GEN-LAST:event_formKeyReleased
   

    /**
     * Luo AjoIkkuna-formin joka myös käynnistää säikeen Updater. 
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
            java.util.logging.Logger.getLogger(AjoIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        new AjoFrame().setVisible(true);
                    }
                });
    }

    /**
     * Säie päivittää NXT_Connection-luokalta saadun datan reaaliajassa ruudulle
     */
    public class Updater extends Thread {

        boolean isRunning = false;

        @Override
        public void run() {
            isRunning = true;

            while (isRunning) {

                // Kirjoitetaan sonicin arvo (jos 255, viiva)
                if (nxtc.getSonic() == 255) {
                    jLabel_sonicValue.setText("-");
                } else {
                    jLabel_sonicValue.setText("" + nxtc.getSonic());
                }
                if(nxtc.getEndTime()!="") {
                	jLabel_sonicAngle.setText("ET:" + nxtc.getEndTime());
                }
                else {
                	jLabel_sonicAngle.setText("ET: ");
                }
/**
                // Siirretään sonicin arvoa ruudussa sensorin kulman mukaan.
                jLabel_sonicValue.setLocation((141 + nxtc.getSonicAngle() + (nxtc.getSonicAngle() / 2)), (42 + (nxtc.getSonicAngle() * nxtc.getSonicAngle()) / 80));
                jLabel_sonicValue.repaint();

                // Väripalkki vaihtaa väriä värisensorin mukaan
                Color color;
                try {
                    Field field = Class.forName("java.awt.Color").getField(nxtc.getColor());
                    color = (Color) field.get(null);
                } catch (Exception e) {
                    color = null;
                }
                colorPanel.setBackground(color);

                // Kirjoitetaan sonicin kulma
                jLabel_sonicAngle.setText(nxtc.getSonicAngle() + "°");

                // Ilmoitukset
                if ("red".equals(nxtc.getColor())) {
                    jLabel_info.setText("Maali!");
                } else if ("green".equals(nxtc.getColor())) {
                    jLabel_info.setText("Lähtöpiste!");
                } else if (nxtc.getSonic() < 17) {
                    jLabel_info.setText("# # SEIS! # #");
                } else if (nxtc.getSonic() < 30) {
                    jLabel_info.setText("Este lähestyy!");
                } else {
                    jLabel_info.setText(null);
                } **/

            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JLabel jLabel_sonicAngle;
    private javax.swing.JLabel jLabel_sonicValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_screen;
    // End of variables declaration//GEN-END:variables
}
