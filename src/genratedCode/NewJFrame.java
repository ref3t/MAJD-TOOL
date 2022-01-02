package genratedCode;


import .*;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.Highlighter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author admin
 */
public class NewJFrame extends javax.swing.JFrame {

    static int xPos = 0;
    static int yPos = 0;
    int red = 172, green = 200, blue = 253;
    ArrayList<JPanel> stepPanel = new ArrayList<JPanel>();
//    ArrayList<StepsList>stepListitems= new ArrayList<StepsList>();

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() throws IOException {
        initComponents();
        buttonGroup1.add(grater);

        buttonGroup1.add(less);

        buttonGroup1.add(equal);

        buttonGroup1.add(graterequal);

        buttonGroup1.add(lessequal);

        buttonGroup1.add(contains);

        buttonGroup1.add(start);
        buttonGroup1.add(end);
        buttonGroup1.add(regex);

        buttonGroup3.add(grater3);

        buttonGroup3.add(less3);

        buttonGroup3.add(equal3);

        buttonGroup3.add(graterequal3);

        buttonGroup3.add(lessequal3);

        buttonGroup3.add(contains3);

        buttonGroup3.add(start3);
        buttonGroup3.add(end3);
        buttonGroup3.add(regex3);

        buttonGroup4.add(grater4);

        buttonGroup4.add(less4);

        buttonGroup4.add(equal4);

        buttonGroup4.add(graterequal4);

        buttonGroup4.add(lessequal4);

        buttonGroup4.add(contains4);

        buttonGroup4.add(start4);
        buttonGroup4.add(end4);
        buttonGroup4.add(regex4);
                
        
        buttonGroup2.add(grater1);

        buttonGroup2.add(less1);

        buttonGroup2.add(equal1);

        buttonGroup2.add(graterequal1);

        buttonGroup2.add(lessequal1);

        buttonGroup2.add(contains1);

        buttonGroup2.add(start1);
        buttonGroup2.add(end1);
        buttonGroup2.add(regex1);
        
        buttonGroup5.add(jRadioButton1);
        buttonGroup5.add(jRadioButton2);
        buttonGroup5.add(jRadioButton3);
        jRadioButton1.setSelected(true);
        
//        ImageIcon imageIconUrl = new ImageIcon(new ImageIcon("img/url.png").getImage().getScaledInstance(210, 100, Image.SCALE_DEFAULT));
//
//        ImageIcon imageIconXpath = new ImageIcon(new ImageIcon("img/writeID.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
//
//        ImageIcon imageIconstatment = new ImageIcon(new ImageIcon("img/statment.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
//        ImageIcon imageIconwait = new ImageIcon(new ImageIcon("img/sleep.png").getImage().getScaledInstance(120, 100, Image.SCALE_SMOOTH));
//        ImageIcon imageIconwrite = new ImageIcon(new ImageIcon("img/write.png").getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT));
//
//        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/write-name.png").getImage().getScaledInstance(210, 100, Image.SCALE_DEFAULT));
//
//        ImageIcon imageIconclick = new ImageIcon(new ImageIcon("img/write-xpath.png").getImage().getScaledInstance(210, 100, Image.SCALE_DEFAULT));
//        labelUrlbut.setIcon(imageIconUrl);
//        labelUrlbut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
//        // jButton2.setIcon(imageIconXpath);
//        labelconditionbut.setIcon(imageIconstatment);
//        labelconditionbut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
//        //jButton39.setIcon(imageIconwait);
//        labelwaitbut.setIcon(imageIconwait);
//        labelwaitbut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
////        jButtoncond2.setIcon(imageIconwrite);
//
//        labelwritebut.setIcon(imageIconwrite);
//        labelwritebut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
////      
//        labelreadbut.setIcon(imageIconread);
//        labelreadbut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        less3.setSelected(true);
        Waitpanel.setVisible(false);
        xpathClick6.setVisible(false);
//        labelclickbut.setIcon(imageIconclick);
//        labelclickbut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        //ImageIcon icnPlay = new ImageIcon();
        //jButton1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("C:\\Users\\admin\\OneDrive - NVIDIA Corporation\\Desktop\\Thises New\\img\\url.png")).getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH))));
//        jButton2.setPreferredSize(new Dimension(130, 130));
// NewJFrame frame = new NewJFrame();
        jFramAction.setVisible(false);
        jFramAction.pack();
        jFramAction.setLocationRelativeTo(null);

        jFramIfStatments.setVisible(false);
        jFramIfStatments.pack();
        jFramIfStatments.setLocationRelativeTo(null);

        jFramIfStatmentsUpdate.setVisible(false);
        jFramIfStatmentsUpdate.pack();
        jFramIfStatmentsUpdate.setLocationRelativeTo(null);

        jFramActionUpdate.setVisible(false);
        jFramActionUpdate.pack();
        jFramActionUpdate.setLocationRelativeTo(null);

        jFrameURL.setVisible(false);
        jFrameURL.pack();
        jFrameURL.setLocationRelativeTo(null);

        jFrameUpdateURL.setVisible(false);
        jFrameUpdateURL.pack();
        jFrameUpdateURL.setLocationRelativeTo(null);

        jFramwaitTime.setVisible(false);
        jFramwaitTime.pack();
        jFramwaitTime.setLocationRelativeTo(null);

        jFramwaitTimeUpdate.setVisible(false);
        jFramwaitTimeUpdate.pack();
        jFramwaitTimeUpdate.setLocationRelativeTo(null);

//        xpathClick6.setVisible(true);
        xpathClick1.setVisible(false);
        url2.setVisible(false);
        xpathClick6.setBounds(10, 20, 340, 230);
        int lenimg = 70, widthimg = 150;
        ImageIcon imagewritexpath = new ImageIcon(new ImageIcon("img/Done/insertxpathn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        writexpath.setIcon(imagewritexpath);
        ImageIcon imagewritename = new ImageIcon(new ImageIcon("img/Done/insertNamen2.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        writeName.setIcon(imagewritename);
        ImageIcon imagewriteID = new ImageIcon(new ImageIcon("img/Done/insertIDn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        writeID.setIcon(imagewriteID);

        ImageIcon imagereadxpath = new ImageIcon(new ImageIcon("img/Done/readXpathn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        readxpath.setIcon(imagereadxpath);
        ImageIcon imagereadname = new ImageIcon(new ImageIcon("img/Done/readNamen.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        readName.setIcon(imagereadname);
        ImageIcon imagereadID = new ImageIcon(new ImageIcon("img/Done/readIDn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        readID.setIcon(imagereadID);

        ImageIcon imageclickxpath = new ImageIcon(new ImageIcon("img/Done/clickXPATHn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        clickxpath.setIcon(imageclickxpath);
        ImageIcon imageclickname = new ImageIcon(new ImageIcon("img/Done/clickNamen.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        clickName.setIcon(imageclickname);
        ImageIcon imageclickID = new ImageIcon(new ImageIcon("img/Done/clickIDn2.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        clickID.setIcon(imageclickID);

        ImageIcon imageurl = new ImageIcon(new ImageIcon("img/Done/ur.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        urlLabel.setIcon(imageurl);
        ImageIcon imageconditon = new ImageIcon(new ImageIcon("img/Done/CONDITIONn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        conditionLabel.setIcon(imageconditon);
        ImageIcon imagewait = new ImageIcon(new ImageIcon("img/Done/WAITINGn.png").getImage().getScaledInstance(widthimg, lenimg, Image.SCALE_DEFAULT));
        waitLabel.setIcon(imagewait);
        jPanel8.setVisible(false);
        pack();
        jPanel1.repaint();
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
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jFrameUpdateURL = new javax.swing.JFrame();
        url1 = new javax.swing.JPanel();
        UrlLabel1 = new javax.swing.JLabel();
        Urltext1 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jFramwaitTime = new javax.swing.JFrame();
        wait1 = new javax.swing.JPanel();
        jLabelwaittime = new javax.swing.JLabel();
        jTextFieldwaittime = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jFramwaitTimeUpdate = new javax.swing.JFrame();
        wait2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldwaitupdate = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jFramAction = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        xpathWrite = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextwriteinputName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextXpathWrite = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        xpathRead = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        xpathClick = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jFramActionUpdate = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        xpathWrite1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Updatename = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        updateByAction = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jFramWriteActionUpdate1 = new javax.swing.JFrame();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        xpathWrite2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jFramIfStatments = new javax.swing.JFrame();
        xpathClick3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        grater = new javax.swing.JRadioButton();
        less = new javax.swing.JRadioButton();
        equal = new javax.swing.JRadioButton();
        graterequal = new javax.swing.JRadioButton();
        lessequal = new javax.swing.JRadioButton();
        contains = new javax.swing.JRadioButton();
        start = new javax.swing.JRadioButton();
        end = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        regex = new javax.swing.JRadioButton();
        jTextField21 = new javax.swing.JTextField();
        jFramIfStatmentsUpdate = new javax.swing.JFrame();
        xpathClick4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        grater1 = new javax.swing.JRadioButton();
        less1 = new javax.swing.JRadioButton();
        equal1 = new javax.swing.JRadioButton();
        graterequal1 = new javax.swing.JRadioButton();
        lessequal1 = new javax.swing.JRadioButton();
        contains1 = new javax.swing.JRadioButton();
        start1 = new javax.swing.JRadioButton();
        end1 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        regex1 = new javax.swing.JRadioButton();
        jTextField24 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrameURL = new javax.swing.JFrame();
        url = new javax.swing.JPanel();
        UrlLabel = new javax.swing.JLabel();
        Urltext = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stepspanel = new javax.swing.JPanel();
        jPanelform = new javax.swing.JPanel();
        xpathClick1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        actionInputName = new javax.swing.JTextField();
        actionLabel = new javax.swing.JLabel();
        actionInputby = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        xpathClick6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        grater3 = new javax.swing.JRadioButton();
        less3 = new javax.swing.JRadioButton();
        equal3 = new javax.swing.JRadioButton();
        graterequal3 = new javax.swing.JRadioButton();
        lessequal3 = new javax.swing.JRadioButton();
        contains3 = new javax.swing.JRadioButton();
        start3 = new javax.swing.JRadioButton();
        end3 = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        regex3 = new javax.swing.JRadioButton();
        jTextField30 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        actionlabel = new javax.swing.JLabel();
        actionimg = new javax.swing.JLabel();
        Waitpanel = new javax.swing.JPanel();
        UrlLabel2 = new javax.swing.JLabel();
        Waitinput = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        url2 = new javax.swing.JPanel();
        UrlLabel3 = new javax.swing.JLabel();
        Urltext3 = new javax.swing.JTextField();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        writexpath = new javax.swing.JLabel();
        writeName = new javax.swing.JLabel();
        writeID = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        readxpath = new javax.swing.JLabel();
        readName = new javax.swing.JLabel();
        readID = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clickxpath = new javax.swing.JLabel();
        clickName = new javax.swing.JLabel();
        clickID = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        urlLabel = new javax.swing.JLabel();
        conditionLabel = new javax.swing.JLabel();
        waitLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        end4 = new javax.swing.JRadioButton();
        start4 = new javax.swing.JRadioButton();
        contains4 = new javax.swing.JRadioButton();
        lessequal4 = new javax.swing.JRadioButton();
        grater4 = new javax.swing.JRadioButton();
        less4 = new javax.swing.JRadioButton();
        regex4 = new javax.swing.JRadioButton();
        equal4 = new javax.swing.JRadioButton();
        graterequal4 = new javax.swing.JRadioButton();

        jMenuItem1.setText("Delete");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Edit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        UrlLabel1.setText("URL ");

        jButton24.setText("Cancel");

        jButton25.setText("Done");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("clear");

        javax.swing.GroupLayout url1Layout = new javax.swing.GroupLayout(url1);
        url1.setLayout(url1Layout);
        url1Layout.setHorizontalGroup(
            url1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(url1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, url1Layout.createSequentialGroup()
                        .addComponent(UrlLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Urltext1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, url1Layout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26)
                        .addGap(18, 18, 18)
                        .addComponent(jButton24)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        url1Layout.setVerticalGroup(
            url1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(url1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrlLabel1)
                    .addComponent(Urltext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(url1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameUpdateURLLayout = new javax.swing.GroupLayout(jFrameUpdateURL.getContentPane());
        jFrameUpdateURL.getContentPane().setLayout(jFrameUpdateURLLayout);
        jFrameUpdateURLLayout.setHorizontalGroup(
            jFrameUpdateURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameUpdateURLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(url1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrameUpdateURLLayout.setVerticalGroup(
            jFrameUpdateURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameUpdateURLLayout.createSequentialGroup()
                .addComponent(url1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabelwaittime.setText("Time In Sec");

        jButton27.setText("Cancel");

        jButton28.setText("Done");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("clear");

        javax.swing.GroupLayout wait1Layout = new javax.swing.GroupLayout(wait1);
        wait1.setLayout(wait1Layout);
        wait1Layout.setHorizontalGroup(
            wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wait1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wait1Layout.createSequentialGroup()
                            .addComponent(jLabelwaittime)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldwaittime))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wait1Layout.createSequentialGroup()
                            .addComponent(jButton28)
                            .addGap(18, 18, 18)
                            .addComponent(jButton29)
                            .addGap(18, 18, 18)
                            .addComponent(jButton27)))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        wait1Layout.setVerticalGroup(
            wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
            .addGroup(wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wait1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelwaittime)
                        .addComponent(jTextFieldwaittime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(wait1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton27)
                        .addComponent(jButton28)
                        .addComponent(jButton29))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFramwaitTimeLayout = new javax.swing.GroupLayout(jFramwaitTime.getContentPane());
        jFramwaitTime.getContentPane().setLayout(jFramwaitTimeLayout);
        jFramwaitTimeLayout.setHorizontalGroup(
            jFramwaitTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wait1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFramwaitTimeLayout.setVerticalGroup(
            jFramwaitTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFramwaitTimeLayout.createSequentialGroup()
                .addComponent(wait1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel13.setText("Time In Sec");

        jButton30.setText("Cancel");

        jButton31.setText("Done");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("clear");

        javax.swing.GroupLayout wait2Layout = new javax.swing.GroupLayout(wait2);
        wait2.setLayout(wait2Layout);
        wait2Layout.setHorizontalGroup(
            wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wait2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wait2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldwaitupdate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, wait2Layout.createSequentialGroup()
                            .addComponent(jButton31)
                            .addGap(18, 18, 18)
                            .addComponent(jButton32)
                            .addGap(18, 18, 18)
                            .addComponent(jButton30)))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        wait2Layout.setVerticalGroup(
            wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
            .addGroup(wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(wait2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextFieldwaitupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(wait2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton30)
                        .addComponent(jButton31)
                        .addComponent(jButton32))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jFramwaitTimeUpdateLayout = new javax.swing.GroupLayout(jFramwaitTimeUpdate.getContentPane());
        jFramwaitTimeUpdate.getContentPane().setLayout(jFramwaitTimeUpdateLayout);
        jFramwaitTimeUpdateLayout.setHorizontalGroup(
            jFramwaitTimeUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wait2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jFramwaitTimeUpdateLayout.setVerticalGroup(
            jFramwaitTimeUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wait2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("Input Name");

        jLabel3.setText("Xpath Or ID");

        jButton9.setText("Done");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Clear");

        jButton6.setText("Cancel");

        javax.swing.GroupLayout xpathWriteLayout = new javax.swing.GroupLayout(xpathWrite);
        xpathWrite.setLayout(xpathWriteLayout);
        xpathWriteLayout.setHorizontalGroup(
            xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWriteLayout.createSequentialGroup()
                .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathWriteLayout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(16, 16, 16))
                    .addGroup(xpathWriteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextwriteinputName)
                            .addComponent(jTextXpathWrite))))
                .addContainerGap())
        );
        xpathWriteLayout.setVerticalGroup(
            xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWriteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextwriteinputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextXpathWrite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(xpathWriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Write", xpathWrite);

        jLabel6.setText("Input Name");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Xpath Or ID");

        jButton14.setText("Done");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Clear");

        jButton16.setText("Cancel");

        javax.swing.GroupLayout xpathReadLayout = new javax.swing.GroupLayout(xpathRead);
        xpathRead.setLayout(xpathReadLayout);
        xpathReadLayout.setHorizontalGroup(
            xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathReadLayout.createSequentialGroup()
                .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathReadLayout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jButton14)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16))
                    .addGroup(xpathReadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7))))
                .addContainerGap())
        );
        xpathReadLayout.setVerticalGroup(
            xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathReadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(xpathReadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Read", xpathRead);

        jLabel8.setText("Input Name");

        jLabel9.setText("Xpath Or ID");

        jButton17.setText("Done");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Clear");

        jButton19.setText("Cancel");

        javax.swing.GroupLayout xpathClickLayout = new javax.swing.GroupLayout(xpathClick);
        xpathClick.setLayout(xpathClickLayout);
        xpathClickLayout.setHorizontalGroup(
            xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClickLayout.createSequentialGroup()
                .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathClickLayout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19))
                    .addGroup(xpathClickLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9))))
                .addContainerGap())
        );
        xpathClickLayout.setVerticalGroup(
            xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClickLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(xpathClickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Click", xpathClick);

        javax.swing.GroupLayout jFramActionLayout = new javax.swing.GroupLayout(jFramAction.getContentPane());
        jFramAction.getContentPane().setLayout(jFramActionLayout);
        jFramActionLayout.setHorizontalGroup(
            jFramActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jFramActionLayout.setVerticalGroup(
            jFramActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel5.setText("Input Name");

        jLabel12.setText("Xpath Or ID");

        jButton11.setText("Done");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Clear");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout xpathWrite1Layout = new javax.swing.GroupLayout(xpathWrite1);
        xpathWrite1.setLayout(xpathWrite1Layout);
        xpathWrite1Layout.setHorizontalGroup(
            xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWrite1Layout.createSequentialGroup()
                .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathWrite1Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(xpathWrite1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Updatename)
                            .addComponent(updateByAction))))
                .addContainerGap())
        );
        xpathWrite1Layout.setVerticalGroup(
            xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWrite1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Updatename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(updateByAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(xpathWrite1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("UPDATE", xpathWrite1);

        javax.swing.GroupLayout jFramActionUpdateLayout = new javax.swing.GroupLayout(jFramActionUpdate.getContentPane());
        jFramActionUpdate.getContentPane().setLayout(jFramActionUpdateLayout);
        jFramActionUpdateLayout.setHorizontalGroup(
            jFramActionUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jFramActionUpdateLayout.setVerticalGroup(
            jFramActionUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jLabel14.setText("Input Name");

        jLabel15.setText("Xpath Or ID");

        jButton33.setText("Done");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("Clear");

        jButton35.setText("Cancel");

        javax.swing.GroupLayout xpathWrite2Layout = new javax.swing.GroupLayout(xpathWrite2);
        xpathWrite2.setLayout(xpathWrite2Layout);
        xpathWrite2Layout.setHorizontalGroup(
            xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWrite2Layout.createSequentialGroup()
                .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathWrite2Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(jButton33)
                        .addGap(18, 18, 18)
                        .addComponent(jButton34)
                        .addGap(18, 18, 18)
                        .addComponent(jButton35))
                    .addGroup(xpathWrite2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14))))
                .addContainerGap())
        );
        xpathWrite2Layout.setVerticalGroup(
            xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathWrite2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(xpathWrite2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35)
                    .addComponent(jButton33)
                    .addComponent(jButton34))
                .addGap(16, 16, 16))
        );

        jTabbedPane3.addTab("Write", xpathWrite2);

        javax.swing.GroupLayout jFramWriteActionUpdate1Layout = new javax.swing.GroupLayout(jFramWriteActionUpdate1.getContentPane());
        jFramWriteActionUpdate1.getContentPane().setLayout(jFramWriteActionUpdate1Layout);
        jFramWriteActionUpdate1Layout.setHorizontalGroup(
            jFramWriteActionUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jFramWriteActionUpdate1Layout.setVerticalGroup(
            jFramWriteActionUpdate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        xpathClick3.setBorder(javax.swing.BorderFactory.createTitledBorder("Statment Tab"));

        jLabel22.setText("Xpath Or ID First Element");

        jLabel23.setText("Xpath Or ID Second Element");

        jButton45.setText("Done");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("Clear");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setText("Cancel");

        grater.setText(">");

        less.setText("<");
        less.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessActionPerformed(evt);
            }
        });

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        graterequal.setText(">=");
        graterequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graterequalActionPerformed(evt);
            }
        });

        lessequal.setText("<=");
        lessequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessequalActionPerformed(evt);
            }
        });

        contains.setText("Contains");

        start.setText("Begins With");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        end.setText("End With");
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });

        jLabel24.setText("Condition Code");

        regex.setText("Regex");
        regex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regexActionPerformed(evt);
            }
        });

        jTextField21.setText("==");

        javax.swing.GroupLayout xpathClick3Layout = new javax.swing.GroupLayout(xpathClick3);
        xpathClick3.setLayout(xpathClick3Layout);
        xpathClick3Layout.setHorizontalGroup(
            xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick3Layout.createSequentialGroup()
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathClick3Layout.createSequentialGroup()
                        .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(xpathClick3Layout.createSequentialGroup()
                                .addComponent(grater)
                                .addGap(26, 26, 26)
                                .addComponent(less)
                                .addGap(23, 23, 23)
                                .addComponent(equal))
                            .addGroup(xpathClick3Layout.createSequentialGroup()
                                .addComponent(contains)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(start)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(end)
                            .addComponent(graterequal))
                        .addGap(18, 18, 18)
                        .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regex)
                            .addComponent(lessequal))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(xpathClick3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(xpathClick3Layout.createSequentialGroup()
                                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField19)
                                    .addComponent(jTextField20)))
                            .addGroup(xpathClick3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField21)))))
                .addContainerGap())
            .addGroup(xpathClick3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        xpathClick3Layout.setVerticalGroup(
            xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grater)
                    .addComponent(less)
                    .addComponent(equal)
                    .addComponent(graterequal)
                    .addComponent(lessequal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contains)
                    .addComponent(start)
                    .addComponent(end)
                    .addComponent(regex))
                .addGap(18, 18, 18)
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(xpathClick3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton45)
                    .addComponent(jButton46)
                    .addComponent(jButton47))
                .addContainerGap())
        );

        javax.swing.GroupLayout jFramIfStatmentsLayout = new javax.swing.GroupLayout(jFramIfStatments.getContentPane());
        jFramIfStatments.getContentPane().setLayout(jFramIfStatmentsLayout);
        jFramIfStatmentsLayout.setHorizontalGroup(
            jFramIfStatmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jFramIfStatmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFramIfStatmentsLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xpathClick3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jFramIfStatmentsLayout.setVerticalGroup(
            jFramIfStatmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jFramIfStatmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFramIfStatmentsLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xpathClick3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        xpathClick4.setBorder(javax.swing.BorderFactory.createTitledBorder("Statment Tab"));

        jLabel25.setText("Xpath Or ID First Element");

        jLabel26.setText("Xpath Or ID Second Element");

        jButton48.setText("Done");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setText("Clear");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("Cancel");

        grater1.setText(">");
        grater1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grater1ActionPerformed(evt);
            }
        });

        less1.setText("<");
        less1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                less1ActionPerformed(evt);
            }
        });

        equal1.setText("=");
        equal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal1ActionPerformed(evt);
            }
        });

        graterequal1.setText(">=");
        graterequal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graterequal1ActionPerformed(evt);
            }
        });

        lessequal1.setText("<=");
        lessequal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessequal1ActionPerformed(evt);
            }
        });

        contains1.setText("Contains");

        start1.setText("Begins With");
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });

        end1.setText("End With");
        end1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end1ActionPerformed(evt);
            }
        });

        jLabel27.setText("Condition Code");

        regex1.setText("Regex");
        regex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regex1ActionPerformed(evt);
            }
        });

        jTextField24.setText("==");

        javax.swing.GroupLayout xpathClick4Layout = new javax.swing.GroupLayout(xpathClick4);
        xpathClick4.setLayout(xpathClick4Layout);
        xpathClick4Layout.setHorizontalGroup(
            xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick4Layout.createSequentialGroup()
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathClick4Layout.createSequentialGroup()
                        .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(xpathClick4Layout.createSequentialGroup()
                                .addComponent(grater1)
                                .addGap(26, 26, 26)
                                .addComponent(less1)
                                .addGap(23, 23, 23)
                                .addComponent(equal1))
                            .addGroup(xpathClick4Layout.createSequentialGroup()
                                .addComponent(contains1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(start1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(end1)
                            .addComponent(graterequal1))
                        .addGap(18, 18, 18)
                        .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regex1)
                            .addComponent(lessequal1))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(xpathClick4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(xpathClick4Layout.createSequentialGroup()
                                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField22)
                                    .addComponent(jTextField23)))
                            .addGroup(xpathClick4Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField24)))))
                .addContainerGap())
            .addGroup(xpathClick4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        xpathClick4Layout.setVerticalGroup(
            xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grater1)
                    .addComponent(less1)
                    .addComponent(equal1)
                    .addComponent(graterequal1)
                    .addComponent(lessequal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contains1)
                    .addComponent(start1)
                    .addComponent(end1)
                    .addComponent(regex1))
                .addGap(18, 18, 18)
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(xpathClick4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton48)
                    .addComponent(jButton49)
                    .addComponent(jButton50))
                .addContainerGap())
        );

        javax.swing.GroupLayout jFramIfStatmentsUpdateLayout = new javax.swing.GroupLayout(jFramIfStatmentsUpdate.getContentPane());
        jFramIfStatmentsUpdate.getContentPane().setLayout(jFramIfStatmentsUpdateLayout);
        jFramIfStatmentsUpdateLayout.setHorizontalGroup(
            jFramIfStatmentsUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jFramIfStatmentsUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFramIfStatmentsUpdateLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xpathClick4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jFramIfStatmentsUpdateLayout.setVerticalGroup(
            jFramIfStatmentsUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jFramIfStatmentsUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFramIfStatmentsUpdateLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xpathClick4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        UrlLabel.setText("URL ");

        jButton5.setText("Cancel");

        jButton7.setText("Done");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("clear");

        javax.swing.GroupLayout urlLayout = new javax.swing.GroupLayout(url);
        url.setLayout(urlLayout);
        urlLayout.setHorizontalGroup(
            urlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(urlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, urlLayout.createSequentialGroup()
                        .addComponent(UrlLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Urltext))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, urlLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        urlLayout.setVerticalGroup(
            urlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(urlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(urlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrlLabel)
                    .addComponent(Urltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(urlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrameURLLayout = new javax.swing.GroupLayout(jFrameURL.getContentPane());
        jFrameURL.getContentPane().setLayout(jFrameURLLayout);
        jFrameURLLayout.setHorizontalGroup(
            jFrameURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
            .addGroup(jFrameURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameURLLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jFrameURLLayout.setVerticalGroup(
            jFrameURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
            .addGroup(jFrameURLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameURLLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(null);

        stepspanel.setFocusTraversalPolicyProvider(true);

        javax.swing.GroupLayout stepspanelLayout = new javax.swing.GroupLayout(stepspanel);
        stepspanel.setLayout(stepspanelLayout);
        stepspanelLayout.setHorizontalGroup(
            stepspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1346, Short.MAX_VALUE)
        );
        stepspanelLayout.setVerticalGroup(
            stepspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(stepspanel);

        jPanelform.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Action ")));

        jLabel17.setText("Input Data");

        actionLabel.setText("Xpath Or ID");

        jButton41.setText("Done");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("Clear");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("Cancel");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout xpathClick1Layout = new javax.swing.GroupLayout(xpathClick1);
        xpathClick1.setLayout(xpathClick1Layout);
        xpathClick1Layout.setHorizontalGroup(
            xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick1Layout.createSequentialGroup()
                .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathClick1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton41)
                        .addGap(18, 18, 18)
                        .addComponent(jButton42)
                        .addGap(18, 18, 18)
                        .addComponent(jButton43))
                    .addGroup(xpathClick1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(actionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actionInputName)
                            .addComponent(actionInputby))))
                .addGap(348, 348, 348))
        );
        xpathClick1Layout.setVerticalGroup(
            xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(actionInputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionLabel)
                    .addComponent(actionInputby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(xpathClick1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton43)
                    .addComponent(jButton41)
                    .addComponent(jButton42))
                .addContainerGap())
        );

        xpathClick6.setBorder(javax.swing.BorderFactory.createTitledBorder("Statment Tab"));

        jLabel31.setText("Data-qa");

        jLabel32.setText("Value");

        jButton54.setText("Done");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("Clear");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setText("Cancel");

        grater3.setText(">");

        less3.setText("<");
        less3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                less3ActionPerformed(evt);
            }
        });

        equal3.setText("=");
        equal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal3ActionPerformed(evt);
            }
        });

        graterequal3.setText(">=");
        graterequal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graterequal3ActionPerformed(evt);
            }
        });

        lessequal3.setText("<=");
        lessequal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessequal3ActionPerformed(evt);
            }
        });

        contains3.setText("Contains");

        start3.setText("Begins With");
        start3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start3ActionPerformed(evt);
            }
        });

        end3.setText("End With");
        end3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end3ActionPerformed(evt);
            }
        });

        jLabel33.setText("Condition Code");

        regex3.setText("Regex");
        regex3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regex3ActionPerformed(evt);
            }
        });

        jTextField30.setText("==");

        jRadioButton1.setText("XPath");

        jRadioButton2.setText("ID");

        jRadioButton3.setText("Name");

        javax.swing.GroupLayout xpathClick6Layout = new javax.swing.GroupLayout(xpathClick6);
        xpathClick6.setLayout(xpathClick6Layout);
        xpathClick6Layout.setHorizontalGroup(
            xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick6Layout.createSequentialGroup()
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xpathClick6Layout.createSequentialGroup()
                        .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpathClick6Layout.createSequentialGroup()
                                .addComponent(grater3)
                                .addGap(36, 36, 36))
                            .addComponent(contains3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpathClick6Layout.createSequentialGroup()
                                .addComponent(less3)
                                .addGap(23, 23, 23)
                                .addComponent(equal3))
                            .addComponent(start3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(end3)
                            .addComponent(graterequal3))
                        .addGap(18, 18, 18)
                        .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regex3)
                            .addComponent(lessequal3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(xpathClick6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(xpathClick6Layout.createSequentialGroup()
                                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField28)
                                    .addComponent(jTextField29)))
                            .addGroup(xpathClick6Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField30))
                            .addGroup(xpathClick6Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(xpathClick6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        xpathClick6Layout.setVerticalGroup(
            xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xpathClick6Layout.createSequentialGroup()
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(10, 10, 10)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grater3)
                    .addComponent(less3)
                    .addComponent(equal3)
                    .addComponent(graterequal3)
                    .addComponent(lessequal3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contains3)
                    .addComponent(start3)
                    .addComponent(end3)
                    .addComponent(regex3))
                .addGap(18, 18, 18)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(xpathClick6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton54)
                    .addComponent(jButton55)
                    .addComponent(jButton56))
                .addContainerGap())
        );

        actionlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        actionlabel.setForeground(new java.awt.Color(0, 102, 102));

        UrlLabel2.setText("wait in sec");

        jButton36.setText("Cancel");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("Done");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("clear");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WaitpanelLayout = new javax.swing.GroupLayout(Waitpanel);
        Waitpanel.setLayout(WaitpanelLayout);
        WaitpanelLayout.setHorizontalGroup(
            WaitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WaitpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WaitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WaitpanelLayout.createSequentialGroup()
                        .addComponent(UrlLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Waitinput))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WaitpanelLayout.createSequentialGroup()
                        .addComponent(jButton37)
                        .addGap(18, 18, 18)
                        .addComponent(jButton38)
                        .addGap(18, 18, 18)
                        .addComponent(jButton36)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        WaitpanelLayout.setVerticalGroup(
            WaitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WaitpanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(WaitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrlLabel2)
                    .addComponent(Waitinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(WaitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36)
                    .addComponent(jButton37)
                    .addComponent(jButton38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UrlLabel3.setText("URL ");

        jButton39.setText("Cancel");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("Done");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton44.setText("clear");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout url2Layout = new javax.swing.GroupLayout(url2);
        url2.setLayout(url2Layout);
        url2Layout.setHorizontalGroup(
            url2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(url2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, url2Layout.createSequentialGroup()
                        .addComponent(UrlLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Urltext3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, url2Layout.createSequentialGroup()
                        .addComponent(jButton40)
                        .addGap(18, 18, 18)
                        .addComponent(jButton44)
                        .addGap(18, 18, 18)
                        .addComponent(jButton39)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        url2Layout.setVerticalGroup(
            url2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(url2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(url2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrlLabel3)
                    .addComponent(Urltext3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(url2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton39)
                    .addComponent(jButton40)
                    .addComponent(jButton44))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelformLayout = new javax.swing.GroupLayout(jPanelform);
        jPanelform.setLayout(jPanelformLayout);
        jPanelformLayout.setHorizontalGroup(
            jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelformLayout.createSequentialGroup()
                .addComponent(xpathClick6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(url2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanelformLayout.createSequentialGroup()
                .addComponent(xpathClick1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actionlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(actionimg, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(135, 135, 135))
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Waitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelformLayout.setVerticalGroup(
            jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelformLayout.createSequentialGroup()
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xpathClick1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelformLayout.createSequentialGroup()
                        .addComponent(actionlabel)
                        .addGap(10, 10, 10)
                        .addComponent(actionimg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Waitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xpathClick6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(url2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton23.setText("Print");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton23MouseReleased(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(0, 102, 102));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton20.setText("Generat Json File");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 102, 102));
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton21.setText("Generate Selenium Code");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 102, 102));
        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton22.setText("drow Steps");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Generate Jar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Notations   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18), new java.awt.Color(0, 102, 102))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Write Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        writexpath.setForeground(new java.awt.Color(255, 255, 255));
        writexpath.setText("XPath");
        writexpath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                writexpathMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                writexpathMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                writexpathMousePressed(evt);
            }
        });

        writeName.setForeground(new java.awt.Color(255, 255, 255));
        writeName.setText("Name");
        writeName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                writeNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                writeNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                writeNameMousePressed(evt);
            }
        });

        writeID.setForeground(new java.awt.Color(255, 255, 255));
        writeID.setText("ID");
        writeID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                writeIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                writeIDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                writeIDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(writexpath)
                .addGap(18, 18, 18)
                .addComponent(writeName)
                .addGap(18, 18, 18)
                .addComponent(writeID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(writexpath)
                    .addComponent(writeName)
                    .addComponent(writeID))
                .addGap(20, 20, 20))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Read Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        readxpath.setForeground(new java.awt.Color(255, 255, 255));
        readxpath.setText("Xpath");
        readxpath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readxpathMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readxpathMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                readxpathMousePressed(evt);
            }
        });

        readName.setForeground(new java.awt.Color(255, 255, 255));
        readName.setText("Name");
        readName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                readNameMousePressed(evt);
            }
        });

        readID.setForeground(new java.awt.Color(255, 255, 255));
        readID.setText("ID");
        readID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readIDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                readIDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(readxpath)
                .addGap(18, 18, 18)
                .addComponent(readName)
                .addGap(18, 18, 18)
                .addComponent(readID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readxpath)
                    .addComponent(readName)
                    .addComponent(readID))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Submit Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        clickxpath.setForeground(new java.awt.Color(255, 255, 255));
        clickxpath.setText("Xpath");
        clickxpath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickxpathMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickxpathMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clickxpathMousePressed(evt);
            }
        });

        clickName.setForeground(new java.awt.Color(255, 255, 255));
        clickName.setText("Name");
        clickName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clickNameMousePressed(evt);
            }
        });

        clickID.setForeground(new java.awt.Color(255, 255, 255));
        clickID.setText("ID");
        clickID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clickIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clickIDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clickIDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(clickxpath)
                .addGap(18, 18, 18)
                .addComponent(clickName)
                .addGap(18, 18, 18)
                .addComponent(clickID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickxpath)
                    .addComponent(clickName)
                    .addComponent(clickID))
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        urlLabel.setForeground(new java.awt.Color(255, 255, 255));
        urlLabel.setText("URL       ");
        urlLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                urlLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                urlLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                urlLabelMousePressed(evt);
            }
        });

        conditionLabel.setForeground(new java.awt.Color(255, 255, 255));
        conditionLabel.setText("Cond");
        conditionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conditionLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conditionLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conditionLabelMousePressed(evt);
            }
        });

        waitLabel.setForeground(new java.awt.Color(255, 255, 255));
        waitLabel.setText("Wait");
        waitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                waitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                waitLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                waitLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(urlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conditionLabel)
                .addGap(18, 18, 18)
                .addComponent(waitLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(conditionLabel)
                    .addComponent(waitLabel))
                .addGap(20, 20, 20))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conditions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        end4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        end4.setText("End With");
        end4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                end4MousePressed(evt);
            }
        });
        end4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end4ActionPerformed(evt);
            }
        });

        start4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        start4.setText("Begins With");
        start4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                start4MousePressed(evt);
            }
        });
        start4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start4ActionPerformed(evt);
            }
        });

        contains4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        contains4.setText("Contains");
        contains4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contains4MousePressed(evt);
            }
        });

        lessequal4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lessequal4.setText("<=");
        lessequal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lessequal4MousePressed(evt);
            }
        });
        lessequal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessequal4ActionPerformed(evt);
            }
        });

        grater4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        grater4.setText(">");
        grater4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grater4MousePressed(evt);
            }
        });

        less4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        less4.setText("<");
        less4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                less4MousePressed(evt);
            }
        });
        less4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                less4ActionPerformed(evt);
            }
        });

        regex4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        regex4.setText("Regex");
        regex4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                regex4MousePressed(evt);
            }
        });
        regex4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regex4ActionPerformed(evt);
            }
        });

        equal4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        equal4.setText("=");
        equal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                equal4MousePressed(evt);
            }
        });
        equal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal4ActionPerformed(evt);
            }
        });

        graterequal4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        graterequal4.setText(">=");
        graterequal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graterequal4MousePressed(evt);
            }
        });
        graterequal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graterequal4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grater4)
                    .addComponent(contains4))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(less4)
                    .addComponent(start4))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(end4)
                    .addComponent(equal4))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(graterequal4)
                        .addGap(18, 18, 18)
                        .addComponent(lessequal4))
                    .addComponent(regex4))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grater4)
                    .addComponent(less4)
                    .addComponent(equal4)
                    .addComponent(graterequal4)
                    .addComponent(lessequal4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contains4)
                    .addComponent(start4)
                    .addComponent(end4)
                    .addComponent(regex4)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int stepNum = 1;
        for (int i = 0; i < stepPanel.size(); i++) {
            System.out.println("Step number : " + stepNum++ + " \n  Discription: " + ((TitledBorder) stepPanel.get(i).getBorder()).getTitle());
            Component[] components = stepPanel.get(i).getComponents();

            for (Component component : components) {
                if (component.getClass().equals(JTextField.class)) {
                    if (((JTextField) component).getText().length() > 0) {
                        System.out.print(((JTextField) component).getText() + "         ###      ");
                        System.out.println();
                    }
                } else if (component.getClass().equals(JLabel.class)) {
                    if (((JLabel) component).getText().length() > 0) {
                        System.out.print(((JLabel) component).getText() + "         ###      ");
                        System.out.println();
                    }
                }
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(UrlLabel.getText(), Urltext.getText(), "Add URL to Test", "URL", "", "url.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        this.setVisible(true);
        jFrameURL.setVisible(false);
        repaint();
        revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed

    Component selectedComponent;
    MouseListener mouseListener = new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            checkPopup(e);
        }

        public void mouseClicked(MouseEvent e) {
            checkPopup(e);
        }

        public void mouseReleased(MouseEvent e) {
            checkPopup(e);
        }

        private void checkPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {

                selectedComponent = e.getComponent();
                jPopupMenu1.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    };
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

//        selectedComponent.getContentPane().removeAll();
        stepspanel.remove(selectedComponent);
        stepPanel.remove(selectedComponent);
        revalidate(); // in- and validate in one !! 

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseReleased

        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton23MouseReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Component[] components = ((JPanel) selectedComponent).getComponents();

//            for (Component component : components) {
//                if (component.getClass().equals(JTextField.class)) {
//                    //System.err.println("RRRRRRRRRR"+((JTextField) component).getName());
//                   if(((JTextField) component).getName().equals("WRITE")){
//                      System.err.println("RRRRRRRRRR"+((JTextField) component).getName());
//
//                   }
//                }
//            }
//            Component[] components2 = ((JPanel) selectedComponent).getComponents();
//for (int i = 0; i < components2.length; i++) {
//    System.out.println("Componenet name - " + components2[i].getName());
//   
//if (components2[i] instanceof JLabel) {
//                       
//                            jTextField5.setText(((JLabel) components2[i]).getText());
//                            System.out.println("Sub Componenet name - " + ((JLabel) components2[i]).getText());
//                       
//                       }else if (components2[i] instanceof JTextField) {
//                        {
//                           jTextField12.setText(((JTextField) components2[i]).getText());
//                           System.out.println("Sub Componenet name - " + ((JTextField) components2[i]).getText());
//                           
//                       }
////        Component s[] = ((JTextField) components2[i]).getComponents();
////        for (int j = 0; j < s.length; j++) {
//            System.out.println("Sub Componenet name - " + ((JTextField) components2[i]).getText());
////        }
//    }
//
//}
        int i = 0;
        for (Component component : components) {
            System.out.println("Sub Componenet name eeeeeeeeeeeeeeeee- " + (component).getName());
            //if (component.getClass().equals(JTextField.class)) {
            if ((component).getName().equals("URL")) {
                if (component.getClass().equals(JTextField.class)) {
                    jFrameUpdateURL.setVisible(true);
                    jFrameUpdateURL.pack();
                    Urltext1.setText(((JTextField) component).getText());
                }

            } else if ((component).getName().equals("WAIT")) {
                if (component.getClass().equals(JTextField.class)) {
                    jFramwaitTimeUpdate.setVisible(true);
                    jFramwaitTimeUpdate.pack();
                    jTextFieldwaitupdate.setText(((JTextField) component).getText());
                }
            } else if ((component).getName().equals("WRITE") || (component).getName().equals("READ") || (component).getName().equals("CLICK")) {
                if (component.getClass().equals(JLabel.class)) {

                    Updatename.setText(((JLabel) component).getText());

                } else if (component.getClass().equals(JTextField.class)) {
                    {
                        updateByAction.setText(((JTextField) component).getText());

                    }
                    jFramActionUpdate.setVisible(true);
                    jFramActionUpdate.pack();
                }
            } else if ((component).getName().equals("IF")) {

                if (component.getClass().equals(JLabel.class)) {
                    System.out.println(((JLabel) component).getText());
//                    jTextField24.setText(((JLabel) component).getText());
                    if (((JLabel) component).getText().equals(">")) {
                        grater1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("<")) {

                        less1.setSelected(true);
                    } else if (((JLabel) component).getText().trim().equals("=")) {

                        equal1.setSelected(true);
                    } else if (((JLabel) component).getText().equals(">=")) {

                        graterequal1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("<=")) {

                        lessequal1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("contains")) {

                        contains1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("start")) {

                        start1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("end")) {

                        end1.setSelected(true);
                    } else if (((JLabel) component).getText().equals("regex")) {

                        regex1.setSelected(true);
                    }

                } else if (component.getClass().equals(JTextField.class)) {
                    {
                        if (i == 0) {

                            jTextField22.setText(((JTextField) component).getText());
                            i++;
                        } else {
                            jTextField23.setText(((JTextField) component).getText());
                            i = 0;
                        }

                    }

                }
                jFramIfStatmentsUpdate.setVisible(true);
                jFramIfStatmentsUpdate.pack();
                //}
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        for (int i = 0; i < stepPanel.size(); i++) {
            if (stepPanel.get(i).equals((JPanel) selectedComponent)) {
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {
                    if (component.getClass().equals(JTextField.class)) {
//                    System.err.println(((JTextField) component).getText());
                        ((JTextField) component).setText(Urltext1.getText());
                    }
                }
            }
        }
        revalidate();
        jFrameUpdateURL.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jLabelwaittime.getText(), jTextFieldwaittime.getText(), "Add Wait to Test", "WAIT", "", "write.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);
        jFramwaitTime.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        for (int i = 0; i < stepPanel.size(); i++) {
            if (stepPanel.get(i).equals((JPanel) selectedComponent)) {
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {
                    if (component.getClass().equals(JTextField.class)) {
//                    System.err.println(((JTextField) component).getText());
                        ((JTextField) component).setText(jTextFieldwaitupdate.getText());
                    }
                }
            }
        }
        revalidate();
        jFramwaitTimeUpdate.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jTextwriteinputName.getText(), jTextXpathWrite.getText(), "Add Write Action ", "WRITE", "", "write.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);
        jFramAction.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  if(Updatename.getText().length() == 0 ||   updateByAction.getText().length() == 0){
            JOptionPane.showMessageDialog(this, " Please fill all elements aaction input name/ input by :");
           
        }else {
      int j = 0;
  
        for (int i = 0; i < stepPanel.size(); i++) {
            if (stepPanel.get(i).equals((JPanel) selectedComponent)) {
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {
                    if (component.getClass().equals(JTextField.class)) {
                        //                    System.err.println(((JTextField) component).getText());
                        ((JTextField) component).setText(updateByAction.getText());
                    } else if (component.getClass().equals(JLabel.class) && j == 1) {
                        //                    System.err.println(((JTextField) component).getText());
                        ((JLabel) component).setText(Updatename.getText());

                    }
                    j++;
                }
            }
        }
        revalidate();
        jFramActionUpdate.setVisible(false);   
  }// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jTextField6.getText(), jTextField7.getText(), "Add Read Action ", "READ", "", "read.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);
        jFramAction.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jTextField8.getText(), jTextField9.getText(), "Add Click Action ", "CLICK", "", "click.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);
        jFramAction.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equalActionPerformed

    private void graterequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graterequalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graterequalActionPerformed

    private void lessequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessequalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessequalActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endActionPerformed

    private void regexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regexActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        String cond = "";

        if (grater.isSelected()) {
            cond = ">";
        } else if (less.isSelected()) {
            cond = "<";
        } else if (equal.isSelected()) {
            cond = "=";
        } else if (graterequal.isSelected()) {
            cond = ">=";
        } else if (lessequal.isSelected()) {
            cond = "<=";
        } else if (contains.isSelected()) {
            cond = "contains";
        } else if (start.isSelected()) {
            cond = "start";
        } else if (end.isSelected()) {
            cond = "end";
        } else if (regex.isSelected()) {
            cond = "regex";
        }
//        System.err.println(cond);
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jTextField19.getText(), jTextField20.getText(), "Add IF Condition ", "IF", cond, "statment.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);
        jFramIfStatments.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        String cond = "";
        int j = 0;
        for (int i = 0; i < stepPanel.size(); i++) {
            if (stepPanel.get(i).equals((JPanel) selectedComponent)) {
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {
                    if (component.getClass().equals(JTextField.class)) {
                        //                    System.err.println(((JTextField) component).getText());

                        if (i == 0) {

                            ((JTextField) component).setText(jTextField22.getText());
                            i++;
                        } else {
                            ((JTextField) component).setText(jTextField23.getText());
                            i = 0;
                        }
                    } else if (component.getClass().equals(JLabel.class)) {
                        //                    System.err.println(((JTextField) component).getText());
                        if (((JLabel) component).getText().length() > 0) {
                            if (grater1.isSelected()) {
                                cond = ">";
                            } else if (less1.isSelected()) {
                                cond = "<";
                            } else if (equal1.isSelected()) {
                                cond = "=";
                            } else if (graterequal1.isSelected()) {
                                cond = ">=";
                            } else if (lessequal1.isSelected()) {
                                cond = "<=";
                            } else if (contains1.isSelected()) {
                                cond = "contains";
                            } else if (start1.isSelected()) {
                                cond = "start";
                            } else if (end1.isSelected()) {
                                cond = "end";
                            } else if (regex1.isSelected()) {
                                cond = "regex";
                            }
                            ((JLabel) component).setText(cond);
                        }
                    }
                }
            }
        }
        revalidate();
        jFramIfStatmentsUpdate.setVisible(false);


    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void less1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_less1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_less1ActionPerformed

    private void equal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equal1ActionPerformed

    private void graterequal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graterequal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graterequal1ActionPerformed

    private void lessequal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessequal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessequal1ActionPerformed

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start1ActionPerformed

    private void end1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end1ActionPerformed

    private void regex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regex1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regex1ActionPerformed

    private void grater1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grater1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grater1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int stepNum = 1;
        String NameElement = "";
        String XpathElement = "";
        String Actionstep = "";
        String actionBy = "";
        int j = 0;
        JSONObject testDetails = new JSONObject();
        JSONObject testJson = new JSONObject();
        JSONArray TestList = new JSONArray();
        JSONObject testObject = new JSONObject();
        for (int i = 0; i < stepPanel.size(); i++) {
            testDetails = new JSONObject();
            testObject = new JSONObject();
            testDetails.put("Step number :", stepNum);
            testDetails.put("Step discription:", ((TitledBorder) stepPanel.get(i).getBorder()).getTitle());
            //just for if statment 
            if (((TitledBorder) stepPanel.get(i).getBorder()).getTitle().contains("IF")) {
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {

                    if (component.getClass().equals(JTextField.class)) {
                        if (((JTextField) component).getText().length() > 0) {
                            if (j == 0) {
                                XpathElement = ((JTextField) component).getText();
                                Actionstep = ((JTextField) component).getName();
                                testDetails.put("data-qa:", ((JTextField) component).getText());
                                j++;
                            } else {

                                testDetails.put("value:", ((JTextField) component).getText());
                                j = 0;
                            }
                        }
                    } else if (component.getClass().equals(JLabel.class)) {
                        if (((JLabel) component).getText().length() > 0) {
                            testDetails.put("condition:", ((JLabel) component).getText());
                        }
                    }
                }
            } else {

                // System.out.println("Step number : " + stepNum++ + " \n  Discription: " + ((TitledBorder) stepPanel.get(i).getBorder()).getTitle());
                Component[] components = stepPanel.get(i).getComponents();

                for (Component component : components) {

                    if (component.getClass().equals(JTextField.class)) {
                        if (((JTextField) component).getText().length() > 0) {
                            System.out.print(((JTextField) component).getText() + "         ###      " + ((JTextField) component).getName());
                            System.out.println();
                            XpathElement = ((JTextField) component).getText();
                            Actionstep = ((JTextField) component).getName();
                        }
                    } else if (component.getClass().equals(JLabel.class)) {
                        if (((JLabel) component).getText().length() > 0) {
                            System.out.print(((JLabel) component).getText() + "         ###      ");
                            System.out.println();
                            NameElement = ((JLabel) component).getText();
                        }

                    }
                }
                testDetails.put("action Type:", stepPanel.get(i).getName());

                testDetails.put("Element Name:", NameElement);

                testDetails.put("XPATH Element:", XpathElement);

            }
            testDetails.put("action Type:", stepPanel.get(i).getName());
            testDetails.put("Step Action:", Actionstep);

            //testObject.put("Test", testJson);
            testObject.put("step#:" + stepNum, testDetails);
            stepNum++;
            TestList.add(testObject);
        }

        System.out.println(TestList.size());
        //Write JSON file
        try (FileWriter file = new FileWriter("Test.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(TestList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(TestList);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed
    static BufferedWriter bw;
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {
            String content
                    = "\n\n"
                    + "/**\n"
                    + " *\n"
                    + " * @author Generated By Automation Tool For QA \n" + " */"
                    + "\n\nimport java.util.concurrent.TimeUnit;\n\n"
                    + "import org.openqa.selenium.By;\n"
                    + "import org.openqa.selenium.WebDriver;\n\n"
                    + "import org.openqa.selenium.WebElement;\n"
                    + "import org.openqa.selenium.chrome.ChromeDriver;\n\n"
                    + "import org.testng.Assert;\n\n\n"
                    + "public class NewJFrame {\n"
                    + "   static WebDriver driver;\n"
                    + "   public static void main(String [] args) throws Exception {\n"
                    + "       System.setProperty(\"webdriver.chrome.driver\", \"C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe\");\n"
                    + "       driver=new ChromeDriver();\n"
                    + "       driver.manage().window().maximize();";
            File file = new File("C:\\Users\\admin\\OneDrive - NVIDIA Corporation\\Documents\\NetBeansProjects\\ThesisQAToolGeneratedCode\\src\\NewJFrame.java");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            bw.write(content);

//JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();

            try (FileReader reader = new FileReader("Test.json")) {
                //Read JSON file
                Object obj = jsonParser.parse(reader);

                JSONArray TestList = (JSONArray) obj;

                System.out.println(TestList.size());
                //Iterate over employee array
                for (int i = 0; i < TestList.size(); i++) {
                    System.out.println(((JSONObject) TestList.get(i)));
                    JSONObject testObject = (JSONObject) ((JSONObject) TestList.get(i)).get("step#:" + (i + 1));

                    //Get employee first name
                    String des = (String) testObject.get("Step discription:");
                    System.out.println(des);
                    //parseTestObject((JSONObject) employeeList.get(i), "step#:" + (i + 1));
                    bw.append("\n       //" + des);
                    bw.append("\n       step" + (i + 1) + "();\n");
                }

                bw.append("\n   }");//end of main

                //write steps functions
                for (int i = 0; i < TestList.size(); i++) {
                    System.out.println(((JSONObject) TestList.get(i)));
                    bw.append("\n\n   private static void step" + (i + 1) + "() throws Exception{\n"
                            + "      \n"
                            + "    \n");
                    parseTestObject((JSONObject) TestList.get(i), "step#:" + (i + 1));
                    bw.append("\n   }");
                }
                bw.append("\n}");//end of class

//              runCommand();
                //employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            bw.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed
    private static void parseTestObject(JSONObject test, String step) throws IOException {
        //Get employee object within list
        JSONObject testObject = (JSONObject) test.get(step);

        //Get employee first name
        String ElementName = (String) testObject.get("Element Name:");
        System.out.println(ElementName);
        String stepAction = (String) testObject.get("Step Action:");
        System.out.println(stepAction);
        //String stepNumber = (String) testObject.get("Step number :");    
        System.out.println(step);
        String xpathElement = (String) testObject.get("XPATH Element:");
        System.out.println(xpathElement);
        String stepDescription = (String) testObject.get("Step discription:");
        System.out.println(stepDescription);
         String actionType = (String) testObject.get("action Type:");
        System.out.println(actionType);
        String value = (String) testObject.get("value:");
        
        String dataqa = (String) testObject.get("data-qa:");
        System.out.println(value);
        bw.append("\n       // **********##The step##==>  " + stepDescription + "******\n\n");
        if (stepAction.equals("URL")) {
            bw.append("      driver.get(\"" + xpathElement + "\");\n");
        } else if (stepAction.toLowerCase().contains("write")) {
            bw.append("      WebElement username=driver.findElement(By."+actionType+"(\"" + xpathElement + "\"));\n");
            bw.append("      username.sendKeys(\"" + ElementName + "\");\n");

        } else if (stepAction.toLowerCase().contains("click")) {
            bw.append("      WebElement login=driver.findElement(By."+actionType+"(\"" + xpathElement + "\"));\n");
            bw.append("      login.click();\n");

        } else if (stepAction.toLowerCase().contains("read")) {
            bw.append("      WebElement username=driver.findElement(By."+actionType+"(\"" + xpathElement + "\"));\n");
            //bw.append("      username.sendKeys(\"" + ElementName + "\");\n");

        }
        else if (stepAction.toLowerCase().contains("if")) {
            bw.append("      WebElement elem=driver.findElement(By."+actionType+"(\"" + dataqa + "\"));\n");
            bw.append("      if (!\""+value+"\".trim().equalsIgnoreCase(elem.getText().trim())) {\n");
            bw.append("         throw (new Exception ( \"exception value must be equals\"));\n");
            
            bw.append("      }\n");

        }
//        //Get employee last name
//        String lastName = (String) testObject.get("lastName");  
//        System.out.println(lastName);
//         
//        //Get employee website name
//        String website = (String) testObject.get("website");    
//        System.out.println(website);
    }

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int stepNum = 1;
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/line.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        JFrame frame = new JFrame("Steps Of The Test");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridLayout(stepPanel.size() * 2, 1));

        for (int i = 0; i < stepPanel.size(); i++) {
            contentPane.add(stepPanel.get(i));
            JLabel labelline = new JLabel();
            labelline.setIcon(imageIconread);
            labelline.setSize(40, 40);
            contentPane.add(labelline);
            frame.repaint();

        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(contentPane, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

//            System.out.println("Step number : " + stepNum++ + " \n  Discription: " + ((TitledBorder) stepPanel.get(i).getBorder()).getTitle());
//            Component[] components = stepPanel.get(i).getComponents();
//
//            for (Component component : components) {
//                if (component.getClass().equals(JTextField.class)) {
//                    if (((JTextField) component).getText().length() > 0) {
//                        System.out.print(((JTextField) component).getText() + "         ###      ");
//                        System.out.println();
//                    }
//                } else if (component.getClass().equals(JLabel.class)) {
//                    if (((JLabel) component).getText().length() > 0) {
//                        System.out.print(((JLabel) component).getText() + "         ###      ");
//                        System.out.println();
//                    }
//                }
//            }
//
//        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed

        if(Urltext3.getText().length() == 0 ){
            JOptionPane.showMessageDialog(this, " Please fill all elements URL input like: https://www.facebook.com");
           
        }else {
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(UrlLabel3.getText(), Urltext3.getText(), "Add URL to Test", "URL", "", "url.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        this.setVisible(true);
        jFrameURL.setVisible(false);
        repaint();
        revalidate(); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
 if(Waitinput.getText().length() == 0 ){
            JOptionPane.showMessageDialog(this, " Please fill waiting time input in sec ");
           
        }else {        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(UrlLabel2.getText(), Waitinput.getText(), "Add Wait to Test", "WAIT", "", "sleep.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        setVisible(true);    
 }// TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
Waitpanel.setVisible(false); 
actionlabel.setVisible(false);
actionimg.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void regex3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regex3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regex3ActionPerformed

    private void end3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end3ActionPerformed

    private void start3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start3ActionPerformed

    private void lessequal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessequal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessequal3ActionPerformed

    private void graterequal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graterequal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graterequal3ActionPerformed

    private void equal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equal3ActionPerformed

    private void less3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_less3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_less3ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        String cond = "";

        if (grater3.isSelected()) {
            cond = ">";
        } else if (less3.isSelected()) {
            cond = "<";
        } else if (equal3.isSelected()) {
            cond = "=";
        } else if (graterequal3.isSelected()) {
            cond = ">=";
        } else if (lessequal3.isSelected()) {
            cond = "<=";
        } else if (contains3.isSelected()) {
            cond = "contains";
        } else if (start3.isSelected()) {
            cond = "start";
        } else if (end3.isSelected()) {
            cond = "end";
        } else if (regex3.isSelected()) {
            cond = "regex";
        }
        
        
        if (jRadioButton1.isSelected()) {
            findBy = "xpath";
        } else if (jRadioButton2.isSelected()) {
            findBy = "id";
        } else{
            findBy = "name";
        }
        //        System.err.println(cond);
        LayoutManager layout = new GridLayout(1, 2);
        stepspanel.setLayout(layout);
        StepsList step = new StepsList();
        step.addStep(jTextField28.getText(), jTextField29.getText(), "Add IF Condition ", "IF", cond, "statment.png", findBy);
        step.getPanelStep().addMouseListener(mouseListener);
        stepspanel.add(step.getPanelStep());
        stepPanel.add(step.getPanelStep());
        repaint();
        revalidate();
        this.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
       
        if(actionInputName.isVisible() && ( actionInputName.getText().length() == 0 ||   actionInputby.getText().length() == 0 )){
            JOptionPane.showMessageDialog(this, " Please fill all elements aaction input name/ input by :");
           
        }else {
        if (actionlabel.getText().contains("READ")) {
            LayoutManager layout = new GridLayout(1, 2);
            stepspanel.setLayout(layout);
            StepsList step = new StepsList();
            step.addStep(actionInputName.getText(), actionInputby.getText(), "Add Read Action ", "READ", "", "read.png", findBy);
            step.getPanelStep().addMouseListener(mouseListener);
            stepspanel.add(step.getPanelStep());
            stepPanel.add(step.getPanelStep());
            repaint();
            revalidate();
            this.setVisible(true);
            //        jFramAction.setVisible(false);
        } else if (actionlabel.getText().contains("CLICK")) {
            LayoutManager layout = new GridLayout(1, 2);
            stepspanel.setLayout(layout);
            StepsList step = new StepsList();
            step.addStep(actionInputName.getText(), actionInputby.getText(), "Add Click Action ", "CLICK", "", "click.png", findBy);
            step.getPanelStep().addMouseListener(mouseListener);
            stepspanel.add(step.getPanelStep());
            stepPanel.add(step.getPanelStep());
            repaint();
            revalidate();
            this.setVisible(true);
            //        jFramAction.setVisible(false);
        } else if (actionlabel.getText().contains("WRITE")) {
            LayoutManager layout = new GridLayout(1, 2);
            stepspanel.setLayout(layout);
            StepsList step = new StepsList();
            step.addStep(actionInputName.getText(), actionInputby.getText(), "Add WRITE Action ", "WRITE", "", "write.png", findBy);
            step.getPanelStep().addMouseListener(mouseListener);
            stepspanel.add(step.getPanelStep());
            stepPanel.add(step.getPanelStep());
            repaint();
            revalidate();
            this.setVisible(true);
            //        jFramAction.setVisible(false);
        }
        actionInputName.setText("");
        actionInputby.setText("");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "/c", "javac  ../ThesisQAToolGeneratedCode/src/test.java");

        try {

            Process process = processBuilder.start();

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void less4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_less4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_less4ActionPerformed

    private void start4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start4ActionPerformed

    private void equal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equal4ActionPerformed

    private void end4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end4ActionPerformed

    private void graterequal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graterequal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graterequal4ActionPerformed

    private void lessequal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessequal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lessequal4ActionPerformed

    private void regex4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regex4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regex4ActionPerformed

    private void writexpathMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writexpathMouseEntered
        writexpath.setForeground(Color.WHITE);
        writexpath.setBackground(new Color(red,green,blue));
        writexpath.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_writexpathMouseEntered

    private void writexpathMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writexpathMouseExited
        writexpath.setForeground(Color.WHITE);
        writexpath.setBackground(new Color(240, 240, 240));
        writexpath.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_writexpathMouseExited

    private void writexpathMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writexpathMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);        xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("WRITE");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/write.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "xpath";
        jPanel8.setVisible(false);
        pack();
        repaint();
        actionInputName.setText("");

actionInputby.setText("");
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
        actionLabel.setText(findBy);
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
        pack();        // TODO add your handling code here:
    }//GEN-LAST:event_writexpathMousePressed

    private void writeNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeNameMouseEntered
        writeName.setForeground(Color.WHITE);
        writeName.setBackground(new Color(red,green,blue));
        writeName.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_writeNameMouseEntered

    private void writeNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeNameMouseExited
        writeName.setForeground(Color.WHITE);
        writeName.setBackground(new Color(240, 240, 240));
        writeName.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_writeNameMouseExited

    private void writeNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeNameMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);         xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("WRITE");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/write.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        findBy = "name";
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
        actionLabel.setText(findBy);
jPanel8.setVisible(false);
xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        pack();
        repaint();
        jPanelform.repaint();
        pack();  // TODO add your handling code here:
    }//GEN-LAST:event_writeNameMousePressed

    private void writeIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeIDMouseEntered
        writeID.setForeground(Color.WHITE);
        writeID.setBackground(new Color(red,green,blue));
        writeID.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_writeIDMouseEntered

    private void writeIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeIDMouseExited
        writeID.setForeground(Color.WHITE);
        writeID.setBackground(new Color(240, 240, 240));
        writeID.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_writeIDMouseExited
    String findBy = "";
    private void writeIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeIDMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);         xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("WRITE");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/write.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        findBy = "id";
        jPanel8.setVisible(false);
        pack();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        repaint();
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        jPanelform.repaint();
        pack();// TODO add your handling code here:
    }//GEN-LAST:event_writeIDMousePressed

    private void readxpathMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readxpathMouseEntered
      readxpath.setForeground(Color.WHITE);
        readxpath.setBackground(new Color(red,green,blue));
        readxpath.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_readxpathMouseEntered

    private void readxpathMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readxpathMouseExited
       readxpath.setForeground(Color.WHITE);
        readxpath.setBackground(new Color(240, 240, 240));
        readxpath.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_readxpathMouseExited

    private void readxpathMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readxpathMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);   xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("READ");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/read.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "xpath";
        jPanel8.setVisible(false);
        pack();
        repaint();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();          // TODO add your handling code here:
    }//GEN-LAST:event_readxpathMousePressed

    private void readNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readNameMouseEntered
       readName.setForeground(Color.WHITE);
        readName.setBackground(new Color(red,green,blue));
        readName.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_readNameMouseEntered

    private void readNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readNameMouseExited
        readName.setForeground(Color.WHITE);
        readName.setBackground(new Color(240, 240, 240));
        readName.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_readNameMouseExited

    private void readNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readNameMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);        xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("READ");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/read.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "name";
        jPanel8.setVisible(false);
        pack();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        repaint();
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();  // TODO add your handling code here:
    }//GEN-LAST:event_readNameMousePressed

    private void readIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readIDMouseEntered
         readID.setForeground(Color.WHITE);
        readID.setBackground(new Color(red,green,blue));
        readID.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_readIDMouseEntered

    private void readIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readIDMouseExited
      readID.setForeground(Color.WHITE);
        readID.setBackground(new Color(240, 240, 240));
        readID.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_readIDMouseExited

    private void readIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readIDMousePressed
actionInputName.setVisible(true);
jLabel17.setVisible(true);         xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("READ");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/read.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "id";
        jPanel8.setVisible(false);
        pack();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        repaint();
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();// TODO add your handling code here:
    }//GEN-LAST:event_readIDMousePressed

    private void clickxpathMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickxpathMouseEntered
       clickxpath.setForeground(Color.WHITE);
        clickxpath.setBackground(new Color(red,green,blue));
        clickxpath.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_clickxpathMouseEntered

    private void clickxpathMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickxpathMouseExited
       clickxpath.setForeground(Color.WHITE);
        clickxpath.setBackground(new Color(240, 240, 240));
        clickxpath.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_clickxpathMouseExited

    private void clickxpathMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickxpathMousePressed
xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("CLICK");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/click.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "xpath";
        jPanel8.setVisible(false);
        pack();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");
actionInputName.setVisible(false);
jLabel17.setVisible(false);
actionInputby.setText("");
        repaint();
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();          // TODO add your handling code here:
    }//GEN-LAST:event_clickxpathMousePressed

    private void clickNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNameMouseEntered
      clickName.setForeground(Color.WHITE);
        clickName.setBackground(new Color(red,green,blue));
        clickName.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_clickNameMouseEntered

    private void clickNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNameMouseExited
       clickName.setForeground(Color.WHITE);
        clickName.setBackground(new Color(240, 240, 240));
        clickName.setOpaque(true);  // TODO add your handling code here:
    }//GEN-LAST:event_clickNameMouseExited

    private void clickNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNameMousePressed
actionInputName.setVisible(false);
jLabel17.setVisible(false);
xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        actionlabel.setText("CLICK");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/click.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        jPanel8.setVisible(false);
        pack();
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        repaint();
        findBy = "name";
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();  // TODO add your handling code here:
    }//GEN-LAST:event_clickNameMousePressed

    private void clickIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickIDMouseEntered
        clickID.setForeground(Color.WHITE);
        clickID.setBackground(new Color(red,green,blue));
        clickID.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_clickIDMouseEntered

    private void clickIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickIDMouseExited
       clickID.setForeground(Color.WHITE);
        clickID.setBackground(new Color(240, 240, 240));
        clickID.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_clickIDMouseExited

    private void clickIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickIDMousePressed
actionInputName.setVisible(false);
jLabel17.setVisible(false);       xpathClick6.setVisible(false);
        Waitpanel.setVisible(false);
        jPanel8.setVisible(false);
        pack();
        repaint();
        actionlabel.setText("CLICK");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/click.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(true);
        url2.setVisible(false);
        jPanelform.repaint();
        findBy = "id";
        xpathClick1.setVisible(true); 
actionlabel.setVisible(true);
actionimg.setVisible(true);
actionInputName.setText("");

actionInputby.setText("");
        actionlabel.setText(actionlabel.getText() + " By " + findBy);
actionLabel.setText(findBy);
        pack();  // TODO add your handling code here:
    }//GEN-LAST:event_clickIDMousePressed

    private void urlLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlLabelMouseEntered
        urlLabel.setForeground(Color.WHITE);
        urlLabel.setBackground(new Color(red,green,blue));
        urlLabel.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_urlLabelMouseEntered

    private void urlLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlLabelMouseExited
         urlLabel.setForeground(Color.WHITE);
        urlLabel.setBackground(new Color(240, 240, 240));
        urlLabel.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_urlLabelMouseExited

    private void urlLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlLabelMousePressed
      url2.setVisible(true);
      jPanel8.setVisible(false);
        pack();
        repaint();
        actionlabel.setText("Add URL");
      ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/urlnew.png").getImage().getScaledInstance(120, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        Waitpanel.setVisible(false);
        xpathClick6.setVisible(false);
        xpathClick1.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_urlLabelMousePressed

    private void waitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitLabelMouseEntered
         waitLabel.setForeground(Color.WHITE);
        waitLabel.setBackground(new Color(red,green,blue));
        waitLabel.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_waitLabelMouseEntered

    private void waitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitLabelMouseExited
         waitLabel.setForeground(Color.WHITE);
        waitLabel.setBackground(new Color(240, 240, 240));
        waitLabel.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_waitLabelMouseExited

    private void waitLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitLabelMousePressed
xpathClick6.setVisible(false);
jPanel8.setVisible(false);
        pack();
        repaint();
        Waitpanel.setVisible(true);
        actionlabel.setText("WAIT");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/sleep.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(false);
        url2.setVisible(false);
        jPanelform.repaint();
        pack();        // TODO add your handling code here:
    }//GEN-LAST:event_waitLabelMousePressed

    private void conditionLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionLabelMouseEntered
        conditionLabel.setForeground(Color.WHITE);
        conditionLabel.setBackground(new Color(red,green,blue));
        conditionLabel.setOpaque(true);// TODO add your handling code here:
    }//GEN-LAST:event_conditionLabelMouseEntered

    private void conditionLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionLabelMouseExited
       conditionLabel.setForeground(Color.WHITE);
        conditionLabel.setBackground(new Color(240, 240, 240));
        conditionLabel.setOpaque(true); // TODO add your handling code here:
    }//GEN-LAST:event_conditionLabelMouseExited

    private void conditionLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionLabelMousePressed
jPanel8.setVisible(true);
        pack();
        repaint();  
        actionlabel.setText("Condition");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/statment.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(false);
        xpathClick6.setBounds(10, 20, 340, 230);
        xpathClick6.setVisible(true);
        Waitpanel.setVisible(false);
        url2.setVisible(false);
grater3.setSelected(true);
grater4.setSelected(true);
        jPanelform.repaint();
        pack();   // TODO add your handling code here:
    }//GEN-LAST:event_conditionLabelMousePressed

    private void grater4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grater4MousePressed
actionlabel.setText("Condition");
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/statment.png").getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        actionimg.setIcon(imageIconread);
        xpathClick1.setVisible(false);
        xpathClick6.setBounds(10, 20, 340, 230);
        xpathClick6.setVisible(true);
        Waitpanel.setVisible(false);
        url2.setVisible(false);grater3.setSelected(true);
grater4.setSelected(true);
        jPanelform.repaint();
        pack();         // TODO add your handling code here:
    }//GEN-LAST:event_grater4MousePressed

    private void less4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_less4MousePressed
less3.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_less4MousePressed

    private void equal4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equal4MousePressed
equal3.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_equal4MousePressed

    private void graterequal4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graterequal4MousePressed
graterequal3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_graterequal4MousePressed

    private void lessequal4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessequal4MousePressed
lessequal3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_lessequal4MousePressed

    private void contains4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contains4MousePressed
contains3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_contains4MousePressed

    private void start4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start4MousePressed
start3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_start4MousePressed

    private void end4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_end4MousePressed
end3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_end4MousePressed

    private void regex4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regex4MousePressed
regex3.setSelected(true);         // TODO add your handling code here:
    }//GEN-LAST:event_regex4MousePressed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
 actionInputName.setText("");
        actionInputby.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
xpathClick1.setVisible(false); 
actionlabel.setVisible(false);
actionimg.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
updateByAction.setText("");Updatename.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 jFramActionUpdate.setVisible(false);
                    jFramActionUpdate.pack();    
                    this.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
Waitinput.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
Urltext3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
url2.setVisible(false); 
actionlabel.setVisible(false);
actionimg.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewJFrame frame = new NewJFrame();
                    frame.setVisible(true);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new NewJFrame().setVisible(true);
//                } catch (IOException ex) {
//                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Updatename;
    private javax.swing.JLabel UrlLabel;
    private javax.swing.JLabel UrlLabel1;
    private javax.swing.JLabel UrlLabel2;
    private javax.swing.JLabel UrlLabel3;
    private javax.swing.JTextField Urltext;
    private javax.swing.JTextField Urltext1;
    private javax.swing.JTextField Urltext3;
    private javax.swing.JTextField Waitinput;
    private javax.swing.JPanel Waitpanel;
    private javax.swing.JTextField actionInputName;
    private javax.swing.JTextField actionInputby;
    private javax.swing.JLabel actionLabel;
    private javax.swing.JLabel actionimg;
    private javax.swing.JLabel actionlabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel clickID;
    private javax.swing.JLabel clickName;
    private javax.swing.JLabel clickxpath;
    private javax.swing.JLabel conditionLabel;
    private javax.swing.JRadioButton contains;
    private javax.swing.JRadioButton contains1;
    private javax.swing.JRadioButton contains3;
    private javax.swing.JRadioButton contains4;
    private javax.swing.JRadioButton end;
    private javax.swing.JRadioButton end1;
    private javax.swing.JRadioButton end3;
    private javax.swing.JRadioButton end4;
    private javax.swing.JRadioButton equal;
    private javax.swing.JRadioButton equal1;
    private javax.swing.JRadioButton equal3;
    private javax.swing.JRadioButton equal4;
    private javax.swing.JRadioButton grater;
    private javax.swing.JRadioButton grater1;
    private javax.swing.JRadioButton grater3;
    private javax.swing.JRadioButton grater4;
    private javax.swing.JRadioButton graterequal;
    private javax.swing.JRadioButton graterequal1;
    private javax.swing.JRadioButton graterequal3;
    private javax.swing.JRadioButton graterequal4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFramAction;
    private javax.swing.JFrame jFramActionUpdate;
    private javax.swing.JFrame jFramIfStatments;
    private javax.swing.JFrame jFramIfStatmentsUpdate;
    private javax.swing.JFrame jFramWriteActionUpdate1;
    private javax.swing.JFrame jFrameURL;
    private javax.swing.JFrame jFrameUpdateURL;
    private javax.swing.JFrame jFramwaitTime;
    private javax.swing.JFrame jFramwaitTimeUpdate;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelwaittime;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelform;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldwaittime;
    private javax.swing.JTextField jTextFieldwaitupdate;
    private javax.swing.JTextField jTextXpathWrite;
    private javax.swing.JTextField jTextwriteinputName;
    private javax.swing.JRadioButton less;
    private javax.swing.JRadioButton less1;
    private javax.swing.JRadioButton less3;
    private javax.swing.JRadioButton less4;
    private javax.swing.JRadioButton lessequal;
    private javax.swing.JRadioButton lessequal1;
    private javax.swing.JRadioButton lessequal3;
    private javax.swing.JRadioButton lessequal4;
    private javax.swing.JLabel readID;
    private javax.swing.JLabel readName;
    private javax.swing.JLabel readxpath;
    private javax.swing.JRadioButton regex;
    private javax.swing.JRadioButton regex1;
    private javax.swing.JRadioButton regex3;
    private javax.swing.JRadioButton regex4;
    private javax.swing.JRadioButton start;
    private javax.swing.JRadioButton start1;
    private javax.swing.JRadioButton start3;
    private javax.swing.JRadioButton start4;
    private javax.swing.JPanel stepspanel;
    private javax.swing.JTextField updateByAction;
    private javax.swing.JPanel url;
    private javax.swing.JPanel url1;
    private javax.swing.JPanel url2;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JPanel wait1;
    private javax.swing.JPanel wait2;
    private javax.swing.JLabel waitLabel;
    private javax.swing.JLabel writeID;
    private javax.swing.JLabel writeName;
    private javax.swing.JLabel writexpath;
    private javax.swing.JPanel xpathClick;
    private javax.swing.JPanel xpathClick1;
    private javax.swing.JPanel xpathClick3;
    private javax.swing.JPanel xpathClick4;
    private javax.swing.JPanel xpathClick6;
    private javax.swing.JPanel xpathRead;
    private javax.swing.JPanel xpathWrite;
    private javax.swing.JPanel xpathWrite1;
    private javax.swing.JPanel xpathWrite2;
    // End of variables declaration//GEN-END:variables

    private void runCommand() {

        ProcessBuilder processBuilder = new ProcessBuilder();
        // Windows
        processBuilder.command("cmd.exe", "/c", "java -jar selenium.jar src/genratedCode/test.java");

        try {

            Process process = processBuilder.start();

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Windows
        processBuilder.command("cmd.exe", "/c", "java src/genratedCode/test");

        try {

            Process process = processBuilder.start();

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
