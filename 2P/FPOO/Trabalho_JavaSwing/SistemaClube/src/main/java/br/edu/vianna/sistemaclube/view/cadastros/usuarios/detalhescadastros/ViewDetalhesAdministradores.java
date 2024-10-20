/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.vianna.sistemaclube.view.cadastros.usuarios.detalhescadastros;

import br.edu.vianna.sistemaclube.dao.impl.usuariodao.AdministradorDAO;
import br.edu.vianna.sistemaclube.dao.impl.usuariodao.InstrutorDAO;
import br.edu.vianna.sistemaclube.model.usuarios.Administrador;
import br.edu.vianna.sistemaclube.model.usuarios.Instrutor;
import br.edu.vianna.sistemaclube.utils.datahora.FormataDataHora;
import br.edu.vianna.sistemaclube.utils.datahora.FormataData;
import br.edu.vianna.sistemaclube.view.cadastros.cadutils.ViewDeletarRegistro;
import br.edu.vianna.sistemaclube.view.cadastros.usuarios.ViewCadastroAdministrador;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

/**
 * @author William
 */
public class ViewDetalhesAdministradores extends javax.swing.JDialog {

    /**
     * Creates new form ViewDetalhesAtividades
     */
    public ViewDetalhesAdministradores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        lblTopo = new javax.swing.JLabel();
        txtIdLinhaClicada = new javax.swing.JTextField();
        pnlControles = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        tabPanelBuscar = new javax.swing.JTabbedPane();
        pnlBuscarPorId = new javax.swing.JPanel();
        txtBuscarPorId = new javax.swing.JTextField();
        btnBuscarPorId = new javax.swing.JButton();
        pnlBuscarPorNome = new javax.swing.JPanel();
        txtBuscarPorNome = new javax.swing.JTextField();
        btnBuscarPorNome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarPorData = new javax.swing.JButton();
        txtBuscarPorData = new javax.swing.JFormattedTextField();
        pnlBuscarPorCpf = new javax.swing.JPanel();
        txtBuscarPorCpf = new javax.swing.JFormattedTextField();
        btnBuscarPorCpf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar detalhes dos administradores");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlTopo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTopo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblTopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTopo.setText("Administradores cadastrados");

        txtIdLinhaClicada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdLinhaClicada.setBorder(null);

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdLinhaClicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopo)
                    .addComponent(txtIdLinhaClicada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlControles.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Create.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Cancel.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnAlterarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Sync.png"))); // NOI18N
        btnAlterarDados.setText("Alterar");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Delete.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlesLayout = new javax.swing.GroupLayout(pnlControles);
        pnlControles.setLayout(pnlControlesLayout);
        pnlControlesLayout.setHorizontalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlControlesLayout.setVerticalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlControlesLayout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAlterarDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        tabPanelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtBuscarPorId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBuscarPorId.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarPorId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscarPorId.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscarPorId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Zoom.png"))); // NOI18N
        btnBuscarPorId.setText("Buscar");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarPorIdLayout = new javax.swing.GroupLayout(pnlBuscarPorId);
        pnlBuscarPorId.setLayout(pnlBuscarPorIdLayout);
        pnlBuscarPorIdLayout.setHorizontalGroup(
            pnlBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarPorIdLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBuscarPorIdLayout.setVerticalGroup(
            pnlBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorIdLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlBuscarPorIdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorId))
                .addContainerGap())
        );

        tabPanelBuscar.addTab("Por ID", pnlBuscarPorId);

        txtBuscarPorNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBuscarPorNome.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscarPorNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscarPorNome.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscarPorNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Zoom.png"))); // NOI18N
        btnBuscarPorNome.setText("Buscar");
        btnBuscarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarPorNomeLayout = new javax.swing.GroupLayout(pnlBuscarPorNome);
        pnlBuscarPorNome.setLayout(pnlBuscarPorNomeLayout);
        pnlBuscarPorNomeLayout.setHorizontalGroup(
            pnlBuscarPorNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarPorNomeLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtBuscarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBuscarPorNomeLayout.setVerticalGroup(
            pnlBuscarPorNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorNomeLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlBuscarPorNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNome))
                .addContainerGap())
        );

        tabPanelBuscar.addTab("Por Nome", pnlBuscarPorNome);

        btnBuscarPorData.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscarPorData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Zoom.png"))); // NOI18N
        btnBuscarPorData.setText("Buscar");
        btnBuscarPorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorDataActionPerformed(evt);
            }
        });

        txtBuscarPorData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtBuscarPorData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBuscarPorData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarPorData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtBuscarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPorData)
                    .addComponent(txtBuscarPorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabPanelBuscar.addTab("Por Data de Nascimento", jPanel1);

        txtBuscarPorCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtBuscarPorCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBuscarPorCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarPorCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnBuscarPorCpf.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnBuscarPorCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/16x16/Zoom.png"))); // NOI18N
        btnBuscarPorCpf.setText("Buscar");
        btnBuscarPorCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarPorCpfLayout = new javax.swing.GroupLayout(pnlBuscarPorCpf);
        pnlBuscarPorCpf.setLayout(pnlBuscarPorCpfLayout);
        pnlBuscarPorCpfLayout.setHorizontalGroup(
            pnlBuscarPorCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarPorCpfLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(txtBuscarPorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBuscarPorCpfLayout.setVerticalGroup(
            pnlBuscarPorCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscarPorCpfLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlBuscarPorCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPorCpf)
                    .addComponent(txtBuscarPorCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabPanelBuscar.addTab("Buscar por CPF", pnlBuscarPorCpf);

        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome", "Sobrenome", "CPF", "Email", "Data Nasc.", "Data Registro", "Último Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAdmin.setShowGrid(true);
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAdmin);
        if (tbAdmin.getColumnModel().getColumnCount() > 0) {
            tbAdmin.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbAdmin.getColumnModel().getColumn(0).setMaxWidth(60);
            tbAdmin.getColumnModel().getColumn(1).setMinWidth(110);
            tbAdmin.getColumnModel().getColumn(2).setMinWidth(110);
            tbAdmin.getColumnModel().getColumn(4).setMinWidth(110);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabPanelBuscar)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPanelBuscar.getAccessibleContext().setAccessibleName("Por Nome");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarDadosDeAdministradores();
        txtIdLinhaClicada.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ViewCadastroAdministrador viewCadastroAdministrador = new ViewCadastroAdministrador(this, true);
        viewCadastroAdministrador.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
        if (txtIdLinhaClicada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Para alterar os dados de um administrador clique sobre ele e então clique novamente em Alterar, " +
                            "na janela que se abrir clique no botão buscar, uma vez que o ID do administrador já está definido, as informações dela serão trazidas da base de dados.",
                    "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewCadastroAdministrador viewCadastroAdministrador = new ViewCadastroAdministrador(this, true);
            int id = Integer.parseInt(txtIdLinhaClicada.getText());
            viewCadastroAdministrador.getTxtBuscarPorId().setText(String.valueOf(id));
            viewCadastroAdministrador.getTxtBuscarPorId().requestFocusInWindow();
            viewCadastroAdministrador.setVisible(true);
            txtIdLinhaClicada.setText("");
        }
    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int qtdAdmins = tbAdmin.getRowCount();
        if (qtdAdmins <= 1) {
            JOptionPane.showMessageDialog(rootPane, "Não é possível apagar o único administrador do sistema!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtIdLinhaClicada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Para deletar o registro de um administrador, clique sobre ele e então clique novamente em Deletar", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewDeletarRegistro viewDeletarRegistro = new ViewDeletarRegistro(this, true);
            viewDeletarRegistro.getTxtIdItemSelecionado().setText(String.valueOf(txtIdLinhaClicada.getText()));
            viewDeletarRegistro.setVisible(true);
            txtIdLinhaClicada.setText("");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
        if (!txtBuscarPorId.getText().isBlank()) {
            realizarBuscaDeCadastroPorId();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite um ID para realizar a busca!", "Campo de busca vazio", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed

    private void btnBuscarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorNomeActionPerformed
        if (!txtBuscarPorNome.getText().isBlank()) {
            realizarBuscaDeCadastroPorNome();
        } else {
            txtBuscarPorNome.setText("");
            JOptionPane.showMessageDialog(rootPane, "Digite o nome do administrador para realizar a busca!", "Campo de busca vazio", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarPorNomeActionPerformed

    private void btnBuscarPorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorDataActionPerformed
        realizarBuscaDeCadastroPorData();
    }//GEN-LAST:event_btnBuscarPorDataActionPerformed

    private void btnBuscarPorCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorCpfActionPerformed
        realizarBuscaDeCadastroPorCpf();
    }//GEN-LAST:event_btnBuscarPorCpfActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        carregarDadosDeAdministradores();
    }//GEN-LAST:event_formWindowGainedFocus

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEventosMouseClicked
        escutarCliquesDoMouseNaTabela(evt);
    }//GEN-LAST:event_tbEventosMouseClicked

    private void escutarCliquesDoMouseNaTabela(java.awt.event.MouseEvent evt) {
        int linha = tbAdmin.rowAtPoint(evt.getPoint());
        if (linha >= 0) {
            int coluna = 0;
            Object valor = tbAdmin.getValueAt(linha, coluna);
            txtIdLinhaClicada.setText((String) valor);
        }
    }

    private void realizarBuscaDeCadastroPorId() {
        Administrador administrador;
        try {
            administrador = new AdministradorDAO().buscarPorId(Integer.valueOf(txtBuscarPorId.getText()));

            if (administrador == null) {
                JOptionPane.showMessageDialog(rootPane, "A busca não retornou nenhum resultado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                preencherTabela(administrador);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            exibeMensagemErroNaBase(ex);
        }
    }

    private void realizarBuscaDeCadastroPorNome() {
        List<Administrador> administradores;
        try {
            administradores = new AdministradorDAO().buscarPorNome(txtBuscarPorNome.getText());

            if (administradores.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "A busca não retornou nenhum resultado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                preencherTabela(administradores);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            exibeMensagemErroNaBase(ex);
        }
    }

    private void realizarBuscaDeCadastroPorData() {
        List<Administrador> administradores;
        try {
            administradores = new AdministradorDAO().buscarPorDataNasc(txtBuscarPorData.getText());

            if (administradores.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "A busca não retornou nenhum resultado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                preencherTabela(administradores);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            exibeMensagemErroNaBase(ex);
        }
    }

    private void realizarBuscaDeCadastroPorCpf() {
        Administrador administrador;
        try {
            administrador = new AdministradorDAO().buscarPorCpf(txtBuscarPorCpf.getText().replaceAll("[^\\d]", ""));

            if (administrador == null) {
                JOptionPane.showMessageDialog(rootPane, "A busca não retornou nenhum resultado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                preencherTabela(administrador);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            exibeMensagemErroNaBase(ex);
        }
    }

    public void carregarDadosDeAdministradores() {
        List<Administrador> administradores;
        try {
            administradores = new AdministradorDAO().buscarTodos();
            if (administradores.isEmpty()) {
                if (!mensagemJaExibida) {
                    JOptionPane.showMessageDialog(rootPane, "Nenhum administrador cadastrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    mensagemJaExibida = true;
                    limparTabela();
                }
            } else {
                preencherTabela(administradores);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            exibeMensagemErroNaBase(ex);
        }
    }

    private void preencherTabela(List<Administrador> administradores) throws SQLException, ClassNotFoundException {
        DefaultTableModel tabela = (DefaultTableModel) tbAdmin.getModel();

        limparTabela();

        for (Administrador adm : administradores) {
            String[] linha = getDadosAdmin(adm);
            tabela.addRow(linha);
        }

        centralizarConteudosDaTabela();
    }

    private void preencherTabela(Administrador adm) throws SQLException, ClassNotFoundException {
        DefaultTableModel tabela = (DefaultTableModel) tbAdmin.getModel();

        limparTabela();

        String[] linha = getDadosAdmin(adm);
        tabela.addRow(linha);

        centralizarConteudosDaTabela();
    }

    private void limparTabela() {
        DefaultTableModel tabela = (DefaultTableModel) tbAdmin.getModel();

        while (tabela.getRowCount() > 0) {
            tabela.removeRow(0);
        }
    }

    private static String[] getDadosAdmin(Administrador administrador) {
        return new String[]{
                String.valueOf(administrador.getId()),
                administrador.getNome(), administrador.getSobrenome(),
                administrador.getCpf(), administrador.getEmail(),
                FormataData.formataDataParaExibicao(administrador.getDataNascimento()),
                FormataDataHora.formataDataHoraParaExibicaoComSegundos(administrador.getDataRegistro()),
                FormataDataHora.formataDataHoraParaExibicaoSemSegundos(administrador.getDataUltimoAcesso())
        };
    }

    private void centralizarConteudosDaTabela() {
        DefaultTableCellRenderer cetralizarConteudo = new DefaultTableCellRenderer();
        cetralizarConteudo.setHorizontalAlignment(SwingConstants.CENTER);
        tbAdmin.getColumnModel().getColumn(0).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(1).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(2).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(3).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(4).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(5).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(6).setCellRenderer(cetralizarConteudo);
        tbAdmin.getColumnModel().getColumn(7).setCellRenderer(cetralizarConteudo);
    }

    private void exibeMensagemErroNaBase(Exception ex) {
        JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tentar buscar o dado na base.\nERRO: " + ex.getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(ViewDetalhesAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDetalhesAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDetalhesAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDetalhesAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewDetalhesAdministradores dialog = new ViewDetalhesAdministradores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnBuscarPorCpf;
    private javax.swing.JButton btnBuscarPorData;
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton btnBuscarPorNome;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTopo;
    private javax.swing.JPanel pnlBuscarPorCpf;
    private javax.swing.JPanel pnlBuscarPorId;
    private javax.swing.JPanel pnlBuscarPorNome;
    private javax.swing.JPanel pnlControles;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTabbedPane tabPanelBuscar;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JFormattedTextField txtBuscarPorCpf;
    private javax.swing.JFormattedTextField txtBuscarPorData;
    private javax.swing.JTextField txtBuscarPorId;
    private javax.swing.JTextField txtBuscarPorNome;
    private javax.swing.JTextField txtIdLinhaClicada;
    // End of variables declaration//GEN-END:variables
    private boolean mensagemJaExibida = false;
}
