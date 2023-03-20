/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inicio;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
int xMouse, yMouse;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IniciarBtn = new javax.swing.JButton();
        inventarioTiempoTxt = new javax.swing.JTextField();
        inventarioCostoTxt = new javax.swing.JTextField();
        ProduTiempoTxt = new javax.swing.JTextField();
        ProduCostoTxt = new javax.swing.JTextField();
        EmpaqueTiempoTxt = new javax.swing.JTextField();
        EmpaqueCostoTxt = new javax.swing.JTextField();
        SalidaTiempoTxt = new javax.swing.JTextField();
        SalidaCostoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 157, 128));
        jPanel1.setForeground(new java.awt.Color(0, 157, 128));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido a Monkey!");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Triciclo.png"))); // NOI18N

        IniciarBtn.setBackground(new java.awt.Color(204, 51, 0));
        IniciarBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        IniciarBtn.setForeground(new java.awt.Color(0, 0, 0));
        IniciarBtn.setText("Iniciar simulacion");
        IniciarBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IniciarBtn.setBorderPainted(false);
        IniciarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inventarioTiempoTxt.setBackground(new java.awt.Color(255, 255, 255));
        inventarioTiempoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inventarioTiempoTxt.setForeground(new java.awt.Color(0, 0, 0));
        inventarioTiempoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inventarioTiempoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioTiempoTxtActionPerformed(evt);
            }
        });
        inventarioTiempoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inventarioTiempoTxtKeyTyped(evt);
            }
        });

        inventarioCostoTxt.setBackground(new java.awt.Color(255, 255, 255));
        inventarioCostoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inventarioCostoTxt.setForeground(new java.awt.Color(0, 0, 0));
        inventarioCostoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inventarioCostoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioCostoTxtActionPerformed(evt);
            }
        });
        inventarioCostoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inventarioCostoTxtKeyTyped(evt);
            }
        });

        ProduTiempoTxt.setBackground(new java.awt.Color(255, 255, 255));
        ProduTiempoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ProduTiempoTxt.setForeground(new java.awt.Color(0, 0, 0));
        ProduTiempoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProduTiempoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduTiempoTxtActionPerformed(evt);
            }
        });
        ProduTiempoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProduTiempoTxtKeyTyped(evt);
            }
        });

        ProduCostoTxt.setBackground(new java.awt.Color(255, 255, 255));
        ProduCostoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ProduCostoTxt.setForeground(new java.awt.Color(0, 0, 0));
        ProduCostoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProduCostoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduCostoTxtActionPerformed(evt);
            }
        });
        ProduCostoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProduCostoTxtKeyTyped(evt);
            }
        });

        EmpaqueTiempoTxt.setBackground(new java.awt.Color(255, 255, 255));
        EmpaqueTiempoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EmpaqueTiempoTxt.setForeground(new java.awt.Color(0, 0, 0));
        EmpaqueTiempoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmpaqueTiempoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpaqueTiempoTxtActionPerformed(evt);
            }
        });
        EmpaqueTiempoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmpaqueTiempoTxtKeyTyped(evt);
            }
        });

        EmpaqueCostoTxt.setBackground(new java.awt.Color(255, 255, 255));
        EmpaqueCostoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EmpaqueCostoTxt.setForeground(new java.awt.Color(0, 0, 0));
        EmpaqueCostoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmpaqueCostoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpaqueCostoTxtActionPerformed(evt);
            }
        });
        EmpaqueCostoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmpaqueCostoTxtKeyTyped(evt);
            }
        });

        SalidaTiempoTxt.setBackground(new java.awt.Color(255, 255, 255));
        SalidaTiempoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SalidaTiempoTxt.setForeground(new java.awt.Color(0, 0, 0));
        SalidaTiempoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SalidaTiempoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaTiempoTxtActionPerformed(evt);
            }
        });
        SalidaTiempoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalidaTiempoTxtKeyTyped(evt);
            }
        });

        SalidaCostoTxt.setBackground(new java.awt.Color(255, 255, 255));
        SalidaCostoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        SalidaCostoTxt.setForeground(new java.awt.Color(0, 0, 0));
        SalidaCostoTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SalidaCostoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaCostoTxtActionPerformed(evt);
            }
        });
        SalidaCostoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalidaCostoTxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Inventario");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Producción");

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Empaquetado");

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Salida");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tiempo (s)");

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Costo (Q/s)");

        header.setBackground(new java.awt.Color(0, 157, 128));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(0, 157, 128));

        exitLabel.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(0, 0, 0));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("x");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 619, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/liana.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(IniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(193, 193, 193))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(SalidaTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(EmpaqueTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                    .addGap(42, 42, 42)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ProduTiempoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(inventarioTiempoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(42, 42, 42)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(inventarioCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ProduCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(EmpaqueCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SalidaCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(134, 134, 134)
                                            .addComponent(jLabel8)
                                            .addGap(84, 84, 84)
                                            .addComponent(jLabel9))))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inventarioTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inventarioCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProduTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProduCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpaqueTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpaqueCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalidaTiempoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalidaCostoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addComponent(IniciarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void inventarioTiempoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioTiempoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventarioTiempoTxtActionPerformed

    private void inventarioCostoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioCostoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventarioCostoTxtActionPerformed

    private void ProduTiempoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduTiempoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProduTiempoTxtActionPerformed

    private void ProduCostoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduCostoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProduCostoTxtActionPerformed

    private void EmpaqueTiempoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpaqueTiempoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpaqueTiempoTxtActionPerformed

    private void EmpaqueCostoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpaqueCostoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpaqueCostoTxtActionPerformed

    private void SalidaTiempoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaTiempoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidaTiempoTxtActionPerformed

    private void SalidaCostoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaCostoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalidaCostoTxtActionPerformed

    private void inventarioTiempoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventarioTiempoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            inventarioTiempoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            inventarioTiempoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_inventarioTiempoTxtKeyTyped

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1KeyTyped

    private void inventarioCostoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventarioCostoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            inventarioCostoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            inventarioCostoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_inventarioCostoTxtKeyTyped

    private void ProduTiempoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProduTiempoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            ProduTiempoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            ProduTiempoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_ProduTiempoTxtKeyTyped

    private void ProduCostoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProduCostoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            ProduCostoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            ProduCostoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_ProduCostoTxtKeyTyped

    private void EmpaqueTiempoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpaqueTiempoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            EmpaqueTiempoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            EmpaqueTiempoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_EmpaqueTiempoTxtKeyTyped

    private void EmpaqueCostoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpaqueCostoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            EmpaqueCostoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            EmpaqueCostoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_EmpaqueCostoTxtKeyTyped

    private void SalidaTiempoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalidaTiempoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            SalidaTiempoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            SalidaTiempoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_SalidaTiempoTxtKeyTyped

    private void SalidaCostoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalidaCostoTxtKeyTyped
        // TODO add your handling code here:
         char C = evt.getKeyChar();
        
        if(Character.isLetter(C)){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            SalidaCostoTxt.setCursor(null);
            
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
                || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96 || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "ingrese solo numeros");
            SalidaCostoTxt.setCursor(null);
            
        }        
    }//GEN-LAST:event_SalidaCostoTxtKeyTyped

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        exitBtn.setBackground(Color.RED);
        exitLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        exitBtn.setBackground(new Color(0,157,128));
        exitLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitLabelMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpaqueCostoTxt;
    private javax.swing.JTextField EmpaqueTiempoTxt;
    private javax.swing.JButton IniciarBtn;
    private javax.swing.JTextField ProduCostoTxt;
    private javax.swing.JTextField ProduTiempoTxt;
    private javax.swing.JTextField SalidaCostoTxt;
    private javax.swing.JTextField SalidaTiempoTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel header;
    private javax.swing.JTextField inventarioCostoTxt;
    private javax.swing.JTextField inventarioTiempoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}