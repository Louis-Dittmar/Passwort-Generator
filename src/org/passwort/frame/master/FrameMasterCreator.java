package org.passwort.frame.master;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.passwort.file.FileMaster;
import org.passwort.frame.JFrameLook;
import org.passwort.main.var;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrameMasterCreator {

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameLook();
				try {
					FrameMasterCreator window = new FrameMasterCreator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameMasterCreator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(12, 69, 558, 22);
		frame.getContentPane().add(passwordField);

		JLabel lblMasterPasswort = new JLabel("Master Passwort:");
		lblMasterPasswort.setBounds(12, 50, 183, 16);
		frame.getContentPane().add(lblMasterPasswort);

		JLabel lblMasterPasswortWiederholen = new JLabel("Master Passwort wiederholen:");
		lblMasterPasswortWiederholen.setBounds(12, 104, 183, 16);
		frame.getContentPane().add(lblMasterPasswortWiederholen);

		passwordField1 = new JPasswordField();
		passwordField1.setBounds(12, 124, 558, 22);
		frame.getContentPane().add(passwordField1);

		JButton btnNewButton = new JButton("OK ");

		btnNewButton.setBounds(473, 361, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JCheckBox boxMaster = new JCheckBox("Ich M\u00F6chte kein Masterpasswort Nutzen !");
		boxMaster.setBounds(12, 155, 324, 25);
		frame.getContentPane().add(boxMaster);

		JLabel labelText = new JLabel(" !");
		labelText.setForeground(Color.RED);
		labelText.setBounds(12, 365, 265, 16);
		labelText.setVisible(false);
		frame.getContentPane().add(labelText);

		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

				if (!boxMaster.isSelected()) {

					if (passwordField.getText() == passwordField1.getText()) {
						var.MasterPasswortStatus = true;
						FileMaster.WriteMaster();

					} else {
						labelText.setText("Das Passwort ist Nicht Gleich");
						labelText.setVisible(true);

					}

				}

			}
		});

		// Text

	}
}
