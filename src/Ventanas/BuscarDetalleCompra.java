/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import Clases.CustomTextField;
import Procedimientos.Conexion;
import com.keffect.effects.animatedEffects.Shape;
import com.keffectpanel.KEffectPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Reymundo
 */
public class BuscarDetalleCompra extends javax.swing.JDialog {

    /**
     * Creates new form BuscarProveedor
     * @param parent
     * @param modal
     */
    public BuscarDetalleCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
          try {
            this.setIconImage(new ImageIcon(getClass().getResource("Icono.png")).getImage());
        } catch (NullPointerException ex) {
        }
        initComponents();
        
         Tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
         this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        PanelVer = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbbusc = new javax.swing.JComboBox();
        txtbusc = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnshowall = new javax.swing.JButton();
        btncancel3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle de Compra");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TabbedPane.setColorDeBorde(new java.awt.Color(0, 204, 204));
        TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneStateChanged(evt);
            }
        });

        PanelVer = PanelEffect2;
        PanelVer.setBackground(new java.awt.Color(0, 153, 204));
        PanelVer.setLayout(new javax.swing.BoxLayout(PanelVer, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(0, 153, 204));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Por: ");

        cmbbusc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbbusc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto", "Proveedor", "Laboratorio", "Estado" }));
        cmbbusc.setToolTipText("Buscar Por:");

        txtbusc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtbusc.setToolTipText("Buscar");
        CustomTextField customTextField9 = new CustomTextField(100);
        txtbusc = customTextField9;
        customTextField9.setPlaceholder("Ingrese Información a Buscar");
        customTextField9.setFont(new java.awt.Font("Tahoma", 0, 16));
        customTextField9.setForeground(Color.BLACK);
        customTextField9.setPlaceholderForeground(Color.LIGHT_GRAY);
        txtbusc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscKeyReleased(evt);
            }
        });
        /*txtbusc = new AutoComplete.AutoCompletar();
        ((AutoCompletar)txtbusc).setDesplegable(new DesplegableJPopUPMenu(txtbusc));
        ModeloAutoCompletar modelo1 = new ModeloVendNames();
        ((AutoCompletar)txtbusc).setModelo(modelo1);
        ((AutoCompletar)txtbusc).getDesplegable().setForeground(new Color(102,153,255));
        ((AutoCompletar)txtbusc).addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscTyped(evt);
            }
        });
        ((AutoCompletar)txtbusc).setToolTipText("Ingresar Dato a Buscar");*/

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbbusc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbusc, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbusc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbusc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.setToolTipText("Lista Registros");
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TablaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TablaFocusLost(evt);
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(Tabla);

        jPanel7.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));

        btnshowall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnshowall.setForeground(new java.awt.Color(255, 255, 255));
        btnshowall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TablaTodos.png"))); // NOI18N
        btnshowall.setMnemonic('m');
        btnshowall.setText("Mostrar Todos");
        btnshowall.setToolTipText("Mostrar Todos Los Registros");
        btnshowall.setContentAreaFilled(false);
        btnshowall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnshowall.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnshowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowallActionPerformed(evt);
            }
        });
        jPanel5.add(btnshowall);

        btncancel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncancel3.setForeground(new java.awt.Color(255, 255, 255));
        btncancel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        btncancel3.setMnemonic('c');
        btncancel3.setText("Cancelar");
        btncancel3.setToolTipText("Cancelar / Salir");
        btncancel3.setContentAreaFilled(false);
        btncancel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel3ActionPerformed(evt);
            }
        });
        jPanel5.add(btncancel3);

        jPanel7.add(jPanel5, java.awt.BorderLayout.SOUTH);

        PanelVer.add(jPanel7);

        TabbedPane.addTab("Ver", PanelVer);

        getContentPane().add(TabbedPane, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1118, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static ResultSet resultado;
    
    KEffectPanel PanelEffect2 = new KEffectPanel();
    
      public void Titulo(){
        
        Object [] Titulo = {"No.", "Proveedor", "Laboratorio", "Producto","Fecha Vencimiento","Unidades","Costo Unitario", "Descuento(%)",
   "Incluye IVA", "Total", "Adquisición","Incluye Viñeta", "Cantidad Viñeta", 
  "Permite Devolución", "Unidades Devolución", "Estado"};
        
       
        model.setColumnIdentifiers(Titulo);
      
        this.Tabla.setModel(model);
        
        JTableHeader header = Tabla.getTableHeader();
        header.setFont(new Font("Tahoma", Font.BOLD, 14));
   
      Tabla.setDefaultRenderer(Object.class, new FormatoTabla());
       
    
    }
   
      int ID_Compra;

    public void setID_Compra(int ID_Compra) {
        this.ID_Compra = ID_Compra;
    }
      
      
    
    
   public void ActualizarTabla(){
        
         
     Titulo();
     
       model.setRowCount(0);
       Tabla.setModel(model);
       
      
        try{
            
        
        resultado = Conexion.consulta("Select * from [dbo].[DetalleCompraV] where ID_Compra = "+ID_Compra);


     
       while (resultado.next())
       {     
              Object [] Datos = new Object [16]; 

              
              Datos [0]= String.valueOf(resultado.getInt(1));
              
              resultado.getInt(2);
              Datos [1]= resultado.getString(3);
              Datos [2]= resultado.getString(4);
              Datos [3]= resultado.getString(5).trim()+" "+resultado.getString(6).trim()+" x"+
                         resultado.getString(7).trim()+" "+resultado.getString(8).trim()+" "+
                         resultado.getString(9).trim();
              
            DateFormat Format = new SimpleDateFormat("MMMMM-yyyy", Locale.getDefault());
              
              Date A = resultado.getDate(10);
              String FechaVence = Format.format(A);
              
              Datos [4]= FechaVence;
              Datos [5]= String.valueOf(resultado.getInt(11));
              Datos [6]= String.valueOf(resultado.getDouble(12));
              Datos [7]= String.valueOf(resultado.getDouble(13));
              Datos [8]= String.valueOf(resultado.getString(14));
              Datos [9]= String.valueOf(resultado.getDouble(15));
              Datos [10]= String.valueOf(resultado.getString(16));
              Datos [11]= String.valueOf(resultado.getString(17));
              Datos [12]= String.valueOf(resultado.getDouble(18));
              Datos [13]= String.valueOf(resultado.getString(19));
              Datos [14]= String.valueOf(resultado.getInt(20));
              Datos [15]= String.valueOf(resultado.getString(21));
              
              
              model.addRow(Datos);  
   
    }
       
       Tabla.setModel(model);
    
   
 

        
    }   catch (SQLException ex) {
      JOptionPane.showMessageDialog(null,ex.getMessage()); 
    }
        
          
    }
   
   public void Buscar(){
       
       Titulo();
       
        int index = cmbbusc.getSelectedIndex()+1;

        switch(index){

            case 1:

            try{
                model.setRowCount(0);
                String Buscar = txtbusc.getText();
                resultado = Conexion.consulta("Select * from  [dbo].[DetalleCompraV] where "
                        + "[Nombre_Producto]+' '+[Tipo_Medicamento]+' x'+CAST([UnidsXCaja] AS varchar)+' '"
                        + "+[Contenido] like '%"+Buscar+"%'");

                while (resultado.next())
                {
             
         Object [] Datos = new Object [16]; 

              
              Datos [0]= String.valueOf(resultado.getInt(1));
              
              resultado.getInt(2);
              Datos [1]= resultado.getString(3);
              Datos [2]= resultado.getString(4);
              Datos [3]= resultado.getString(5).trim()+" "+resultado.getString(6).trim()+" x"+
                         resultado.getString(7).trim()+" "+resultado.getString(8).trim()+" "+
                         resultado.getString(9).trim();
              
            DateFormat Format = new SimpleDateFormat("MMMMM-yyyy", Locale.getDefault());
              
              Date A = resultado.getDate(10);
              String FechaVence = Format.format(A);
              
              Datos [4]= FechaVence;
              Datos [5]= String.valueOf(resultado.getInt(11));
              Datos [6]= String.valueOf(resultado.getDouble(12));
              Datos [7]= String.valueOf(resultado.getDouble(13));
              Datos [8]= String.valueOf(resultado.getString(14));
              Datos [9]= String.valueOf(resultado.getDouble(15));
              Datos [10]= String.valueOf(resultado.getString(16));
              Datos [11]= String.valueOf(resultado.getString(17));
              Datos [12]= String.valueOf(resultado.getDouble(18));
              Datos [13]= String.valueOf(resultado.getString(19));
              Datos [14]= String.valueOf(resultado.getInt(20));
              Datos [15]= String.valueOf(resultado.getString(21));
              
              
              model.addRow(Datos);  
                    
          
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No Encontrado");
            }

            break;

                    case 2:

            try{
                model.setRowCount(0);
                String Buscar = txtbusc.getText();
                resultado = Conexion.consulta("Select * from [dbo].[DetalleCompraV] where [Nombre_Proveedor] like '%"+Buscar+"%'");

                while (resultado.next())
                {
             
                     
              Object [] Datos = new Object [16]; 

              
              Datos [0]= String.valueOf(resultado.getInt(1));
              
              resultado.getInt(2);
              Datos [1]= resultado.getString(3);
              Datos [2]= resultado.getString(4);
              Datos [3]= resultado.getString(5).trim()+" "+resultado.getString(6).trim()+" x"+
                         resultado.getString(7).trim()+" "+resultado.getString(8).trim()+" "+
                         resultado.getString(9).trim();
              
            DateFormat Format = new SimpleDateFormat("MMMMM-yyyy", Locale.getDefault());
              
              Date A = resultado.getDate(10);
              String FechaVence = Format.format(A);
              
              Datos [4]= FechaVence;
              Datos [5]= String.valueOf(resultado.getInt(11));
              Datos [6]= String.valueOf(resultado.getDouble(12));
              Datos [7]= String.valueOf(resultado.getDouble(13));
              Datos [8]= String.valueOf(resultado.getString(14));
              Datos [9]= String.valueOf(resultado.getDouble(15));
              Datos [10]= String.valueOf(resultado.getString(16));
              Datos [11]= String.valueOf(resultado.getString(17));
              Datos [12]= String.valueOf(resultado.getDouble(18));
              Datos [13]= String.valueOf(resultado.getString(19));
              Datos [14]= String.valueOf(resultado.getInt(20));
              Datos [15]= String.valueOf(resultado.getString(21));
              
               
          model.addRow(Datos);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No Encontrado");
            }

            break;
               
                        
              case 3:

            try{
                model.setRowCount(0);
                String Buscar = txtbusc.getText();
                resultado = Conexion.consulta("Select * from [dbo].[DetalleCompraV] where [Laboratorio] like '%"+Buscar+"%'");

                while (resultado.next())
                {
             
                    
       Object [] Datos = new Object [16]; 

              
              Datos [0]= String.valueOf(resultado.getInt(1));
              
              resultado.getInt(2);
              Datos [1]= resultado.getString(3);
              Datos [2]= resultado.getString(4);
              Datos [3]= resultado.getString(5).trim()+" "+resultado.getString(6).trim()+" x"+
                         resultado.getString(7).trim()+" "+resultado.getString(8).trim()+" "+
                         resultado.getString(9).trim();
              
            DateFormat Format = new SimpleDateFormat("MMMMM-yyyy", Locale.getDefault());
              
              Date A = resultado.getDate(10);
              String FechaVence = Format.format(A);
              
              Datos [4]= FechaVence;
              Datos [5]= String.valueOf(resultado.getInt(11));
              Datos [6]= String.valueOf(resultado.getDouble(12));
              Datos [7]= String.valueOf(resultado.getDouble(13));
              Datos [8]= String.valueOf(resultado.getString(14));
              Datos [9]= String.valueOf(resultado.getDouble(15));
              Datos [10]= String.valueOf(resultado.getString(16));
              Datos [11]= String.valueOf(resultado.getString(17));
              Datos [12]= String.valueOf(resultado.getDouble(18));
              Datos [13]= String.valueOf(resultado.getString(19));
              Datos [14]= String.valueOf(resultado.getInt(20));
              Datos [15]= String.valueOf(resultado.getString(21));
              
               
          model.addRow(Datos);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No Encontrado");
            }

            break;
               
                   case 4:

            try{
                model.setRowCount(0);
                String Buscar = txtbusc.getText();
                resultado = Conexion.consulta("Select * from [dbo].[DetalleCompraV] where [Estado_DetCompra] like '%"+Buscar+"%'");

                while (resultado.next())
                {
             
                    
           Object [] Datos = new Object [16]; 

              
              Datos [0]= String.valueOf(resultado.getInt(1));
              
              resultado.getInt(2);
              Datos [1]= resultado.getString(3);
              Datos [2]= resultado.getString(4);
              Datos [3]= resultado.getString(5).trim()+" "+resultado.getString(6).trim()+" x"+
                         resultado.getString(7).trim()+" "+resultado.getString(8).trim()+" "+
                         resultado.getString(9).trim();
              
            DateFormat Format = new SimpleDateFormat("MMMMM-yyyy", Locale.getDefault());
              
              Date A = resultado.getDate(10);
              String FechaVence = Format.format(A);
              
              Datos [4]= FechaVence;
              Datos [5]= String.valueOf(resultado.getInt(11));
              Datos [6]= String.valueOf(resultado.getDouble(12));
              Datos [7]= String.valueOf(resultado.getDouble(13));
              Datos [8]= String.valueOf(resultado.getString(14));
              Datos [9]= String.valueOf(resultado.getDouble(15));
              Datos [10]= String.valueOf(resultado.getString(16));
              Datos [11]= String.valueOf(resultado.getString(17));
              Datos [12]= String.valueOf(resultado.getDouble(18));
              Datos [13]= String.valueOf(resultado.getString(19));
              Datos [14]= String.valueOf(resultado.getInt(20));
              Datos [15]= String.valueOf(resultado.getString(21));
              
              
              model.addRow(Datos);  
                    
          
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No Encontrado");
            }

            break;

            default:

            break;

          
        
        }
        Tabla.setModel(model);
                
   }

   public void ActivarBotones(){
   
 
    }
    
   
 
  
  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            PanelEffect2.setEffect(new Shape(1000));
            PanelEffect2.startEffect();
            
          
        ActualizarTabla();
        
        txtbusc.requestFocus();
            


// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TablaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TablaFocusGained

        ActivarBotones();    // TODO add your handling code here:
    }//GEN-LAST:event_TablaFocusGained

    private void TablaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TablaFocusLost

        ActivarBotones();
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaFocusLost

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked

        ActivarBotones();
           
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaMouseClicked

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed

        ActivarBotones();  // TODO add your handling code here:
    }//GEN-LAST:event_TablaMousePressed

    private void btnshowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowallActionPerformed

        ActualizarTabla();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshowallActionPerformed

    private void btncancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel3ActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btncancel3ActionPerformed

    private void TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneStateChanged

        int index = TabbedPane.getSelectedIndex();
      
        if(index==1){

            PanelEffect2.setEffect(new Shape(1000));
            PanelEffect2.startEffect();
            txtbusc.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_TabbedPaneStateChanged

    private void txtbuscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscKeyReleased
Buscar();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscKeyReleased

    
     
    
    DefaultTableModel model = new DefaultTableModel() {

        
        
    Class[] types = new Class [] {
  
        java.lang.String.class, java.lang.String.class, java.lang.String.class, 
        java.lang.String.class, java.lang.String.class, java.lang.String.class, 
        java.lang.String.class, java.lang.String.class, java.lang.String.class, 
        java.lang.String.class, java.lang.String.class, java.lang.String.class, 
        java.lang.String.class, java.lang.String.class, java.lang.String.class, 
        java.lang.String.class
    };
 

    @Override
    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

  

    @Override
    public boolean isCellEditable(int row, int column) {
    
    
            return false;
    
       //all cells false
    
    }
};
    
    
    
    
     public class FormatoTabla extends DefaultTableCellRenderer
{
 @Override
 public Component getTableCellRendererComponent
 (JTable table, Object value, boolean selected, boolean focused, int row, int column)
 {
         
  if(String.valueOf(table.getValueAt(row,15)).equalsIgnoreCase("Inactivo"))  {
      setForeground(Color.RED);
  }
   else { setForeground(Color.BLACK);
   }
  
//   if(String.valueOf(table.getValueAt(row,9)).equalsIgnoreCase("Si"))  {
//      setForeground(Color.GREEN);
//  }
                  
    
 super.getTableCellRendererComponent(table, value, selected, focused, row, column);
 return this;
 }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDetalleCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarDetalleCompra dialog = new BuscarDetalleCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelVer;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader TabbedPane;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btncancel3;
    private javax.swing.JButton btnshowall;
    private javax.swing.JComboBox cmbbusc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtbusc;
    // End of variables declaration//GEN-END:variables
}