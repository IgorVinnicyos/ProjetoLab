/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.ti;

import classes.Acesso;
import classes.Coordenador;
import classes.Disciplina;
import classes.Professor;
import conexao.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import repositorio.Inserir;

/**
 *
 * @author igor_
 */
public class TelaCadastro extends javax.swing.JFrame {
  Conecta con = new Conecta();
        Connection conexao;
    static int Professor ;
   static  boolean  visivel;
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        conexao = con.Conecta();
        
       txtDisciplina.setVisible(visivel);
       txtFormacao.setVisible(visivel);
       campoFormacao.setVisible(visivel);
        campoDisciplina.setVisible(visivel);

         comboBoxCoordenador.setVisible(false);
         comboBoxProfessor.setVisible(false);
         ComboBoxFuncionario.setVisible(false);
        
         txtCoordenadorAcesso.setVisible(false);
         txtProfessorAcesso.setVisible(false);
         txtFuncionarioAcesso.setVisible(false);
      
        visivelCadastroCoordenador(false);
     visivelCadastroAcesso(false);
        
   procuraIdProfessor();
   
   procuraIdCoordenador();
   
   procuraIdFuncionario();
        
        
        
          
    }
    public void procuraIdFuncionario(){
    
        
         ArrayList  listaIDA = new ArrayList();
        
       
    
      
          
          String  sql = "SELECT * FROM FUNCIONARIO";  
      
    
           
           
     try {
        PreparedStatement Cstmt = conexao.prepareStatement(sql);
         
          ResultSet Corst = Cstmt.executeQuery();
            System.out.println(Corst);
             int a = 0;
             
             while(Corst.next()){
               listaIDA.add(Corst.getInt("idfuncionario"));
             if(Corst.getBoolean("status")){
                    
                   
                    //System.out.println("id professor: "+listaIDC.size());
               
                    
                  System.out.println(listaIDA.get(a));  
                ComboBoxFuncionario.addItem(Integer.toString((int)listaIDA.get(a)));
                
                 
             }
              a++;
             }
          
     } catch (SQLException ex) {
         Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
     }
    
        
        
        
        
    }
    
    public void procuraIdCoordenador(){
    
    ArrayList  listaIDC = new ArrayList();
        
       
    
      
          
          String  sql = "SELECT * FROM COORDENADOR";  
      
    
           
           
     try {
        PreparedStatement Cstmt = conexao.prepareStatement(sql);
         
          ResultSet Corst = Cstmt.executeQuery();
            System.out.println(Corst);
             int c = 0;
             
             while(Corst.next()){
               listaIDC.add(Corst.getInt("idcoordenador"));
             if(Corst.getBoolean("status")){
                    
                   
                    //System.out.println("id professor: "+listaIDC.size());
               
                    
                  System.out.println(listaIDC.get(c));  
                comboBoxCoordenador.addItem(Integer.toString((int)listaIDC.get(c)));
                 
             }
              c++;
             }
          
     } catch (SQLException ex) {
         Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }
    
    public void procuraIdProfessor(){
    
          
        ArrayList  listaID = new ArrayList();
        
       
    
      
          
          String  sql = "SELECT * FROM PROFESSOR";  
      
    
           
           
     try {
        PreparedStatement stmt = conexao.prepareStatement(sql);
         
          ResultSet Crst = stmt.executeQuery();
            System.out.println(Crst);
             int i = 0;
             while(Crst.next()){
                  listaID.add(Crst.getInt("idprofessor"));
             if(Crst.getBoolean("status")){
                    
                
                    //System.out.println("id professor: "+listaID.size());
               
                    
                  System.out.println(listaID.get(i));  
                 comboBoxProfessor.addItem(Integer.toString((int)listaID.get(i)));
                 
             }
              i++;
             }
          
     } catch (SQLException ex) {
         Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    
    
    
    }
    
   
       public static void visivelCadastroCoordenador(boolean b){
      //campos
      campoNome.setVisible(b);
      campoSalario.setVisible(b);
      ComboBoxTurno.setVisible(b);
      CheckBoxProfessor.setVisible(b);
      buttonCadastrar.setVisible(b);
        
      
      txtNome.setVisible(b);
      txtSalario.setVisible(b);
      txtTurno.setVisible(b);
      txtProfessor.setVisible(b);
      imgCoordenador.setVisible(b);
       
      tipoAcessoProfessor.setSelected(false);
       tipoAcessoFuncionario.setSelected(false);
        tipoAcessoCoordenador.setSelected(false);
        
        comboBoxCoordenador.setVisible(false);
         comboBoxProfessor.setVisible(false);
         ComboBoxFuncionario.setVisible(false);
        
         txtCoordenadorAcesso.setVisible(false);
         txtProfessorAcesso.setVisible(false);
         txtFuncionarioAcesso.setVisible(false);
      
           if(b == true){
       titulo.setText("Cadastro coordenador");
       
       }
      
      }
       public static void visivelCadastroAcesso(boolean b){
        //campos
       campoLogin.setVisible(b);
       campoSenha.setVisible(b);
       tipoAcessoCoordenador.setVisible(b);
       tipoAcessoProfessor.setVisible(b);
       tipoAcessoFuncionario.setVisible(b);
       imgAcesso.setVisible(b);
       
       if(b == true){
       titulo.setText("Cadastro acesso");
       
       }
       
   //comboBoxProfessor.setVisible(b);
    
       ButtonCadastrarAcesso.setVisible(b);
       
       //nomes
       
       txtLogin.setVisible(b);
       txtSenha.setVisible(b);
     //  txtCoordenadorAcesso.setVisible(b);
      // txtProfessorAcesso.setVisible(b);
      // txtFuncionarioAcesso.setVisible(b);
       CheckBoxProfessor.setSelected(false);
      
       
          
        txtDisciplina.setVisible(false);
        txtFormacao.setVisible(false);
       campoFormacao.setVisible(false);
       campoDisciplina.setVisible(false);
       
      
      
       
       }
 
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoCadastro = new javax.swing.ButtonGroup();
        tipoAcesso = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        tipoCadastro = new javax.swing.JLabel();
        RadioCoordenador = new javax.swing.JRadioButton();
        RadioAcesso = new javax.swing.JRadioButton();
        txtLogin = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JLabel();
        comboBoxProfessor = new javax.swing.JComboBox<>();
        txtProfessorAcesso = new javax.swing.JLabel();
        comboBoxCoordenador = new javax.swing.JComboBox<>();
        txtCoordenadorAcesso = new javax.swing.JLabel();
        txtFuncionarioAcesso = new javax.swing.JLabel();
        ComboBoxFuncionario = new javax.swing.JComboBox<>();
        ButtonCadastrarAcesso = new javax.swing.JButton();
        tipoAcessoProfessor = new javax.swing.JRadioButton();
        tipoAcessoCoordenador = new javax.swing.JRadioButton();
        tipoAcessoFuncionario = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        txtTurno = new javax.swing.JLabel();
        ComboBoxTurno = new javax.swing.JComboBox<>();
        campoSalario = new javax.swing.JTextField();
        txtSalario = new javax.swing.JLabel();
        txtProfessor = new javax.swing.JLabel();
        CheckBoxProfessor = new javax.swing.JCheckBox();
        campoDisciplina = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        imgCoordenador = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JLabel();
        campoFormacao = new javax.swing.JTextField();
        imgAcesso = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1366, 710));
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
        jButton1.setBounds(30, 30, 100, 60);

        tipoCadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tipoCadastro.setText("Tipo de cadastro:");
        getContentPane().add(tipoCadastro);
        tipoCadastro.setBounds(140, 210, 190, 30);

        grupoTipoCadastro.add(RadioCoordenador);
        RadioCoordenador.setText("Coordenador");
        RadioCoordenador.setContentAreaFilled(false);
        RadioCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCoordenadorActionPerformed(evt);
            }
        });
        getContentPane().add(RadioCoordenador);
        RadioCoordenador.setBounds(340, 220, 100, 23);

        grupoTipoCadastro.add(RadioAcesso);
        RadioAcesso.setText("Acesso");
        RadioAcesso.setContentAreaFilled(false);
        RadioAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(RadioAcesso);
        RadioAcesso.setBounds(450, 220, 80, 23);

        txtLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtLogin.setText("Login:");
        getContentPane().add(txtLogin);
        txtLogin.setBounds(570, 210, 70, 30);
        getContentPane().add(campoLogin);
        campoLogin.setBounds(570, 260, 320, 30);
        getContentPane().add(campoSenha);
        campoSenha.setBounds(570, 370, 320, 30);

        txtSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSenha.setText("Senha:");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(570, 330, 80, 30);

        comboBoxProfessor.setEditable(true);
        comboBoxProfessor.setMaximumRowCount(1000000);
        comboBoxProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxProfessor);
        comboBoxProfessor.setBounds(740, 530, 150, 30);

        txtProfessorAcesso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtProfessorAcesso.setText("Professor:");
        getContentPane().add(txtProfessorAcesso);
        txtProfessorAcesso.setBounds(570, 530, 110, 30);

        comboBoxCoordenador.setEditable(true);
        comboBoxCoordenador.setMaximumRowCount(1000000);
        comboBoxCoordenador.setToolTipText("");
        comboBoxCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCoordenadorActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxCoordenador);
        comboBoxCoordenador.setBounds(740, 530, 150, 30);

        txtCoordenadorAcesso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtCoordenadorAcesso.setText("Coordenador:");
        getContentPane().add(txtCoordenadorAcesso);
        txtCoordenadorAcesso.setBounds(570, 530, 150, 30);

        txtFuncionarioAcesso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtFuncionarioAcesso.setText("Funcionario:");
        getContentPane().add(txtFuncionarioAcesso);
        txtFuncionarioAcesso.setBounds(570, 530, 140, 30);

        ComboBoxFuncionario.setEditable(true);
        ComboBoxFuncionario.setMaximumRowCount(1000000);
        ComboBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxFuncionario);
        ComboBoxFuncionario.setBounds(740, 530, 150, 30);

        ButtonCadastrarAcesso.setText("Cadastrar");
        ButtonCadastrarAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCadastrarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCadastrarAcesso);
        ButtonCadastrarAcesso.setBounds(680, 620, 160, 30);

        tipoAcesso.add(tipoAcessoProfessor);
        tipoAcessoProfessor.setText("Professor");
        tipoAcessoProfessor.setContentAreaFilled(false);
        tipoAcessoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAcessoProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(tipoAcessoProfessor);
        tipoAcessoProfessor.setBounds(570, 420, 90, 23);

        tipoAcesso.add(tipoAcessoCoordenador);
        tipoAcessoCoordenador.setText("Coordenador");
        tipoAcessoCoordenador.setContentAreaFilled(false);
        tipoAcessoCoordenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAcessoCoordenadorActionPerformed(evt);
            }
        });
        getContentPane().add(tipoAcessoCoordenador);
        tipoAcessoCoordenador.setBounds(690, 420, 100, 23);

        tipoAcesso.add(tipoAcessoFuncionario);
        tipoAcessoFuncionario.setText("Funcionario");
        tipoAcessoFuncionario.setContentAreaFilled(false);
        tipoAcessoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoAcessoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(tipoAcessoFuncionario);
        tipoAcessoFuncionario.setBounds(820, 420, 100, 23);

        txtNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtNome.setText("Nome:");
        getContentPane().add(txtNome);
        txtNome.setBounds(580, 210, 90, 40);

        campoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(campoNome);
        campoNome.setBounds(580, 260, 320, 30);

        txtTurno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTurno.setText("Turno:");
        getContentPane().add(txtTurno);
        txtTurno.setBounds(580, 320, 80, 29);

        ComboBoxTurno.setEditable(true);
        ComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Diurno", "Noturno", "Integral" }));
        ComboBoxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxTurno);
        ComboBoxTurno.setBounds(670, 320, 230, 30);
        getContentPane().add(campoSalario);
        campoSalario.setBounds(670, 410, 90, 30);

        txtSalario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSalario.setText("Salário:");
        getContentPane().add(txtSalario);
        txtSalario.setBounds(580, 410, 81, 30);

        txtProfessor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtProfessor.setText("Professor:");
        getContentPane().add(txtProfessor);
        txtProfessor.setBounds(770, 410, 109, 30);

        CheckBoxProfessor.setContentAreaFilled(false);
        CheckBoxProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBoxProfessor);
        CheckBoxProfessor.setBounds(880, 410, 20, 30);

        campoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDisciplinaActionPerformed(evt);
            }
        });
        getContentPane().add(campoDisciplina);
        campoDisciplina.setBounds(710, 500, 190, 30);

        txtDisciplina.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtDisciplina.setText("Disciplina:");
        getContentPane().add(txtDisciplina);
        txtDisciplina.setBounds(580, 500, 110, 29);

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadastrar);
        buttonCadastrar.setBounds(680, 620, 160, 30);

        imgCoordenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconcoordenador.png"))); // NOI18N
        getContentPane().add(imgCoordenador);
        imgCoordenador.setBounds(190, 330, 210, 290);

        txtFormacao.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtFormacao.setText("Formação: ");
        getContentPane().add(txtFormacao);
        txtFormacao.setBounds(580, 560, 121, 30);
        getContentPane().add(campoFormacao);
        campoFormacao.setBounds(710, 560, 190, 30);

        imgAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAcesso.png"))); // NOI18N
        getContentPane().add(imgAcesso);
        imgAcesso.setBounds(200, 350, 260, 230);

        titulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(titulo);
        titulo.setBounds(490, 10, 530, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaLimpa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 750);

        setSize(new java.awt.Dimension(1382, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboBoxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTurnoActionPerformed

    private void CheckBoxProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxProfessorActionPerformed
        // TODO add your handling code here:
           
                   if(CheckBoxProfessor.isSelected()){
        
        txtDisciplina.setVisible(true);
        txtFormacao.setVisible(true);
        campoFormacao.setVisible(true);
       campoDisciplina.setVisible(true);
     this.visivel = true;
       //this.professor = true;
                   }
                   if(CheckBoxProfessor.isSelected()==false){
                   txtDisciplina.setVisible(false);
                   txtFormacao.setVisible(false);
       campoDisciplina.setVisible(false);
      campoFormacao.setVisible(false);
      // this.professor = false;
      
                   }
                   
    }//GEN-LAST:event_CheckBoxProfessorActionPerformed

    private void RadioAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAcessoActionPerformed
        // TODO add your handling code here:
        
        if(RadioAcesso.isSelected())
        {
            visivelCadastroCoordenador(false);
            visivelCadastroAcesso(true);
        
        }
    }//GEN-LAST:event_RadioAcessoActionPerformed

    private void RadioCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCoordenadorActionPerformed
        // TODO add your handling code here:
        if(RadioCoordenador.isSelected()){
            visivelCadastroCoordenador(true);
            visivelCadastroAcesso(false);
        }
        
             
        
    }//GEN-LAST:event_RadioCoordenadorActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
        
        boolean inserirDisciplina = false;
        
        boolean professor = false;
        String nome = campoNome.getText();
        String turno = (String)ComboBoxTurno.getSelectedItem();
        double salario = Double.parseDouble(campoSalario.getText());

        Coordenador c = new Coordenador(nome, turno, salario, professor,true);
       int idcoordenador =  Inserir.inserirCoordenador(c, conexao);
        
        if(CheckBoxProfessor.isSelected()){
         String formacao = campoFormacao.getText();
         String disciplina = campoDisciplina.getText();
        Professor p = new Professor(nome,turno,salario,formacao,idcoordenador,0,true);
        int idprofessor = Inserir.inserirProfessor(p, conexao);
        
        this.Professor = idprofessor;
        Disciplina d = new Disciplina(disciplina,idprofessor,true);
       int iddisciplina = Inserir.inserirDisciplina(d, conexao);
       // String disciplina, int professor_idprofessor,boolean status
        }
        RadioAcesso.setSelected(true);
        visivelCadastroAcesso(true);
        visivelCadastroCoordenador(false);
        
        comboBoxCoordenador.addItem(Integer.toString(idcoordenador));
        comboBoxCoordenador.setSelectedItem(Integer.toString(idcoordenador));
       System.out.println(idcoordenador);
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void campoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDisciplinaActionPerformed

    private void ButtonCadastrarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarAcessoActionPerformed
        // TODO add your handling code here:
        
        String login = campoLogin.getText();
        String senha = campoSenha.getText();
        
        if(tipoAcessoCoordenador.isSelected()){
        
        int idcoordenador = Integer.parseInt((String)comboBoxCoordenador.getSelectedItem());
        System.out.println("id:"+idcoordenador);
            Acesso a = new Acesso(idcoordenador, 0, login,this.Professor, senha, true);
      int idcoord =  Inserir.inseriraAcesso(a, conexao);
        }
        
        if(tipoAcessoFuncionario.isSelected()){
        
        int idfuncionario = Integer.parseInt((String)ComboBoxFuncionario.getSelectedItem());
        
         Acesso a = new Acesso(0, idfuncionario, login,0, senha, true);
          int idfunc =  Inserir.inseriraAcesso(a, conexao);
         
        }
        
        if(tipoAcessoProfessor.isSelected()){
        
        int idprofessor = Integer.parseInt((String)comboBoxProfessor.getSelectedItem());
        
         Acesso a = new Acesso(0, 0, login,idprofessor, senha, true);
          int idprof=  Inserir.inseriraAcesso(a, conexao);
        }
        
        if(tipoAcessoCoordenador.isSelected()==false && tipoAcessoFuncionario.isSelected()==false && tipoAcessoProfessor.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Selecione um tipo de Acesso");
        }
        this.dispose();
        
    }//GEN-LAST:event_ButtonCadastrarAcessoActionPerformed

    private void comboBoxProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProfessorActionPerformed
        // TODO add your handling code here:
   
           
      
        
    }//GEN-LAST:event_comboBoxProfessorActionPerformed

    private void comboBoxCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCoordenadorActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_comboBoxCoordenadorActionPerformed

    private void ComboBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFuncionarioActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ComboBoxFuncionarioActionPerformed

    private void tipoAcessoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAcessoProfessorActionPerformed
        // TODO add your handling code here:
        if(tipoAcessoProfessor.isSelected()){
         comboBoxProfessor.setVisible(true);
         comboBoxCoordenador.setVisible(false);
         ComboBoxFuncionario.setVisible(false);
         
            txtCoordenadorAcesso.setVisible(false);
         txtProfessorAcesso.setVisible(true);
         txtFuncionarioAcesso.setVisible(false);
        
        }
    }//GEN-LAST:event_tipoAcessoProfessorActionPerformed

    private void tipoAcessoCoordenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAcessoCoordenadorActionPerformed
        // TODO add your handling code here:
             if(tipoAcessoCoordenador.isSelected()){
         comboBoxCoordenador.setVisible(true);
         comboBoxProfessor.setVisible(false);
         ComboBoxFuncionario.setVisible(false);
        
         txtCoordenadorAcesso.setVisible(true);
         txtProfessorAcesso.setVisible(false);
         txtFuncionarioAcesso.setVisible(false);
        
        
        }
       
    }//GEN-LAST:event_tipoAcessoCoordenadorActionPerformed

    private void tipoAcessoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoAcessoFuncionarioActionPerformed
        // TODO add your handling code here:
         if(tipoAcessoFuncionario.isSelected()){
         ComboBoxFuncionario.setVisible(true);
        comboBoxCoordenador.setVisible(false);
         comboBoxProfessor.setVisible(false);
         
            txtCoordenadorAcesso.setVisible(false);
         txtProfessorAcesso.setVisible(false);
         txtFuncionarioAcesso.setVisible(true);
        
        }
    }//GEN-LAST:event_tipoAcessoFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
        
            }
        });
        
          
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ButtonCadastrarAcesso;
    public static javax.swing.JCheckBox CheckBoxProfessor;
    public static javax.swing.JComboBox<String> ComboBoxFuncionario;
    public static javax.swing.JComboBox<String> ComboBoxTurno;
    public static javax.swing.JRadioButton RadioAcesso;
    public static javax.swing.JRadioButton RadioCoordenador;
    public static javax.swing.JButton buttonCadastrar;
    public static javax.swing.JTextField campoDisciplina;
    public static javax.swing.JTextField campoFormacao;
    public static javax.swing.JTextField campoLogin;
    public static javax.swing.JTextField campoNome;
    public static javax.swing.JTextField campoSalario;
    public static javax.swing.JPasswordField campoSenha;
    public static javax.swing.JComboBox<String> comboBoxCoordenador;
    public static javax.swing.JComboBox<String> comboBoxProfessor;
    public static javax.swing.ButtonGroup grupoTipoCadastro;
    public static javax.swing.JLabel imgAcesso;
    public static javax.swing.JLabel imgCoordenador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.ButtonGroup tipoAcesso;
    public static javax.swing.JRadioButton tipoAcessoCoordenador;
    public static javax.swing.JRadioButton tipoAcessoFuncionario;
    public static javax.swing.JRadioButton tipoAcessoProfessor;
    private javax.swing.JLabel tipoCadastro;
    public static javax.swing.JLabel titulo;
    public static javax.swing.JLabel txtCoordenadorAcesso;
    public static javax.swing.JLabel txtDisciplina;
    public static javax.swing.JLabel txtFormacao;
    public static javax.swing.JLabel txtFuncionarioAcesso;
    public static javax.swing.JLabel txtLogin;
    public static javax.swing.JLabel txtNome;
    public static javax.swing.JLabel txtProfessor;
    public static javax.swing.JLabel txtProfessorAcesso;
    public static javax.swing.JLabel txtSalario;
    public static javax.swing.JLabel txtSenha;
    public static javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
