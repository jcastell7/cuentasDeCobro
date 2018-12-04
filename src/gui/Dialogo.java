package gui;

import Objetos.Docente;
import Objetos.Modulo;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogo extends javax.swing.JDialog {

    /*
    se crea un entero caso para cambiar la informacion recibida por los botones
    y los JTextField
    se crea un docente y un modulo para guardar los datos y compartirlos entre
    la clase Formato, FechaYHora y Dialogo
     */
    int caso;
    Docente docente;
    Modulo modulo;
    Formato parent;

    //modificadores del docente
    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    //modificadores del modulo
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public void setParent(java.awt.Frame parent){
    this.parent=(Formato)parent;
    }
    public Dialogo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setParent(parent);
        //el caso se inicializa en 0
        caso = 0;
        //el panel se hace enfocable para el listener del enter
        panel.setFocusable(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblConcepto = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        cmbCombo = new javax.swing.JComboBox<>();
        txtTexto2 = new javax.swing.JTextField();
        cmbFecha = new datechooser.beans.DateChooserCombo();
        chkOpcional = new javax.swing.JCheckBox();
        txtTexto1 = new javax.swing.JTextField();
        txtTexto3 = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelKeyPressed(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConcepto.setText("jLabel1");
        panel.add(lblConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panel.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        panel.add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        cmbCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComboActionPerformed(evt);
            }
        });
        panel.add(cmbCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtTexto2.setText("jTextField1");
        txtTexto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "texto 2"));
        txtTexto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTexto2KeyTyped(evt);
            }
        });
        panel.add(txtTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, -1));

        cmbFecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    cmbFecha.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
    cmbFecha.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 10));
    panel.add(cmbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

    chkOpcional.setText("jCheckBox1");
    chkOpcional.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            chkOpcionalItemStateChanged(evt);
        }
    });
    panel.add(chkOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

    txtTexto1.setText("jTextField1");
    txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "texto 1"));
    txtTexto1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTexto1KeyTyped(evt);
        }
    });
    panel.add(txtTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, -1));

    txtTexto3.setText("jTextField2");
    txtTexto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "texto 3"));
    panel.add(txtTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, -1));

    btnAtras.setText("Atras");
    btnAtras.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAtrasActionPerformed(evt);
        }
    });
    panel.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

    getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        /*
        dependiendo del caso en el que se encuentre el boton accionará 
        un metodo distinto, cambiando los JTextField y los botones presentados.
         */
        //el primer metodo es el de fecha, este se llama desde la clase Formato.
        //al presionar el boton acciona el metodo del docente y guarda 
        //la informacion en los objetos Docente y Modulo
        switch (caso) {
            case 1:
                docente();
                setFechaCreacion();
                break;
            case 2:
                setDocente();
                programa();
                break;
            case 3:
                setPrograma();
                imputacion();
                System.out.println("programa: "+modulo.getPrograma());
                break;
            case 4:
                setImputacion();
                moduloGrupo();
                break;
            case 5:
                setModuloGgrupo();
                valorHora();
                break;
            case 6:
                if(!txtTexto1.getText().trim().isEmpty()){
                setValorHora();
                dispose();
                fechaYHora();}else{
                JOptionPane.showMessageDialog(this, "No puede dejar el espacio vacío");
                }
                break;
            case 7:
                totalPagar();
                break;
            case 8:
                setTotalPagar();
                observaciones();
                break;

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtTexto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTexto1KeyTyped
        // TODO add your handling code here:
        //se valida que en el metodo de el valor de horas se acepten solo numeros
        if (caso == 6) {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTexto1KeyTyped

    private void txtTexto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTexto2KeyTyped
        //se valida que en el metodo del total a pagar solo se reciban numeros
        //y que solo se calcule cuando halla algun numero escrito para evitar errores
        if (caso == 8) {
            char c = evt.getKeyChar();
            if (c < '0' || c > '9') {
                evt.consume();
            }
            if (txtTexto2.getText().length() > 0) {
                int total = Integer.parseInt(txtTexto2.getText().trim());
                txtTexto3.setText((total + (Integer.parseInt(txtTexto1.getText()))) + "");
            }
        }
    }//GEN-LAST:event_txtTexto2KeyTyped

    private void chkOpcionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkOpcionalItemStateChanged
        // TODO add your handling code here:
        //si se necesita habilitar o deshabilitar un campo se tiene un checkbox
        //si el checkbox se slecciona se activa y sino se deshabilita
        if (caso == 2) {
            //caso docente()
            if (chkOpcional.isSelected()) {
                txtTexto3.setEnabled(true);
            } else {
                txtTexto3.setEnabled(false);
            }
        }
        if (caso == 8) {
            //caso totalAPagar()
            if (chkOpcional.isSelected()) {
                txtTexto2.setEditable(true);
                txtTexto2.setEnabled(true);
            } else {
                //si el checkbox no esta seleccionado el valor total es 
                //igual al valor de las horas multiplicado por el valor de las horas
                txtTexto2.setEditable(false);
                txtTexto2.setEnabled(false);
                txtTexto3.setText((modulo.totalHoras() * modulo.getValorHora()) + "");

            }
        }
    }//GEN-LAST:event_chkOpcionalItemStateChanged

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // se guardan las observaciones en el objeto y se cierra la ventana para mostrar
        //el formato antes de exportarlo a excel
        setObservaciones();
        parent.llenarCampos();
        dispose();
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        //para regresar al campo anterior
        switch (caso) {
            case 2:
                fecha();
                break;
            case 3:
                docente();
                break;
            case 4:
                programa();
                break;
            case 5:
                imputacion();
                break;
            case 6:
                moduloGrupo();
                break;
            case 7:
                valorHora();
                break;
            case 8:
                dispose();
                fechaYHora();
                break;
            case 9:
                totalPagar();
                break;
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void panelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelKeyPressed
        // se escucha la tecla enter, si se presiona se activa la accion del boton aceptar
        //si es el ultimo caso se activa la funcion del boton terminar
        
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
                        if(caso==9){
                btnTerminarActionPerformed(null);
            }btnAceptarActionPerformed(null);

        }
    }//GEN-LAST:event_panelKeyPressed

    private void cmbComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbComboActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialogo dialog = new Dialogo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    //todos los campos se borran se deshabilitan y se ponen invisibles
    public void reinicio() {
        txtTexto1.setText(null);
        txtTexto2.setText(null);
        txtTexto3.setText(null);
        txtTexto1.setVisible(false);
        txtTexto2.setVisible(false);
        txtTexto3.setVisible(false);
        txtTexto1.setEditable(true);
        txtTexto2.setEditable(true);
        txtTexto3.setEditable(true);
        txtTexto1.setEnabled(true);
        txtTexto2.setEnabled(true);
        txtTexto3.setEnabled(true);
        cmbCombo.setVisible(false);
        cmbFecha.setVisible(false);
        btnAceptar.setVisible(false);
        btnAtras.setVisible(false);
        btnTerminar.setVisible(false);
        chkOpcional.setVisible(false);
    }

    //se recibe la fecha de un JCalendar y se guarda en el modulo
    public void fecha() {
        reinicio();
        caso = 1;
        lblConcepto.setText("Añadir fecha.");
        cmbFecha.setVisible(true);
        btnAceptar.setVisible(true);
    }

    //se guarda la informacion del formato en el objeto
    public void setFechaCreacion() {
        modulo.setFechaCreacion(cmbFecha.getSelectedDate());
    }

    //se recibe el nombre, cedula y cuenta bancaria de un doncente
    public void docente() {
        reinicio();
        caso = 2;
        lblConcepto.setText("Añadir docente.");
        txtTexto1.setVisible(true);
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre Docente"));
        txtTexto2.setVisible(true);
        txtTexto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CC. Docente"));
        chkOpcional.setVisible(true);
        chkOpcional.setText("¿Desea agregar una cuenta bancaria al docente?");
        txtTexto3.setVisible(true);
        txtTexto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuenta Bancaria"));
        txtTexto3.setEnabled(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);

    }

    //se almacena la informacion del docente en el objeto Docente
    public void setDocente() {
        docente.setDocente(txtTexto1.getText());
        docente.setID(txtTexto2.getText());
        docente.setCuentaBancaria(txtTexto3.getText().trim());
    }

    //ser ercibe la informacion del programa, que tipo de programa es,
    //nombre del programa y correo del coordinador del programa
    public void programa() {
        reinicio();
        caso = 3;
        lblConcepto.setText("Seleccionar Programa.");
        cmbCombo.setVisible(true);
        cmbCombo.removeAllItems();
        cmbCombo.addItem("Doctorado");
        cmbCombo.addItem("Maestría");
        cmbCombo.addItem("Especialización");
        cmbCombo.addItem("Diplomado");
        cmbCombo.addItem("Seminario");
        cmbCombo.addItem("Conferencia");
        txtTexto1.setVisible(true);
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre Coordinador"));
        txtTexto2.setVisible(true);
        txtTexto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre Programa"));
        txtTexto3.setVisible(true);
        txtTexto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo Coordinador"));
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);
    }

    //se almacena la informacion del programa en el objeto Modulo
    public void setPrograma() {
        modulo.setPrograma(cmbCombo.getSelectedItem().toString() + " en " + txtTexto2.getText());
        modulo.setCorreoCoordinador(txtTexto3.getText().trim());
        modulo.setNombreCoordinador(txtTexto1.getText().trim());
    }

    //se recibe el numero de imputacion de la cuenta
    public void imputacion() {
        reinicio();
        caso = 4;
        lblConcepto.setText("Añadir Numero de Imputacion");
        txtTexto1.setVisible(true);
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Numero Imputacion"));
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);
    }

    //se almacena el numero de imputacion de la cuenta y se almacena en el objeto Modulo
    public void setImputacion() {
        modulo.setNumeroDeImputacion(txtTexto1.getText());
    }

    //se recibe el grupo y el nombre del modulo 
    public void moduloGrupo() {
        reinicio();
        caso = 5;
        lblConcepto.setText("Añadir un Modulo y su Grupo.");
        cmbCombo.removeAllItems();
        txtTexto2.setVisible(true);
        txtTexto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Grupo"));
        txtTexto3.setVisible(true);
        txtTexto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Modulo"));
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);
    }

    //se almacena el nombre y el grupo del modulo en el objeto Modulo
    public void setModuloGgrupo() {
        modulo.setGrupo(txtTexto2.getText().trim());
        modulo.setModulo(txtTexto3.getText().trim());
    }

    //se recibe el valor de la hora catedra
    public void valorHora() {
        lblConcepto.setText("Agregar Valor Hora Catedra");
        reinicio();
        caso = 6;
        txtTexto1.setVisible(true);
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Valor Hora Catedra"));
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);
    }

    //se almacena el valor de la hora catedra en el objeto Modulo
    public void setValorHora() {

        modulo.setValorHora(Integer.parseInt(txtTexto1.getText().trim()));
        
        
    }

    // se abre la clase FechaYHora para introducir los valores de los dias en los que se dio clase 
    //y la cantidad de horas dictadas 
    public void fechaYHora() {
        caso = 7;
        FechaYHora fecha = new FechaYHora(Formato.getFrames()[0], rootPaneCheckingEnabled);
        fecha.setModulo(modulo);
        fecha.setVisible(true);
        fecha.setAlwaysOnTop(true);
    }

    //se muestra el total sin el valor de transporte interno
    //se recibe el valor del transporte interno y se le suma al valor total para
    //dar el valor total a pagar + transporte interno
    public void totalPagar() {
        lblConcepto.setText("Total");
        reinicio();
        caso = 8;
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total Horas"));
        txtTexto2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Transporte Interno"));
        txtTexto3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total Dinero"));
        txtTexto1.setEnabled(true);
        txtTexto2.setEnabled(false);
        txtTexto3.setEnabled(true);
        txtTexto1.setVisible(true);
        txtTexto2.setVisible(true);
        txtTexto3.setVisible(true);
        txtTexto1.setEditable(false);
        txtTexto2.setEditable(false);
        txtTexto3.setEditable(false);
        txtTexto1.setText((modulo.totalHoras() * modulo.getValorHora()) + "");
        txtTexto3.setText((modulo.totalHoras() * modulo.getValorHora()) + "");
        chkOpcional.setVisible(true);
        chkOpcional.setText("Transporte Interno");
        btnAceptar.setVisible(true);
        btnAtras.setVisible(true);
    }

    //se guarda el valor del transporte interno en el objeto Modulo
    public void setTotalPagar() {
        if (txtTexto2.getText().length() > 0) {
            modulo.setTransporteInt(Integer.parseInt(txtTexto2.getText()));
        }
    }

    //se recibe la informaicon de las observaciones y se muestra el boton de terminar
    //para volver a la clase Formato y dar una muestra del formato final antes
    //de terminarlo 
    public void observaciones() {
        caso = 9;
        reinicio();
        lblConcepto.setText("Agregar Observaciones");
        txtTexto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Observaciones"));
        txtTexto1.setVisible(true);
        btnAtras.setVisible(true);
        btnTerminar.setVisible(true);
    }

    //se guarda la informacion de las observaciones en el objeto Modulo
    public void setObservaciones() {
        modulo.setObservaciones(txtTexto1.getText().trim());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAtras;
    public javax.swing.JButton btnTerminar;
    private javax.swing.JCheckBox chkOpcional;
    public javax.swing.JComboBox<String> cmbCombo;
    public datechooser.beans.DateChooserCombo cmbFecha;
    public javax.swing.JLabel lblConcepto;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtTexto1;
    private javax.swing.JTextField txtTexto2;
    private javax.swing.JTextField txtTexto3;
    // End of variables declaration//GEN-END:variables

}
