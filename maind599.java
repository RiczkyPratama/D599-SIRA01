package test1;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author RICZKY PRATAMA || TECH ENTHUSIAST || SILVER_RABBITKU aka SIRA || Medium.com/@furatamarizuki
 * Codingan ini memiliki lisensi dan mengambil tanpa seizin pemilik akan ada konsekuensinya, terima kasih!
 */
public class maind599 extends javax.swing.JFrame {
    JPanel paneldasboard = new PanelDasboard();
    private HashMap<String, String> credentials;

    /**
     * Creates new form maind599
     */
    public maind599() {
        initComponents();
        credentials = new HashMap<>();
        credentials.put("Riczky", "123456");
        credentials.put("Faisal", "123456");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jpass = new javax.swing.JPasswordField();
        bmasuk = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jctampil = new javax.swing.JCheckBox();
        juser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DISCORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 270, 190, 52);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("599");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 310, 80, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/discordgerak1-2.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 200, 200);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 314, 460);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jpass);
        jpass.setBounds(160, 230, 240, 30);

        bmasuk.setText("Masuk");
        bmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmasukActionPerformed(evt);
            }
        });
        jPanel2.add(bmasuk);
        bmasuk.setBounds(290, 310, 110, 30);

        bkeluar.setText("Keluar");
        jPanel2.add(bkeluar);
        bkeluar.setBounds(170, 310, 110, 30);

        jctampil.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jctampil.setForeground(new java.awt.Color(255, 255, 255));
        jctampil.setText("Tampilkan Password");
        jctampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctampilActionPerformed(evt);
            }
        });
        jPanel2.add(jctampil);
        jctampil.setBounds(240, 270, 160, 24);
        jPanel2.add(juser);
        juser.setBounds(160, 190, 240, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PASSWORD");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 230, 90, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("this app created by @silver_rabbitku");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(90, 380, 300, 18);

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Silahkan login terlebih dahulu untuk ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 120, 260, 30);

        jLabel5.setFont(new java.awt.Font("Pricedown Bl", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELAMAT DATANG");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(100, 70, 270, 60);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("USERNAME");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 190, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/doodlep_1.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 470, 470);

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("mendapatkan akses pada fitur terbaru D599");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(80, 140, 290, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(310, 0, 470, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jctampilActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if (jctampil.isSelected()) {
            jpass.setEchoChar((char)0);
        }
        else {
            jpass.setEchoChar('*');
        }
    }                                        

    private void bmasukActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
        String username = juser.getText();
        String password = new String(jpass.getPassword());
        
        if (juser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out username");
        }
        
        else if (jpass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        
        else if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            paneldasboard = new PanelDasboard();
            getContentPane().removeAll(); // Hapus semua komponen dari JFrame
            setContentPane(paneldasboard); // Ganti JPanel1 dengan JPanel2 di JFrame
        
            revalidate();
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Wrong username or password", "Message", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(maind599.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maind599.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maind599.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maind599.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                maind599 form = new maind599();
                
                int width = 790;
                int height = 499;
                
                // Menghitung posisi tengah layar
            int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
            int screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
            int xPos = (screenWidth - width) / 2;
            int yPos = (screenHeight - height) / 2;
            
            form.setBounds(xPos, yPos, width, height);
            form.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bmasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JCheckBox jctampil;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField juser;
    // End of variables declaration                   
}
