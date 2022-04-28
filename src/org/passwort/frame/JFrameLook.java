package org.passwort.frame;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JFrameLook {

    public JFrameLook() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | InstantiationException |
                 IllegalAccessException e) {

            e.printStackTrace();
        }
    }

}
