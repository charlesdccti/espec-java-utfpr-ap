/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadFornecedor.java
 *
 * Created on 19/09/2011, 21:24:49
 */
package visao;

import controle.AcaoDoControle;
import controle.ControleFornecedor;
import java.util.List;
import javax.swing.JTable;
import modelo.Fornecedor;

/**
 *
 * @author Casa
 */
public class CadFornecedor extends javax.swing.JFrame {
    
    private ControleFornecedor controlForn;
    private Fornecedor fornecedor;
    private AcaoDoControle acao;
    private final String[] tbFornecedorTitle = {"ID", "Nome", "Telefone", "Email"};

    /** Creates new form CadFornecedor */
    public CadFornecedor() {
	controlForn = new ControleFornecedor();
        initComponents();
	habilita(true);
    }
    
    private void habilita(boolean estado) {
	btnIncluir.setEnabled(estado);
	btnExcluir.setEnabled(!estado);
	abasFornecedor.setEnabledAt(0, estado);
	abasFornecedor.setEnabledAt(1, !estado);
	if (estado) {
	    List<Fornecedor> fornecedores = controlForn.listaDeFornecedores();
	    tbFornecedor.setModel(new BotiqueTableModel(getRows(fornecedores), tbFornecedorTitle));
	    abasFornecedor.setSelectedIndex(0);
	} else {
	    abasFornecedor.setSelectedIndex(1);
	    txNome.requestFocus();
	}
    }
    
    private Object[][] getRows(List<Fornecedor> itens) {
	Object[][] itensTab = new Object[itens.size()][2];
	int row = 0;
	for(Fornecedor prod : itens) {
	    Object[][] line = {prod.row()};
	    System.arraycopy(line, 0, itensTab, row, 1);
	    row++;
	}
	return itensTab;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        abasFornecedor = new javax.swing.JTabbedPane();
        painelConsulta = new javax.swing.JPanel();
        scrollTbFornecedor = new javax.swing.JScrollPane();
        tbFornecedor = new javax.swing.JTable();
        lbPesquisa = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txPesquisa = new javax.swing.JTextField();
        painelCadastro = new javax.swing.JPanel();
        lbId = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txTelefone = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Fornecedores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnIncluir)
                .addComponent(btnExcluir))
        );

        tbFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            getRows(controlForn.listaDeFornecedores()),
            tbFornecedorTitle));
    tbFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbFornecedorMouseClicked(evt);
        }
    });
    scrollTbFornecedor.setViewportView(tbFornecedor);

    lbPesquisa.setText("Pesquisar");

    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBuscarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
    painelConsulta.setLayout(painelConsultaLayout);
    painelConsultaLayout.setHorizontalGroup(
        painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painelConsultaLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbPesquisa)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnBuscar)
            .addContainerGap())
        .addComponent(scrollTbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
    );
    painelConsultaLayout.setVerticalGroup(
        painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painelConsultaLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbPesquisa)
                .addComponent(btnBuscar)
                .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(scrollTbFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
    );

    abasFornecedor.addTab("Consulta", painelConsulta);

    lbId.setText("Codigo");

    lbNome.setText("Nome");

    txId.setEnabled(false);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    btnConfirmar.setText("Confirmar");
    btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnConfirmarActionPerformed(evt);
        }
    });

    btnCancelar.setText("Cancelar");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(btnConfirmar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(btnCancelar))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(btnConfirmar)
            .addComponent(btnCancelar))
    );

    lbTelefone.setText("Telefone");

    lbEmail.setText("Email");

    javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
    painelCadastro.setLayout(painelCadastroLayout);
    painelCadastroLayout.setHorizontalGroup(
        painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painelCadastroLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTelefone)
                        .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbEmail)
                        .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(lbId)
                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txNome, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addComponent(lbNome)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );
    painelCadastroLayout.setVerticalGroup(
        painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(painelCadastroLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbId)
            .addGap(4, 4, 4)
            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbNome)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(painelCadastroLayout.createSequentialGroup()
                    .addComponent(lbEmail)
                    .addGap(4, 4, 4)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCadastroLayout.createSequentialGroup()
                    .addComponent(lbTelefone)
                    .addGap(4, 4, 4)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(76, 76, 76)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    abasFornecedor.addTab("Cadastro", painelCadastro);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abasFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(abasFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
	controlForn.deletar(Integer.parseInt(txId.getText()));
	habilita(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
	acao = AcaoDoControle.INSERIR;
	txId.setText("");
	txNome.setText("");
	txTelefone.setText("");
	txEmail.setText("");
	habilita(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
	if (acao == AcaoDoControle.INSERIR) {
	    fornecedor = new Fornecedor(txNome.getText(), txTelefone.getText(), txEmail.getText());
	    controlForn.inserir(fornecedor);
	} else if (acao == AcaoDoControle.EDITAR) {
	    fornecedor = new Fornecedor(txNome.getText(), txTelefone.getText(), txEmail.getText());
	    fornecedor.setId(Integer.parseInt(txId.getText()));
	    controlForn.atualizar(fornecedor);
	}
	habilita(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
	habilita(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tbFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFornecedorMouseClicked
	if (evt.getClickCount() == 2) {
	    JTable table = (JTable) evt.getSource();
	    int id = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
	    fornecedor = controlForn.getFornecedor(id);
	    txId.setText(String.valueOf(fornecedor.getId()));
	    txNome.setText(fornecedor.getNome());
	    txTelefone.setText(fornecedor.getTelefone());
	    txEmail.setText(fornecedor.getEmail());
	    habilita(false);
	    acao = AcaoDoControle.EDITAR;
	}
    }//GEN-LAST:event_tbFornecedorMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
	List<Fornecedor> fornecedores = controlForn.listaDeFonecedoresPorNome(txPesquisa.getText());
	tbFornecedor.setModel(new BotiqueTableModel(getRows(fornecedores), tbFornecedorTitle));
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasFornecedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JScrollPane scrollTbFornecedor;
    private javax.swing.JTable tbFornecedor;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txPesquisa;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}