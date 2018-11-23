package Interface;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
public class Interface extends javax.swing.JFrame { 
    public Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areadetexto = new javax.swing.JTextArea();
        botaoexecuta = new javax.swing.JButton();
        instrumentos = new javax.swing.JSpinner();
        volume = new javax.swing.JSlider();
        textovolume = new javax.swing.JLabel();
        textoinstrumentos = new javax.swing.JLabel();
        textobpms = new javax.swing.JLabel();
        bpms = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areadetexto.setColumns(20);
        areadetexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        areadetexto.setRows(5);
        jScrollPane1.setViewportView(areadetexto);

        botaoexecuta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botaoexecuta.setText("Executar");
        botaoexecuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexecutaActionPerformed(evt);
            }
        });

        instrumentos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        instrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textovolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textovolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textovolume.setText("Volume");

        textoinstrumentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoinstrumentos.setLabelFor(instrumentos);
        textoinstrumentos.setText("INSTRUMENTOS");
        textoinstrumentos.setToolTipText("");
        textoinstrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textobpms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textobpms.setLabelFor(bpms);
        textobpms.setText("BPMs");
        textobpms.setToolTipText("");

        bpms.setModel(new javax.swing.SpinnerNumberModel(120, 20, 999, 1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(botaoexecuta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoinstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textobpms, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpms, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textovolume, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textovolume, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoinstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textobpms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bpms, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoexecuta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void botaoexecutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexecutaActionPerformed
            String areatexto = areadetexto.getText();
            Player player = new Player();
            Pattern exce = new Pattern();
            exce = ControladorDeInstrumentos(areatexto,0,(int) instrumentos.getValue(), (int) bpms.getValue());
            player.play(exce);
    }//GEN-LAST:event_botaoexecutaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       abreInterfaceDeSalvar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void abreInterfaceDeSalvar(){
       InterfaceDeSalvar frame = new InterfaceDeSalvar();
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       frame.setVisible(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new Interface().setVisible(true);            
            Interface tela = new Interface();
            tela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
            tela.addWindowListener(new WindowAdapter(){
            
                @Override
                public void windowClosing(WindowEvent evt){
                   int dialogoConfirma = JOptionPane.showConfirmDialog(null,"Deseja Salvar?");
                   //JOptionPane.showMessageDialog(null, "Tem certeza que deseja fechar? (Não esqueça de salvar)");
                    if (dialogoConfirma==JOptionPane.OK_OPTION)
                    {
                        abreInterfaceDeSalvar();
                    }
                    else
                    {   
                        if(dialogoConfirma==JOptionPane.NO_OPTION)
                        {
                            System.exit(0);
                        }
                                  
                    }   
                                      
                }
            
            });
            
            tela.setVisible(true);
        });
    }
    
    private static Pattern ControladorDeInstrumentos(String texto, int voz, int instrumento, int tempo)
    {    Pattern pattern = new Pattern(texto)
               .setVoice(voz)                 //PARA INSTRUMENTOS DE PERCUSÃO COMO BATERIA E DERIVADOS COLOQUE 9 NO setVoice.
                                            // OS DEMAIS SÃO INTRUMENTOS GERAIS COMO PIANO, GUITARRA SAX E ETC.
               .setInstrument(instrumento)            // CADA NUMERO É UM INSTRUMENTO, LISTA DE INSTRUMENTOS https://www.cs.utexas.edu/ftp/novak/cs315/jfugue-chapter2.pdf
               .setTempo(tempo);              // O TEMPO É O BPM.
        return pattern;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areadetexto;
    private javax.swing.JButton botaoexecuta;
    private javax.swing.JSpinner bpms;
    private javax.swing.JSpinner instrumentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textobpms;
    private javax.swing.JLabel textoinstrumentos;
    private javax.swing.JLabel textovolume;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
