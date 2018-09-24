package cubesweeper;


import java.awt.Color;
import java.util.Random;



public class Hard extends javax.swing.JFrame {
    private int hiddenButton;
    private int id;
    private Color hiddenColor;
    private Color mainColor;
    private int score = 100;

    
    win w = new win();
    
    /**
     * Creates new form gameboard_project1_lswitzer2
     */
    public Hard() {
        initComponents();
        setColor();
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
        java.awt.GridBagConstraints gridBagConstraints;

        dlogWin = new javax.swing.JDialog();
        lblFound = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        tfScore = new javax.swing.JTextField();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt10 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();
        bt14 = new javax.swing.JButton();
        bt15 = new javax.swing.JButton();
        bt16 = new javax.swing.JButton();
        bt17 = new javax.swing.JButton();
        bt18 = new javax.swing.JButton();
        bt19 = new javax.swing.JButton();
        bt20 = new javax.swing.JButton();
        bt21 = new javax.swing.JButton();
        bt22 = new javax.swing.JButton();
        bt23 = new javax.swing.JButton();
        bt24 = new javax.swing.JButton();
        bt25 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        lblFound.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblFound.setText("You found it!");

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblScore.setText("Final Score:");

        tfScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlogWinLayout = new javax.swing.GroupLayout(dlogWin.getContentPane());
        dlogWin.getContentPane().setLayout(dlogWinLayout);
        dlogWinLayout.setHorizontalGroup(
            dlogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlogWinLayout.createSequentialGroup()
                .addGroup(dlogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlogWinLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblFound))
                    .addGroup(dlogWinLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(dlogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfScore)
                            .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        dlogWinLayout.setVerticalGroup(
            dlogWinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlogWinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFound, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cubesweeper Hard");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        bt2.setFocusPainted(false);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 0, 0);
        getContentPane().add(bt2, gridBagConstraints);

        bt3.setFocusPainted(false);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(bt3, gridBagConstraints);

        bt4.setFocusPainted(false);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(bt4, gridBagConstraints);

        bt5.setFocusPainted(false);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 17);
        getContentPane().add(bt5, gridBagConstraints);

        bt1.setBackground(new java.awt.Color(255, 51, 51));
        bt1.setFocusPainted(false);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(bt1, gridBagConstraints);

        bt6.setFocusPainted(false);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(bt6, gridBagConstraints);

        bt7.setFocusPainted(false);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        getContentPane().add(bt7, gridBagConstraints);

        bt8.setFocusPainted(false);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt8, gridBagConstraints);

        bt9.setFocusPainted(false);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt9, gridBagConstraints);

        bt10.setFocusPainted(false);
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 17);
        getContentPane().add(bt10, gridBagConstraints);

        bt11.setFocusPainted(false);
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(bt11, gridBagConstraints);

        bt12.setFocusPainted(false);
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        getContentPane().add(bt12, gridBagConstraints);

        bt13.setFocusPainted(false);
        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt13, gridBagConstraints);

        bt14.setFocusPainted(false);
        bt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt14, gridBagConstraints);

        bt15.setFocusPainted(false);
        bt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 17);
        getContentPane().add(bt15, gridBagConstraints);

        bt16.setFocusPainted(false);
        bt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(bt16, gridBagConstraints);

        bt17.setFocusPainted(false);
        bt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 0, 0);
        getContentPane().add(bt17, gridBagConstraints);

        bt18.setFocusPainted(false);
        bt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt18, gridBagConstraints);

        bt19.setFocusPainted(false);
        bt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(bt19, gridBagConstraints);

        bt20.setFocusPainted(false);
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 17);
        getContentPane().add(bt20, gridBagConstraints);

        bt21.setFocusPainted(false);
        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 0);
        getContentPane().add(bt21, gridBagConstraints);

        bt22.setFocusPainted(false);
        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 5, 11, 0);
        getContentPane().add(bt22, gridBagConstraints);

        bt23.setFocusPainted(false);
        bt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 0);
        getContentPane().add(bt23, gridBagConstraints);

        bt24.setFocusPainted(false);
        bt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 0);
        getContentPane().add(bt24, gridBagConstraints);

        bt25.setFocusPainted(false);
        bt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 17);
        getContentPane().add(bt25, gridBagConstraints);

        jMenu3.setText("File");

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       if(hiddenColor == bt1.getBackground()){

           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        if(hiddenColor == bt2.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt2ActionPerformed

    private void tfScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreActionPerformed
        
    }//GEN-LAST:event_tfScoreActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if(hiddenColor == bt3.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        if(hiddenColor == bt4.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        if(hiddenColor == bt5.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        if(hiddenColor == bt6.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if(hiddenColor == bt7.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        if(hiddenColor == bt8.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        if(hiddenColor == bt9.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        if(hiddenColor == bt10.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
       if(hiddenColor == bt11.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        if(hiddenColor == bt12.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        if(hiddenColor == bt13.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt14ActionPerformed
        if(hiddenColor == bt14.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt14ActionPerformed

    private void bt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt15ActionPerformed
       if(hiddenColor == bt15.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt15ActionPerformed

    private void bt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt16ActionPerformed
        if(hiddenColor == bt16.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt16ActionPerformed

    private void bt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt17ActionPerformed
       if(hiddenColor == bt17.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt17ActionPerformed

    private void bt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt18ActionPerformed
        if(hiddenColor == bt18.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt18ActionPerformed

    private void bt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt19ActionPerformed
        if(hiddenColor == bt19.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt19ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        if(hiddenColor == bt20.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
       if(hiddenColor == bt21.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
       if(hiddenColor == bt22.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt22ActionPerformed

    private void bt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt23ActionPerformed
       if(hiddenColor == bt23.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt23ActionPerformed

    private void bt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt24ActionPerformed
        if(hiddenColor == bt24.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt24ActionPerformed

    private void bt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt25ActionPerformed
        if(hiddenColor == bt25.getBackground()){
           tfScore.setText(Integer.toString(score));
           w.setScore(score);
           w.setVisible(true);
       }
       else{
           lowerScore();
       }
    }//GEN-LAST:event_bt25ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public void lowerScore(){
        score--;
        
    }
    private void setColor(){
        Random r = new Random();
        mainColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
        int red = mainColor.getRed();
        int blue = mainColor.getBlue();
        int green = mainColor.getGreen();
        int alpha = mainColor.getAlpha();
        if(red>=blue&&red>=green){
            red+=10;
        }
        else if(blue>=red&&blue>=green){
            blue+=10;
        }
        else if(green>=red&&green>=blue){
            green+=10;
        }
        hiddenColor = new Color(red, green, blue);
        hiddenColor = new Color(red, green, blue, alpha);
        hiddenButton = r.nextInt(25);
        System.out.println(hiddenButton);
        if(hiddenButton == 0){
            bt1.setBackground(hiddenColor);
        }
        else{
            bt1.setBackground(mainColor);
        }
        if(hiddenButton == 1){
            bt2.setBackground(hiddenColor);
        }
        else{
            bt2.setBackground(mainColor);
        }
        if(hiddenButton == 2){
            bt3.setBackground(hiddenColor);
        }
        else{
            bt3.setBackground(mainColor);
        }
        if(hiddenButton == 3){
            bt4.setBackground(hiddenColor);
        }
        else{
            bt4.setBackground(mainColor);
        }if(hiddenButton == 4){
            bt5.setBackground(hiddenColor);
        }
        else{
            bt5.setBackground(mainColor);
        }
        if(hiddenButton == 5){
            bt6.setBackground(hiddenColor);
        }
        else{
            bt6.setBackground(mainColor);
        }
        if(hiddenButton == 6){
            bt7.setBackground(hiddenColor);
        }
        else{
            bt7.setBackground(mainColor);
        }
        if(hiddenButton == 7){
            bt8.setBackground(hiddenColor);
        }
        else{
            bt8.setBackground(mainColor);
        }
        if(hiddenButton == 8){
            bt9.setBackground(hiddenColor);
        }
        else{
            bt9.setBackground(mainColor);
        }
        if(hiddenButton == 9){
            bt10.setBackground(hiddenColor);
        }
        else{
            bt10.setBackground(mainColor);
        }
        if(hiddenButton == 10){
            bt11.setBackground(hiddenColor);
        }
        else{
            bt11.setBackground(mainColor);
        }
        if(hiddenButton == 11){
            bt12.setBackground(hiddenColor);
        }
        else{
            bt12.setBackground(mainColor);
        }
        if(hiddenButton == 12){
            bt13.setBackground(hiddenColor);
        }
        else{
            bt13.setBackground(mainColor);
        }
        if(hiddenButton == 13){
            bt14.setBackground(hiddenColor);
        }
        else{
            bt14.setBackground(mainColor);
        }
        if(hiddenButton == 14){
            bt15.setBackground(hiddenColor);
        }
        else{
            bt15.setBackground(mainColor);
        }
        if(hiddenButton == 15){
            bt16.setBackground(hiddenColor);
        }
        else{
            bt16.setBackground(mainColor);
        }
        if(hiddenButton == 16){
            bt17.setBackground(hiddenColor);
        }
        else{
            bt17.setBackground(mainColor);
        }
        if(hiddenButton == 17){
            bt18.setBackground(hiddenColor);
        }
        else{
            bt18.setBackground(mainColor);
        }
        if(hiddenButton == 18){
            bt19.setBackground(hiddenColor);
        }
        else{
            bt19.setBackground(mainColor);
        }
        if(hiddenButton == 19){
            bt20.setBackground(hiddenColor);
        }
        else{
            bt20.setBackground(mainColor);
        }
        if(hiddenButton == 20){
            bt21.setBackground(hiddenColor);
        }
        else{
            bt21.setBackground(mainColor);
        }
        if(hiddenButton == 21){
            bt22.setBackground(hiddenColor);
        }
        else{
            bt22.setBackground(mainColor);
        }
        if(hiddenButton == 22){
            bt23.setBackground(hiddenColor);
        }
        else{
            bt23.setBackground(mainColor);
        }
        if(hiddenButton == 23){
            bt24.setBackground(hiddenColor);
        }
        else{
            bt24.setBackground(mainColor);
        }
        if(hiddenButton == 24){
            bt25.setBackground(hiddenColor);
        }
        else{
            bt25.setBackground(mainColor);
        }
        
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
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Easy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Easy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt10;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt14;
    private javax.swing.JButton bt15;
    private javax.swing.JButton bt16;
    private javax.swing.JButton bt17;
    private javax.swing.JButton bt18;
    private javax.swing.JButton bt19;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt20;
    private javax.swing.JButton bt21;
    private javax.swing.JButton bt22;
    private javax.swing.JButton bt23;
    private javax.swing.JButton bt24;
    private javax.swing.JButton bt25;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JDialog dlogWin;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblFound;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField tfScore;
    // End of variables declaration//GEN-END:variables
}
