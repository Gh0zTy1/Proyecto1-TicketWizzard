/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import com.equipo7.proyecto1.ticketwizzard.dtos.UsuarioDTO;
import com.equipo7.proyecto1.ticketwizzard.gestores.GestorTransacciones;
import com.equipo7.proyecto1.ticketwizzard.interfaces.gestores.IGestorTransacciones;

/**
 *
 * @author neri
 */
public class frmMiHistorial extends javax.swing.JFrame {

    private IGestorTransacciones transacciones;
    private UsuarioDTO usuario;
    
    /**
     * Creates new form frmMiHistorial
     * @param usuario
     */
    public frmMiHistorial(UsuarioDTO usuario) {
        initComponents();
        this.setVisible(true);
        this.usuario = usuario;
        this.transacciones = GestorTransacciones.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
