package cpu_sched;
/**
 *
 * @author omarrefay
 */
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FCFS extends javax.swing.JFrame {

    DefaultTableModel model;
    int w1 = 0;
    int TWT = 0;

    public FCFS() {
        initComponents();
        P_ID_Field.setText("1");
        this.setLocationRelativeTo(null);
        this.setTitle("CPU Schedulling(FCFS)");
        this.setResizable(false);

//        model.removeRow(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FCFS_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AT = new javax.swing.JLabel();
        P_ID_Field = new javax.swing.JTextField();
        AT_Field = new javax.swing.JTextField();
        P_ID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Del_btn = new javax.swing.JButton();
        Back_btn = new javax.swing.JButton();
        calc_btn = new javax.swing.JButton();
        Add_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ATAT_Label = new javax.swing.JLabel();
        AWT_Label = new javax.swing.JLabel();
        S_O_P = new javax.swing.JLabel();
        SOF_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));
        jPanel1.setForeground(new java.awt.Color(108, 18, 173));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FCFS_Table.setBackground(new java.awt.Color(50, 59, 66));
        FCFS_Table.setForeground(new java.awt.Color(255, 255, 255));
        FCFS_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Arrival Time", "Waiting Time", "Turn Around Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(FCFS_Table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 237, -1, 330));

        jLabel2.setBackground(new java.awt.Color(26, 35, 126));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 18, 173));
        jLabel2.setText("First Come First Serve");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        AT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AT.setForeground(new java.awt.Color(108, 18, 173));
        AT.setText("Arrival Time");
        jPanel1.add(AT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(P_ID_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 220, 30));
        jPanel1.add(AT_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, 30));

        P_ID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        P_ID.setForeground(new java.awt.Color(108, 18, 173));
        P_ID.setText("Prosess ID");
        jPanel1.add(P_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 18, 173));
        jLabel8.setText("Average Waiting Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(108, 18, 173));
        jLabel9.setText("Average Turn Around Time");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        Del_btn.setBackground(new java.awt.Color(216, 53, 53));
        Del_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Del_btn.setForeground(new java.awt.Color(255, 255, 255));
        Del_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu_sched/pngwing.com (22).png"))); // NOI18N
        Del_btn.setText("Del");
        Del_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Del_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 100, 40));

        Back_btn.setBackground(new java.awt.Color(108, 18, 173));
        Back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu_sched/pngwing.com (20).png"))); // NOI18N
        Back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 40));

        calc_btn.setBackground(new java.awt.Color(76, 183, 72));
        calc_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        calc_btn.setForeground(new java.awt.Color(255, 255, 255));
        calc_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu_sched/calculator.png"))); // NOI18N
        calc_btn.setText("Calc");
        calc_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_btnActionPerformed(evt);
            }
        });
        jPanel1.add(calc_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, 40));

        Add_btn.setBackground(new java.awt.Color(76, 183, 72));
        Add_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Add_btn.setForeground(new java.awt.Color(255, 255, 255));
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu_sched/pngwing.com (21).png"))); // NOI18N
        Add_btn.setText("ADD");
        Add_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cpu_sched/pngwing.com (19).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        ATAT_Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ATAT_Label.setForeground(new java.awt.Color(108, 18, 173));
        jPanel1.add(ATAT_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 150, 30));

        AWT_Label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AWT_Label.setForeground(new java.awt.Color(108, 18, 173));
        jPanel1.add(AWT_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 150, 30));

        S_O_P.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        S_O_P.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(S_O_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 165, 120, 40));

        SOF_label.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SOF_label.setForeground(new java.awt.Color(108, 18, 173));
        SOF_label.setText("State of Processes");
        jPanel1.add(SOF_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) FCFS_Table.getModel();
        if (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
            P_ID_Field.setText(String.valueOf(Integer.parseInt(P_ID_Field.getText())-1));
        } else {
                JOptionPane.showMessageDialog(null, "Please enter New Rows First");
            }
    }//GEN-LAST:event_Del_btnActionPerformed

    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
        frame_1 Start = new frame_1();
        Start.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back_btnActionPerformed

    private void calc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_btnActionPerformed

            if (model != null&&model.getRowCount()>0) {
                int rowCount = model.getRowCount();
                int CpuTime[] = new int[rowCount];
                int WaitingTime[] = new int[rowCount];
                int TurnAroundTime[] = new int[rowCount];
                for (int i = 0; i < rowCount; i++) {
                    CpuTime[i] = Integer.parseInt(String.valueOf(model.getValueAt(i, 1)));
                }
                for (int i = 1; i < rowCount; i++) {
                    WaitingTime[i] = WaitingTime[i - 1] + CpuTime[i - 1];
                }
                for (int i = 0; i < rowCount; i++) {
                    TurnAroundTime[i] = WaitingTime[i] + CpuTime[i];
                }
                Show_Answer();
                changeState("Running",Color.GREEN);

            } else {
                JOptionPane.showMessageDialog(null, "Please enter New Rows First","WARNING",JOptionPane.WARNING_MESSAGE);
                
            }

    }//GEN-LAST:event_calc_btnActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        // TODO add your handling code here:
        
        model = (DefaultTableModel) FCFS_Table.getModel();
        Add_To_Table();
        changeState("Waiting",Color.RED);

    }//GEN-LAST:event_Add_btnActionPerformed
    private void Add_To_Table() {

        try {

            int ArrivalTime = Integer.parseInt(AT_Field.getText());
            String ProcessID = P_ID_Field.getText();
            if (!ProcessID.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) FCFS_Table.getModel();
                TWT = w1 + Integer.parseInt(AT_Field.getText());
                Object[] row = {"P" + ProcessID, ArrivalTime, w1, TWT};
                model.addRow(row);
                w1 = Integer.parseInt(AT_Field.getText()) + w1;
                Clear_CPU_Time();
                Increament_Num_Process();
                AT_Field.requestFocusInWindow();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid integers For Arrival Time.","Invalid Input", JOptionPane.ERROR_MESSAGE);

        }
    }
    private void Clear_CPU_Time() {
        AT_Field.setText("");
    }
    private void Increament_Num_Process() {
        P_ID_Field.setText(String.valueOf(Integer.parseInt(P_ID_Field.getText()) + 1));
    }
    private void Show_Answer() {
        double T_W = 0;
        double T_W_T = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            T_W += Integer.parseInt(String.valueOf(model.getValueAt(i, 2)));
            T_W_T += Integer.parseInt(String.valueOf(model.getValueAt(i, 3)));
        }
        T_W /= model.getRowCount();
        T_W_T /= model.getRowCount();
        AWT_Label.setText(String.valueOf(T_W));
        ATAT_Label.setText(String.valueOf(T_W_T));

    }
        private void changeState(String State , Color Col) {
        S_O_P.setText(State);
        S_O_P.setForeground(Col);
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCFS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AT;
    private javax.swing.JLabel ATAT_Label;
    private javax.swing.JTextField AT_Field;
    private javax.swing.JLabel AWT_Label;
    private javax.swing.JButton Add_btn;
    private javax.swing.JButton Back_btn;
    private javax.swing.JButton Del_btn;
    private javax.swing.JTable FCFS_Table;
    private javax.swing.JLabel P_ID;
    private javax.swing.JTextField P_ID_Field;
    private javax.swing.JLabel SOF_label;
    private javax.swing.JLabel S_O_P;
    private javax.swing.JButton calc_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
