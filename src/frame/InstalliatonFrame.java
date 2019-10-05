package frame;

import java.awt.BorderLayout;
import java.awt.Window.Type;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import main.var;
import org.eclipse.wb.swt.SWTResourceManager;

public class InstalliatonFrame {

	protected Shell shell;
	private static Text FileText;
	private JFrame frame;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

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
			InstalliatonFrame window = new InstalliatonFrame();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage(InstalliatonFrame.class, "/pictures/passwort-48.png"));
		shell.setSize(619, 425);
		shell.setText(var.ProjectName);
		shell.setLayout(null);

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(451, 338, 140, 30);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		btnNewButton.setText("Fertig");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(464, 77, 127, 30);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				frame = new JFrame();
				frame.setType(Type.POPUP);
				frame.setBounds(100, 100, 628, 489);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				frame.getContentPane().add(fileChooser, BorderLayout.CENTER);

				int rueckgabeWert = fileChooser.showOpenDialog(null);
				if (rueckgabeWert == JFileChooser.APPROVE_OPTION) {
					var.VorläufigeFolderLocation = fileChooser.getSelectedFile() + "";
					FileText.setText(var.VorläufigeFolderLocation);
				}
			}
		});
		btnNewButton_1.setText("Durchsuchen ");

		FileText = new Text(shell, SWT.BORDER);
		FileText.setBounds(10, 79, 448, 26);

		Button btnExtraOrdnerErstellen = new Button(shell, SWT.CHECK);
		btnExtraOrdnerErstellen.setBounds(10, 111, 203, 20);
		btnExtraOrdnerErstellen.setText("Extra Ordner Erstellen ");


	}
}
