package planner.view;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planner.controller.ControllerCompromisso;
import planner.model.Compromisso;

public class TelaAtividades extends javax.swing.JFrame {

   private int codUsuarioLogado;    
   public TelaAtividades(int codUsuarioLogado) {
        initComponents();
        this.codUsuarioLogado = codUsuarioLogado;
    }
    private TelaAtividades() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAtividades = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon(getClass().getResource("/planner/icons/pagina.jpg"));
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCompromisso = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atividades");
        setIconImage(new ImageIcon(getClass().getResource("/planner/icons/planner.png")).getImage());
        setResizable(false);

        jTableCompromisso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableCompromisso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "Descricao"
            }
        ));
        jScrollPane1.setViewportView(jTableCompromisso);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("HORÁRIO: ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("COMPROMISSO: ");

        jTextFieldDescricao.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldDescricao.setToolTipText("Informe o compromisso ");

        btAdicionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btAdicionar.setText("ADICIONAR");
        btAdicionar.setContentAreaFilled(false);
        btAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btSair.setText("SAIR");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um horario", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", " " }));

        btSalvar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btListar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btListar.setText("LISTAR");
        btListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAtividadesLayout = new javax.swing.GroupLayout(painelAtividades);
        painelAtividades.setLayout(painelAtividadesLayout);
        painelAtividadesLayout.setHorizontalGroup(
            painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtividadesLayout.createSequentialGroup()
                .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelAtividadesLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAtividadesLayout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btSair))
                            .addGroup(painelAtividadesLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelAtividadesLayout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btAdicionar))
                            .addGroup(painelAtividadesLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelAtividadesLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        painelAtividadesLayout.setVerticalGroup(
            painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtividadesLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btLimpar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(painelAtividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btSalvar)
                    .addComponent(btListar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAtividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void login(int codUsuario){
        codUsuarioLogado = codUsuario;
    }
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
        TelaInicial telIni = new TelaInicial();
        telIni.setVisible(true);
        telIni.setSize(400,500);
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        jTextFieldDescricao.setText("");
        jComboBoxHorario.setSelectedIndex(0);       
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       String umaData = dateFormat.format(jDateChooser1.getDate());
       String hora = jComboBoxHorario.getSelectedItem().toString();
       String descricao = jTextFieldDescricao.getText();
       DefaultTableModel model = (DefaultTableModel)jTableCompromisso.getModel();
       model.addRow(new Object[]{umaData, hora, descricao});
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
    //System.out.println("Valor de codUsuarioLogado antes de SALVAR na telaAtividades: " + codUsuarioLogado);
    boolean sucesso;
    DefaultTableModel model = (DefaultTableModel) jTableCompromisso.getModel();
    ArrayList<Compromisso> compromissos = new ArrayList<>();    
    for (int i = 0; i < model.getRowCount(); i++) {
        String umaData = (String) model.getValueAt(i, 0);
        String hora = (String) model.getValueAt(i, 1);
        String descricao = (String) model.getValueAt(i, 2);
        
        Compromisso compromisso = new Compromisso(umaData, hora, descricao);
        compromisso.setCodUsuario(codUsuarioLogado);        
        compromissos.add(compromisso);            
    }
    try {
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso(codUsuarioLogado);
        sucesso = controllerCompromisso.cadastrarTabelaCompromisso(compromissos, codUsuarioLogado);
        //System.out.println("Valor de codUsuarioLogado apos salvar na telaAtividades:" +codUsuarioLogado);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Compromissos salvos com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os compromissos.");
        }
    } catch (Exception e) {        
        JOptionPane.showMessageDialog(null, "Erro ao salvar os compromissos: " + e.getMessage());
    }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
       TelaCrud telCr = new TelaCrud(codUsuarioLogado);
       telCr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btListarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCompromisso;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JPanel painelAtividades;
    // End of variables declaration//GEN-END:variables
}
