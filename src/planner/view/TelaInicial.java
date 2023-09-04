package planner.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your daily activities!");
        setIconImage(new ImageIcon(getClass().getResource("/planner/icons/icone.png")).getImage());
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
        jButtonLogin.setContentAreaFilled(false);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInicialLayout = new javax.swing.GroupLayout(painelInicial);
        painelInicial.setLayout(painelInicialLayout);
        painelInicialLayout.setHorizontalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabelLogin))
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelSenha))
                        .addGap(18, 18, 18)
                        .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(painelInicialLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButtonLogin)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        painelInicialLayout.setVerticalGroup(
            painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicialLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabelLogin)
                .addGap(43, 43, 43)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButtonLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        telaAtiv.setVisible(true);
        telaAtiv.setSize(700,700);
        telaAtiv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JPanel painelInicial;
    // End of variables declaration//GEN-END:variables
}
