import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyPluginToolWindow {

    private JPanel myToolWindowContent;
    private Insets insets = new Insets(0,0,0,0);


    private String[] featurenames;
    private Boolean[] featuredropdown;
    private LinkedHashMap<String, Boolean> features;
    private Map<String, String[]> checkboxtochoices;
    private Map<JCheckBox, ComboBox> checkboxtodropdown;
    private int lineNum = -1;


    public MyPluginToolWindow(ToolWindow toolWindow) {
        myToolWindowContent = new JPanel();
        myToolWindowContent.setLayout(new GridBagLayout());

        /*
        put the name of your feature in the featurenames array,
        then true in the corresponding line of featuredropdown if your feature requires a dropdown menu
        also put your drop down menu options in the checkboxtodropdown map.
         */

        featurenames = new String[]{
                "feature 1",
                "feature 2",
                "feature 3",
                "feature 4",
                "feature 5",
                "feature 6",
                "feature 7"
        };

        featuredropdown = new Boolean[]{
                false,
                true,
                false,
                false,
                false,
                false,
                false
        };

        checkboxtochoices.put(featurenames[1], new String[]{"choice 1", "choice 2", "choice 3"});

        features = new LinkedHashMap<>();
        for (int i=0; i<featurenames.length;i++){
            JCheckBox checkbox = new JCheckBox(new CheckboxAction(featurenames[i], featuredropdown[i], this));
            addCheckbox(checkbox);
        }
    }

    public void addDropDown(JCheckBox source){
        if (!checkboxtodropdown.containsKey(source)){
            String[] choices = checkboxtochoices.get(source.getText());
            ComboBox<String> cb = new ComboBox<String>(choices);
            int i = 0;
            Boolean found = false;
            while ((!found) && i<featurenames.length){
                if (source.getText().equals(featurenames[i])) found = true;
                else {
                    i++;
                }
            }
            cb.setVisible(true);
            addComponent(cb, GridBagConstraints.RELATIVE, i, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
            checkboxtodropdown.put(source, cb);
        }else{
            checkboxtodropdown.get(source).setVisible(true);
        }
    }

    public void removeDropDrown(JCheckBox source){
        if (checkboxtodropdown.containsKey(source))
            checkboxtodropdown.get(source).setVisible(false);
    }

    private void addComponent(Component component, int gridx, int gridy, int anchor, int fill){
        GridBagConstraints gbc = new GridBagConstraints(gridx,gridy,1,1,1.0,1.0,anchor,fill,insets,0,0);
        myToolWindowContent.add(component,gbc);
    }

    public void addCheckbox (JComponent j){
            lineNum++;
            addComponent(j,lineNum,0,GridBagConstraints.CENTER,GridBagConstraints.BOTH);
    }

    public JPanel getContent() {
        return myToolWindowContent;
    }
}

