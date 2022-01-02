package genratedCode;


import .*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class StepsList {

    static int stepNumber = 1;
    JPanel panelStep = new JPanel();

    public void addStep(String ActionName, String Xpath, String Description, String drag, String action, String img,String findBy) {
        Border blackline = BorderFactory.createTitledBorder("Step-" + stepNumber + " _ " + Description);

        JPanel newPanel = new JPanel(new GridLayout(2, 2));
        JLabel labelName = new JLabel(ActionName);
        JLabel labelimg = new JLabel();
        JTextField stepxpath = new JTextField(Xpath);
        newPanel.setBorder(blackline);
        ImageIcon imageIconread = new ImageIcon(new ImageIcon("img/" + img).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        labelimg.setIcon(imageIconread);
        if (drag.equals("IF")) {
            labelName.setText(action);

            JLabel l = new JLabel(findBy);
            JTextField firstval = new JTextField(ActionName);
            //newPanel.add(labelimg);
            l.setIcon(imageIconread);
            newPanel.add(l);
            l.setName(drag);
            newPanel.add(firstval);
            firstval.setName(drag);
        }

        if (!drag.equals("IF")) {
            newPanel.add(labelimg);
        }
if (drag.equals("WAIT")) {
            newPanel.add(new JLabel());
        }

        newPanel.add(labelName);
        newPanel.add(stepxpath);
        stepxpath.setName(drag);
        labelName.setName(drag);
        labelimg.setName(drag);
        newPanel.setName(findBy);
        //newPanel.add(Descriptionstep);
        stepNumber++;

        panelStep = newPanel;
    }

    public JPanel getPanelStep() {
        return panelStep;
    }

}
