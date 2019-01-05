/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.XPathExpression;


/**
 *
 * @author Rodrigo
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    private Camaras camaras;
    private Contratos contratos;
    private Document tudo;

    public MainWindow() {
        initComponents();

        camaras = new Camaras(true);
        contratos = new Contratos(true);

        tudo = Util.lerDocumentoXML("tudo.xml");
        TFCamaras.setText(camaras.getRawFileString());
        TFContratos.setText(contratos.getRawFileString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JanelaResultado = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaResultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TFCamaras = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TFContratos = new javax.swing.JTextArea();
        SimpleSearch = new javax.swing.JTextField();
        ComplexSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PesquisaComplexaButton = new javax.swing.JButton();
        PesquisaSimplesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ddlPesquisas = new javax.swing.JComboBox<>();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        TextAreaResultado.setColumns(20);
        TextAreaResultado.setRows(5);
        jScrollPane3.setViewportView(TextAreaResultado);

        jLabel3.setText("Resultado da pesquisa");

        javax.swing.GroupLayout JanelaResultadoLayout = new javax.swing.GroupLayout(JanelaResultado.getContentPane());
        JanelaResultado.getContentPane().setLayout(JanelaResultadoLayout);
        JanelaResultadoLayout.setHorizontalGroup(
            JanelaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JanelaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(JanelaResultadoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JanelaResultadoLayout.setVerticalGroup(
            JanelaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaResultadoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TFCamaras.setColumns(20);
        TFCamaras.setRows(5);
        jScrollPane1.setViewportView(TFCamaras);

        TFContratos.setColumns(20);
        TFContratos.setRows(5);
        jScrollPane2.setViewportView(TFContratos);

        jLabel1.setText("Pesquisa Customizada");

        PesquisaComplexaButton.setText("Pesquisa Complexa");
        PesquisaComplexaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaComplexaButtonActionPerformed(evt);
            }
        });

        PesquisaSimplesButton.setText("Pesquisa Simples");
        PesquisaSimplesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaSimplesButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisa Predefinida");

        ddlPesquisas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procurar contratos por data específica", "Procurar contratos por autor da publicação", "Procurar contratos por adjudicatário", "Procurar qual o contrato de maior valor de uma Câmara Municipal especifica", "Procurar qual o contrato de maior valor de todas as Câmaras", "Introduzir uma câmara e obter todos os dados da mesma", "Top 5 das Câmara que gastaram mais com contratos", "Procurar Câmara por nome do presidente" }));

        jMenu1.setText("Ficheiros de Saida");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Juntar as camaras com os contratos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Criar página html com os brasões");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Guardar Ficheiro Camaras.xml");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Guardar Ficheiro Contratos.xml");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Guardar ambos ficheiros");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        MenuBar.add(jMenu1);

        jMenu2.setText("Opções");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Atualizar Ficheiros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SimpleSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComplexSearch))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PesquisaComplexaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PesquisaSimplesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ddlPesquisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 166, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ddlPesquisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SimpleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaSimplesButton)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaComplexaButton)
                    .addComponent(ComplexSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        Main.paginaHTMLBrasoes();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        Main.juntar2ficheiros();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        Thread thread = new Thread() {
            @Override
            public void run() {
                camaras = new Camaras(false);
                contratos = new Contratos(false);

                TFCamaras.setText(camaras.getRawFileString());
                TFContratos.setText(contratos.getRawFileString());
                JOptionPane.showMessageDialog(null, "",
                        "Acabou de atualizar", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        thread.start();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void PesquisaComplexaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaComplexaButtonActionPerformed

        Pesquisa pesquisa = null;
        try {
            pesquisa = new Pesquisa(camaras.getDocument(), ComplexSearch.getText());
            pesquisa.Pesquisa();
        } catch (Exception ex) {
            System.out.println("Erro Pesquisa");
            ex.printStackTrace();
        }
        if (pesquisa == null) {
            return;
        }
        Element el = new Element("SearchRoot");
        Document doc = new Document(el);

        for (Element elem : pesquisa.elements) {
            elem.detach();
            el.addContent(elem);
        }
        String str = Util.escreverDocumentoString(doc);

        TFCamaras.setText(str);
    }//GEN-LAST:event_PesquisaComplexaButtonActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed


    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Guardar Ficheiro Camaras.xml       
        Util.escreverFicheiroTexto(TFCamaras.getText(), Camaras.getPath());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //Guardar ambos Ficheiros
        Util.escreverFicheiroTexto(TFCamaras.getText(), Camaras.getPath());
        Util.escreverFicheiroTexto(TFContratos.getText(), Contratos.getPath());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void PesquisaSimplesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaSimplesButtonActionPerformed

        XPathFactory factory = XPathFactory.instance();
        XPathExpression xPath = null;
        String search = SimpleSearch.getText();

        switch (ddlPesquisas.getSelectedIndex()) {
            case 0:
                //Procurar contratos por data específica

                xPath = factory.compile("//contrato[contains(@publicacao, '" + search + "')]");
                break;
            case 1:
                //Procurar contratos por autor da publicação
                
                xPath = factory.compile("//contrato[contains(../@nomeMun,'" + search + "')]");
                break;
            case 2:
                //Procurar contratos por adjudicatário
                 xPath = factory.compile("//contrato[contains(adjudicatario, '" + search + "')]");
                break;
            case 3:
                //Procurar qual o contrato de maior valor de uma Câmara Municipal especifica
                 xPath = factory.compile("//contrato[contains(../@nomeMun,'" +  search +"' ) and preco =  max(..//preco)]");
                break;
            case 4:
                //Procurar qual o contrato de maior valor de todas as Câmaras

                break;
            case 5:
                //Introduzir uma câmara e obter todos os dados da mesma
                
                break;
            case 6:
                //Top 5 das Câmara que gastaram mais com contratos
                
                break;
            case 7:
                //Procurar Câmara por nome do presidente
                xPath = factory.compile("//municipio[contains(@presidente,'" + search + "')]");
                break;
            default:
        }
        
        List<Element> list = xPath.evaluate(tudo);
        
        Element resultRoot = new Element("resultado");
        Document doc = new Document(resultRoot);
        
        for (int i = 0; i < list.size(); i++) {
            Element item = list.get(i);
            item.detach();
            resultRoot.addContent(item);
        }        
        TextAreaResultado.setText(Util.escreverDocumentoString(doc));

        JanelaResultado.setSize(800, 800);
        JanelaResultado.setVisible(true);

    }//GEN-LAST:event_PesquisaSimplesButtonActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //Guardar Ficheiro Contratos.xml
        Util.escreverFicheiroTexto(TFContratos.getText(), Contratos.getPath());
    }//GEN-LAST:event_jMenuItem5ActionPerformed
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ComplexSearch;
    private javax.swing.JFrame JanelaResultado;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton PesquisaComplexaButton;
    private javax.swing.JButton PesquisaSimplesButton;
    private javax.swing.JTextField SimpleSearch;
    private javax.swing.JTextArea TFCamaras;
    private javax.swing.JTextArea TFContratos;
    private javax.swing.JTextArea TextAreaResultado;
    private javax.swing.JComboBox<String> ddlPesquisas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
  }
