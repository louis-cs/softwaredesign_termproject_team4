//package main.java;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.*;

public class PluginToolWindow {
    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JLabel currentDate;
    private JLabel currentTime;
    private JLabel timeZone;
    private JPanel myToolWindowContent;

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JCheckBox checkBox7;
    private JCheckBox checkBox8;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;

    private int lineNum = -1;


    public PluginToolWindow(ToolWindow toolWindow) {
        //hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
        //refreshToolWindowButton.addActionListener(e -> currentDateTime());

        myToolWindowContent = new JPanel();
        myToolWindowContent.setLayout(new GridBagLayout());
        myToolWindowContent.setLocation(0,0);
        label1 = new JLabel("       Correction for variable case naming convention");
        label1.setForeground(Color.BLACK);
        checkBox1 = new JCheckBox();
        label2 = new JLabel("       Capital Completion");
        label2.setForeground(Color.BLACK);
        checkBox2 = new JCheckBox();
        label3 = new JLabel("       Provide custom shortcut");
        label3.setForeground(Color.BLACK);
        checkBox3 = new JCheckBox();
        label4 = new JLabel("       Feature 4");
        label4.setForeground(Color.BLACK);
        checkBox4 = new JCheckBox();
        label5 = new JLabel("       Feature 5");
        label5.setForeground(Color.BLACK);
        checkBox5 = new JCheckBox();
        label6 = new JLabel("       Feature 6");
        label6.setForeground(Color.BLACK);
        checkBox6 = new JCheckBox();
        label7 = new JLabel("       Feature 7");
        label7.setForeground(Color.BLACK);
        checkBox7 = new JCheckBox();
        label8 = new JLabel("       Feature 8");
        label8.setForeground(Color.BLACK);
        checkBox8 = new JCheckBox();
        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.fill = GridBagConstraints.HORIZONTAL;
        addGbc(true, gbc, label1);
        addGbc(false, gbc, checkBox1);
        addGbc(true, gbc, label2);
        addGbc(false, gbc, checkBox2);
        addGbc(true, gbc, label3);
        addGbc(false, gbc, checkBox3);
        addGbc(true, gbc, label4);
        addGbc(false, gbc, checkBox4);
        addGbc(true, gbc, label5);
        addGbc(false, gbc, checkBox5);
        addGbc(true, gbc, label6);
        addGbc(false, gbc, checkBox6);
        addGbc(true, gbc, label7);
        addGbc(false, gbc, checkBox7);
        addGbc(true, gbc, label8);
        addGbc(false, gbc, checkBox8);

        //this.currentDateTime();
    }

    public void addGbc (boolean newLine, GridBagConstraints gbc, JComponent j){
        if (newLine) {
            lineNum++;
        }
        gbc.gridx = 0;
        gbc.gridy = lineNum;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        //gbc.ipady = 2;
        myToolWindowContent.add(j , gbc);
    }
//    public void currentDateTime() {
//        // Get current date and time
//        Calendar instance = Calendar.getInstance();
//        currentDate.setText(String.valueOf(instance.get(Calendar.DAY_OF_MONTH)) + "/"
//                + String.valueOf(instance.get(Calendar.MONTH) + 1) + "/" +
//                String.valueOf(instance.get(Calendar.YEAR)));
//        currentDate.setIcon(new ImageIcon(getClass().getResource("/myToolWindow/Calendar-icon.png")));
//        int min = instance.get(Calendar.MINUTE);
//        String strMin;
//        if (min < 10) {
//            strMin = "0" + String.valueOf(min);
//        } else {
//            strMin = String.valueOf(min);
//        }
//        currentTime.setText(instance.get(Calendar.HOUR_OF_DAY) + ":" + strMin);
//        currentTime.setIcon(new ImageIcon(getClass().getResource("/myToolWindow/Time-icon.png")));
//        // Get time zone
//        long gmt_Offset = instance.get(Calendar.ZONE_OFFSET); // offset from GMT in milliseconds
//        String str_gmt_Offset = String.valueOf(gmt_Offset / 3600000);
//        str_gmt_Offset = (gmt_Offset > 0) ? "GMT + " + str_gmt_Offset : "GMT - " + str_gmt_Offset;
//        timeZone.setText(str_gmt_Offset);
//        timeZone.setIcon(new ImageIcon(getClass().getResource("/myToolWindow/Time-zone-icon.png")));
//
//
//    }

    public JPanel getContent() {
        return myToolWindowContent;
    }
}
