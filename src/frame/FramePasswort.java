package frame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

import file.FileCreator;
import main.var;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FramePasswort {

	protected Shell shell;
	private Text PasswortText;
	private Text PasswortWText;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FramePasswort window = new FramePasswort();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
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

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(575, 430);
		shell.setText("SWT Application");

		PasswortText = new Text(shell, SWT.BORDER);
		PasswortText.setBounds(10, 66, 537, 26);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 40, 537, 20);
		lblNewLabel.setText("Passwort: ");

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 111, 537, 20);
		lblNewLabel_1.setText("PasswortWiederholen:");

		PasswortWText = new Text(shell, SWT.BORDER);
		PasswortWText.setBounds(10, 137, 537, 26);

		Button btnFertig = new Button(shell, SWT.NONE);
		btnFertig.setBounds(457, 343, 90, 30);
		btnFertig.setText("Fertig");

		Button btnVerstanden = new Button(shell, SWT.CHECK);
		btnVerstanden.setBounds(10, 303, 111, 20);
		btnVerstanden.setText("Verstanden");

		Label lblHinweis = new Label(shell, SWT.NONE);
		lblHinweis.setBounds(10, 169, 537, 128);
		lblHinweis.setText("Hinweis:");

		Label FailText = new Label(shell, SWT.NONE);
		FailText.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		FailText.setBounds(319, 317, 228, 20);
		FailText.setText("Das passwort ist falsch");

		btnFertig.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (btnVerstanden.getSelection() == true) {

					if (PasswortText.getText() == PasswortWText.getText() ) {

						var.AdminPasswortVorläufig = PasswortText.getText();
						FileCreator.InternFile();

					} else {

						FailText.setText("Passwort Stimmt Nicht Überein");
						FailText.setVisible(true);

					}
				} else {
					FailText.setText("Bitte Bestädigen");
					FailText.setVisible(true);
				}

			}
		});

	}

}
