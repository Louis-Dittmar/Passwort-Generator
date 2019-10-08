package org.passwort.frame.master;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.passwort.file.FileMaster;
import org.passwort.frame.JFrameLook;
import org.passwort.main.var;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class FrameMasterVerification {

	private JFrame shell;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameLook();
				try {
					FrameMasterVerification window = new FrameMasterVerification();
					window.shell.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameMasterVerification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		shell = new JFrame();
		shell.setTitle(var.ProjectName);
		shell.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FrameMasterVerification.class.getResource("/pictures/passwort-48.png")));
		shell.setBounds(100, 100, 600, 420);
		shell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shell.getContentPane().setLayout(null);

		JButton btnFertig = new JButton("Fertig");
		btnFertig.setBounds(244, 176, 97, 25);
		shell.getContentPane().add(btnFertig);

		textField = new JTextField();
		textField.setBounds(12, 108, 558, 22);
		shell.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDasPasswortStimmt = new JLabel("Das Passwort simmt nicht \u00DCberein  !");
		lblDasPasswortStimmt.setBounds(12, 147, 558, 16);
		shell.getContentPane().add(lblDasPasswortStimmt);
		
		JButton btnPasswortZurcksetzen = new JButton("Passwort Zur\u00FCcksetzen");
		btnPasswortZurcksetzen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// Reset Master  Password
			}
		});
		btnPasswortZurcksetzen.setBounds(12, 335, 163, 25);
		shell.getContentPane().add(btnPasswortZurcksetzen);

		btnFertig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FileMaster.ReadMaster();

				if (textField.getText() == var.MasterPassLoad) {
					
					
			
					

				}

			}
		});

		// ###########################
	}
}
