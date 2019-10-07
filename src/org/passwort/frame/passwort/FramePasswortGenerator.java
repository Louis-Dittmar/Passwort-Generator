package org.passwort.frame.passwort;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.passwort.frame.JFrameLook;
import org.passwort.main.var;
import java.awt.Dialog.ModalExclusionType;

public class FramePasswortGenerator {

	private JFrame frmTet;
	public static JTextField textField;
	public static JTextField PasswortField;
	public static JCheckBox BoxG;
	public static JCheckBox BoxK;
	public static JCheckBox BoxN;
	public static JCheckBox BoxNull;
	public static JCheckBox BoxS;
	public static JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameLook();
				try {
					FramePasswortGenerator window = new FramePasswortGenerator();
					window.frmTet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FramePasswortGenerator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTet = new JFrame();
		frmTet.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmTet.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FramePasswortGenerator.class.getResource("/pictures/passwort-48.png")));
		frmTet.setType(Type.POPUP);
		frmTet.setTitle(var.ProjectName);
		frmTet.setBounds(100, 100, 595, 292);
		frmTet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTet.getContentPane().setLayout(null);

		JButton btnPasswortG = new JButton("Passwort Generieren");
		btnPasswortG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PasswortCreator();
			}
		});
		btnPasswortG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPasswortG.setBounds(12, 13, 251, 26);
		frmTet.getContentPane().add(btnPasswortG);

		slider = new JSlider();
		slider.setValue(12);
		slider.setMinimum(4);
		slider.setMaximum(64);
		slider.setBounds(12, 57, 210, 26);
		frmTet.getContentPane().add(slider);

		JLabel LableLenght = new JLabel("12");
		LableLenght.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LableLenght.setBounds(233, 57, 67, 26);
		frmTet.getContentPane().add(LableLenght);

		BoxG = new JCheckBox("Gro\u00DFbuchstaben");
		BoxG.setBounds(12, 92, 166, 25);
		frmTet.getContentPane().add(BoxG);

		BoxK = new JCheckBox("Kleinbuchstaben");
		BoxK.setBounds(12, 122, 166, 25);
		frmTet.getContentPane().add(BoxK);

		BoxN = new JCheckBox("Nummern");
		BoxN.setBounds(12, 152, 166, 25);
		frmTet.getContentPane().add(BoxN);

		BoxNull = new JCheckBox("Nullen");
		BoxNull.setBounds(182, 92, 194, 25);
		frmTet.getContentPane().add(BoxNull);

		BoxS = new JCheckBox("Sonderzeichen");
		BoxS.setBounds(182, 122, 194, 25);
		frmTet.getContentPane().add(BoxS);

		textField = new JTextField();
		textField.setText(",.:-_#+~<>!\u00A7$%&(){}=?@");
		textField.setBounds(186, 153, 190, 22);
		frmTet.getContentPane().add(textField);
		textField.setColumns(10);

		Label label = new Label("Dein Passwort: ");
		label.setBounds(12, 183, 97, 24);
		frmTet.getContentPane().add(label);

		PasswortField = new JTextField();
		PasswortField.setColumns(10);
		PasswortField.setBounds(12, 213, 553, 22);
		frmTet.getContentPane().add(PasswortField);

		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
			               new StringSelection(PasswortField.getText()), null
			          );
			}
		});
		btnCopy.setBounds(468, 183, 97, 25);
		frmTet.getContentPane().add(btnCopy);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				LableLenght.setText(slider.getValue() + "");
			}
		});
	}

	public static void setPasswortFieldText() {
		PasswortField.setText(PasswortCreator.Passwort);
	}
	
	
}
