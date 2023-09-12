package planner.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import planner.controller.ControllerPessoa;

public class TelaInicial extends javax.swing.JFrame {
    
    
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelInicial = new javax.swing.JPanel(){
            public void paintComponent(Graphics t){

                ImageIcon im = new ImageIcon(getClass().getResource("/planner/icons/fundo.jpg"));
                Image i =im.getImage();

                t.drawImage(i,0,0, this.getSize().width,this.getSize().height,this);
            }
        };
        jLabelLogin = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        brNovoUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your daily activities!");
        setIconImage(new ImageIcon(getClass().getResource("/planner/icons/planner.png")).getImage());
        setResizable(false);

        jLabelLogin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelLogin.setText("LOGIN");

        jLabelUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelUsuario.setText("Usuario: ");

        jLabelSenha.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha: ");

        jTextFieldUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldUsuario.setToolTipText("Informe o usuario");

        jPasswordFieldSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPasswordFieldSenha.setToolTipText("Informe a senha");

        jButtonLogin.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonLogin.setText("ENTRAR");
        jButtonLogin.setActionCommand("");
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        brNovoUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        brNovoUsuario.setText("NOVO ");
        brNovoUsuario.setActionCommand("");
        brNovoUsuario.setContentAreaFilled(false);
        brNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brNovoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabelLogin))
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelSenha))
                        .addGap(18, 18, 18)
                        .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInicialLayout.createSequentialGroup()
                                .addComponent(brNovoUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLogin))
                            .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUsuario)
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabelLogin)
                .addGap(37, 37, 37)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin)
                    .addComponent(brNovoUsuario))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        TelaAtividades telaAtiv = new TelaAtividades();
        try{
        String usuario, senha;
        usuario = jTextFieldUsuario.getText();
        senha = jPasswordFieldSenha.getText();
        ControllerPessoa controllerPessoa = new ControllerPessoa();
        if(controllerPessoa.autenticaPessoa(usuario, senha)){
            JOptionPane.showMessageDialog(null, "Logado com sucesso!! ");
            telaAtiv.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalida.");         
        } 
        }catch(Exception e){            
            JOptionPane.showMessageDialog(null, "Erro ao logar: " + e);
        }       
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void brNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brNovoUsuarioActionPerformed
        CadastroUsuario cadUsu = new CadastroUsuario();
        cadUsu.setVisible(true);
        cadUsu.setSize(400,500);
        cadUsu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_brNovoUsuarioActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brNovoUsuario;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JPanel painelInicial;
    // End of variables declaration//GEN-END:variables
}
