import javax.swing.*;
import java.awt.event.ActionEvent;

class EnableDisableCheckboxAction extends AbstractAction {
    public EnableDisableCheckboxAction(String text) {
        super(text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JCheckBox cbLog = (JCheckBox) e.getSource();
        if (cbLog.isSelected()) {
            System.out.println("Feature enabled!");
            //enable the feature somehow
        } else {
            System.out.println("Feature disabled :(");
            //disable the feature
        }
    }

}
