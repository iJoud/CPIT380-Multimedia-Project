
import javax.swing.JOptionPane;
import cpit380practice.*;
import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class PictureFrame extends javax.swing.JFrame {

    String Pic1_Path;
    Picture Pic1;
    Picture Pic2;
    int x1, x2, y1, y2;
    boolean Clicked = false;

    public PictureFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Max = new javax.swing.JButton();
        Min = new javax.swing.JButton();
        Average = new javax.swing.JButton();
        Median = new javax.swing.JButton();
        GrayScale = new javax.swing.JButton();
        Binary = new javax.swing.JButton();
        Laplacian = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Histogram = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ScaleDown = new javax.swing.JButton();
        ScaleUp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        EdgeDetectionAmount = new javax.swing.JTextField();
        EdgeDetection = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        HorizontalRef = new javax.swing.JButton();
        VerticalRef = new javax.swing.JButton();
        Diagonal_D1_UpperToLower1 = new javax.swing.JButton();
        Diagonal_D1_LowerToUpper = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jSlider3 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        RedEye = new javax.swing.JButton();
        Collage = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Copy = new javax.swing.JButton();
        PlottingHistogram = new javax.swing.JButton();
        ToChromakey = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Crop = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        yposi = new javax.swing.JTextField();
        xposi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        blueVal = new javax.swing.JTextField();
        redVal = new javax.swing.JTextField();
        GreenVal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PicInfo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PicInformation = new javax.swing.JLabel();
        PicInformation1 = new javax.swing.JLabel();

        jButton5.setText("r180");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("r90");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CPIT380 Project");
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label1.setForeground(new java.awt.Color(105, 105, 105));
        label1.setText("Input Image");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        button1.setBackground(new java.awt.Color(176, 196, 222));
        button1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        button1.setLabel("Browse");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 290, 50));
        button1.getAccessibleContext().setAccessibleDescription("");

        label2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label2.setForeground(new java.awt.Color(105, 105, 105));
        label2.setText("Output Image");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 420, 340));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 420, 340));

        jPanel1.setBackground(new java.awt.Color(230, 230, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Max.setBackground(new java.awt.Color(255, 255, 240));
        Max.setText("Max");
        Max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxActionPerformed(evt);
            }
        });
        jPanel1.add(Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 31, 107, -1));

        Min.setBackground(new java.awt.Color(255, 255, 240));
        Min.setText("Min");
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });
        jPanel1.add(Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 31, 107, -1));

        Average.setBackground(new java.awt.Color(255, 255, 240));
        Average.setText("Average");
        Average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverageActionPerformed(evt);
            }
        });
        jPanel1.add(Average, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 69, 107, -1));

        Median.setBackground(new java.awt.Color(255, 255, 240));
        Median.setText("Median");
        Median.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedianActionPerformed(evt);
            }
        });
        jPanel1.add(Median, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 31, 138, -1));

        GrayScale.setBackground(new java.awt.Color(255, 255, 240));
        GrayScale.setText("Gray Scale");
        GrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrayScaleActionPerformed(evt);
            }
        });
        jPanel1.add(GrayScale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, 110, -1));

        Binary.setBackground(new java.awt.Color(255, 255, 240));
        Binary.setText("Binary");
        Binary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinaryActionPerformed(evt);
            }
        });
        jPanel1.add(Binary, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 69, 138, -1));

        Laplacian.setBackground(new java.awt.Color(255, 255, 240));
        Laplacian.setText("Laplacian");
        Laplacian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaplacianActionPerformed(evt);
            }
        });
        jPanel1.add(Laplacian, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 107, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 240));
        jButton1.setText("Sunset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 107, 107, -1));

        Histogram.setBackground(new java.awt.Color(255, 255, 240));
        Histogram.setText("Histogram");
        Histogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistogramActionPerformed(evt);
            }
        });
        jPanel1.add(Histogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 107, 138, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(105, 105, 105));
        jLabel11.setText("Filter");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 420, 150));

        jPanel2.setBackground(new java.awt.Color(230, 230, 250));

        ScaleDown.setBackground(new java.awt.Color(255, 255, 240));
        ScaleDown.setText("Scale Down");
        ScaleDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleDownActionPerformed(evt);
            }
        });

        ScaleUp.setBackground(new java.awt.Color(255, 255, 240));
        ScaleUp.setText("Scale Up ");
        ScaleUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleUpActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(105, 105, 105));
        jLabel9.setText("Scale");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ScaleUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScaleDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScaleDown)
                .addGap(11, 11, 11)
                .addComponent(ScaleUp))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 140, 110));

        jPanel3.setBackground(new java.awt.Color(230, 230, 250));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(105, 105, 105));
        jLabel8.setText("Value for edge detection : ");

        EdgeDetectionAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EdgeDetectionAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeDetectionAmountActionPerformed(evt);
            }
        });

        EdgeDetection.setBackground(new java.awt.Color(255, 255, 240));
        EdgeDetection.setText("Edge Detection");
        EdgeDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeDetectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(EdgeDetection)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdgeDetectionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdgeDetectionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdgeDetection)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 292, 100));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1162, 826, -1, -1));

        jPanel5.setBackground(new java.awt.Color(230, 230, 250));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(105, 105, 105));
        jLabel7.setText("Reflection");

        HorizontalRef.setBackground(new java.awt.Color(255, 255, 240));
        HorizontalRef.setText("Horizontal");
        HorizontalRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorizontalRefActionPerformed(evt);
            }
        });

        VerticalRef.setBackground(new java.awt.Color(255, 255, 240));
        VerticalRef.setText("Vertical");
        VerticalRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerticalRefActionPerformed(evt);
            }
        });

        Diagonal_D1_UpperToLower1.setBackground(new java.awt.Color(255, 255, 240));
        Diagonal_D1_UpperToLower1.setText("D1 : Right To Left");
        Diagonal_D1_UpperToLower1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagonal_D1_UpperToLower1ActionPerformed(evt);
            }
        });

        Diagonal_D1_LowerToUpper.setBackground(new java.awt.Color(255, 255, 240));
        Diagonal_D1_LowerToUpper.setText("D1 : Left To Right");
        Diagonal_D1_LowerToUpper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagonal_D1_LowerToUpperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(19, 19, 19)
                .addComponent(Diagonal_D1_LowerToUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Diagonal_D1_UpperToLower1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(HorizontalRef, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(VerticalRef, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diagonal_D1_LowerToUpper, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diagonal_D1_UpperToLower1)
                    .addComponent(HorizontalRef)
                    .addComponent(VerticalRef)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 720, 50));

        jPanel7.setBackground(new java.awt.Color(230, 230, 250));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel7.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, -1));
        jSlider1.getAccessibleContext().setAccessibleParent(jLabel2);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setText("Red");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        jPanel7.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setText("Green");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 40));

        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });
        jPanel7.add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));
        jSlider3.getAccessibleContext().setAccessibleParent(jLabel1);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setText("Blue");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(105, 105, 105));
        jLabel12.setText("Colors");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 292, 200));

        jPanel8.setBackground(new java.awt.Color(230, 230, 250));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 105, 105));
        jLabel10.setText("Rotation");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 240));
        jButton3.setText("RotateLeft");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 240));
        jButton4.setText("RotateRight");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, -1));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 140, 110));

        jPanel10.setBackground(new java.awt.Color(230, 230, 250));

        jButton7.setBackground(new java.awt.Color(255, 255, 240));
        jButton7.setText("Blend");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        RedEye.setBackground(new java.awt.Color(255, 255, 240));
        RedEye.setText("Red Eye Reduction");
        RedEye.setToolTipText("");
        RedEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedEyeActionPerformed(evt);
            }
        });

        Collage.setBackground(new java.awt.Color(255, 255, 240));
        Collage.setText("Collage");
        Collage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollageActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 240));
        jButton8.setText("Draw Rectangles");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        Copy.setBackground(new java.awt.Color(255, 255, 240));
        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });

        PlottingHistogram.setBackground(new java.awt.Color(255, 255, 240));
        PlottingHistogram.setText("Plotting Histogram");
        PlottingHistogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlottingHistogramActionPerformed(evt);
            }
        });

        ToChromakey.setBackground(new java.awt.Color(255, 255, 240));
        ToChromakey.setText("To Chromakey");
        ToChromakey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToChromakeyActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 240));
        jButton9.setText("Collage");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(105, 105, 105));
        jLabel13.setText("Methods");

        Crop.setBackground(new java.awt.Color(255, 255, 240));
        Crop.setText("Crop");
        Crop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Collage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Crop, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RedEye, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlottingHistogram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ToChromakey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(Crop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Collage)
                    .addComponent(Copy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedEye)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlottingHistogram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ToChromakey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 420, 290));

        jButton13.setBackground(new java.awt.Color(255, 255, 240));
        jButton13.setText("Clear");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 292, -1));

        jPanel6.setBackground(new java.awt.Color(230, 230, 250));

        jLabel14.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(105, 105, 105));
        jLabel14.setText("Pixel Information");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(105, 105, 105));
        jLabel15.setText("Y = ");

        yposi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yposi.setText("        ");
        yposi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yposiActionPerformed(evt);
            }
        });

        xposi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xposi.setText("        ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(105, 105, 105));
        jLabel16.setText("X = ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(105, 105, 105));
        jLabel17.setText("Red");

        blueVal.setText("        ");

        redVal.setText("        ");

        GreenVal.setText("        ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 105, 105));
        jLabel18.setText("Green");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(105, 105, 105));
        jLabel19.setText("Blue");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xposi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redVal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GreenVal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(blueVal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yposi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(yposi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xposi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(blueVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(GreenVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 292, -1));

        jPanel9.setBackground(new java.awt.Color(230, 230, 250));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(105, 105, 105));
        jLabel6.setText("Information ");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        PicInfo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jPanel9.add(PicInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(105, 105, 105));
        jLabel20.setText("Picture ");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        PicInformation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PicInformation.setText("                         ");
        jPanel9.add(PicInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 30));

        PicInformation1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PicInformation1.setText("                         ");
        jPanel9.add(PicInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 420, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        Pic1_Path = FileChooser.pickAFile();//FileChooser.pickAFile();//FileChooser.pickAFile();
        Pic1 = new Picture(Pic1_Path);
        Pic2 = new Picture(Pic1);

        PicInformation1.setText("Width = " + Pic1.getWidth() + " , Height = " + Pic1.getHeight());
        Pixel[] p = Pic1.getPixels();

        PicInformation.setText("Number of Pixels = " + (Pic1.getWidth() * Pic1.getHeight()) + " Pixels");
        jLabel1.setIcon(new ImageIcon(Pic1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH)));

        OutputPicture();
    }//GEN-LAST:event_button1ActionPerformed

    public void OutputPicture() {
        jLabel2.setIcon(new ImageIcon(Pic2.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Pixel[] OutputPic = Pic2.getPixels();
        for (int i = 0; i < OutputPic.length; i++) {
            int green = (int) (OutputPic[i].getGreen() * 0.7);
            int blue = (int) (OutputPic[i].getBlue() * 0.7);
            OutputPic[i].setColor(new Color(OutputPic[i].getRed(), green, blue));
        }
        OutputPicture();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ScaleUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleUpActionPerformed

        String numTimesStr = JOptionPane.showInputDialog(null, "Please Enter Scale Up Factor: ");
        int numTimes = Integer.parseInt(numTimesStr);

        Pic2 = new Picture(Pic1.getWidth() * numTimes, Pic1.getHeight() * numTimes);
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        int targetX = 0;
        int targetY = 0;
        for (int sourceX = 0; sourceX < Pic1.getWidth(); sourceX++) {
            for (int sourceY = 0; sourceY < Pic1.getHeight(); sourceY++) {
                sourcePixel = Pic1.getPixel(sourceX, sourceY);
                for (int indexY = 0; indexY < numTimes; indexY++) {
                    for (int indexX = 0; indexX < numTimes; indexX++) {
                        targetX = sourceX * numTimes + indexX;
                        targetY = sourceY * numTimes + indexY;
                        targetPixel = Pic2.getPixel(targetX, targetY);
                        targetPixel.setColor(sourcePixel.getColor());
                    }
                }
            }

        }

        Pic2.show();
    }//GEN-LAST:event_ScaleUpActionPerformed

    private void ScaleDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleDownActionPerformed

        String numTimesStr = JOptionPane.showInputDialog(null, "Please Enter Scale Down Factor: ");
        int numTimes = Integer.parseInt(numTimesStr);
        Pic2 = Pic2.scaleDown(numTimes);
        Pic2.show();

    }//GEN-LAST:event_ScaleDownActionPerformed

    private void MaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxActionPerformed
        Pic2.grayscale();

        Picture temp = new Picture(Pic2);

        // Filter size = 3 
        for (int i = 1; i < Pic2.getWidth() - 1; i++) {
            for (int j = 1; j < Pic2.getHeight() - 1; j++) {

                int x = i;
                int y = j;

                int[][] PixelXY = {{x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1},
                {x, y - 1}, {x, y}, {x, y + 1},
                {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}};
                int[] Red = new int[9];
                int[] Green = new int[9];
                int[] Blue = new int[9];

                for (int r = 0; r < PixelXY.length; r++) {
                    Red[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getRed();
                    Green[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getGreen();
                    Blue[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getBlue();
                }

                Arrays.sort(Red);
                Arrays.sort(Green);
                Arrays.sort(Blue);

                Pic2.getPixel(i, j).setColor(new Color(Red[8], Green[8], Blue[8]));

            }
        }
        OutputPicture();


    }//GEN-LAST:event_MaxActionPerformed

    private void AverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverageActionPerformed
        Pic2.grayscale();

        for (int i = 1; i < Pic2.getWidth() - 1; i++) {
            for (int j = 1; j < Pic2.getHeight() - 1; j++) {

                int x = i;
                int y = j;

                int[][] PixelXY = {{x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1},
                {x, y - 1}, {x, y}, {x, y + 1},
                {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}};

                int[] pixelsAverage = new int[9];

                for (int r = 0; r < PixelXY.length; r++) {
                    pixelsAverage[r] = (int) Pic2.getPixel(PixelXY[r][0], PixelXY[r][1]).getAverage();
                }

                Arrays.sort(pixelsAverage);

                Pixel wanted = null;
                for (int[] PixelXY1 : PixelXY) {
                    int temp = (int) Pic2.getPixel(PixelXY1[0], PixelXY1[1]).getAverage();
                    if (temp == pixelsAverage[4]) {
                        wanted = Pic2.getPixel(PixelXY1[0], PixelXY1[1]);
                        break;
                    }
                }

                Pic2.getPixel(i, j).setColor(wanted.getColor());

            }
        }
        OutputPicture();
    }//GEN-LAST:event_AverageActionPerformed

    private void MedianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedianActionPerformed
        Pic2.grayscale();

        // Filter size = 3 
        for (int i = 1; i < Pic2.getWidth() - 1; i++) {
            for (int j = 1; j < Pic2.getHeight() - 1; j++) {

                int x = i;
                int y = j;

                int[][] PixelXY = {{x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1},
                {x, y - 1}, {x, y}, {x, y + 1},
                {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}};
                int[] Red = new int[9];
                int[] Green = new int[9];
                int[] Blue = new int[9];

                for (int r = 0; r < PixelXY.length; r++) {
                    Red[r] = Pic2.getPixel(PixelXY[r][0], PixelXY[r][1]).getRed();
                    Green[r] = Pic2.getPixel(PixelXY[r][0], PixelXY[r][1]).getGreen();
                    Blue[r] = Pic2.getPixel(PixelXY[r][0], PixelXY[r][1]).getBlue();
                }

                Arrays.sort(Red);
                Arrays.sort(Green);
                Arrays.sort(Blue);

                Pic2.getPixel(i, j).setColor(new Color(Red[4], Green[4], Blue[4]));

            }
        }
        OutputPicture();


    }//GEN-LAST:event_MedianActionPerformed


    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        Pic2.grayscale();

        Picture temp = new Picture(Pic2);

        // Filter size = 3 
        for (int i = 1; i < Pic2.getWidth() - 1; i++) {
            for (int j = 1; j < Pic2.getHeight() - 1; j++) {

                int x = i;
                int y = j;

                int[][] PixelXY = {{x - 1, y - 1}, {x - 1, y}, {x - 1, y + 1},
                {x, y - 1}, {x, y}, {x, y + 1},
                {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}};
                int[] Red = new int[9];
                int[] Green = new int[9];
                int[] Blue = new int[9];

                for (int r = 0; r < PixelXY.length; r++) {
                    Red[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getRed();
                    Green[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getGreen();
                    Blue[r] = temp.getPixel(PixelXY[r][0], PixelXY[r][1]).getBlue();
                }

                Arrays.sort(Red);
                Arrays.sort(Green);
                Arrays.sort(Blue);

                Pic2.getPixel(i, j).setColor(new Color(Red[0], Green[0], Blue[0]));

            }
        }
        OutputPicture();


    }//GEN-LAST:event_MinActionPerformed

    private void GrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrayScaleActionPerformed

        for (int x = 0; x < Pic2.getWidth(); x++) {
            for (int y = 0; y < Pic2.getHeight(); y++) {

                int g = ((Pic2.getPixel(x, y).getGreen() + Pic2.getPixel(x, y).getBlue() + Pic2.getPixel(x, y).getRed()) / 3);
                Pic2.getPixel(x, y).setColor(new Color(g, g, g));

            }
        }
        OutputPicture();


    }//GEN-LAST:event_GrayScaleActionPerformed

    private void BinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinaryActionPerformed

        for (int i = 0; i < Pic2.getWidth(); i++) {
            for (int j = 0; j < Pic2.getHeight(); j++) {

                int r = Pic2.getPixel(i, j).getRed();
                int g = Pic2.getPixel(i, j).getGreen();
                int b = Pic2.getPixel(i, j).getBlue();
                double avg = (r + g + b) / 3;

                if (avg < 100) {
                    Pic2.getPixel(i, j).setColor(Color.black);

                } else {

                    Pic2.getPixel(i, j).setColor(Color.WHITE);
                }

            }
        }

        OutputPicture();


    }//GEN-LAST:event_BinaryActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed

        for (int x = 0; x < Pic1.getWidth(); x++) {
            for (int y = 0; y < Pic1.getHeight(); y++) {

                Pic2.getPixel(x, y).setColor(new Color(Pic1.getPixel(x, y).getRed(), Pic1.getPixel(x, y).getGreen(), Pic1.getPixel(x, y).getBlue()));

            }
        }

        OutputPicture();

    }//GEN-LAST:event_CopyActionPerformed

    private void EdgeDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeDetectionActionPerformed
        if (EdgeDetectionAmount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Edge Detection Value", "Error", JOptionPane.ERROR_MESSAGE);
        }
        double amount = Double.parseDouble(EdgeDetectionAmount.getText());
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        double topAverage = 0.0;
        double bottomAverage = 0.0;
        for (int y = 0; y < Pic2.getHeight() - 1; y++) {
            for (int x = 0; x < Pic2.getWidth(); x++) {
                topPixel = Pic2.getPixel(x, y);
                bottomPixel = Pic2.getPixel(x, y + 1);
                topAverage = topPixel.getAverage();
                bottomAverage = bottomPixel.getAverage();
                if (Math.abs(topAverage - bottomAverage) < amount) {
                    topPixel.setColor(Color.WHITE);
                } else {
                    topPixel.setColor(Color.BLACK);
                }
            }
        }
        OutputPicture();

    }//GEN-LAST:event_EdgeDetectionActionPerformed

    private void ToChromakeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToChromakeyActionPerformed
        this.dispose();
        new Chromakey().setVisible(true);
    }//GEN-LAST:event_ToChromakeyActionPerformed

    private void LaplacianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaplacianActionPerformed

        Picture outPic = new Picture(Pic2.getWidth(), Pic2.getHeight());

        Pic2.grayscale();

// -------------------------------------------------------------------------------
        // Filter   :1   1  1 
        //           1  -8  1
        //           1   1  1
// --------------------------------------------------------------------------------        
        for (int i = 1; i < Pic2.getWidth() - 1; i++) {
            for (int j = 1; j < Pic2.getHeight() - 1; j++) {

                int x = i;
                int y = j;

                int[] pixels = new int[9];
                int result = 00;

                result += (Pic2.getPixel(x - 1, y - 1).getRed()) * 1;
                result += (Pic2.getPixel(x - 1, y).getRed()) * 1;
                result += (Pic2.getPixel(x - 1, y + 1).getRed()) * 1;

                result += (Pic2.getPixel(x, y - 1).getRed()) * 1;
                result += (Pic2.getPixel(x, y).getRed()) * (-8);
                result += (Pic2.getPixel(x, y + 1).getRed()) * 1;

                result += (Pic2.getPixel(x + 1, y - 1).getRed()) * 1;
                result += (Pic2.getPixel(x + 1, y).getRed()) * 1;
                result += (Pic2.getPixel(x + 1, y + 1).getRed()) * 1;

                if (result <= 0) {

                    outPic.getPixel(x, y).setColor(new Color(0, 0, 0));

                } else if (result >= 255) {
                    outPic.getPixel(x, y).setColor(new Color(255, 255, 255));

                } else {
                    outPic.getPixel(x, y).setColor(new Color(result, result, result));
                }
            }
        }

        Pic2 = new Picture(outPic);
        OutputPicture();


    }//GEN-LAST:event_LaplacianActionPerformed

    private void RedEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedEyeActionPerformed

        if (x1 > 0 && x2 > 0) {
            Pic2.removeRedEye(x1, y1, x2, y2, Color.BLACK);
            x2 = 0;
            y2 = 0;
            x1 = 0;
            y1 = 0;

        } else {
            Pic2.removeRedEye(0, 0, Pic2.getWidth() - 1, Pic2.getHeight() - 1, Color.BLACK);
        }

        jLabel2.setIcon(new ImageIcon(Pic2.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));

        OutputPicture();


    }//GEN-LAST:event_RedEyeActionPerformed


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        if (!Clicked || x1 == 0 && y1 == 0 ) {
            x1 = evt.getX();
            y1 = evt.getY();
            Clicked = true;

            xposi.setText(x1 + "");
            yposi.setText(y1 + "");
            redVal.setText(Pic1.getPixel(x1, y1).getRed() + "");
            GreenVal.setText(Pic1.getPixel(x1, y1).getGreen() + "");
            blueVal.setText(Pic1.getPixel(x1, y1).getBlue() + "");

        } else if (x2 == 0 && y2 == 0 || Clicked) {
            x2 = evt.getX();
            y2 = evt.getY();
            Clicked = false;

            xposi.setText(x2 + "");
            yposi.setText(y2 + "");
            redVal.setText(Pic1.getPixel(x2, y2).getRed() + "");
            GreenVal.setText(Pic1.getPixel(x2, y2).getGreen() + "");
            blueVal.setText(Pic1.getPixel(x2, y2).getBlue() + "");

        }

        // Check if coordinates entered in right order
        if (x1 > x2 && y1 > y2) {
            int temp = x2;
            x2 = x1;
            x1 = temp;
            int temp2 = y2;
            y2 = y1;
            y1 = temp2;
        }


    }//GEN-LAST:event_jLabel1MouseClicked


    private void CollageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollageActionPerformed

        Pic2.createCollage(Pic2);
        OutputPicture();

    }//GEN-LAST:event_CollageActionPerformed

    private void CropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CropActionPerformed

        if (x1 == 0 && x2 == 0) {
            JOptionPane.showMessageDialog(null, "You didn't select coordinates to crop by mouse click",
                    "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            Picture cropedPic = new Picture(Pic2);
            Pixel[] p = cropedPic.getPixels();

            for (int i = 0; i < p.length; i++) {
                p[i].setColor(Color.WHITE);
            }

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    cropedPic.getPixel(x, y).setColor(Pic2.getPixel(x, y).getColor());
                }
            }
            Pic2 = new Picture(cropedPic);
            OutputPicture();
            x1 = 0;
            y1 = 0;
            x2 = 0;
            y2 = 0;
        }

    }//GEN-LAST:event_CropActionPerformed

    private void EdgeDetectionAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeDetectionAmountActionPerformed

    }//GEN-LAST:event_EdgeDetectionAmountActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        int red = jSlider1.getValue();

        Pixel[] pixelArray = Pic2.getPixels();
        Pixel[] OrgiPixelArray = Pic1.getPixels();

        if (red >= 45 && red <= 55) {
            for (int i = 0; i < pixelArray.length; i++) {
                pixelArray[i].setRed(OrgiPixelArray[i].getRed());
            }
        }
        if (red > 55) {

            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getRed() * 1.20) <= 255) {
                    pixelArray[i].setRed((int) (pixelArray[i].getRed() * 1.20));
                }
            }

        } else if (red < 45) {
            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getRed() * 0.80) >= 0) {
                    pixelArray[i].setRed((int) (pixelArray[i].getRed() * 0.80));
                }
            }

        }

        OutputPicture();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged

        int green = jSlider2.getValue();

        Pixel[] pixelArray = Pic2.getPixels();
        Pixel[] OrgiPixelArray = Pic1.getPixels();

        if (green >= 45 && green <= 55) {
            for (int i = 0; i < pixelArray.length; i++) {
                pixelArray[i].setGreen(OrgiPixelArray[i].getGreen());
            }
        }
        if (green > 55) {

            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getGreen() * 1.20) <= 255) {
                    pixelArray[i].setGreen((int) (pixelArray[i].getGreen() * 1.20));
                }
            }

        } else if (green < 45) {
            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getGreen() * 0.80) >= 0) {
                    pixelArray[i].setGreen((int) (pixelArray[i].getGreen() * 0.80));
                }
            }

        }
        OutputPicture();


    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged

        int blue = jSlider3.getValue();

        Pixel[] pixelArray = Pic2.getPixels();
        Pixel[] OrgiPixelArray = Pic1.getPixels();

        if (blue >= 45 && blue <= 55) {
            for (int i = 0; i < pixelArray.length; i++) {
                pixelArray[i].setBlue(OrgiPixelArray[i].getBlue());
            }
        }
        if (blue > 55) {

            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getBlue() * 1.20) <= 255) {
                    pixelArray[i].setBlue((int) (pixelArray[i].getBlue() * 1.20));
                }
            }

        } else if (blue < 45) {
            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getBlue() * 0.80) >= 0) {
                    pixelArray[i].setBlue((int) (pixelArray[i].getBlue() * 0.80));
                }
            }

        }

        OutputPicture();

    }//GEN-LAST:event_jSlider3StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Pic2 = Pic2.rotateLeft();
        OutputPicture();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Pic2 = Pic2.rotateRight();
        OutputPicture();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VerticalRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerticalRefActionPerformed
        for (int x = 0; x < Pic2.getHeight(); x++) {
            int targetx = Pic2.getWidth() - 1;
            int sourcex = 0;
            while (targetx > sourcex) {
                Pixel source_Pixel = Pic2.getPixel(sourcex, x);
                Pixel target_Pixel = Pic2.getPixel(targetx, x);
                target_Pixel.setColor(source_Pixel.getColor());
                targetx--;
                sourcex++;
            }
        }
        OutputPicture();
    }//GEN-LAST:event_VerticalRefActionPerformed

    private void HorizontalRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorizontalRefActionPerformed
        Pic2 = Pic2.mirrorAllHorizontal();

        OutputPicture();

    }//GEN-LAST:event_HorizontalRefActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Pic2 = Pic1.blendPictures(new Picture(FileChooser.pickAFile()), 0.6);

        OutputPicture();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Pic2.drawRectangles();
        OutputPicture();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Pic2.createCollage(Pic2);
        OutputPicture();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void Diagonal_D1_UpperToLower1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagonal_D1_UpperToLower1ActionPerformed

        //Upper (Right) Triangle to Lower (Left) Triangle
        for (int y = 1; y < Pic2.getHeight(); y++) {
            for (int x = 0; x < y; x++) {
                Pixel TargetPixel = Pic2.getPixel(x, y);
                TargetPixel.setColor(Pic2.getPixel(y, x).getColor());
            }
        }

        OutputPicture();
    }//GEN-LAST:event_Diagonal_D1_UpperToLower1ActionPerformed

    private void Diagonal_D1_LowerToUpperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagonal_D1_LowerToUpperActionPerformed

        //Lower (Left) Triangle to Upper (Right) Triangle
        for (int y = 1; y < Pic2.getHeight(); y++) {
            for (int x = 0; x < y; x++) {
                Pixel TargetPixel = Pic2.getPixel(y, x);
                TargetPixel.setColor(Pic2.getPixel(x, y).getColor());
            }
        }

        OutputPicture();
    }//GEN-LAST:event_Diagonal_D1_LowerToUpperActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        Pic2 = new Picture(Pic1);
        OutputPicture();
        jSlider1.setValue(50);
        jSlider2.setValue(50);
        jSlider3.setValue(50);


    }//GEN-LAST:event_jButton13ActionPerformed

    private void HistogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistogramActionPerformed

        // -----------------------
        // SLIDES METHOD DOESN'T WORKING
        //-------------------
        //        // step 3: compare with the cumulative frequency CuF of an equalized histogram.
        //        double Feq = IntensityCuf[255] / 256;
        //        int[] FeqArray = new int[256];
        //        for (int i = 0; i < FeqArray.length; i++) {
        //            FeqArray[i] = (int) Feq;
        //        }
        //        if (Feq != (int) Feq) {
        //            FeqArray[128]++;
        //        }
        //        int[] CuFeq = new int[256];
        //        CuFeq[0] = FeqArray[0];
        //        for (int i = 1; i < CuFeq.length; i++) {
        //            CuFeq[i] = (FeqArray[i] + CuFeq[(i - 1)]);
        //        }
        //
        //        // step 4: mapping
        //        int newValue = 0;
        //        Boolean done = false;
        //        for (int x = 0; x < Parray.length; x++) {
        //            int CufPixel = IntensityCuf[Parray[x].getBlue()];
        //            for (int i = 0; i < CuFeq.length; i++) {
        //                if (CuFeq[i] == CufPixel) {
        //                    Parray[x].setColor(new Color(i, i, i));
        //                    done = true;
        //                }
        //            }
        //            if (done == false){
        //             for (int i = 0; i < CuFeq.length; i++) {
        //                if (CuFeq[i] >=(CufPixel-2)&&CuFeq[i] <=(CufPixel+2)) {
        //                    Parray[x].setColor(new Color(i, i, i));
        //                    done = true;
        //                }
        //            }
        //
        //            }
        //            done =false;
        //        }
        // --------------------------
        // SLIDES METHOD DOESN'T WORKING
        // We are using alternative way
        // using scale factor
        // Equation :
        // new Intensity =  ( (max color value)256/number of pixels )* Intensity cumulative frequency in current index
        // ---------------------------
        Pic2 = new Picture(Pic1);

        Pic2.grayscale();
        Pixel[] Parray = Pic2.getPixels();// Picture is gray, RGB values are equal in each pixel
        // Intensity Freq. array
        int[] IntensityFreq = new int[256]; // Max value = 255

        //calculate the frequency distribution for each pixel value.
        for (int i = 0; i < Parray.length; i++) {
            for (int p = 0; p < IntensityFreq.length; p++) {
                if (Parray[i].getAverage() == p) {
                    IntensityFreq[p]++;
                }
            }
        }
        // calculate the cumulative frequency distribution
        int[] IntensityCuf = new int[256]; // Max value = 255
        IntensityCuf[0] = IntensityFreq[0];
        for (int i = 1; i < IntensityCuf.length; i++) {
            IntensityCuf[i] = IntensityFreq[i] + IntensityCuf[(i - 1)];

        }

        int pixel;
        //array represents the intecity values of the pixels
        int Intensity[] = new int[256];
        for (Pixel Parray1 : Parray) {
            pixel = (int) Parray1.getAverage();
            Intensity[pixel]++;// Increment Intensity Frequancy
        }

        // calculate the scale factor
        // Equation to find pixel new Intensity value :
        // new Intensity =  ( (max color value)256/number of pixels )* Intensity cumulative frequency in current index
        double scale = 255.0 / Parray.length;
        //calculte cdf
        for (int i = 0; i < Intensity.length; i++) {
            // implementing Equation
            int value = (int) (scale * IntensityCuf[i]);
            if (value > 255) {
                value = 255;
            }
            Intensity[i] = value;
        }

        // mapping histogram equalization
        for (Pixel Parray1 : Parray) {
            pixel = (int) Parray1.getAverage();
            int color = Intensity[pixel];// get color value
            Parray1.setColor(new Color(color, color, color));//set new color
        }

        OutputPicture(); // written to display new image after each modification 
    }//GEN-LAST:event_HistogramActionPerformed

    private void PlottingHistogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlottingHistogramActionPerformed

//        Pic2 = new Picture(Pic1);
        Pic2.grayscale();
        Pixel[] Parray = Pic2.getPixels();// Picture is gray, RGB values are equal in each pixel
        // Intensity Freq. array
        int[] IntensityFreq = new int[256]; // Max value = 255

        // Step 1:  calculate the frequency distribution for each pixel value.
        for (int i = 0; i < Parray.length; i++) {
            for (int p = 0; p < IntensityFreq.length; p++) {
                if (Parray[i].getBlue() == p) {
                    IntensityFreq[p]++;
                }
            }
        }
        // step 2: draw plotting histogram

        // get Max freq. value to set new pic height
        int height = 0;
        for (int i = 0; i < IntensityFreq.length; i++) {
            if (IntensityFreq[i] > height) {
                height = IntensityFreq[i];
            }
        }
        // create white pic to draw on
        Pic2 = new Picture(IntensityFreq.length, (height));

        // set Picture output background to white
        Parray = Pic2.getPixels();
        for (Pixel Parray1 : Parray) {
            Parray1.setColor(Color.WHITE);
        }
        // start drawing
        int up = 0;
        for (int x = 0; x < IntensityFreq.length; x++) {
            up = IntensityFreq[x];
            for (int y = Pic2.getHeight() - 1; y > 0; y--) {
                Pic2.getPixel(x, y).setColor(Color.BLACK);
                up--;
                if (up < 0) {
                    break;
                }
            }
        }
        OutputPicture();

    }//GEN-LAST:event_PlottingHistogramActionPerformed

    private void yposiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yposiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yposiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Pic2 = Pic2.rotateRight();
        OutputPicture();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Pic2 = Pic2.rotate(180);
        OutputPicture();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Pic2 = Pic2.rotate(270);
       OutputPicture();    }//GEN-LAST:event_jButton6ActionPerformed

    public void colorChange() {

//        Pic2 = new Picture(Pic1);
//        jLabel2.setIcon(new ImageIcon(Pic1.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));
        int green = jSlider2.getValue();
        int blue = jSlider3.getValue();
        int red = jSlider1.getValue();

        Pixel[] pixelArray = Pic2.getPixels();
        Pixel[] OrgiPixelArray = Pic1.getPixels();

        if (red >= 45 && red <= 55) {
            for (int i = 0; i < pixelArray.length; i++) {
                pixelArray[i].setRed(OrgiPixelArray[i].getRed());
            }
        }
        if (red > 50) {

            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getRed() * 1.20) <= 255) {
                    pixelArray[i].setRed((int) (pixelArray[i].getRed() * 1.20));
                }
            }

        } else {
            for (int i = 0; i < pixelArray.length; i++) {
                if ((pixelArray[i].getRed() * 0.80) >= 0) {
                    pixelArray[i].setRed((int) (pixelArray[i].getRed() * 0.80));
                }
            }

        }

        for (int i = 0; i < pixelArray.length; i++) {
//            if (red != 0) {
//                pixelArray[i].setRed(red);
//
//            }
            if (green != 0) {
                pixelArray[i].setGreen(green);

            }
            if (blue != 0) {
                pixelArray[i].setBlue(blue);

            }

        }

        jLabel2.setIcon(new ImageIcon(Pic2.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH)));

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
            java.util.logging.Logger.getLogger(PictureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PictureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PictureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PictureFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PictureFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Average;
    private javax.swing.JButton Binary;
    private javax.swing.JButton Collage;
    private javax.swing.JButton Copy;
    private javax.swing.JButton Crop;
    private javax.swing.JButton Diagonal_D1_LowerToUpper;
    private javax.swing.JButton Diagonal_D1_UpperToLower1;
    private javax.swing.JButton EdgeDetection;
    private javax.swing.JTextField EdgeDetectionAmount;
    private javax.swing.JButton GrayScale;
    private javax.swing.JTextField GreenVal;
    private javax.swing.JButton Histogram;
    private javax.swing.JButton HorizontalRef;
    private javax.swing.JButton Laplacian;
    private javax.swing.JButton Max;
    private javax.swing.JButton Median;
    private javax.swing.JButton Min;
    private javax.swing.JLabel PicInfo;
    private javax.swing.JLabel PicInformation;
    private javax.swing.JLabel PicInformation1;
    private javax.swing.JButton PlottingHistogram;
    private javax.swing.JButton RedEye;
    private javax.swing.JButton ScaleDown;
    private javax.swing.JButton ScaleUp;
    private javax.swing.JButton ToChromakey;
    private javax.swing.JButton VerticalRef;
    private javax.swing.JTextField blueVal;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField redVal;
    private javax.swing.JTextField xposi;
    private javax.swing.JTextField yposi;
    // End of variables declaration//GEN-END:variables
}
