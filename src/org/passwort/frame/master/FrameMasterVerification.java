package org.passwort.frame.master;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.passwort.file.FileMaster;
import org.passwort.frame.JFrameLook;
import org.passwort.frame.passwort.FramePasswortGenerator;
import org.passwort.frame.passwort.PasswortCreator;
import org.passwort.main.var;

public class FrameMasterVerification {

	public static Boolean PasswortFrameB = true;
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
	
	
	private JFrame shell;

	private JTextField textField;

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
		shell.setBounds(100, 100, 600, 290);
		shell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shell.getContentPane().setLayout(null);

		JButton btnFertig = new JButton("Fertig");
		btnFertig.setBounds(473, 48, 97, 25);
		shell.getContentPane().add(btnFertig);

		textField = new JTextField();
		textField.setBounds(12, 13, 558, 22);
		shell.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblDasPasswortStimmt = new JLabel("Das Passwort simmt nicht \u00DCberein  !");
		lblDasPasswortStimmt.setBounds(12, 36, 558, 16);
		shell.getContentPane().add(lblDasPasswortStimmt);

		JButton btnPasswortZurcksetzen = new JButton("Passwort Zur\u00FCcksetzen");
		btnPasswortZurcksetzen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Reset Master Password
			}
		});
		btnPasswortZurcksetzen.setBounds(12, 205, 163, 25);
		shell.getContentPane().add(btnPasswortZurcksetzen);

		JButton btnNewButton = new JButton("Passwort Generator");
		btnNewButton.setBounds(268, 48, 193, 25);
		shell.getContentPane().add(btnNewButton);
		
		
		
		btnFertig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FileMaster.ReadMaster();

				if (textField.getText() == var.MasterPassLoad) {

				}

			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FramePasswortGenerator();
				
				if(PasswortFrameB == true) {

					new FramePasswortGenerator();
				FramePasswortGenerator.main(null);
				PasswortFrameB = false;
				}
				// ##################################
			}
		});

	}
}
