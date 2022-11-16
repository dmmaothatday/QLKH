/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLKHView;
import QLKHController.*;
/**
 *
 * @author trinh
 */

public class indexFormNVKK extends javax.swing.JFrame {

    /**
     * Creates new form indexFormNVKK
     */
    public indexFormNVKK() {
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

        lblKho = new javax.swing.JLabel();
        lblNhanVienKiemKe = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        btnKhu = new javax.swing.JButton();
        btnDay = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnLoaiSanPham = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblKho.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblKho.setText("QUẢN LÝ KHO XE ĐẠP");

        lblNhanVienKiemKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNhanVienKiemKe.setText("NHÂN VIÊN KIỂM KÊ");

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnKhu.setIcon(new javax.swing.ImageIcon("C:\\Users\\letha\\OneDrive\\Pictures\\area.png")); // NOI18N
        btnKhu.setText("Quản lý khu");
        btnKhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuActionPerformed(evt);
            }
        });

        btnDay.setIcon(new javax.swing.ImageIcon("C:\\Users\\letha\\OneDrive\\Pictures\\row.png")); // NOI18N
        btnDay.setText("Quản lý dãy");
        btnDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDayActionPerformed(evt);
            }
        });

        btnSanPham.setIcon(new javax.swing.ImageIcon("C:\\Users\\letha\\OneDrive\\Pictures\\database.png")); // NOI18N
        btnSanPham.setText("Quản lý sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnLoaiSanPham.setIcon(new javax.swing.ImageIcon("C:\\Users\\letha\\OneDrive\\Pictures\\database (1).png")); // NOI18N
        btnLoaiSanPham.setText("Quản lý loại sản phẩm");
        btnLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKho)
                .addGap(166, 166, 166)
                .addComponent(btnDangXuat)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblNhanVienKiemKe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblKho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnDangXuat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNhanVienKiemKe)
                .addGap(68, 68, 68)
                .addComponent(btnKhu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhapForm.runLogin();
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        QLSanPhamForm.runQLSanPham();
        this.setVisible(false);
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        QLLoaiSanPhamForm.runQLLoaiSP();
        this.setVisible(false);
    }//GEN-LAST:event_btnLoaiSanPhamActionPerformed

    private void btnKhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuActionPerformed
        // TODO add your handling code here:
        QLKhuForm.runQLKhu();
        this.setVisible(false);
    }//GEN-LAST:event_btnKhuActionPerformed

    private void btnDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDayActionPerformed
        // TODO add your handling code here:
        QLDayForm.runQLDay();
        this.setVisible(false);
    }//GEN-LAST:event_btnDayActionPerformed

 
    /**
     * @param args the command line arguments
     */
    public static void runIndexNVKK() {
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
            java.util.logging.Logger.getLogger(indexFormNVKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(indexFormNVKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(indexFormNVKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(indexFormNVKK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new indexFormNVKK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDay;
    private javax.swing.JButton btnKhu;
    private javax.swing.JButton btnLoaiSanPham;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JLabel lblKho;
    private javax.swing.JLabel lblNhanVienKiemKe;
    // End of variables declaration//GEN-END:variables
}
