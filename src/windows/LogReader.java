/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import resources.ObtenerDirectorios;
import resources.model.Dir;

/**
 *
 * @author maria
 */
public class LogReader extends javax.swing.JFrame {

    public static void run() {
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
            java.util.logging.Logger.getLogger(LogReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogReader().setVisible(true);
            }
        });
    }

    public LogReader() {
        initComponents();
        initMyComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelRadioButtonsArea = new javax.swing.JPanel();
        radioButtonTodos = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        botonExaminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        querysField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datoBuscarText = new javax.swing.JTextArea();
        barraProgresoBusqueda = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("log-reader");
        setLocation(new java.awt.Point(480, 200));

        panelRadioButtonsArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioButtonTodos.setText("jRadioButton1");
        radioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonTodosActionPerformed(evt);
            }
        });
        panelRadioButtonsArea.add(radioButtonTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        panelRadioButtonsArea.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        panelRadioButtonsArea.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        panelRadioButtonsArea.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, -1, -1));

        jCheckBox4.setText("jCheckBox4");
        panelRadioButtonsArea.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, -1, -1));

        jCheckBox5.setText("jCheckBox5");
        panelRadioButtonsArea.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, -1));

        jCheckBox6.setText("jCheckBox6");
        panelRadioButtonsArea.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, -1, -1));

        jCheckBox7.setText("jCheckBox7");
        panelRadioButtonsArea.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 0, -1, -1));

        jCheckBox8.setText("jCheckBox8");
        panelRadioButtonsArea.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 23, -1, -1));

        jCheckBox9.setText("jCheckBox9");
        panelRadioButtonsArea.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 46, -1, -1));

        jCheckBox10.setText("jCheckBox10");
        panelRadioButtonsArea.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 69, -1, -1));

        jCheckBox11.setText("jCheckBox11");
        panelRadioButtonsArea.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 92, -1, -1));

        jCheckBox12.setText("jCheckBox12");
        panelRadioButtonsArea.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 115, -1, -1));

        jCheckBox13.setText("jCheckBox13");
        panelRadioButtonsArea.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 138, -1, -1));

        jLabel1.setText("Directorio de los logs");

        jTextField2.setText("c:\\dir");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        botonExaminar.setText("...");
        botonExaminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonExaminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonExaminar))
                .addContainerGap())
        );

        botonExaminar.getAccessibleContext().setAccessibleName("");

        botonBuscar.setText("Actualizar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Dato a buscar:");

        jLabel3.setText("Flujos:");

        querysField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        querysField.setText("0");
        querysField.setToolTipText("Ingrese aquí la cantidad de flujos que desea obtener...");

        datoBuscarText.setColumns(20);
        datoBuscarText.setRows(5);
        jScrollPane1.setViewportView(datoBuscarText);

        barraProgresoBusqueda.setStringPainted(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(querysField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barraProgresoBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(querysField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(barraProgresoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("Opciones");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRadioButtonsArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRadioButtonsArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRadioButtonsArea.getAccessibleContext().setAccessibleName("");
        panelRadioButtonsArea.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initMyComponents() {
        radioButtonTodos.setVisible(true);
        radioButtonTodos.setEnabled(false);
        radioButtonTodos.setText("Seleccionar todos");
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
        jCheckBox7.setVisible(false);
        jCheckBox8.setVisible(false);
        jCheckBox9.setVisible(false);
        jCheckBox10.setVisible(false);
        jCheckBox11.setVisible(false);
        jCheckBox12.setVisible(false);
        jCheckBox13.setVisible(false);

        //barraProgresoBusqueda.setStringPainted(true);
    }

    private void botonExaminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExaminarMouseClicked
        fileChooser.setCurrentDirectory(new java.io.File("c:\\"));
        fileChooser.setDialogTitle("Seleccione la carpeta de LOGS");
        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showSaveDialog(null);

        if (fileChooser.getSelectedFile() != null) {
            jTextField2.setText(fileChooser.getSelectedFile().toString());
        }

        directorios = new ArrayList<>();
        directoriosAPI = new ArrayList<>();
        botonBuscar.setText("Actualizar");
    }//GEN-LAST:event_botonExaminarMouseClicked

    private void radioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonTodosActionPerformed
        boolean estado = !radioButtonTodos.isSelected();
        //cuando el radioButtonTodos está activado, se desactivan todos los CheckButton
        for (java.awt.Component c : panelRadioButtonsArea.getComponents()) {
            if (c instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox cb = (javax.swing.JCheckBox) c;
                if (!cb.getText().equalsIgnoreCase("")) {
                    cb.setEnabled(estado);
                }
            }
        }
    }//GEN-LAST:event_radioButtonTodosActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (directoriosAPI.size() != 0 || directorios.size() != 0) {
            botonBuscar.setText("Buscar");
        }

        if (botonBuscar.getText().equals("Actualizar")) {
            //int x=40;
            //setValueProgBar(x);
            directoriosAPI = new ArrayList<>();
            directorios = new ArrayList<>();
            ObtenerDirectorios.obtenerDirectorios(new File(jTextField2.getText()), directoriosAPI);
            botonBuscar.setEnabled(false);
            configRadioandCheckButtons();
            botonBuscar.setEnabled(true);
            radioButtonTodos.setEnabled(true);
            sanitizarArrays(directoriosAPI, directorios);
            //System.out.println("Se ha actualizado la lista correctamente.");

            if (directoriosAPI.size() != 0 || directorios.size() != 0) {
                botonBuscar.setText("Buscar");
            }
        } else {
            ArrayList<ArrayList<ArrayList<String>>> listado = new ArrayList<>();

            int querys = Integer.parseInt(querysField.getText());
            String datoBuscar = datoBuscarText.getText();
            //barraProgresoBusqueda = new javax.swing.JProgressBar(0,100);

            barraProgresoBusqueda.setMinimum(1);
            barraProgresoBusqueda.setMaximum(directoriosAPI.size()-1);
            //barraProgresoBusqueda.setValue(50);

            for (int I = 0; I < directoriosAPI.size(); I++) {
                barraProgresoBusqueda.setValue(I);
                barraProgresoBusqueda.update(barraProgresoBusqueda.getGraphics());
                //System.out.println(I);
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(directoriosAPI.get(I).getRuta()));
                    ArrayList<ArrayList<String>> datosSirven = new ArrayList<>();
                    ArrayList<String> temporal = new ArrayList<>();
                    int temporalCont = 0;
                    String en;

                    boolean datosCoinciden = false;
                    en = reader.readLine();
                    while (en != null && datosSirven.size() < querys) {
                        //System.out.println(directoriosAPI.get(I).getRuta() + "-" + en);
                        if (en.length() != 0 && en.charAt(0) == '2') {
                            temporalCont++;
                        }

                        if (temporalCont != 2) {
                            temporal.add(en + "\n");
                        }

                        if (en.contains(datoBuscar)) {
                            datosCoinciden = true;
                        }

                        if (temporalCont == 2 && datosCoinciden == true) {
                            //for(String i: temporal)
                            //    System.out.println(i);
                            temporal.add(directoriosAPI.get(I).getRuta());
                            datosSirven.add(temporal);
                            temporal = new ArrayList<>();
                            temporal.add(en);
                            datosCoinciden = false;
                        } else if (temporalCont == 2) {
                            temporal = new ArrayList<>();
                            temporal.add(en);
                            temporalCont = 1;
                        }

                        en = reader.readLine();
                    }

                    listado.add(datosSirven);

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LogReader.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LogReader.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
            
            
            for (int j = 0; j < listado.size(); j++) {
                for (int i = 0; i < listado.get(j).size(); i++) {
                    System.out.println(listado.get(j).get(i));
                }
                System.out.println("");
            }

        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        directorios = new ArrayList<>();
        directoriosAPI = new ArrayList<>();
        botonBuscar.setText("Actualizar");
    }//GEN-LAST:event_jTextField2KeyPressed

    private javax.swing.JCheckBox getNextAvailable() {
        for (java.awt.Component c : panelRadioButtonsArea.getComponents()) {
            if (c instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox cb = (javax.swing.JCheckBox) c;
                if (cb.getText().equalsIgnoreCase("") && !cb.isVisible()) {
                    return cb;
                }
            }
        }
        return null;
    }

    private void cleanCheckBoxes() {
        for (java.awt.Component c : panelRadioButtonsArea.getComponents()) {
            if (c instanceof javax.swing.JCheckBox) {
                javax.swing.JCheckBox cb = (javax.swing.JCheckBox) c;
                cb.setText("");
                cb.setVisible(false);

            }
        }
    }

    private void configRadioandCheckButtons() {
        //Clean al available check boxes in order to set visible only the ones i need
        cleanCheckBoxes();

        names = new HashSet<>();
        for (Dir i : directoriosAPI) {
            String[] partes = i.getRuta().split("\\\\");
            if (partes[partes.length - 1].toLowerCase().indexOf("api") > -1) {
                String name = partes[partes.length - 1].toLowerCase().replace("_", "-").split("-")[0];
                names.add(name.toUpperCase());
            }
        }
        for (String name : names) {
            javax.swing.JCheckBox cb = this.getNextAvailable();
            cb.setText(name);
            cb.setVisible(true);
        }
    }

    private void sanitizarArrays(ArrayList<Dir> directoriosAPI, ArrayList<Dir> directorios) {
        for (int c = 0; c < directoriosAPI.size(); c++) {
            if (radioButtonTodos.isSelected()) {
                if (!directoriosAPI.get(c).getRuta().contains("API")) {
                    directorios.add(directoriosAPI.get(c));
                    directoriosAPI.remove(c);
                    c--;
                }
            } else {
                if (directoriosAPI.get(c).getRuta().contains("API")) {
                    //acá guardamos solamente los directorios que contienen las palabras del filtro diseñado
                }
            }
        }
    }

    private void setValueProgBar(int value) {
        barraProgresoBusqueda.setValue(value);
    }

    public void setDirectoriosAPI(ArrayList<Dir> directoriosAPI) {
        this.directoriosAPI = directoriosAPI;
    }

    public ArrayList<Dir> getDirectoriosAPI() {
        return directoriosAPI;
    }

    Set<String> names = new HashSet<>();
    private ArrayList<Dir> directoriosAPI = new ArrayList<>();
    private ArrayList<Dir> directorios = new ArrayList<>();
    private javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgresoBusqueda;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonExaminar;
    private javax.swing.JTextArea datoBuscarText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelRadioButtonsArea;
    private javax.swing.JTextField querysField;
    private javax.swing.JRadioButton radioButtonTodos;
    // End of variables declaration//GEN-END:variables

    private boolean isNullOrEmpty(String en) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
