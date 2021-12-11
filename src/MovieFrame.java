
import cpit380practice.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MovieFrame extends javax.swing.JFrame {

    String dir = "testtt";
    Picture frame = new Picture(600, 460);
    FrameSequencer frameSequencer
            = new FrameSequencer(dir);
    File i = new File(frameSequencer.getDirectory());

    public void OutputFrame() {
        jLabel1.setIcon(new ImageIcon(frame.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));
    }

    public MovieFrame() {
        initComponents();
        OutputFrame();
    }

    public static void deleteFile(File file) {
        if (file.isDirectory()) {
            for (File sub : file.listFiles()) {
                deleteFile(sub);
            }
        }
        file.delete();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browes = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Sunset = new javax.swing.JButton();
        TickerTape = new javax.swing.JButton();
        Chromakey = new javax.swing.JButton();
        RectangleTransformationMovie = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Sunset1 = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        browes.setBackground(new java.awt.Color(176, 196, 222));
        browes.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        browes.setForeground(new java.awt.Color(105, 105, 105));
        browes.setLabel("Browse");
        browes.setName(""); // NOI18N
        browes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(230, 230, 250));

        Sunset.setBackground(new java.awt.Color(255, 255, 240));
        Sunset.setText("Sunset");
        Sunset.setToolTipText("");
        Sunset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SunsetActionPerformed(evt);
            }
        });

        TickerTape.setBackground(new java.awt.Color(255, 255, 240));
        TickerTape.setText("Ticker Tape Movie ");
        TickerTape.setToolTipText("");
        TickerTape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TickerTapeActionPerformed(evt);
            }
        });

        Chromakey.setBackground(new java.awt.Color(255, 255, 240));
        Chromakey.setText("Chromakey");
        Chromakey.setToolTipText("");
        Chromakey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChromakeyActionPerformed(evt);
            }
        });

        RectangleTransformationMovie.setBackground(new java.awt.Color(255, 255, 240));
        RectangleTransformationMovie.setText("Rectangle Transformation Movie");
        RectangleTransformationMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleTransformationMovieActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(105, 105, 105));
        jLabel14.setText("Edits");

        Sunset1.setText("Sunset");
        Sunset1.setToolTipText("");
        Sunset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sunset1ActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(255, 255, 240));
        Clear.setText("Clear");
        Clear.setToolTipText("");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(TickerTape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Chromakey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RectangleTransformationMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(Sunset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(Sunset)
                .addGap(26, 26, 26)
                .addComponent(TickerTape)
                .addGap(26, 26, 26)
                .addComponent(Chromakey)
                .addGap(29, 29, 29)
                .addComponent(RectangleTransformationMovie)
                .addGap(32, 32, 32)
                .addComponent(Clear)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(browes, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(browes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TickerTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TickerTapeActionPerformed

        String message = JOptionPane.showInputDialog(this, "Enter Text : ", "");

        int framesPerSec = 40;
        Picture p = null;
        Graphics g = null;
        Font font = new Font("Times New Roman", Font.CENTER_BASELINE, 25);

        // text move from right to left
        for (int i = 0; i < framesPerSec * 3; i++) {
            // draw the string
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(new Color(120, 120, 120, 100));
            g.fillRect(0, (int) (frame.getHeight() - (frame.getHeight() / 4) - 25), p.getWidth(), 30);
            g.setColor(Color.WHITE);
            g.setFont(font);

            if (((int) (i * 5)) < (frame.getWidth() - 50)) {
                g.drawString(message, (int) (i * 5), (int) (frame.getHeight() - (frame.getHeight() / 4)));
            } else {
                break;
            }
//                g.drawString(message, (int) (i - 40) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }
//            if (i >= (framesPerSec * 2)) {
//                g.drawString(message, (int) (i - 80) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }

            // add frame to sequencer
            frameSequencer.addFrame(p);

        }

        for (int i = framesPerSec * 3; i > 0; i--) {
            // draw the string
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(new Color(120, 120, 120, 100));
            g.fillRect(0, (int) (frame.getHeight() - (frame.getHeight() / 4) - 25), p.getWidth(), 30);
            g.setColor(Color.WHITE);
            g.setFont(font);

            if ((i * 5) > (50)) {
                g.drawString(message, (int) (i * 5) - 50, (int) (frame.getHeight() - (frame.getHeight() / 4)));
            } else {
                break;
            }
//                g.drawString(message, (int) (i - 40) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }
//            if (i >= (framesPerSec * 2)) {
//                g.drawString(message, (int) (i - 80) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }

            // add frame to sequencer
            frameSequencer.addFrame(p);

        }

        for (int i = 0; i < framesPerSec * 3; i++) {
            // draw the string
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(new Color(120, 120, 120, 100));
            g.fillRect(0, (int) (frame.getHeight() - (frame.getHeight() / 4) - 25), p.getWidth(), 30);
            g.setColor(Color.WHITE);
            g.setFont(font);

            if (((int) (i * 5)) < (frame.getWidth() - 50)) {
                g.drawString(message, (int) (i * 5), (int) (frame.getHeight() - (frame.getHeight() / 4)));
            } else {
                break;
            }
//                g.drawString(message, (int) (i - 40) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }
//            if (i >= (framesPerSec * 2)) {
//                g.drawString(message, (int) (i - 80) * (int) (frame.getWidth() * 0.01), (int) (frame.getHeight() - (frame.getHeight() / 4)));
//            }

            // add frame to sequencer
            frameSequencer.addFrame(p);

        }

        // play the movie
        frameSequencer.play(70);


    }//GEN-LAST:event_TickerTapeActionPerformed

    private void SunsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SunsetActionPerformed

        String dir = "testtt";
        FrameSequencer frameSequencer = new FrameSequencer(dir);
        Picture currP = null;
        File dirObj = new File("blowhole/");
        String[] fileArray = dirObj.list();
        Picture p;

        if (frame.getWidth() == 600 && frame.getHeight() == 460) {
            // loop through the array of files
            for (int i = 0; i < fileArray.length - 1; i++) {
                if (fileArray[i].indexOf(".jpg") >= 0) {
                    currP = new Picture("blowhole/" + fileArray[i]);
                    currP.makeSunset(0.72);
                    frameSequencer.addFrame(currP);
                }
            }
            // play the movie
            frameSequencer.play(30);

        } else {

            for (int i = 0; i < 30; i++) {
                p = new Picture(frame);
                p.makeSunset(0.72);
                frameSequencer.addFrame(p);
            }

            frameSequencer.play(15);

        }


    }//GEN-LAST:event_SunsetActionPerformed

    private void ChromakeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChromakeyActionPerformed

        String dir = "testtt";
        FrameSequencer frameSequencer = new FrameSequencer(dir);
        JOptionPane.showMessageDialog(null,
                "Choose Frames Background ", "Select Background ", JOptionPane.OK_OPTION);
        Picture currP = new Picture(FileChooser.pickAFile());;

        // loop through the array of files
        for (int i = 0; i < 10; i++) {
            chromakey(currP);
            frameSequencer.addFrame(frame);
        }

        // play the movie
        frameSequencer.play(30);


    }//GEN-LAST:event_ChromakeyActionPerformed

    private void RectangleTransformationMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleTransformationMovieActionPerformed

        int framesPerSec = 50;
        Picture p = frame;
        Graphics g = null;
        FrameSequencer frameSequencer
                = new FrameSequencer("testtt");

        // loop through the first second
        int i;
        for (i = 0; (i * 5) < (p.getHeight() - 50); i++) {
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(Color.BLUE);

            g.fillRect((i * 2), (i * 5), 50, 50);
            frameSequencer.addFrame(p);
        }

        int x = i * 2;
        int y = i * 5;
        for (int c = 0; c < 30; c++) {
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(Color.BLUE);
            g.fillOval((x += p.getWidth() * 0.005), (y -= p.getHeight() * 0.01), 50, 50);
            frameSequencer.addFrame(p);
        }
        for (int c = 0; y < (p.getHeight() - 50); c++) {
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(Color.BLUE);
            g.fillOval((x += p.getWidth() * 0.005), (y += p.getHeight() * 0.01), 50, 50);
            frameSequencer.addFrame(p);
        }
        for (int c = 0; c < 30; c++) {
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(Color.BLUE);
            g.fillOval((x += p.getWidth() * 0.005), (y -= p.getHeight() * 0.01), 50, 50);
            frameSequencer.addFrame(p);
        }
        for (int c = 0; y < (p.getHeight()); c++) {
            p = new Picture(frame);
            g = p.getGraphics();
            g.setColor(Color.BLUE);
            g.fillOval((x += p.getWidth() * 0.005), (y += p.getHeight() * 0.01), 50, 50);
            frameSequencer.addFrame(p);
        }

        frameSequencer.play(60);


    }//GEN-LAST:event_RectangleTransformationMovieActionPerformed

    private void browesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browesActionPerformed

        CLEAR();
        frame = new Picture(FileChooser.pickAFile());
        frameSequencer.addFrame(frame);
        jLabel1.setIcon(new ImageIcon(frame.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));


    }//GEN-LAST:event_browesActionPerformed

    private void Sunset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sunset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sunset1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        CLEAR();

    }//GEN-LAST:event_ClearActionPerformed

    public void CLEAR() {

        deleteFile(i);

        dir = "testtt";
        frame = new Picture(600, 460);
        frameSequencer
                = new FrameSequencer(dir);
        i = new File(frameSequencer.getDirectory());
        OutputFrame();

    }

    public void chromakey(Picture currP) {

        Pixel currPixel = null;
        Pixel newPixel = null;

        int width, height;
        if (currP.getWidth() > frame.getWidth()) {
            width = frame.getWidth();
        } else {
            width = currP.getWidth();
        }
        if (currP.getHeight() > frame.getHeight()) {
            height = frame.getHeight();
        } else {
            height = currP.getHeight();
        }

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                currPixel = frame.getPixel(x, y);
                // In case the we want to subtract green background
                if (currPixel.getRed() + currPixel.getBlue() < currPixel.getGreen()) {
                    newPixel = currP.getPixel(x, y);
                    currPixel.setColor(newPixel.getColor());
                    continue;
                }
                // In case the we want to subtract blue background
                if (currPixel.getRed() + currPixel.getGreen() < currPixel.getBlue()) {
                    newPixel = currP.getPixel(x, y);
                    currPixel.setColor(newPixel.getColor());
                }

            }
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
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chromakey;
    private javax.swing.JButton Clear;
    private javax.swing.JButton RectangleTransformationMovie;
    private javax.swing.JButton Sunset;
    private javax.swing.JButton Sunset1;
    private javax.swing.JButton TickerTape;
    private java.awt.Button browes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
