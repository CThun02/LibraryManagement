/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmTrangChu extends javax.swing.JPanel {

    /**
     * Creates new form KhoHang
     */
    public FrmTrangChu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmDiff = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbViPham = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cbbMuonSach = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cbbTraSach = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cbbNhapSach = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cbbSachLoi = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cbbSachUaThich = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        frmDiff.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Hoạt động gần đây");

        jPanel3.setBackground(new java.awt.Color(125, 200, 150));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Báo cáo vi phạm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Số người vi phạm:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, -1, -1));

        jLabel4.setText("Lỗi phổ biến:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 96, -1));

        jLabel5.setText("Thời gian:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbViPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel3.add(cbbViPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel7.setText("0");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel8.setText("error!");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        jPanel4.setBackground(new java.awt.Color(125, 200, 150));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sô lượng mượn sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Thời gian:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbMuonSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel4.add(cbbMuonSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel13.setText("Số người mượn:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 100, -1));

        jLabel14.setText("Thể loại phổ biến:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 100, -1));

        jLabel15.setText("0");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel16.setText("error!");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        jPanel5.setBackground(new java.awt.Color(125, 200, 150));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đã trả sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Thời gian:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbTraSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel5.add(cbbTraSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel19.setText("Số người trả:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 96, -1));

        jLabel20.setText("Lỡ hẹn trả:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 96, -1));

        jLabel21.setText("0");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel22.setText("0");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        jPanel14.setBackground(new java.awt.Color(125, 200, 150));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Báo cáo nhập sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel14MouseReleased(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("Số sách nhập:");
        jPanel14.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 100, -1));

        jLabel25.setText("Chi phí bỏ ra");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 96, -1));

        jLabel26.setText("Thời gian:");
        jPanel14.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbNhapSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel14.add(cbbNhapSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel27.setText("0");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel28.setText("0");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Báo cáo kho sách");

        jPanel16.setBackground(new java.awt.Color(125, 200, 150));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Số lượng sách lỗi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setText("Thời gian:");
        jPanel16.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbSachLoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel16.add(cbbSachLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel31.setText("Số lượng sách lỗi:");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 110, -1));

        jLabel32.setText("Lỗi phổ biến:");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 100, -1));

        jLabel33.setText("0");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel34.setText("error!");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        jPanel18.setBackground(new java.awt.Color(125, 200, 150));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sách ưa thích", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setText("Thời gian:");
        jPanel18.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 37, 67, -1));

        cbbSachUaThich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 ngày", "1 tuần", "1 tháng", "3 tháng" }));
        jPanel18.add(cbbSachUaThich, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 34, 134, -1));

        jLabel37.setText("Thể loại ưa thích:");
        jPanel18.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, 96, -1));

        jLabel38.setText("Lượt mượn:");
        jPanel18.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 96, 96, -1));

        jLabel39.setText("error!");
        jPanel18.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 68, -1, -1));

        jLabel40.setText("0");
        jPanel18.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 96, -1, -1));

        javax.swing.GroupLayout frmDiffLayout = new javax.swing.GroupLayout(frmDiff);
        frmDiff.setLayout(frmDiffLayout);
        frmDiffLayout.setHorizontalGroup(
            frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDiffLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(frmDiffLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmDiffLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frmDiffLayout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        frmDiffLayout.setVerticalGroup(
            frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmDiffLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(frmDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(frmDiff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(frmDiff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseReleased

    private void jPanel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbMuonSach;
    private javax.swing.JComboBox<String> cbbNhapSach;
    private javax.swing.JComboBox<String> cbbSachLoi;
    private javax.swing.JComboBox<String> cbbSachUaThich;
    private javax.swing.JComboBox<String> cbbTraSach;
    private javax.swing.JComboBox<String> cbbViPham;
    private javax.swing.JPanel frmDiff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
