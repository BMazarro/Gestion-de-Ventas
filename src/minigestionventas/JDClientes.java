/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minigestionventas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dam09
 */
public class JDClientes extends javax.swing.JDialog {
    DefaultTableModel modelo = new DefaultTableModel();
    Connection c;
    MenuOpciones padre;
    Statement sentencia;
    int id;
    String nombre;
    String direccion;
    String poblacion;
    String telefono;
    String nif;
    int tipoConexion=-1;
    /**
     * Creates new form JDClientes
     */
    public JDClientes(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        padre= (MenuOpciones)parent;
        c= padre.obtieneConexion();
        tipoConexion= padre.obtieneTipo();
        combo.addItem("id");
        combo.addItem("nombre");
        combo.setSelectedIndex(0);
        try {
            inicializarTabla();
            mostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(JDClientes.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("ALTA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BAJA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MODIFICACION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CLIENTES");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minigestionventas/go_back.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/minigestionventas/go_back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Busqueda de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(207, 207, 207)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jButton3)
                            .addGap(27, 27, 27)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    // -------------- INSERTAR CLIENTE ----------------------------------
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean sigue= true;
        while(sigue){
            // el identificador de la venta no debe existir anteriormente
            id = Integer.parseInt(JOptionPane.showInputDialog("ID del cliente:"));
            try {
                sigue=comprobarIDCliente();
            } catch (SQLException ex) {
                Logger.getLogger(JDVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       nombre = JOptionPane.showInputDialog("Nombre del cliente:");
       direccion= JOptionPane.showInputDialog("Direccion:");
       poblacion= JOptionPane.showInputDialog("Poblacion:");
       telefono =JOptionPane.showInputDialog("Telefono:");
       nif= JOptionPane.showInputDialog("NIF:");
       String sql= "INSERT INTO CLIENTES VALUES("+id+",'"+nombre+"','"+direccion+"','"+poblacion+"','"+telefono+"','"+nif+"')";
        try { 
            ejecutaSQL(sql, 1);
            limpiar();
            mostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(JDClientes.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }//GEN-LAST:event_jButton1ActionPerformed
     public boolean comprobarIDCliente() throws SQLException{
        boolean sigue= true;
        Statement sentencia2;
        String sql= "Select * from Clientes where ID="+id;
        sentencia2 = c.createStatement();
        ResultSet r=sentencia2.executeQuery(sql);
        if(r.next()){    //si existe
            sigue=true;
            JOptionPane.showMessageDialog(rootPane, "El cliente ya existe en la base de datos");           
        }
        else{
            sigue=false;        
        }
        return sigue;
    }
    
    // -------------- LIMPIAR LA TABLA ---------------------------------
    void limpiar(){
        while (table.getRowCount()!=0){
           ((DefaultTableModel)table.getModel()).removeRow(0);
        }
    }   
    // -------------- ELIMINAR REGISTRO SELECCIONADO -------------------
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int i= table.getSelectedRow();
       if (i== -1){
           JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
       }
       else {
           int n=JOptionPane.showConfirmDialog(null, "Se va a eliminar el registro, está seguro?", "Confirmar baja", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
          if (n==0){
               String sql="DELETE CLIENTES WHERE CLIENTES.ID="+table.getValueAt(i, 0);
                try {
                    ejecutaSQL(sql, 2);
                } catch (SQLException ex) {
                     Logger.getLogger(JDClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
                modelo.removeRow(table.getSelectedRow());
          }        
       }      
    }//GEN-LAST:event_jButton2ActionPerformed

    // -------------- MODIFICAR REGISTRO SELECCIONADO -------------------
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       java.math.BigDecimal bd; 
       int i= table.getSelectedRow();
       if (i== -1){
           JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro");
       }
       else {
            bd= (java.math.BigDecimal)table.getValueAt(i, 0);
            id = bd.intValue();
            nombre= (String)table.getValueAt(i, 1);
            direccion= (String)table.getValueAt(i, 2);
            poblacion= (String)table.getValueAt(i, 3);
            telefono = (String)table.getValueAt(i, 4);
            nif = (String)table.getValueAt(i, 5);
           //-----------------------------------------------------------------------
           id = Integer.parseInt(JOptionPane.showInputDialog("ID del cliente:", id));
           nombre = JOptionPane.showInputDialog("Nombre del cliente:", nombre);
           direccion= JOptionPane.showInputDialog("Direccion:", direccion);
           poblacion= JOptionPane.showInputDialog("Poblacion:", poblacion);
           telefono =JOptionPane.showInputDialog("Telefono:", telefono);
           nif= JOptionPane.showInputDialog("NIF:", nif);
           
           String sql= "UPDATE CLIENTES SET "+
                   "NOMBRE='" + nombre + 
                   "', DIRECCION='" + direccion +
                   "', POBLACION='" + poblacion +
                   "', TELEF='" + telefono + 
                   "', NIF='" + nif + "' WHERE ID="+id;
        try { 
            ejecutaSQL(sql, 3);
            limpiar();
            mostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(JDClientes.class.getName()).log(Level.SEVERE, null, ex);
        } 
       }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // -------------- BUSCAR UN CLIENTE DETERMINADO POR NOMBRE o ID --------------------
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: 
        java.math.BigDecimal bd;
        int n= combo.getSelectedIndex();
        int estadoID =0;
        int estadoNom= 0;
        // ---------- BUSCAMOS POR ID -------------------
        if (n==0){
            int id= Integer.parseInt(JOptionPane.showInputDialog("Por ID: ¿Que cliente desea buscar?"));
            for (int i = 0; i < table.getRowCount(); i++) {
                bd= (java.math.BigDecimal)table.getValueAt(i, 0);
                int p= bd.intValue();
                if (p==id) {                                           
                  table.changeSelection(i, 0, false, false);
                  estadoID= 1;
                  break;                       
                }             
            }
            if (estadoID==0){
                JOptionPane.showMessageDialog(rootPane, "El cliente no existe");
            }
        }       
        // ---------- BUSCAMOS POR NOMBRE ---------------
        else if (n==1){          
            String ele = JOptionPane.showInputDialog("Por Nombre: ¿Que cliente desea buscar?");
            for (int i = 0; i < table.getRowCount(); i++) {
                if (((String)table.getValueAt(i, 1)).compareToIgnoreCase(ele)==0) {                                           
                  table.changeSelection(i, 1, false, false);
                  estadoNom= 1;
                  break;                
                }              
            }  
            if (estadoNom==0){
                JOptionPane.showMessageDialog(rootPane, "El cliente no existe");
            }
        }      
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void inicializarTabla() {    
      table.setModel(modelo);     
      modelo.addColumn("id");
      modelo.addColumn("nombre");
      modelo.addColumn("direccion");
      modelo.addColumn("poblacion");
      modelo.addColumn("telefono");
      modelo.addColumn("nif");
}
    public int obtieneNumRegistros() throws SQLException{
        Statement sent=c.createStatement();
        int contador=0;
        ResultSet rs2= sent.executeQuery("Select count(id) from Clientes");
        while(rs2.next()){
            contador=contador+1;
        }
        System.out.println(""+contador);
        return contador;
        
    }   
    public void mostrarTabla() throws SQLException{
      Statement s= c.createStatement();
      ResultSet rs = s.executeQuery("Select * from CLIENTES order by id"); 
      while(rs.next()){           
          Object [] fila= new Object [6]; // tamaño con el numero de columnas (campos)        
          for (int i=0; i<fila.length; i++){
              fila[i]= rs.getObject(i+1);              
          }
           modelo.addRow(fila);        
      }            
    }    
    public  void ejecutaSQL(String sql, int n) throws SQLException{
            sentencia = c.createStatement();
            sentencia.execute(sql);
            if (n==1){
                System.out.println("Alta cliente");
            }
            if (n==2){
                System.out.println("Cliente eliminado");
            }
            if (n==3){
                System.out.println("Cliente modificado");
            }   
            sentencia.close();
     }
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
            java.util.logging.Logger.getLogger(JDClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDClientes dialog = new JDClientes(new javax.swing.JDialog(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}