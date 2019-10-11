package org.passwort.frame.passwort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.passwort.frame.JFrameLook;
import org.passwort.main.var;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Dialog.ModalExclusionType;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameVerificationPasswortGenerator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public static JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JCheckBox BoxN;
	public static JCheckBox BoxK;
	public static JCheckBox BoxG;
	public static JCheckBox BoxNull;
	public static JCheckBox BoxS;
	public static JSlider slider;
	private JLabel LableLenght;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrameLook();
				try {
					FrameVerificationPasswortGenerator frame = new FrameVerificationPasswortGenerator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameVerificationPasswortGenerator() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FrameVerificationPasswortGenerator.class.getResource("/pictures/passwort-48.png")));
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.POPUP);
		setTitle(var.ProjectName);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 595, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("Passwort Generieren");

		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(12, 13, 251, 26);
		contentPane.add(button);

		JSlider slider = new JSlider();
		slider.setValue(12);
		slider.setMinimum(4);
		slider.setMaximum(114);
		slider.setBounds(12, 57, 210, 26);
		contentPane.add(slider);

		LableLenght = new JLabel("12");
		LableLenght.setFont(new Font("Tahoma", Font.PLAIN, 19));
		LableLenght.setBounds(233, 57, 67, 26);
		contentPane.add(LableLenght);

		BoxG = new JCheckBox("Gro\u00DFbuchstaben");
		BoxG.setBounds(12, 92, 166, 25);
		contentPane.add(BoxG);

		BoxK = new JCheckBox("Kleinbuchstaben");
		BoxK.setBounds(12, 122, 166, 25);
		contentPane.add(BoxK);

		BoxN = new JCheckBox("Nummern");
		BoxN.setBounds(12, 152, 166, 25);
		contentPane.add(BoxN);

		BoxNull = new JCheckBox("Nullen");
		BoxNull.setBounds(182, 92, 194, 25);
		contentPane.add(BoxNull);

		BoxS = new JCheckBox("Sonderzeichen");
		BoxS.setBounds(182, 122, 194, 25);
		contentPane.add(BoxS);

		textField = new JTextField();
		textField.setText(",.:-_#+~<>!\u00A7$%&(){}=?@");
		textField.setColumns(10);
		textField.setBounds(186, 153, 190, 22);
		contentPane.add(textField);

		Label label_1 = new Label("Dein Passwort: ");
		label_1.setBounds(12, 183, 97, 24);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 213, 553, 22);
		contentPane.add(textField_1);

		JButton button_1 = new JButton("Copy");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(textField_1.getText()),
						null);

			}
		});
		button_1.setBounds(468, 183, 97, 25);
		contentPane.add(button_1);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				LableLenght.setText(slider.getValue() + "");
			}
		});

		// #####################################
	}
}
