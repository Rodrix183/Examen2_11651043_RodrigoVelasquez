package examen2_11651043_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminUsuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private File archivo = null;

    public adminUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Usuarios:" + listaUsuarios;
    }

    public void cargarArchivo() {
        Scanner lea = null;
        listaUsuarios = new ArrayList<>();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter(";");
                while (lea.hasNext()) {
                    int id = lea.nextInt();
                    String user = lea.next();
                    String p_nombre = lea.next();
                    String s_nombre = lea.next();
                    String p_apellido = lea.next();
                    String s_apellido = lea.next();
                    String password = lea.next();
                    int año_nacimiento = lea.nextInt();
                    int año_afiliacion = lea.nextInt();
                    String tipo = lea.next();
                    listaUsuarios.add(new Usuario(id, user, p_nombre, s_nombre,
                            p_apellido, s_apellido, password, año_nacimiento, año_afiliacion, tipo));
                }
            } catch (Exception e) {
            }
        }
    }

    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Usuario us : listaUsuarios) {
                bw.write(us.getId()+";");
                bw.write(us.getUser()+";");
                bw.write(us.getP_nombre()+";");
                bw.write(us.getS_nombre()+";");
                bw.write(us.getP_apellido()+";");
                bw.write(us.getS_apellido()+";");
                bw.write(us.getPassword()+";");
                bw.write(us.getAño_nacimiento()+";");
                bw.write(us.getAño_afiliacion()+";");
                bw.write(us.getTipo()+";");                
                
            }
            bw.flush();
        } catch (Exception ex) {                
        }
        bw.close();
        fw.close();
    }
}
