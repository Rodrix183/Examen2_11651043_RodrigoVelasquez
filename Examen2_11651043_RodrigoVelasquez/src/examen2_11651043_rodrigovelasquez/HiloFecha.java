package examen2_11651043_rodrigovelasquez;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloFecha extends Thread {

    private JLabel fecha;

    public HiloFecha(JLabel fecha) {
        this.fecha = fecha;
    }

    @Override
    public void run() {
        while (true) {

            Date f = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
            fecha.setText(df.format(f));
            try {
                Thread.sleep(86400000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
