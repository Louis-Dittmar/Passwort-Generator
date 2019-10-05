package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window.Type;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.var;

public class JavaFileChooser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}

				try {
					JavaFileChooser window = new JavaFileChooser();
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
	public JavaFileChooser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setBounds(100, 100, 628, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		frame.getContentPane().add(fileChooser, BorderLayout.CENTER);

		int rueckgabeWert = fileChooser.showOpenDialog(null);
		if (rueckgabeWert == JFileChooser.APPROVE_OPTION) {
			var.VorläufigeFolderLocation = fileChooser.getSelectedFile().getName() + "";
		}

	}

}
