package org.passwort.frame;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JFrameLook {

	public JFrameLook() {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			
			e.printStackTrace();
		}

		return;
	}

}
