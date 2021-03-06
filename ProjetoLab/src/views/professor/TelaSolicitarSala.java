/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.professor;

import java.sql.*;
import classes.*;
import java.util.ArrayList;
import conexao.Conecta;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.Inserir;
import repositorio.pilha.Pilha;
import views.ti.TelaCadastro;

/**
 *
 * @author igor_
 */
public class TelaSolicitarSala extends javax.swing.JFrame {

    /**
     * Creates new form TelaSolicitarSala
     */
    Conecta con = new Conecta();
    Connection conexao = con.Conecta();
    Professor p;
    

    public TelaSolicitarSala() {
        initComponents();
     //codigoSala();
             txtQuantitativoDias.setVisible(false);
        campoNumeroDias.setVisible(false);
        txtDiasSemanais.setVisible(false);
        comoBoxdia.setVisible(false);
        
        
         Pilha pilha = new Pilha();
         p = pilha.tirarProfessor();;
         pilha.professorPilha(p);
         codigoEquipamento();
            
      
    }

    public void codigoEquipamento(){
    
        
         ArrayList  listaID = new ArrayList();
        
       
    
      
          
          String  sql = "SELECT * FROM EQUIPAMENTOS";  
      
    
           
           
     try {
        PreparedStatement Estmt = conexao.prepareStatement(sql);
         
          ResultSet Erst = Estmt.executeQuery();
            System.out.println(Erst);
             int a = 0;
             
             while(Erst.next()){
               listaID.add(Erst.getString(2));
             if(Erst.getBoolean("status")){
                    
                   
                    //System.out.println("id professor: "+listaIDC.size());
               
                    
                  System.out.println(listaID.get(a));  
                comboboxEquipamentos.addItem((String)listaID.get(a));
                
                 
             }
              a++;
             }
          
     } catch (SQLException ex) {
         Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }
    
    
    public void codigoSala(int quantidade) {
        comboBoxSala.removeAllItems();
        ArrayList listaCod = new ArrayList();
        ArrayList listaId = new ArrayList();

        String sql = "SELECT * FROM SALA";
        String query = "SELECT * FROM LOCAL";
        try {
            PreparedStatement Cstmt = conexao.prepareStatement(sql);
            ResultSet Corst = Cstmt.executeQuery();
            
             
            PreparedStatement Lstmt = conexao.prepareStatement(query);
            ResultSet Lrst  = Lstmt.executeQuery();;
           
            System.out.println(Lrst);
            
            int i = 0;
            int c= 0;
            while (Corst.next() && Lrst.next()) {
                listaId.add(Corst.getInt(5));
                listaCod.add(Lrst.getString("codigo"));
                if (Corst.getBoolean("status")) {

                    //System.out.println("id professor: "+listaIDC.size());
                    System.out.println("id:" + listaId.get(i));
                  
                    
                    
                  
                        if (Corst.getInt(5) == Lrst.getInt("idlocal") && Corst.getInt("capacidade_aluno")>= quantidade && !Corst.getBoolean("locada")) {
                            
                            System.out.println("codigo:" + listaCod.get(i));
                             comboBoxSala.addItem((String)listaCod.get(i));
                        }
                       

                   
                }
                i++;
            }

        } catch (SQLException ex) {
          Logger.getLogger(TelaSolicitarSala.class.getName()).log(Level.SEVERE, null, ex);  
          
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoHoraInicio = new javax.swing.JFormattedTextField();
        campoHoraFIm = new javax.swing.JFormattedTextField();
        txtInicio = new javax.swing.JLabel();
        txtHoraFim = new javax.swing.JLabel();
        txtDia = new javax.swing.JLabel();
        campoDia = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        checkBoxTemporada = new javax.swing.JCheckBox();
        txtSala = new javax.swing.JLabel();
        comboBoxSala = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JLabel();
        quantidadeAlunos = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        campoNumeroDias = new javax.swing.JTextField();
        txtQuantitativoDias = new javax.swing.JLabel();
        txtDiasSemanais = new javax.swing.JLabel();
        comoBoxdia = new javax.swing.JComboBox<>();
        botaoSolicitar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboboxEquipamentos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconleft.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 40, 90, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Solicitar sala");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 30, 410, 70);

        try {
            campoHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHoraInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoHoraInicio.setText(": ");
        campoHoraInicio.setToolTipText("");
        campoHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraInicioActionPerformed(evt);
            }
        });
        getContentPane().add(campoHoraInicio);
        campoHoraInicio.setBounds(660, 380, 50, 40);

        try {
            campoHoraFIm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ## :##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHoraFIm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoHoraFIm.setText(":");
        campoHoraFIm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraFImActionPerformed(evt);
            }
        });
        getContentPane().add(campoHoraFIm);
        campoHoraFIm.setBounds(800, 380, 50, 40);

        txtInicio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtInicio.setText("Inicio:");
        getContentPane().add(txtInicio);
        txtInicio.setBounds(590, 380, 70, 40);

        txtHoraFim.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtHoraFim.setText("Final:");
        getContentPane().add(txtHoraFim);
        txtHoraFim.setBounds(730, 390, 70, 20);

        txtDia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDia.setText("Dia:");
        getContentPane().add(txtDia);
        txtDia.setBounds(590, 450, 60, 30);

        try {
            campoDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDia.setText("//");
        campoDia.setToolTipText("");
        campoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDiaActionPerformed(evt);
            }
        });
        getContentPane().add(campoDia);
        campoDia.setBounds(650, 450, 200, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("Temporada:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 300, 130, 30);

        checkBoxTemporada.setContentAreaFilled(false);
        checkBoxTemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTemporadaActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxTemporada);
        checkBoxTemporada.setBounds(730, 310, 21, 20);

        txtSala.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSala.setText("Sala:");
        getContentPane().add(txtSala);
        txtSala.setBounds(590, 230, 60, 40);

        getContentPane().add(comboBoxSala);
        comboBoxSala.setBounds(660, 240, 190, 30);

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuantidade.setText("Nº Alunos:");
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(590, 180, 120, 29);

        try {
            quantidadeAlunos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        quantidadeAlunos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(quantidadeAlunos);
        quantidadeAlunos.setBounds(720, 180, 90, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPesquisar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(820, 180, 32, 32);
        getContentPane().add(campoNumeroDias);
        campoNumeroDias.setBounds(680, 510, 59, 30);

        txtQuantitativoDias.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtQuantitativoDias.setText("Nº dias:");
        getContentPane().add(txtQuantitativoDias);
        txtQuantitativoDias.setBounds(590, 510, 90, 30);

        txtDiasSemanais.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDiasSemanais.setText("Dia:");
        getContentPane().add(txtDiasSemanais);
        txtDiasSemanais.setBounds(590, 560, 50, 30);

        comoBoxdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda", "Terça", "Quarta", "Quinta", "Sexta" }));
        getContentPane().add(comoBoxdia);
        comoBoxdia.setBounds(650, 560, 200, 30);

        botaoSolicitar.setText("Solicitar");
        botaoSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSolicitarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSolicitar);
        botaoSolicitar.setBounds(650, 620, 160, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone sala de aula.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 250, 250, 270);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("Equipamentos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1020, 170, 170, 40);

        comboboxEquipamentos.setToolTipText("");
        comboboxEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxEquipamentosActionPerformed(evt);
            }
        });
        getContentPane().add(comboboxEquipamentos);
        comboboxEquipamentos.setBounds(1020, 240, 210, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setText("Quantidade:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1020, 310, 140, 30);

        try {
            campoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(campoQuantidade);
        campoQuantidade.setBounds(1180, 310, 50, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaLimpa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -2, 1366, 770);

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoHoraFImActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraFImActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraFImActionPerformed

    private void campoHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraInicioActionPerformed

    private void campoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDiaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        codigoSala(Integer.parseInt(quantidadeAlunos.getText()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkBoxTemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTemporadaActionPerformed
        // TODO add your handling code here:
        
        if(checkBoxTemporada.isSelected()){
        txtQuantitativoDias.setVisible(true);
        campoNumeroDias.setVisible(true);
        txtDiasSemanais.setVisible(true);
        comoBoxdia.setVisible(true);
        
        }
        if(checkBoxTemporada.isSelected()==false){
        
            txtQuantitativoDias.setVisible(false);
        campoNumeroDias.setVisible(false);
        txtDiasSemanais.setVisible(false);
        comoBoxdia.setVisible(false);
            
        }
        
    }//GEN-LAST:event_checkBoxTemporadaActionPerformed

    private void botaoSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSolicitarActionPerformed
        // TODO add your handling code here:
        int sala =0;
        java.sql.Date date=  null;
        java.util.Date data = null;
        int idagenda = 0;
        int idequipamento= 0;
        int quantidade = Integer.parseInt(campoQuantidade.getText());
        //----------------------- select sala------------------//
        String codigo = (String)comboBoxSala.getSelectedItem();
        String sql = "SELECT * FROM LOCAL WHERE CODIGO ='"+codigo+"'";
         PreparedStatement Istmt;
         PreparedStatement Sstmt;
         ResultSet Irst;
        try {
            Sstmt = conexao.prepareStatement(sql);
            ResultSet Srst = Sstmt.executeQuery();
        while(Srst.next()){
        String query = "SELECT * FROM SALA WHERE LOCAL_IDLOCAL ='"+Srst.getInt(1)+"'";
        Istmt = conexao.prepareStatement(query);
        Irst = Istmt.executeQuery();
        
        while(Irst.next()){
         sala = Irst.getInt(1);
           
        }
            
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaSolicitarSala.class.getName()).log(Level.SEVERE, null, ex);
        }
             //----------------------- fim select sala-------------------//
        
        
        
       //---------------------------- Conversor de data -----------------//
        try {
           // é os espaços no campo dia retirar
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            data = formatter.parse(campoDia.getText());
            
            
             
              date = new java.sql.Date(data.getTime());
             
        } catch (ParseException ex) {
            Logger.getLogger(TelaSolicitarSala.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //------------------------ fim conversor ------------------------//
        
        String horario = campoHoraInicio.getText()+" As: "+ campoHoraFIm.getText();
        
        if(checkBoxTemporada.isSelected()){
        
        int Ndia = Integer.parseInt(campoNumeroDias.getText());
        String Dia = (String)comoBoxdia.getSelectedItem();
        
   
        Agenda ag = new Agenda(Dia,horario,Ndia,true);
        idagenda = Inserir.inserirAgenda(ag, conexao);
        //String horario, Date dia, boolean autorizacao, int agenda_idagenda, int coordenador_idcoordenador,int professor_idprofessor, int sala_idsala,boolean status
        }
        LocaSala ls = new LocaSala(horario,date,false,idagenda,p.getCoordenador_idcoordenador(),p.getIdprofessor(),sala,true);
        
        
        int idloca_sala = Inserir.inserirLocaSala(ls, conexao);
        
          
       
       
       
       //---------------- equipamentos--------------//
       
       
       
        String nome = (String)comboboxEquipamentos.getSelectedItem();
        String eqp = "SELECT * FROM EQUIPAMENTOS WHERE NOME ='"+nome+"'";
         PreparedStatement Estmt;
         ResultSet Erst;
         
        try {
            Estmt = conexao.prepareStatement(eqp);
            Erst = Estmt.executeQuery();
        while(Erst.next()){
       idequipamento = Erst.getInt(1);
        
            
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaSolicitarSala.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // ---------------------------------------------//
        
        
        if(idequipamento != 0 ){    
    Solicitacao solicitaçao = new Solicitacao(date,1,horario,22,p.getIdprofessor(),sala,true);
        
       System.out.println(idloca_sala);
      
    //Date data_solicitacao, int depatarmento_iddepartamento, String horario, int numero_protocolo, int professor_idprofessor, int sala_idsala,boolean status
   int idsolicitacao = Inserir.inserirSolicitacao(solicitaçao, conexao);
   
   
   equipamentos_solicitados es = new equipamentos_solicitados(idequipamento,quantidade,idsolicitacao,true);
   Inserir.inserirEquipamentos_solicitados(es, conexao);
   //int equipamentos_idequipamentos, int quantidade, int solicitacao_idsolicitacao,boolean status
    }
        
        
        
    }//GEN-LAST:event_botaoSolicitarActionPerformed

    private void comboboxEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxEquipamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxEquipamentosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSolicitarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSolicitarSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSolicitar;
    public static javax.swing.JFormattedTextField campoDia;
    public static javax.swing.JFormattedTextField campoHoraFIm;
    public static javax.swing.JFormattedTextField campoHoraInicio;
    private javax.swing.JTextField campoNumeroDias;
    public static javax.swing.JFormattedTextField campoQuantidade;
    public static javax.swing.JCheckBox checkBoxTemporada;
    public static javax.swing.JComboBox<String> comboBoxSala;
    public static javax.swing.JComboBox<String> comboboxEquipamentos;
    public static javax.swing.JComboBox<String> comoBoxdia;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField quantidadeAlunos;
    public static javax.swing.JLabel txtDia;
    public static javax.swing.JLabel txtDiasSemanais;
    public static javax.swing.JLabel txtHoraFim;
    public static javax.swing.JLabel txtInicio;
    private javax.swing.JLabel txtQuantidade;
    public static javax.swing.JLabel txtQuantitativoDias;
    public static javax.swing.JLabel txtSala;
    // End of variables declaration//GEN-END:variables
}
