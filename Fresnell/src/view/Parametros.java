package view;

import controller.CaixaPreta;
import controller.LeituraImagem;
import controller.Sistema;
import java.awt.Point;

public class Parametros extends javax.swing.JFrame {

    CaixaPreta c;
    LeituraImagem leitura;

    public Parametros() {

        c = new CaixaPreta();
        leitura = new LeituraImagem();
        
        initComponents();
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelFresnell = new javax.swing.JLabel();
        antenaA = new javax.swing.JLabel();
        antenaB = new javax.swing.JLabel();
        XantenaA = new javax.swing.JLabel();
        YantenaA = new javax.swing.JLabel();
        XantenaB = new javax.swing.JLabel();
        YantenaB = new javax.swing.JLabel();
        Xsolo = new javax.swing.JLabel();
        txtXAntenaA = new javax.swing.JTextField();
        txtYAntenaA = new javax.swing.JTextField();
        txtXAntenaB = new javax.swing.JTextField();
        txtYAntenaB = new javax.swing.JTextField();
        txtFrequencia = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAlturaA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlturaB = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(611, 367));

        LabelFresnell.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        LabelFresnell.setText("Zona de Fresnel");

        antenaA.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        antenaA.setText("Antena A");

        antenaB.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        antenaB.setText("Antena B");

        XantenaA.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        XantenaA.setText("Coordenada X:");

        YantenaA.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        YantenaA.setText("Coordenada Y:");

        XantenaB.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        XantenaB.setText("Coordenada X:");

        YantenaB.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        YantenaB.setText("Coordenada Y:");

        Xsolo.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        Xsolo.setText("Frequência (MHz)");

        calcular.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Altura(m)");

        jLabel2.setText("Altura(m)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAlturaA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(YantenaA)
                                .addGap(18, 18, 18)
                                .addComponent(txtYAntenaA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(XantenaA)
                                .addGap(18, 18, 18)
                                .addComponent(txtXAntenaA)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(XantenaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YantenaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtXAntenaB, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtYAntenaB, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(txtAlturaB))
                        .addGap(33, 33, 33)
                        .addComponent(Xsolo)
                        .addGap(18, 18, 18)
                        .addComponent(txtFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(antenaA)
                        .addGap(126, 126, 126)
                        .addComponent(antenaB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calcular)
                        .addGap(18, 18, 18)
                        .addComponent(sair)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelFresnell)
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(LabelFresnell)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antenaA)
                    .addComponent(antenaB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(XantenaA)
                    .addComponent(XantenaB)
                    .addComponent(Xsolo)
                    .addComponent(txtXAntenaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtXAntenaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YantenaA)
                    .addComponent(YantenaB)
                    .addComponent(txtYAntenaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYAntenaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAlturaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtAlturaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(sair))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed

        System.out.println("Calcular");
        
        int xAntenaA = Integer.parseInt(txtXAntenaA.getText());
        int yAntenaA = Integer.parseInt(txtYAntenaA.getText());
        int xAntenaB = Integer.parseInt(txtXAntenaB.getText());
        int yAntenaB = Integer.parseInt(txtYAntenaB.getText());
        int alturaA = Integer.parseInt(txtAlturaA.getText());
        int alturaB = Integer.parseInt(txtAlturaB.getText());
        int frequencia = Integer.parseInt(txtFrequencia.getText());
        
        int pontaAntenaA = leitura.altura(xAntenaA, yAntenaA) + alturaA;
        int pontaAntenaB = leitura.altura(xAntenaB, yAntenaB) + alturaB;
        
        
        System.out.println("Ponta Antena A " +pontaAntenaA);
        System.out.println("Ponta Antena B " +pontaAntenaB);
        
        c.setAntenaA(new Point(xAntenaA, pontaAntenaA));
        c.setAntenaB(new Point(xAntenaB, pontaAntenaB));
        c.setFrequencia(frequencia);
        //c.setRelevo(Sistema.pontosTest2());

        c.setRelevo(leitura.extrairPontos(xAntenaA, yAntenaA, xAntenaB, yAntenaB));
        c.fresnel();
        /*Ufa achei que tinha feito bostona*/
    }//GEN-LAST:event_calcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFresnell;
    private javax.swing.JLabel XantenaA;
    private javax.swing.JLabel XantenaB;
    private javax.swing.JLabel Xsolo;
    private javax.swing.JLabel YantenaA;
    private javax.swing.JLabel YantenaB;
    private javax.swing.JLabel antenaA;
    private javax.swing.JLabel antenaB;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sair;
    private javax.swing.JTextField txtAlturaA;
    private javax.swing.JTextField txtAlturaB;
    private javax.swing.JTextField txtFrequencia;
    private javax.swing.JTextField txtXAntenaA;
    private javax.swing.JTextField txtXAntenaB;
    private javax.swing.JTextField txtYAntenaA;
    private javax.swing.JTextField txtYAntenaB;
    // End of variables declaration//GEN-END:variables
}
