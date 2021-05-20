/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.ArmazenaCanais;
import controller.CanalAtual;
import controller.CarregarLista;
import controller.MediaPlayer;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author renato
 */
public class ListaCanais extends javax.swing.JFrame {
    private CarregarLista carregarlista;
    private ArrayList<String> listaNomesCanais;
    private ArrayList<String> listaUrlCanais;
    private MediaPlayer mp;
    /**
     * Creates new form ListaCanais
     */
    public ListaCanais(MediaPlayer mp) {
        initComponents();
        this.listaNomesCanais   =   new ArrayList();
        this.listaUrlCanais     =   new ArrayList(); 
        this.mp = mp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_carregar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_canais = new javax.swing.JTable();
        top_bar = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(585, 500));
        setMinimumSize(new java.awt.Dimension(585, 470));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(585, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setText("CARREGAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/upload2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 70));

        btn_carregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu_2.png"))); // NOI18N
        btn_carregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_carregarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_carregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 220, 140));

        tabela_canais.setBackground(new java.awt.Color(254, 254, 254));
        tabela_canais.setBorder(null);
        tabela_canais.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tabela_canais.setForeground(new java.awt.Color(91, 91, 91));
        tabela_canais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANAIS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_canais.setGridColor(new java.awt.Color(254, 254, 254));
        tabela_canais.setRowHeight(25);
        tabela_canais.setSelectionBackground(new java.awt.Color(244, 244, 244));
        tabela_canais.getTableHeader().setReorderingAllowed(false);
        tabela_canais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_canaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_canais);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, -1));

        top_bar.setBackground(new java.awt.Color(1, 1, 1));
        top_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                top_barMouseDragged(evt);
            }
        });
        top_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                top_barMousePressed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout top_barLayout = new javax.swing.GroupLayout(top_bar);
        top_bar.setLayout(top_barLayout);
        top_barLayout.setHorizontalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_barLayout.createSequentialGroup()
                .addContainerGap(550, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        top_barLayout.setVerticalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(top_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background_tela2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(592, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(592, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(592, 480));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked
    int xx,xy;
    private void top_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top_barMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_top_barMousePressed

    private void top_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_top_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy); 
    }//GEN-LAST:event_top_barMouseDragged

    private void btn_carregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_carregarMouseClicked
        
        DefaultTableModel tabelaCanais =  (DefaultTableModel) tabela_canais.getModel();
        String path = "";
       
        
        // Abri um pop up para escolha da lista em formato txt
        JFileChooser fileChoose = new JFileChooser();
        fileChoose.setDialogTitle("Buscar lista IPTV");
        fileChoose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Lista","txt");
        
        fileChoose.setFileFilter(filter);
        int retorno = fileChoose.showOpenDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChoose.getSelectedFile();
            path = file.getPath();
        }
        
        // Obtem o caminho do arquivo
        carregarlista = new CarregarLista(path);
        carregarlista.abrir();
        
        this.listaNomesCanais = ArmazenaCanais.getListaNomeCanais();
        this.listaUrlCanais   = ArmazenaCanais.getListaURLCanais();
        
         for(int contador = 0; contador < this.listaNomesCanais.size(); contador++){
            if (this.listaNomesCanais.get(contador).isEmpty()) {
                
                this.listaNomesCanais.remove(contador);
                
                if (this.listaUrlCanais.get(contador).isEmpty()) {
                    this.listaUrlCanais.remove(contador);
                }
            }
  
              tabelaCanais.addRow(new Object[]{this.listaNomesCanais.get(contador)});
         }
         
          
    }//GEN-LAST:event_btn_carregarMouseClicked
    

    
    private void tabela_canaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_canaisMouseClicked
        int index = this.tabela_canais.getSelectedRow();
        String url = this.listaUrlCanais.get(index);
        CanalAtual.setCanal(url);
        this.mp.carregarVideo(true, url);
        
        
    }//GEN-LAST:event_tabela_canaisMouseClicked
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_carregar;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_canais;
    private javax.swing.JPanel top_bar;
    // End of variables declaration//GEN-END:variables
}