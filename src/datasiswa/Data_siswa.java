/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasiswa;
import java.sql.*;
import java.text.Format;
import javax.swing.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author FAHMI
 */
public class Data_siswa extends javax.swing.JFrame {
public String tgllahir;
    /**
     * Creates new form Data_siswa
     */
    public Data_siswa() {
        initComponents();
        menampilkandata();
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
        jLabel1 = new javax.swing.JLabel();
        nisn = new javax.swing.JLabel();
        nis = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        agama = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        tfnisn = new javax.swing.JTextField();
        tfnis = new javax.swing.JTextField();
        tfnama = new javax.swing.JTextField();
        tftempat = new javax.swing.JTextField();
        tgl_lahir = new com.toedter.calendar.JDateChooser();
        tfagama = new javax.swing.JTextField();
        tfalamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfcaridata = new javax.swing.JTextField();
        btncaridata = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jeniskelamin = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SISWA JURUSAN RPL");

        nisn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nisn.setText("NISN");

        nis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nis.setText("NIS");

        nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nama.setText("NAMA");

        label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label.setText("TEMPAT,TANGGAL LAHIR");

        agama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        agama.setText("AGAMA");

        alamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alamat.setText("ALAMAT");

        tgl_lahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgl_lahirPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("CARI BERDASARKAN NIS");

        btncaridata.setText("CARI");
        btncaridata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncaridataActionPerformed(evt);
            }
        });

        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnedit.setText("UBAH");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("JENIS KELAMIN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NISN", "NIS", "NAMA", "JENKEL", "TEMPAT", "TGL LAHIR", "AGAMA", "ALAMAT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki laki", "Perempuan" }));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nisn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfnisn)
                                    .addComponent(tfnis)
                                    .addComponent(tfnama)
                                    .addComponent(tfcaridata)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(350, 350, 350))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(agama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tftempat, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfalamat)
                                    .addComponent(tfagama)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btntambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnkeluar)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncaridata, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfcaridata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncaridata))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nisn)
                                    .addComponent(tfnisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nis))
                            .addComponent(tfnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nama))
                    .addComponent(tfnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label)
                    .addComponent(tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agama)
                    .addComponent(tfagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alamat)
                    .addComponent(tfalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal)
                    .addComponent(btnkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tgl_lahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgl_lahirPropertyChange
       if(tgl_lahir.getDate() !=null){
           SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
           tgllahir = format.format (tgl_lahir.getDate());
       }
    }//GEN-LAST:event_tgl_lahirPropertyChange

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)datasiswa.koneksi.koneksiDB();
            String sql="insert into tbl_datasiswa values('"
                    +tfnisn.getText()+"','"
                    +tfnis.getText()+"','"
                    +tfnama.getText()+"','"
                    +jeniskelamin.getSelectedItem()+"','"
                    +tftempat.getText()+"','"
                    +tgllahir+"','"
                    +tfagama.getText()+"','"
                    +tfalamat.getText()+"')";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            menampilkandata();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        tfnisn.setText("");
        tfnis.setText("");
        tfnama.setText("");
        jeniskelamin.setSelectedItem("");
        tftempat.setText("");
        tgl_lahir.setDate(null);
        tfagama.setText("");
        tfalamat.setText("");
        nisn.requestFocus();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Anda Akan keluar dari aplikasi",
                "Keluar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btncaridataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncaridataActionPerformed
        try {
            java.sql.Connection conn=(java.sql.Connection)datasiswa.koneksi.koneksiDB();

            String sql = "Select * from tbl_datasiswa where nis='"+tfcaridata.getText()+"'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
                if (rs.next()){
                    tfnisn.setText(rs.getString(1));
                    tfnis.setText(rs.getString(2));
                    tfnama.setText(rs.getString(3));
                    jeniskelamin.setSelectedItem(rs.getString(4));
                    tftempat.setText(rs.getString(5));
                    tgl_lahir.setDate(rs.getDate(6));
                    tfagama.setText(rs.getString(7));
                    tfalamat.setText(rs.getString(8));
                    JOptionPane.showMessageDialog(null,"Data Siswa dengan nis : "
                    + tfcaridata.getText() + " ditemukan");
                }else{
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan","Peringatan",JOptionPane.OK_OPTION);
                }
        } catch (Exception e){}
        tfcaridata.requestFocus();
    }//GEN-LAST:event_btncaridataActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)datasiswa.koneksi.koneksiDB();
            String sql= "update tbl_datasiswa set nisn='"+tfnisn.getText()+
                    "',nis='"+tfnis.getText()+
                    "',nama='"+tfnama.getText()+
                    "',jenkel='"+jeniskelamin.getSelectedItem()+
                    "',tempat='"+tftempat.getText()+
                    "',tgllahir='"+tgllahir+
                    "',agama='"+tfagama.getText()+
                    "',alamat='"+tfalamat.getText()+
                    "'where nisn='"+tfnisn.getText()+"'";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            menampilkandata();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data gagal diubah");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try{
            java.sql.Connection conn=(java.sql.Connection)datasiswa.koneksi.koneksiDB();
            String sql = "delete from tbl_datasiswa where nisn='"+tfnisn.getText()+"'";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            menampilkandata();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    public void menampilkandata(){
        DefaultTableModel tabel=new DefaultTableModel();
        tabel.addColumn("NISN");
        tabel.addColumn("NIS");
        tabel.addColumn("NAMA");
        tabel.addColumn("JENKEL");
        tabel.addColumn("TEMPAT");
        tabel.addColumn("TGL LAHIR");
        tabel.addColumn("AGAMA");
        tabel.addColumn("ALAMAT");
        try {
            java.sql.Connection conn = (java.sql.Connection)datasiswa.koneksi.koneksiDB();
            String sql="select * from tbl_datasiswa";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next())
            {
            tabel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8)});
            }
            jTable1.setModel(tabel);
            }
        catch (Exception e){}
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
            java.util.logging.Logger.getLogger(Data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agama;
    private javax.swing.JLabel alamat;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncaridata;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jeniskelamin;
    private javax.swing.JLabel label;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nis;
    private javax.swing.JLabel nisn;
    private javax.swing.JTextField tfagama;
    private javax.swing.JTextField tfalamat;
    private javax.swing.JTextField tfcaridata;
    private javax.swing.JTextField tfnama;
    private javax.swing.JTextField tfnis;
    private javax.swing.JTextField tfnisn;
    private javax.swing.JTextField tftempat;
    private com.toedter.calendar.JDateChooser tgl_lahir;
    // End of variables declaration//GEN-END:variables
}
