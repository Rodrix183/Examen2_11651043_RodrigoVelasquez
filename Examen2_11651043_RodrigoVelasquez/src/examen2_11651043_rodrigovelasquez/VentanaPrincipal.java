package examen2_11651043_rodrigovelasquez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        HiloHora h = new HiloHora(jl_Hora);
        HiloFecha f = new HiloFecha(jl_Fecha);
        h.start();
        f.start();
        administrarATM at = new administrarATM("./ATM.txt");
        at.cargarArchivo();
        for (int i = 0; i < at.getListaATM().size(); i++) {
            cb_SeleccionarATM.addItem(at.getListaATM().get(i).toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_RegistroATM = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_añoFab = new javax.swing.JComboBox<>();
        tf_idATM = new javax.swing.JTextField();
        tf_ubicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_mantenimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_Monto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jd_RegistroUsuarios = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_User = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_IDRegistro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_pNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_sNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_pApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_sApellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_passUser = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_añoNacimiento = new javax.swing.JComboBox<>();
        cb_añoAfiliacion = new javax.swing.JComboBox<>();
        rb_Mantenimiento = new javax.swing.JRadioButton();
        rb_Cliente = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        bg_tipo = new javax.swing.ButtonGroup();
        jd_Login = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_LoginUser = new javax.swing.JTextField();
        pf_LoginPassword = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        jl_Fecha = new javax.swing.JLabel();
        jl_Hora = new javax.swing.JLabel();
        jd_VentanaATM = new javax.swing.JDialog();
        jl_Saludo = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jd_CrearCuenta = new javax.swing.JDialog();
        jButton13 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cb_SeleccionarATM = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registro ATM");

        jLabel2.setText("ID");

        jLabel4.setText("Ubicacion");

        jLabel5.setText("Año Fabricación");

        cb_añoFab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        jLabel6.setText("Tiempo Mantenimiento");

        jLabel7.setText("Monto");

        jButton1.setText("Crear ATM");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_RegistroATMLayout = new javax.swing.GroupLayout(jd_RegistroATM.getContentPane());
        jd_RegistroATM.getContentPane().setLayout(jd_RegistroATMLayout);
        jd_RegistroATMLayout.setHorizontalGroup(
            jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                        .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(cb_añoFab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_idATM))
                            .addComponent(tf_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                        .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Monto))
                            .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_RegistroATMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(145, 145, 145))
        );
        jd_RegistroATMLayout.setVerticalGroup(
            jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroATMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_idATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_añoFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_RegistroATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Registro Usuarios");

        jLabel9.setText("Usuario");

        jLabel10.setText("ID");

        jLabel11.setText("Primero Nombre");

        jLabel12.setText("Segundo Nombre");

        jLabel13.setText("Primer Apellido");

        jLabel14.setText("Segundo Apellido");

        jLabel15.setText("Contraseña");

        jLabel16.setText("Año Nacimiento");

        jLabel17.setText("Año Afiliacion");

        cb_añoNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        cb_añoAfiliacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        bg_tipo.add(rb_Mantenimiento);
        rb_Mantenimiento.setText("Mantenimiento");

        bg_tipo.add(rb_Cliente);
        rb_Cliente.setText("Cliente");

        jLabel18.setText("Tipo Usuario");

        jButton5.setText("Next");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_RegistroUsuariosLayout = new javax.swing.GroupLayout(jd_RegistroUsuarios.getContentPane());
        jd_RegistroUsuarios.getContentPane().setLayout(jd_RegistroUsuariosLayout);
        jd_RegistroUsuariosLayout.setHorizontalGroup(
            jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel8))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_RegistroUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(26, 26, 26)
                                .addComponent(tf_sNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_IDRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(26, 26, 26)
                        .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tf_passUser, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_pApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_sApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_RegistroUsuariosLayout.createSequentialGroup()
                                .addComponent(rb_Mantenimiento)
                                .addGap(18, 18, 18)
                                .addComponent(rb_Cliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_RegistroUsuariosLayout.createSequentialGroup()
                                .addComponent(cb_añoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_añoAfiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButton5)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jd_RegistroUsuariosLayout.setVerticalGroup(
            jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_RegistroUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_IDRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_pNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_sNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_pApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_sApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_passUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_añoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_añoAfiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Mantenimiento)
                    .addComponent(rb_Cliente))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Bienvenido");

        jLabel20.setText("Usuario");

        jLabel21.setText("Contraseña");

        jButton6.setText("Login");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jl_Hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Hora.setText("00:00");

        javax.swing.GroupLayout jd_LoginLayout = new javax.swing.GroupLayout(jd_Login.getContentPane());
        jd_Login.getContentPane().setLayout(jd_LoginLayout);
        jd_LoginLayout.setHorizontalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_LoginLayout.createSequentialGroup()
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)))
                    .addGroup(jd_LoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jl_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jl_Hora)
                        .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19)
                            .addComponent(tf_LoginUser)
                            .addComponent(pf_LoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                .addGap(53, 53, 53))
        );
        jd_LoginLayout.setVerticalGroup(
            jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_LoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_LoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(pf_LoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(46, 46, 46))
        );

        jl_Saludo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Saludo.setText("Bienvenido");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Que desea hacer?");

        jButton7.setText("Crear Cuenta");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Retirar Dinero");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Ingresar Dinero a una Cuenta");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Ingresar Dinero a cuenta de otra persona");

        jButton11.setText("Revisar Estado");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Revisar Transacciones");

        javax.swing.GroupLayout jd_VentanaATMLayout = new javax.swing.GroupLayout(jd_VentanaATM.getContentPane());
        jd_VentanaATM.getContentPane().setLayout(jd_VentanaATMLayout);
        jd_VentanaATMLayout.setHorizontalGroup(
            jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VentanaATMLayout.createSequentialGroup()
                .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_VentanaATMLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jl_Saludo))
                    .addGroup(jd_VentanaATMLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jd_VentanaATMLayout.setVerticalGroup(
            jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_VentanaATMLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jl_Saludo)
                .addGap(51, 51, 51)
                .addComponent(jLabel24)
                .addGap(38, 38, 38)
                .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jd_VentanaATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_VentanaATMLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jButton13.setText("Crear Cuenta");

        jLabel22.setText("Numero Cuenta");

        javax.swing.GroupLayout jd_CrearCuentaLayout = new javax.swing.GroupLayout(jd_CrearCuenta.getContentPane());
        jd_CrearCuenta.getContentPane().setLayout(jd_CrearCuentaLayout);
        jd_CrearCuentaLayout.setHorizontalGroup(
            jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                .addGroup(jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton13))
                    .addGroup(jd_CrearCuentaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel22)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jd_CrearCuentaLayout.setVerticalGroup(
            jd_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearCuentaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ATM");

        jButton2.setText("Crear Usuario");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Crear ATM");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Seleccionar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        cb_SeleccionarATM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_SeleccionarATMItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(cb_SeleccionarATM, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(57, 57, 57)
                .addComponent(cb_SeleccionarATM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //crear ATM
        this.dispose();
        jd_RegistroATM.pack();
        jd_RegistroATM.setLocationRelativeTo(this);
        jd_RegistroATM.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            administrarATM at = new administrarATM("./ATM.txt");
            int id = Integer.parseInt(tf_idATM.getText());
            String ubicacion = tf_ubicacion.getText();
            int año_afiliacion = Integer.parseInt((String) cb_añoFab.getSelectedItem());
            int maintanace = Integer.parseInt(tf_mantenimiento.getText());
            int monto = Integer.parseInt(tf_mantenimiento.getText());

            at.cargarArchivo();
            at.setATM(new ATM(ubicacion, id, año_afiliacion, maintanace, monto));
            at.getListaATM().add(new ATM(ubicacion, id, año_afiliacion, maintanace, monto));
            at.escribirArchivo();
            cb_SeleccionarATM.addItem(new ATM(ubicacion, id, año_afiliacion, maintanace, monto).toString());
            JOptionPane.showMessageDialog(jd_RegistroATM, "Guardado exitosamente!");
            jd_RegistroATM.dispose();
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //crear usuario
        this.dispose();
        jd_RegistroUsuarios.pack();
        jd_RegistroUsuarios.setLocationRelativeTo(this);
        jd_RegistroUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            adminUsuarios au = new adminUsuarios("./Usuarios.txt");
            int id = Integer.parseInt(tf_IDRegistro.getText());
            String user = tf_User.getText();
            String p_nombre = tf_pNombre.getText();
            String s_nombre = tf_sNombre.getText();
            String p_apellido = tf_pApellido.getText();
            String s_apellido = tf_sApellido.getText();
            String password = tf_passUser.getText();
            int año_nacimiento = Integer.parseInt(cb_añoNacimiento.getSelectedItem().toString());
            int año_afiliacion = Integer.parseInt(cb_añoAfiliacion.getSelectedItem().toString());
            String tipo = "Cliente";
            if (rb_Cliente.isSelected()) {
                tipo = "Cliente";
            } else if (rb_Mantenimiento.isSelected()) {
                tipo = "Mantenimiento";
            } else {
                tipo = "Cliente";
            }

            au.cargarArchivo();
            au.setUsuario(new Usuario(id, user, p_nombre, s_nombre, p_apellido, s_apellido, password, año_nacimiento, año_afiliacion, tipo));
            au.getListaUsuarios().add(new Usuario(id, user, p_nombre, s_nombre, p_apellido, s_apellido, password, año_nacimiento, año_afiliacion, tipo));
            au.escribirArchivo();

        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(jd_RegistroATM, "Guardado exitosamente!");
        jd_RegistroUsuarios.dispose();
        this.setVisible(true);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        adminUsuarios au = new adminUsuarios("./Usuarios.txt");
        this.dispose();
        jd_Login.pack();
        jd_Login.setLocationRelativeTo(this);
        jd_Login.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void cb_SeleccionarATMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_SeleccionarATMItemStateChanged
        if (cb_SeleccionarATM.getSelectedIndex() >= 0) {
            atm_sel = cb_SeleccionarATM.getSelectedIndex();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un ATM");
        }
    }//GEN-LAST:event_cb_SeleccionarATMItemStateChanged

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        //el login
        Scanner lea = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("./Usuarios.txt");
            lea = new Scanner(archivo);
            String u = tf_LoginUser.getText();
            String p = pf_LoginPassword.getText();
            boolean flag = false;
            lea.useDelimiter(";");
            while (lea.hasNext()) {
                String user, f_name, s_name, fl_name, sl_name, password, type;
                int id, year, affiliation;
                id = lea.nextInt();
                user = lea.next();
                f_name = lea.next();
                s_name = lea.next();
                fl_name = lea.next();
                sl_name = lea.next();
                password = lea.next();
                year = lea.nextInt();
                affiliation = lea.nextInt();
                type = lea.next();
                if (user.equals(u) && password.equals(p)) {
                    usuarioActual = u;
                    flag = true;
                    break;
                }
                if (flag = true) {
                    jd_Login.dispose();
                    jd_VentanaATM.pack();
                    jd_VentanaATM.setLocationRelativeTo(this);
                    jd_VentanaATM.setVisible(true);
                } else {
                    bandera -= 1;
                    JOptionPane.showMessageDialog(jd_Login, "Datos Erroneos");
                    if (bandera <= 0) {
                        //cuando se ha ingresado mas de 5 veces
                        JOptionPane.showMessageDialog(jd_Login, "Se ha ingresado mas de 5 veces erroneo");
                    }
                }
                br.close();
                fr.close();
            }
        } catch (Exception e) {
        }
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        jl_Fecha.setText(df.format(fecha));

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jd_CrearCuenta.setModal(true);
        jd_CrearCuenta.pack();
        jd_CrearCuenta.setLocationRelativeTo(this);
        jd_CrearCuenta.setVisible(true);

        adminUsuarios au = new adminUsuarios("./Usuarios.txt");
        au.cargarArchivo();
        UsuarioCliente uc = null;
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            if (au.getListaUsuarios().get(i).getUser().equals(usuarioActual)) {
                uc.getLista_Cuentas().add(new Cuenta(cont, 1000, au.getListaUsuarios().get(i).getId()));
            }

        }

        cont += 1;
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        adminUsuarios au = new adminUsuarios("./Usuarios.txt");
        UsuarioCliente uc = null;
        String acum = "";
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            acum += i + ") " + au.getListaUsuarios().get(i).toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(acum + "Seleccione una cuenta"));

        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            if (au.getListaUsuarios().get(i).equals(usuarioActual)) {
                dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
                for (int j = 0; j < uc.getLista_Cuentas().size(); j++) {
                    int pisto = uc.getLista_Cuentas().get(j).getSaldoDisponible() + dinero;
                    uc.getLista_Cuentas().get(j).setSaldoDisponible(pisto);

                }

            }
        }
        JOptionPane.showMessageDialog(jd_VentanaATM, "Saldo actualizado");


    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        adminUsuarios au = new adminUsuarios("./Usuarios.txt");
        UsuarioCliente uc = null;
        String acum = "";
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            acum += i + ") " + au.getListaUsuarios().get(i).toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(acum + "Seleccione una cuenta"));

        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            if (au.getListaUsuarios().get(i).equals(usuarioActual)) {
                dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
                for (int j = 0; j < uc.getLista_Cuentas().size(); j++) {
                    int pisto = uc.getLista_Cuentas().get(j).getSaldoDisponible() - dinero;
                    uc.getLista_Cuentas().get(j).setSaldoDisponible(pisto);

                }

            }
        }
        JOptionPane.showMessageDialog(jd_VentanaATM, "Saldo actualizado");
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        adminUsuarios au = new adminUsuarios("./Usuarios.txt");
        UsuarioCliente uc = null;
        int pos = 0;
        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            if (au.getListaUsuarios().get(i).getUser().equals(usuarioActual)) {
                pos = i;
            }
        }

        for (int i = 0; i < au.getListaUsuarios().size(); i++) {
            for (int j = 0; j < uc.getLista_Cuentas().size(); j++) {
                if (au.getListaUsuarios().get(i).getUser().equals(usuarioActual)) {
                    saldo_actual = uc.getLista_Cuentas().get(j).getSaldoDisponible();
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo_actual);
    }//GEN-LAST:event_jButton11MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipo;
    private javax.swing.JComboBox<String> cb_SeleccionarATM;
    private javax.swing.JComboBox<String> cb_añoAfiliacion;
    private javax.swing.JComboBox<String> cb_añoFab;
    private javax.swing.JComboBox<String> cb_añoNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jd_CrearCuenta;
    private javax.swing.JDialog jd_Login;
    private javax.swing.JDialog jd_RegistroATM;
    private javax.swing.JDialog jd_RegistroUsuarios;
    private javax.swing.JDialog jd_VentanaATM;
    private javax.swing.JLabel jl_Fecha;
    private javax.swing.JLabel jl_Hora;
    private javax.swing.JLabel jl_Saludo;
    private javax.swing.JPasswordField pf_LoginPassword;
    private javax.swing.JRadioButton rb_Cliente;
    private javax.swing.JRadioButton rb_Mantenimiento;
    private javax.swing.JTextField tf_IDRegistro;
    private javax.swing.JTextField tf_LoginUser;
    private javax.swing.JTextField tf_Monto;
    private javax.swing.JTextField tf_User;
    private javax.swing.JTextField tf_idATM;
    private javax.swing.JTextField tf_mantenimiento;
    private javax.swing.JTextField tf_pApellido;
    private javax.swing.JTextField tf_pNombre;
    private javax.swing.JTextField tf_passUser;
    private javax.swing.JTextField tf_sApellido;
    private javax.swing.JTextField tf_sNombre;
    private javax.swing.JTextField tf_ubicacion;
    // End of variables declaration//GEN-END:variables
int atm_sel = 0;
    int bandera = 5;
    int cont = 1;
    String usuarioActual = "";
    int dinero = 0;
    int saldo_actual = 0;
}
