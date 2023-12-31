package planner.view;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planner.DAO.ExceptionMVC;
import planner.controller.ControllerCompromisso;
import planner.model.Compromisso;

public class TelaCrud extends javax.swing.JFrame {
    private int codUsuarioLogado;
    public TelaCrud(int codUsuarioLogado){
        initComponents();
        this.codUsuarioLogado = codUsuarioLogado;
    }
    public TelaCrud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon(getClass().getResource("/planner/icons/pagina.jpg"));
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jLabelLista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        btListar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de compromissos");
        setIconImage(new ImageIcon(getClass().getResource("/planner/icons/planner.png")).getImage());
        setResizable(false);

        jLabelLista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLista.setText("Lista de compromissos");

        jTableLista.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Data", "Hora", "Descricao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLista);

        btListar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btListar.setText("Listar");
        btListar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btDeletar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btDeletar.setText("Deletar");
        btDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeletar)
                        .addGap(132, 132, 132)
                        .addComponent(btSair)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListar)
                    .addComponent(btEditar)
                    .addComponent(btDeletar)
                    .addComponent(btSair))
                .addContainerGap(118, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void login(int codUsuario){
        codUsuarioLogado = codUsuario;
    }
    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
    //System.out.println("Método botao Listar chamado.");
    DefaultTableModel tableModel = (DefaultTableModel) jTableLista.getModel();
    tableModel.setRowCount(0);        
    try{     
        ControllerCompromisso controllerCompromisso = new ControllerCompromisso();  
        //System.out.println("Valor do codUsuarioLogado ao chegar no listar na telaCrud: " + codUsuarioLogado);
        ArrayList<Compromisso> compromissos = controllerCompromisso.listaCompromisso(codUsuarioLogado);            
        //System.out.println("Número de compromissos retornados: " + compromissos.size());
        compromissos.forEach((Compromisso compromisso)->{tableModel.addRow(new Object[] {compromisso.getCodCompromisso(),compromisso.getData(), compromisso.getHora(), compromisso.getDescricao()});  
        });
        jTableLista.setModel(tableModel);            
        }
    catch (ExceptionMVC e){
        JOptionPane.showMessageDialog(null, "Erro"+ e);
    }        
    }//GEN-LAST:event_btListarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       TelaAtividades telAtiv = new TelaAtividades(codUsuarioLogado);
       telAtiv.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //System.out.println("Botão Editar clicado!");
        DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
        int selectedRow = jTableLista.getSelectedRow();
        boolean sucesso;
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para editar");
            return;
        }
        try {
            int codCompromisso = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            String data = (String) model.getValueAt(selectedRow, 1);
            String hora = (String) model.getValueAt(selectedRow, 2);
            String descricao = (String) model.getValueAt(selectedRow, 3);
            ControllerCompromisso controllerCompromisso = new ControllerCompromisso();            
            sucesso = controllerCompromisso.editarCompromissos(codCompromisso, data, hora, descricao);
            if(sucesso){
                model.setValueAt(data, selectedRow,1);
                model.setValueAt(hora, selectedRow, 2);
                model.setValueAt(descricao, selectedRow, 3);
                JOptionPane.showMessageDialog(null, "Compromisso alterado com sucesso");
                selectedRow = jTableLista.getSelectedRow();
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro encontrado: " + e);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
        int selectedRow = jTableLista.getSelectedRow();
        boolean sucesso;
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela para deletar", "Atenção!", JOptionPane.INFORMATION_MESSAGE);
            return; 
        }
        try {
            int codCompromisso = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            ControllerCompromisso controllerCompromisso = new ControllerCompromisso();
            sucesso = controllerCompromisso.excluirCompromisso(codCompromisso);
            if(sucesso){
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Compromisso excluido com sucesso!");
                } else 
                    JOptionPane.showMessageDialog(null, "Erro ao excluir autor");
            } catch (ExceptionMVC e){
                JOptionPane.showMessageDialog(null, "Erro: " + e);
        } 
    }//GEN-LAST:event_btDeletarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
}
