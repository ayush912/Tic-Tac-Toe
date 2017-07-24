import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.*;

class Tictactoe extends javax.swing.JFrame {

    public Tictactoe() {
        initComponents();
    }
    String in1=null;
    String in2=null;
    int i=0;
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setBounds(new java.awt.Rectangle(0, 0, 100, 100));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setVisible(false);
        jButton10.setText("X");
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setVisible(false);
        jButton11.setText("O");
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("START");
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton13.setText("?");
        jButton13.setToolTipText("");
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(40, 40, 40)
                        .addComponent(jButton11)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(36, 36, 36)
                        .addComponent(jButton13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton12))
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton1.setEnabled(true);jButton2.setEnabled(true);jButton3.setEnabled(true);jButton4.setEnabled(true);jButton5.setEnabled(true);jButton6.setEnabled(true);jButton7.setEnabled(true);jButton8.setEnabled(true);jButton9.setEnabled(true);
           
        jButton1.setLabel("");
        jButton2.setLabel("");
        jButton3.setLabel("");
        jButton4.setLabel("");
        jButton5.setLabel("");
        jButton6.setLabel("");
        jButton7.setLabel("");
        jButton8.setLabel("");
        jButton9.setLabel("");
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        in1=null;
        in2=null;
        i=0;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        in1=jButton10.getLabel();
        in2=jButton11.getLabel();
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        i=1;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        in2=jButton10.getLabel();
        in1=jButton11.getLabel();
        jButton10.setVisible(false);
        jButton11.setVisible(false);
       i=1;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            if(jButton1.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton1.setLabel(in1);
           ++i;
           
          if(jButton2.getLabel().equals(in1)&&jButton3.getLabel().equals(in1))
           {
               in1=null;in2=null;
                JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
             jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
          else if(jButton4.getLabel().equals(in1)&&jButton7.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
          else if(jButton5.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
          else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
          jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
          
        }
        
        
        else
        {
            jButton1.setLabel(in2);
           ++i;
           
         if(jButton2.getLabel().equals(in2)&&jButton3.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
         else if(jButton4.getLabel().equals(in2)&&jButton7.getLabel().equals(in2))
            {
                in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
            }
         else if(jButton5.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
         else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
        if(jButton2.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            
            jButton2.setLabel(in1);
           ++i;
          if(jButton1.getLabel().equals(in1)&&jButton3.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
          else if(jButton5.getLabel().equals(in1)&&jButton8.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
          else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        
        else
        {
            jButton2.setLabel(in2);
           ++i;
             if(jButton1.getLabel().equals(in2)&&jButton3.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
             else if(jButton5.getLabel().equals(in2)&&jButton8.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
             else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
        if(jButton3.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton3.setLabel(in1);
           ++i;
           if(jButton1.getLabel().equals(in1)&&jButton2.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton5.getLabel().equals(in1)&&jButton7.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        
        else
        {
            jButton3.setLabel(in2);
           ++i;
           if(jButton1.getLabel().equals(in2)&&jButton2.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton5.getLabel().equals(in2)&&jButton7.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
        if(jButton4.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton4.setLabel(in1);
           ++i;
           if(jButton1.getLabel().equals(in1)&&jButton7.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in1)&&jButton5.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        else
        {
            jButton4.setLabel(in2);
           ++i;
           if(jButton1.getLabel().equals(in2)&&jButton7.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in2)&&jButton5.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
        if(jButton5.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton5.setLabel(in1);
           ++i;
           if(jButton2.getLabel().equals(in1)&&jButton8.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in1)&&jButton4.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton3.getLabel().equals(in1)&&jButton7.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        else
        {
            jButton5.setLabel(in2);
           ++i;
           if(jButton2.getLabel().equals(in2)&&jButton8.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton6.getLabel().equals(in2)&&jButton4.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton3.getLabel().equals(in2)&&jButton7.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
        if(jButton6.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton6.setLabel(in1);
           ++i;
           if(jButton3.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton5.getLabel().equals(in1)&&jButton4.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        else
        {
            jButton6.setLabel(in2);
           ++i;
           if(jButton3.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton5.getLabel().equals(in2)&&jButton4.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
        if(jButton7.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton7.setLabel(in1);
           ++i;
           if(jButton1.getLabel().equals(in1)&&jButton4.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton8.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton3.getLabel().equals(in1)&&jButton5.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        } 
        else
        {
            jButton7.setLabel(in2);
           ++i;
           if(jButton1.getLabel().equals(in2)&&jButton4.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton8.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton3.getLabel().equals(in2)&&jButton5.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try
        {
        if(jButton8.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton8.setLabel(in1);
           ++i;
           if(jButton2.getLabel().equals(in1)&&jButton5.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton7.getLabel().equals(in1)&&jButton9.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        else
        {
            jButton8.setLabel(in2);
           ++i;
           if(jButton2.getLabel().equals(in2)&&jButton5.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton7.getLabel().equals(in2)&&jButton9.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try
        {
        if(jButton9.getLabel()==""&&i>0)
        {
        if(i%2!=0)
        {
            jButton9.setLabel(in1);
           ++i;
           if(jButton3.getLabel().equals(in1)&&jButton6.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton7.getLabel().equals(in1)&&jButton8.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel().equals(in1)&&jButton5.getLabel().equals(in1))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 1 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
             }
        }
        else
        {
            jButton9.setLabel(in2);
           ++i;
           if(jButton3.getLabel().equals(in2)&&jButton6.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
        jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
              }
           else if(jButton7.getLabel().equals(in2)&&jButton8.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
           else if(jButton1.getLabel().equals(in2)&&jButton5.getLabel().equals(in2))
           {
               in1=null;in2=null;
               JOptionPane.showMessageDialog(null,"                    Player 2 Wins\nPress START If You Want To Play Again!!");
           jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
           else if(jButton1.getLabel()!=""&&jButton2.getLabel()!=""&&jButton3.getLabel()!=""&&jButton4.getLabel()!=""&&jButton5.getLabel()!=""&&jButton6.getLabel()!=""&&jButton7.getLabel()!=""&&jButton8.getLabel()!=""&&jButton9.getLabel()!="")
          {
              JOptionPane.showMessageDialog(null,"                  NO ONE Wins\nPress START If You Want To Play Again!!");
          jButton1.setEnabled(false);jButton2.setEnabled(false);jButton3.setEnabled(false);jButton4.setEnabled(false);jButton5.setEnabled(false);jButton6.setEnabled(false);jButton7.setEnabled(false);jButton8.setEnabled(false);jButton9.setEnabled(false);
           }
        }
        }
        }   catch(Exception e){};// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       try{
       JFrame f = new JFrame("HOW TO PLAY?");
       JTextArea txt = new JTextArea("\t              Tutorial on how to play Tic Tac Toe.\n\n1. Initially there is only a 9*9 grid and a START button.\n2. The player who wants to start the game need to click this START button and then two \n     choices will appear: X and O.\n3. The player needs to select either of the choices which will become his symbol for the \n     game and the other symbol will be issued to second player after which the choices will \n     disappear.\n4. Now the players need to mark their choices on the grid alternatively, in the way that they \n     form a three way pattern either vertically, horizontally or diagonally with their own choice.\n4. If a player is succeded in creating such a pattern he wins the game.\n5. To start again you can press the START button. ");
       txt.setEditable(false);
       txt.setBackground(Color.LIGHT_GRAY);
       txt.setPreferredSize(new Dimension(500, 200));
       f.add(txt);
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       f.setLayout(new FlowLayout());
       f.setBackground(Color.LIGHT_GRAY);
       f.pack(); 
       f.setResizable(false);
       f.setVisible(true);
       JOptionPane.showMessageDialog(null,f);
       }
       catch(Exception e){};
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictactoe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
