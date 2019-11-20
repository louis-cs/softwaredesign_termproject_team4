import javax.swing.*;
import java.awt.event.ActionEvent;

class CheckboxAction extends AbstractAction {

    Boolean isDropDown;
    MyPluginToolWindow window;
    public CheckboxAction(String text, Boolean isDropDown, MyPluginToolWindow window) {
        super(text);
        this.isDropDown = isDropDown;
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox cbLog = (JCheckBox) e.getSource();
        if (cbLog.isSelected()) {
            System.out.println("Feature enabled!");
            if (isDropDown){
                window.addDropDown((JCheckBox) e.getSource());
            }
        } else {
            System.out.println("Feature disabled :(");
            //disable the feature
            if (isDropDown){
                window.removeDropDrown((JCheckBox)e.getSource());
            }
        }
    }

}
