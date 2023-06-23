/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Equipo_futbol;
import modelo.TipoBusquedaCombo;

public class Inter_ingreso_clubs extends javax.swing.JInternalFrame {
    
    public ArrayList<Equipo_futbol> list_club = new ArrayList<>();
    private Equipo_futbol club = null;
    
    public Inter_ingreso_clubs() {
        initComponents();
        llenarTabla();
    }
    
    private void llenarLista()
    {
        club = new Equipo_futbol(1, "Dep. Cuenca", "Dario Guzman");
        list_club.add(club);
        
        club = new Equipo_futbol(2, "Barcelona", "Pepe Briones");
        list_club.add(club);
        
        club = new Equipo_futbol(3, "Macara", "Pedro Zamora");
        list_club.add(club);
        
        club = new Equipo_futbol(4, "Emelec", "Julio Diaz");
        list_club.add(club);
        
        club = new Equipo_futbol(5, "Aucas", "Esteban Naranjo");
        list_club.add(club);
    }
    
    private void llenarTabla()
    {
        llenarLista();
                
        for (int fila = 0; fila <list_club.size(); fila++)
        {
            club = (Equipo_futbol)list_club.get(fila);
            llenarFilas(fila, club);                        
        }
    }
    
    private void llenarFilas(int fila, Equipo_futbol club)
    {
        DefaultTableModel tabla = (DefaultTableModel)table_club.getModel();
        
        tabla.addRow(new Object[1]);
        table_club.setValueAt(fila+1, fila, 0);
           table_club.setValueAt(club.getNombre_equipo(), fila, 1);
            table_club.setValueAt(club.getDirector(), fila, 2);            
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_guardar_club = new javax.swing.JButton();
        boton_limpiar_club = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_field_nombre_club = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text_director = new javax.swing.JTextField();
        combo_box_buscar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_club = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text_field_buscar_club = new javax.swing.JTextField();
        boton_buscar_club = new javax.swing.JButton();
        boton_editar_club = new javax.swing.JButton();
        boton_borrar_club = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Ingreso de clubs");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_guardar_club.setBackground(new java.awt.Color(0, 255, 102));
        boton_guardar_club.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        boton_guardar_club.setText("Guardar");
        boton_guardar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardar_clubActionPerformed(evt);
            }
        });
        jPanel1.add(boton_guardar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 89, -1));

        boton_limpiar_club.setBackground(new java.awt.Color(153, 255, 204));
        boton_limpiar_club.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        boton_limpiar_club.setText("Limpiar");
        boton_limpiar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiar_clubActionPerformed(evt);
            }
        });
        jPanel1.add(boton_limpiar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 94, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jLabel3.setText("Nombre club:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jLabel4.setText("Director:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, -1));
        jPanel1.add(text_field_nombre_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 171, -1));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel1.setText("Ingreso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));
        jPanel1.add(text_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));

        combo_box_buscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Director" }));
        jPanel1.add(combo_box_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 145, -1));

        table_club.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "#", "Nombre del Club", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(table_club);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 714, 247));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jLabel10.setText("*Seleccione un registro para efectuar alguna accion de edicion o borrado* ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jLabel11.setText("Buscar por:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        text_field_buscar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_field_buscar_clubActionPerformed(evt);
            }
        });
        text_field_buscar_club.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_field_buscar_clubKeyPressed(evt);
            }
        });
        jPanel1.add(text_field_buscar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 157, -1));

        boton_buscar_club.setBackground(new java.awt.Color(0, 102, 204));
        boton_buscar_club.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        boton_buscar_club.setText("Buscar");
        boton_buscar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscar_clubActionPerformed(evt);
            }
        });
        jPanel1.add(boton_buscar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        boton_editar_club.setBackground(new java.awt.Color(255, 255, 102));
        boton_editar_club.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        boton_editar_club.setText("Editar");
        boton_editar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editar_clubActionPerformed(evt);
            }
        });
        jPanel1.add(boton_editar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 82, -1));

        boton_borrar_club.setBackground(new java.awt.Color(255, 51, 51));
        boton_borrar_club.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        boton_borrar_club.setText("Borrar");
        boton_borrar_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrar_clubActionPerformed(evt);
            }
        });
        jPanel1.add(boton_borrar_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 85, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo blanco.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 760, 410));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo blanco.jpg"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/utea.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_field_buscar_clubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_field_buscar_clubKeyPressed
    }//GEN-LAST:event_text_field_buscar_clubKeyPressed

    private void boton_borrar_clubActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel tabla = (DefaultTableModel)table_club.getModel();
        int fila_select = table_club.getSelectedRow();
        if(tabla.getRowCount()>0)
        {
            tabla.removeRow(fila_select);
        }
    }// GEN-LAST:event_boton_borrar_clubActionPerformed

    private void boton_editar_clubActionPerformed(java.awt.event.ActionEvent evt) {
        int fila_select = table_club.getSelectedRow();
        
        text_field_nombre_club.setText(table_club.getValueAt(fila_select, 1).toString());
        text_director.setText((String) table_club.getValueAt(fila_select, 2));
    }// GEN-LAST:event_boton_editar_clubActionPerformed

    private void boton_limpiar_clubActionPerformed(java.awt.event.ActionEvent evt) {
        text_field_nombre_club.setText("");
        text_director.setText("");
    }// GEN-LAST:event_boton_limpiar_clubActionPerformed

    private void boton_buscar_clubActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_boton_buscar_clubActionPerformed
    }// GEN-LAST:event_boton_buscar_clubActionPerformed

    private void text_field_id_clubActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_text_field_id_clubActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_text_field_id_clubActionPerformed

    private void text_field_buscar_clubActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_text_field_buscar_clubActionPerformed

    }// GEN-LAST:event_text_field_buscar_clubActionPerformed

    private void boton_guardar_clubActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel tabla = (DefaultTableModel)table_club.getModel();
        int filas = tabla.getRowCount();
        
        tabla.addRow(new Object[1]);
        table_club.setValueAt(filas+1, filas, 0);
        table_club.setValueAt(text_field_nombre_club.getText(), filas, 1);
        table_club.setValueAt(text_director.getText(), filas, 2);
    }// GEN-LAST:event_boton_guardar_clubActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar_club;
    private javax.swing.JButton boton_buscar_club;
    private javax.swing.JButton boton_editar_club;
    private javax.swing.JButton boton_guardar_club;
    private javax.swing.JButton boton_limpiar_club;
    private javax.swing.JComboBox<String> combo_box_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_club;
    private javax.swing.JTextField text_director;
    private javax.swing.JTextField text_field_buscar_club;
    private javax.swing.JTextField text_field_nombre_club;
    // End of variables declaration//GEN-END:variables
}