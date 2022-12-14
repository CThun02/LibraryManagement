/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Utilities.SetSize;
import java.awt.Dimension;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class FrmPhieuNhap extends javax.swing.JFrame {
    final SetSize setsize = new SetSize();
    /**
     * Creates new form NewJFrame
     */
    public FrmPhieuNhap() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.seticon();
    }

    private void seticon(){
        URL urldong = getClass().getResource("/Images/cross-small.png");
        btnDong.setIcon(setsize.setSizeAnh(urldong, 20, 20));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoDaCo = new javax.swing.JRadioButton();
        rdoChuaCo = new javax.swing.JRadioButton();
        btnDong = new javax.swing.JLabel();
        PnThongTinSach = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        btnLayThongTin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSoLuongNhap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxTheLoai = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnTheLoai = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        txtNamXuatBan = new javax.swing.JTextField();
        btnHoanThanh = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        imgAnhSach = new javax.swing.JLabel();
        btnTaiAnh = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnNXB = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnNhaCungCap = new javax.swing.JButton();
        btnTacGia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 200, 150)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Phi???u nh???p");

        jLabel3.setText("14:09, 10-11-2022");

        jLabel4.setText("ID:");

        jLabel5.setText("IS ID");

        jLabel6.setText("T??nh tr???ng:");

        rdoDaCo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoDaCo);
        rdoDaCo.setText("???? c??");
        rdoDaCo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoDaCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoDaCoMouseClicked(evt);
            }
        });

        rdoChuaCo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChuaCo);
        rdoChuaCo.setText("Ch??a c??");
        rdoChuaCo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rdoChuaCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoChuaCoMouseClicked(evt);
            }
        });

        btnDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDong.setPreferredSize(new java.awt.Dimension(22, 22));
        btnDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(214, 214, 214)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoDaCo)
                                .addGap(18, 18, 18)
                                .addComponent(rdoChuaCo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoDaCo)
                    .addComponent(rdoChuaCo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 110));

        PnThongTinSach.setBackground(new java.awt.Color(255, 255, 255));
        PnThongTinSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 200, 150)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Th??ng tin s??ch nh???p");

        jLabel7.setText("M?? s??ch");

        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });

        btnLayThongTin.setBackground(new java.awt.Color(125, 200, 150));
        btnLayThongTin.setText("Check");
        btnLayThongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setText("T??n s??ch");

        jLabel9.setText("M?? t??c gi???");

        jLabel10.setText("S??? l?????ng");

        jLabel11.setText("Nh?? xu???t b???n");

        jLabel12.setText("Th??? lo???i");

        jLabel13.setText("N??m xu???t b???n");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        boxTheLoai.setBackground(new java.awt.Color(255, 255, 255));
        boxTheLoai.setMaximumSize(new java.awt.Dimension(185, 900));
        boxTheLoai.setMinimumSize(new java.awt.Dimension(185, 30));
        boxTheLoai.setPreferredSize(new java.awt.Dimension(185, 80));
        boxTheLoai.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(250, 24));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        btnTheLoai.setBackground(new java.awt.Color(125, 200, 150));
        btnTheLoai.setText("Xem");
        btnTheLoai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheLoaiActionPerformed(evt);
            }
        });
        jPanel6.add(btnTheLoai);

        boxTheLoai.add(jPanel6);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("T??m l??");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        boxTheLoai.add(jCheckBox1);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Khoa h???c-vi???n t?????ng");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        boxTheLoai.add(jCheckBox2);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("T??nh c???m");
        boxTheLoai.add(jCheckBox3);

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Kinh doanh - kinh t???");
        boxTheLoai.add(jCheckBox4);

        jScrollPane1.setViewportView(boxTheLoai);

        btnHoanThanh.setBackground(new java.awt.Color(125, 200, 150));
        btnHoanThanh.setText("Ho??n th??nh");
        btnHoanThanh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setText("Gi?? nh???p");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAnhSach, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAnhSach, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        btnTaiAnh.setBackground(new java.awt.Color(125, 200, 150));
        btnTaiAnh.setText("T???i ???nh");
        btnTaiAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBox1.setBackground(new java.awt.Color(125, 200, 150));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnNXB.setBackground(new java.awt.Color(125, 200, 150));
        btnNXB.setText("Xem");
        btnNXB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNXBActionPerformed(evt);
            }
        });

        jLabel14.setText("Nh?? cung c???p");

        jComboBox2.setBackground(new java.awt.Color(125, 200, 150));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnNhaCungCap.setBackground(new java.awt.Color(125, 200, 150));
        btnNhaCungCap.setText("Xem");
        btnNhaCungCap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhaCungCapActionPerformed(evt);
            }
        });

        btnTacGia.setBackground(new java.awt.Color(125, 200, 150));
        btnTacGia.setText("Xem");
        btnTacGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTacGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnThongTinSachLayout = new javax.swing.GroupLayout(PnThongTinSach);
        PnThongTinSach.setLayout(PnThongTinSachLayout);
        PnThongTinSachLayout.setHorizontalGroup(
            PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2))
            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnTaiAnh)
                .addGap(33, 33, 33)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHoanThanh)
                                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnLayThongTin))
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTacGia))))
        );
        PnThongTinSachLayout.setVerticalGroup(
            PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnThongTinSachLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTacGia))
                        .addGap(16, 16, 16)
                        .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNXB)))
                    .addComponent(btnLayThongTin))
                .addGap(6, 6, 6)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaiAnh)
                    .addGroup(PnThongTinSachLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(13, 13, 13)
                .addGroup(PnThongTinSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhaCungCap))
                .addGap(18, 18, 18)
                .addComponent(btnHoanThanh)
                .addContainerGap())
        );

        jPanel1.add(PnThongTinSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 580, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoDaCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDaCoMouseClicked
        // TODO add your handling code here:
        this.checkSach(false);
    }//GEN-LAST:event_rdoDaCoMouseClicked

    private void rdoChuaCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoChuaCoMouseClicked
        // TODO add your handling code here:
        this.checkSach(true);
        txtMaSach.setText("is auto");
        txtMaSach.setEditable(false);
    }//GEN-LAST:event_rdoChuaCoMouseClicked

    private void btnDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDongMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnDongMouseClicked

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void btnNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNXBActionPerformed
        // TODO add your handling code here:
        FrmNhaXuatBan nxb = new FrmNhaXuatBan();
        nxb.setVisible(true);
    }//GEN-LAST:event_btnNXBActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnNhaCungCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhaCungCapActionPerformed
        // TODO add your handling code here:
        FrmNhaCungCap nhaCungCap = new FrmNhaCungCap();
        nhaCungCap.setVisible(true);
    }//GEN-LAST:event_btnNhaCungCapActionPerformed

    private void btnTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheLoaiActionPerformed
        // TODO add your handling code here:
        FrmTheLoai theLoai = new FrmTheLoai();
        theLoai.setVisible(true);
    }//GEN-LAST:event_btnTheLoaiActionPerformed

    private void btnTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTacGiaActionPerformed
        // TODO add your handling code here:
        FrmTacGia tacGia = new FrmTacGia();
        tacGia.setVisible(true);
    }//GEN-LAST:event_btnTacGiaActionPerformed
    
    public void checkSach(boolean ft){
        txtMaSach.setText("");
        txtMaSach.setEditable(true);
        txtTenSach.setEditable(ft);
        txtTacGia.setEditable(ft);
        txtNamXuatBan.setEditable(ft);
        boxTheLoai.setEnabled(ft);
        txtDonGia.setEditable(ft);
        btnTaiAnh.setEnabled(ft);
    }
    
    public void xemChiTiet(){
        PnThongTinSach.remove(btnLayThongTin);
        PnThongTinSach.remove(btnTacGia);
        PnThongTinSach.remove(btnTaiAnh);
        PnThongTinSach.remove(btnNXB);
        PnThongTinSach.remove(btnNhaCungCap);
        PnThongTinSach.remove(btnHoanThanh);
        PnThongTinSach.remove(btnTaiAnh);
        txtMaSach.setEditable(false);
        txtNamXuatBan.setEditable(false);
        txtSoLuongNhap.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnThongTinSach;
    private javax.swing.JPanel boxTheLoai;
    private javax.swing.JLabel btnDong;
    private javax.swing.JButton btnHoanThanh;
    private javax.swing.JButton btnLayThongTin;
    private javax.swing.JButton btnNXB;
    private javax.swing.JButton btnNhaCungCap;
    private javax.swing.JButton btnTacGia;
    private javax.swing.JButton btnTaiAnh;
    private javax.swing.JButton btnTheLoai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgAnhSach;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoChuaCo;
    private javax.swing.JRadioButton rdoDaCo;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNamXuatBan;
    private javax.swing.JTextField txtSoLuongNhap;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
