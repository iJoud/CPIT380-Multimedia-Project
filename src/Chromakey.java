
import cpit380practice.*;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Chromakey extends javax.swing.JFrame {

    String Pic1_Path;
    String Pic2_Path;
    Picture Pic1;
    Picture Pic2;
    Picture out;
    Font font = new Font("Dialog", Font.CENTER_BASELINE, 16);

    public Chromakey() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Browse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultPic = new javax.swing.JLabel();
        Chromakey = new javax.swing.JButton();
        pic1INFO = new javax.swing.JLabel();
        pic2INFO = new javax.swing.JLabel();
        Pic1Label = new javax.swing.JLabel();
        Pic2Label = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1097, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Browse.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        getContentPane().add(Browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 156, 42));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 90, 394, 302));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 90, 394, 302));
        getContentPane().add(resultPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 492, 394, 302));

        Chromakey.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Chromakey.setText("Chromakey");
        Chromakey.setToolTipText("");
        Chromakey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChromakeyActionPerformed(evt);
            }
        });
        getContentPane().add(Chromakey, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 731, 179, 52));
        getContentPane().add(pic1INFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 410, -1, -1));
        getContentPane().add(pic2INFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 410, -1, -1));
        getContentPane().add(Pic1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 401, -1, -1));
        getContentPane().add(Pic2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 401, -1, -1));

        label1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label1.setForeground(new java.awt.Color(105, 105, 105));
        label1.setText("Input Image");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, -1, -1));

        label2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label2.setForeground(new java.awt.Color(105, 105, 105));
        label2.setText("Output Image");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label4.setForeground(new java.awt.Color(105, 105, 105));
        label4.setText("Input Image");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jLabel4.setText("2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 800, 370, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed

        Pic1_Path = FileChooser.pickAFile();
        Pic1 = new Picture(Pic1_Path);

        Pic2_Path = FileChooser.pickAFile();
        Pic2 = new Picture(Pic2_Path);

        jLabel2.setIcon(new ImageIcon(Pic1.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));
        jLabel1.setIcon(new ImageIcon(Pic2.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));

        pic1INFO.setFont(font);
        jLabel3.setFont(font);
        pic1INFO.setText(" Width = " + Pic1.getWidth() + "  , Height = " + Pic1.getHeight());

        this.remove(pic2INFO);
        jLabel3.setText(" Width = " + Pic2.getWidth() + "  , Height = " + Pic2.getHeight());
    }//GEN-LAST:event_BrowseActionPerformed

    private void ChromakeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChromakeyActionPerformed

        Pixel currPixel = null;
        Pixel newPixel = null;

        int width, height;
        if (Pic1.getWidth() > Pic2.getWidth()) {
            width = Pic2.getWidth();
        } else {
            width = Pic1.getWidth();
        }
        if (Pic1.getHeight() > Pic2.getHeight()) {
            height = Pic2.getHeight();
        } else {
            height = Pic1.getHeight();
        }

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                currPixel = Pic1.getPixel(x, y);
                // In case the we want to subtract green background
                if (currPixel.getRed() + currPixel.getBlue() < currPixel.getGreen()) {
                    newPixel = Pic2.getPixel(x, y);
                    currPixel.setColor(newPixel.getColor());
                    continue;
                }
                // In case the we want to subtract blue background
                if (currPixel.getRed() + currPixel.getGreen() < currPixel.getBlue()) {
                    newPixel = Pic2.getPixel(x, y);
                    currPixel.setColor(newPixel.getColor());
                }

            }
        }

        resultPic.setIcon(new ImageIcon(Pic1.getImage().getScaledInstance(resultPic.getWidth(), resultPic.getHeight(), Image.SCALE_SMOOTH)));

        jLabel4.setFont(font);
        jLabel4.setText(" Width = " + resultPic.getWidth() + "  , Height = " + resultPic.getHeight());

    }//GEN-LAST:event_ChromakeyActionPerformed

    private void OutputPicture() {
        resultPic.setIcon(new ImageIcon(out.getImage().getScaledInstance(resultPic.getWidth(), resultPic.getHeight(), Image.SCALE_SMOOTH)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chromakey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chromakey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chromakey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chromakey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chromakey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton Chromakey;
    private javax.swing.JLabel Pic1Label;
    private javax.swing.JLabel Pic2Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private javax.swing.JLabel pic1INFO;
    private javax.swing.JLabel pic2INFO;
    private javax.swing.JLabel resultPic;
    // End of variables declaration//GEN-END:variables

}
