package robotti6PC;

/**
 * Säie päivittää NXT_Connection-luokalta saadun datan reaaliajassa ruudulle
 */
public class Updater extends Thread {

    boolean isRunning = false;
    NXT_Connection nxtc;
    
    public Updater(NXT_Connection conn) {
    	nxtc = conn;
    }
    
    @Override
    public void run() {
        isRunning = true;

        while (isRunning) {
        	
        	
        	/*
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
