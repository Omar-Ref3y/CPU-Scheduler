package cpu_sched;
/**
 *
 * @author omarrefay
 */

public class frame_1 extends javax.swing.JFrame {

    public frame_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CPU Schedulling");
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FCFS_btn = new javax.swing.JButton();
        PNP_btn = new javax.swing.JButton();
        RR_btn = new javax.swing.JButton();
        SJF_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\omarr\\OneDrive\\Documents\\NetBeansProjects\\cpu_sched\\src\\cpu_sched\\pngwing.com (18).png")); // NOI18N

        FCFS_btn.setBackground(new java.awt.Color(50, 59, 66));
        FCFS_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        FCFS_btn.setForeground(new java.awt.Color(255, 255, 255));
        FCFS_btn.setText("FCFS");
        FCFS_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FCFS_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCFS_btnActionPerformed(evt);
            }
        });

        PNP_btn.setBackground(new java.awt.Color(50, 59, 66));
        PNP_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PNP_btn.setForeground(new java.awt.Color(255, 255, 255));
        PNP_btn.setText("PNP");
        PNP_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PNP_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNP_btnActionPerformed(evt);
            }
        });

        RR_btn.setBackground(new java.awt.Color(50, 59, 66));
        RR_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RR_btn.setForeground(new java.awt.Color(255, 255, 255));
        RR_btn.setText("RR");
        RR_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RR_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RR_btnActionPerformed(evt);
            }
        });

        SJF_btn.setBackground(new java.awt.Color(50, 59, 66));
        SJF_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SJF_btn.setForeground(new java.awt.Color(255, 255, 255));
        SJF_btn.setText("SJF");
        SJF_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SJF_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SJF_btnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(202, 209, 188));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 18, 173));
        jLabel2.setText("CPU Scheldulling");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("copyright © OmarRefay");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PNP_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RR_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FCFS_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SJF_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 196, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PNP_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(RR_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(FCFS_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SJF_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCFS_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCFS_btnActionPerformed
        // TODO add your handling code here:
        FCFS FCFS_Frame=new FCFS();
        FCFS_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FCFS_btnActionPerformed

    private void PNP_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNP_btnActionPerformed
        // TODO add your handling code here:
                PNP PNP_Frame=new PNP();
        PNP_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PNP_btnActionPerformed

    private void SJF_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SJF_btnActionPerformed
        // TODO add your handling code here:
                SJF SJF_Frame=new SJF();
        SJF_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SJF_btnActionPerformed

    private void RR_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RR_btnActionPerformed
        // TODO add your handling code here:
                RR RR_Frame=new RR();
        RR_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RR_btnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FCFS_btn;
    private javax.swing.JButton PNP_btn;
    private javax.swing.JButton RR_btn;
    private javax.swing.JButton SJF_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
