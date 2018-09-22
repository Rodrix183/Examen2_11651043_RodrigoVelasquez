package examen2_11651043_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarATM {

    private ArrayList<ATM> listaATM = new ArrayList<>();
    private File archivo = null;

    public administrarATM(String path) {
        archivo = new File(path);
    }

    public ArrayList<ATM> getListaATM() {
        return listaATM;
    }

    public void setListaATM(ArrayList<ATM> listaATM) {
        this.listaATM = listaATM;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaATM=" + listaATM;
    }

    public void setATM(ATM a) {
        this.listaATM.add(a);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (ATM a : listaATM) {
                bw.write(a.getUbicacion() + ";");
                bw.write(a.getId() + ";");
                bw.write(a.getYear_fabricacion() + ";");
                bw.write(a.getTiempo_mantenimiento() + ";");
                bw.write(a.getDinero() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner lea = null;
        listaATM = new ArrayList<>();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter(";");
                while (lea.hasNext()) {                    
                    String ubicacion = lea.next();
                    int id = lea.nextInt();
                    int yr = lea.nextInt();
                    int tmp = lea.nextInt();
                    int din = lea.nextInt();
                    listaATM.add(new ATM(ubicacion, id, din, tmp, din));
                }
            } catch (Exception e) {
            } finally {
                lea.close();
            }
        }
    }
}
