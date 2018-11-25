package Interface;
//import salva.arquivo.ArquivoMIDI;
import controle.musica.ControladorDeMusica;
import traduz.campotexto.Tradutor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import org.jfugue.Pattern;
//import org.jfugue.Player;

public class Interface extends javax.swing.JFrame 
{ 
    public Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areadetexto = new javax.swing.JTextArea();
        BotaoExecuta = new javax.swing.JButton();
        instrumentos = new javax.swing.JSpinner();
        volume = new javax.swing.JSlider();
        textovolume = new javax.swing.JLabel();
        textoinstrumentos = new javax.swing.JLabel();
        textobpms = new javax.swing.JLabel();
        bpms = new javax.swing.JSpinner();
        BotaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areadetexto.setColumns(20);
        areadetexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        areadetexto.setRows(5);
        jScrollPane1.setViewportView(areadetexto);

        BotaoExecuta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotaoExecuta.setText("Executar");
        BotaoExecuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExecutaActionPerformed(evt);
            }
        });

        instrumentos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 31, 1));
        instrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        instrumentos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                instrumentosStateChanged(evt);
            }
        });

        volume.setMaximum(6900000);
        volume.setValue(4300000);

        textovolume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textovolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textovolume.setText("Volume");

        textoinstrumentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoinstrumentos.setLabelFor(instrumentos);
        textoinstrumentos.setText("Acoustic Grand Piano");
        textoinstrumentos.setToolTipText("");
        textoinstrumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textobpms.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textobpms.setLabelFor(bpms);
        textobpms.setText("BPMs");
        textobpms.setToolTipText("");

        bpms.setModel(new javax.swing.SpinnerNumberModel(120, 20, 999, 1));

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
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
                .addComponent(BotaoExecuta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textoinstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(instrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
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
                .addComponent(BotaoSalvar)
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
                        .addComponent(BotaoExecuta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private static String texto_traduzido = new String();
    
    private void BotaoExecutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExecutaActionPerformed
        
        String areatexto = areadetexto.getText();
        
        Tradutor tradutor = new Tradutor(areatexto);
        tradutor.set_Bpm((int) bpms.getValue());
        tradutor.set_Instrumento((int) instrumentos.getValue());
        tradutor.set_Volume((int) volume.getValue());
        Interface.texto_traduzido = tradutor.traduz_musica();
        
        ControladorDeMusica controlador = new ControladorDeMusica(Interface.texto_traduzido);
        controlador.toca_musica();
        
    }//GEN-LAST:event_BotaoExecutaActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        abreInterfaceDeSalvar();
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void instrumentosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_instrumentosStateChanged
        //int valor = (int) instrumentos.getValue();
        switch((int) instrumentos.getValue())
        {           
            case 1:
                textoinstrumentos.setText("Bright Acoustic Piano");
                break;
            case 2:
                textoinstrumentos.setText("Electric Grand Piano");
                break;
            case 3:
                textoinstrumentos.setText("Honky-tonk Piano");
                break;
            case 4:
                textoinstrumentos.setText("Electric Piano 1");
                break;
            case 5:
                textoinstrumentos.setText("Electric Piano 2");
                break;
            case 6:
                textoinstrumentos.setText("Harpsichord");
                break;
            case 7:
                textoinstrumentos.setText("Clavinet");
                break;
            case 8:
                textoinstrumentos.setText("Celesta");
                break;
            case 9:
                textoinstrumentos.setText("Glockenspiel");
                break;
            case 10:
                textoinstrumentos.setText("Music Box");
                break;
            case 11:
                textoinstrumentos.setText("Vibraphone");
                break;
            case 12:
                textoinstrumentos.setText("Marimba");
                break;
            case 13:
                textoinstrumentos.setText("Xylophone");
                break;
            case 14:
                textoinstrumentos.setText("Tubular Bells");
                break;
            case 15:
                textoinstrumentos.setText("Dulcimer");
                break;
            case 16:
                textoinstrumentos.setText("Drawbar Organ");
                break;
            case 17:
                textoinstrumentos.setText("Percussive Organ");
                break;
            case 18:
                textoinstrumentos.setText("Rock Organ");
                break;
            case 19:
                textoinstrumentos.setText("Church Organ");
                break;
            case 20:
                textoinstrumentos.setText("Reed Organ");
                break;
            case 21:
                textoinstrumentos.setText("Accordion");
                break;
            case 22:
                textoinstrumentos.setText("Harmonica");
                break;
            case 23:
                textoinstrumentos.setText("Tango Accordion");
                break;
            case 24:
                textoinstrumentos.setText("Acoustic Guitar (nylon)");
                break;
            case 25:
                textoinstrumentos.setText("Acoustic Guitar (steel)");
                break;
            case 26:
                textoinstrumentos.setText("Electric Guitar (jazz)");
                break;
            case 27:
                textoinstrumentos.setText("Electric Guitar (clean)");
                break;
            case 28:
                textoinstrumentos.setText("Electric Guitar (muted)");
                break;
            case 29:
                textoinstrumentos.setText("Overdriven Guitar");
                break;
            case 30:
                textoinstrumentos.setText("Distortion Guitar");
                break;
            case 31:
                textoinstrumentos.setText("Guitar harmonics");
                break;
            default:
                textoinstrumentos.setText("Acoustic Grand Piano");                
        }
    }//GEN-LAST:event_instrumentosStateChanged
    
    private static void abreInterfaceDeSalvar(){
       InterfaceDeSalvar frame = new InterfaceDeSalvar();
       frame.set_texto(Interface.texto_traduzido);
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       frame.setVisible(true);
    }
    
    public static void main(String args[]) 
    {
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
                       
            Interface tela = new Interface();
            tela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
            tela.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(WindowEvent evt)
                {
                   int dialogoConfirma = JOptionPane.showConfirmDialog(null,"Deseja Salvar?");
                   
                    if (dialogoConfirma==JOptionPane.OK_OPTION)
                    {
                        abreInterfaceDeSalvar();
                    }
                    else
                    {   
                        if(dialogoConfirma==JOptionPane.NO_OPTION)
                        { System.exit(0); }           
                    }                       
                }
            });
            tela.setVisible(true);
        });
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExecuta;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextArea areadetexto;
    private javax.swing.JSpinner bpms;
    private javax.swing.JSpinner instrumentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textobpms;
    private javax.swing.JLabel textoinstrumentos;
    private javax.swing.JLabel textovolume;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
