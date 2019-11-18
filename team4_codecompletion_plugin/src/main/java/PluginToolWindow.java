//package main.java;

import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBTabbedPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class PluginToolWindow {
    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JLabel currentDate;
    private JLabel currentTime;
    private JLabel timeZone;
    private JPanel myToolWindowContent;
    private JFrame frame;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;


    public PluginToolWindow(ToolWindow toolWindow) {
        //hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
        //refreshToolWindowButton.addActionListener(e -> currentDateTime());

        //frame = new JFrame();
        myToolWindowContent = new JPanel();
        myToolWindowContent.setLayout(new GridBagLayout());
        myToolWindowContent.setLocation(0,0);
        //frame.add(myToolWindowContent);
        label1 = new JLabel("Correction for variable case naming convention");
        label1.setForeground(Color.RED);
        button1 = new JButton("Turn On");
        label2 = new JLabel("Capital Completion");
        label2.setForeground(Color.BLACK);
        button2 = new JButton("Turn On");
        label3 = new JLabel("Provide custom shortcut");
        label3.setForeground(Color.BLUE);
        button3 = new JButton("Turn On");
        label4 = new JLabel("Feature 4");
        label4.setForeground(Color.RED);
        button4 = new JButton("Turn On");
        label5 = new JLabel("Feature 5");
        label5.setForeground(Color.BLACK);
        button5 = new JButton("Turn On");
        label6 = new JLabel("Feature 6");
        label6.setForeground(Color.BLUE);
        button6 = new JButton("Turn On");
        label7 = new JLabel("Feature 7");
        label7.setForeground(Color.RED);
        button7 = new JButton("Turn On");
        label8 = new JLabel("Feature 8");
        label8.setForeground(Color.BLACK);
        button8 = new JButton("Turn On");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        addGbc(0, gbc, label1);
        addGbc(1, gbc, button1);
        addGbc(2, gbc, label2);
        addGbc(3, gbc, button2);
        addGbc(4, gbc, label3);
        addGbc(5, gbc, button3);
        addGbc(6, gbc, label4);
        addGbc(7, gbc, button4);
        addGbc(8, gbc, label5);
        addGbc(9, gbc, button5);
        addGbc(10, gbc, label6);
        addGbc(11, gbc, button6);
        addGbc(12, gbc, label7);
        addGbc(13, gbc, button7);
        addGbc(14, gbc, label8);
        addGbc(15, gbc, button8);

        //this.currentDateTime();
    }

    public void addGbc (int index, GridBagConstraints gbc, JComponent j){
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridx = 0;
        gbc.gridy = index;
        gbc.ipady = 2;
        if (j instanceof JButton) {
            gbc.gridwidth = 20;
        }
        else {
            gbc.gridwidth = 40;
        }
        j.setBackground(Color.CYAN);
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
