package examen2_11651043_rodrigovelasquez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloHora extends Thread {

    private JLabel label;

    public HiloHora(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            Date h = new Date();
            DateFormat df = new SimpleDateFormat("hh:mm");
            label.setText(df.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {              
            }
        }
    }

}
