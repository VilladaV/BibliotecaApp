/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.biblioteca.views;
import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Andrés Villada
 */
public class BibliotecaGUI extends javax.swing.JFrame {
    private final Biblioteca biblioteca;
    private final DefaultTableModel tablaModel;
    /**
     * Creates new form BibliotecaGUI
     */
    public BibliotecaGUI() {
        initComponents();
        biblioteca = new Biblioteca();
        tablaModel = (DefaultTableModel) TablaLibros.getModel();
       cargarLibrosTabla();
    }
    // Método para cargar los libros en la tabla
    private void cargarLibrosTabla() {
        DefaultTableModel tablaModel = (DefaultTableModel) TablaLibros.getModel();
        tablaModel.setRowCount(0); // Limpiar la tabla
        ArrayList<Libro> libros = biblioteca.obtenerLibrosAlfabeticamente();
        for (Libro libro : libros) {
            tablaModel.addRow(new Object[]{libro.getTitulo(), libro.getAutor(), libro.getId()}); // Corrección aquí
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        AgregarL = new javax.swing.JButton();
        BuscarL = new javax.swing.JButton();
        ActualizarL = new javax.swing.JButton();
        EliminarL = new javax.swing.JButton();
        Ordenar = new javax.swing.JButton();
        Refrescar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Libro", "Autor", "ID"
            }
        ));
        jScrollPane1.setViewportView(TablaLibros);

        AgregarL.setText("Agregar");
        AgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLActionPerformed(evt);
            }
        });

        BuscarL.setText("Buscar");
        BuscarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLActionPerformed(evt);
            }
        });

        ActualizarL.setText("Actualizar");
        ActualizarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarLActionPerformed(evt);
            }
        });

        EliminarL.setText("Eliminar");
        EliminarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLActionPerformed(evt);
            }
        });

        Ordenar.setText("Ordenar A-Z");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        Refrescar.setText("Refrescar");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel2.setText("Gestión de Biblioteca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ActualizarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgregarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EliminarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Ordenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Refrescar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AgregarL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualizarL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ordenar)
                    .addComponent(Refrescar)
                    .addComponent(salir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
        cargarLibrosTabla();
        JOptionPane.showMessageDialog(this, "Libros ordenados alfabéticamente.");
    }//GEN-LAST:event_OrdenarActionPerformed

    private void EliminarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLActionPerformed
        int filaSeleccionada = TablaLibros.getSelectedRow();
        if (filaSeleccionada != -1) {
            long idLibro = (long) TablaLibros.getValueAt(filaSeleccionada, 2);
            EliminarLibroGUI eliminarGUI = new EliminarLibroGUI(biblioteca, idLibro, this);
            eliminarGUI.setVisible(true);
            //this.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un libro para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EliminarLActionPerformed

    private void ActualizarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarLActionPerformed
        int filaSeleccionada = TablaLibros.getSelectedRow();
        if (filaSeleccionada != -1) {
            long idLibro = (long) TablaLibros.getValueAt(filaSeleccionada, 2);
            Libro libroAActualizar = biblioteca.buscarLibro(idLibro);
            if (libroAActualizar != null) {
                BuscarActualizarLibroGUI actualizarGUI = new BuscarActualizarLibroGUI(biblioteca, libroAActualizar, this);
                actualizarGUI.setVisible(true);
                //this.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el libro con ID: " + idLibro, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un libro para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ActualizarLActionPerformed

    private void BuscarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLActionPerformed
        BuscarActualizarLibroGUI buscarGUI = new BuscarActualizarLibroGUI(biblioteca, this);
        buscarGUI.setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_BuscarLActionPerformed

    private void AgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLActionPerformed
        AgregarLibroGui agregarGUI = new AgregarLibroGui(biblioteca, this);
        agregarGUI.setVisible(true);
       // this.setEnabled(false);
    }//GEN-LAST:event_AgregarLActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarL;
    private javax.swing.JButton AgregarL;
    private javax.swing.JButton BuscarL;
    private javax.swing.JButton EliminarL;
    private javax.swing.JButton Ordenar;
    private javax.swing.JButton Refrescar;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    private void RefrescarActionPerformed(java.awt.event.ActionEvent evt) {
        cargarLibrosTabla();
    }

    public void actualizarTabla() {
        cargarLibrosTabla();
    }
}


