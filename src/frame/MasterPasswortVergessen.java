package frame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MasterPasswortVergessen {

	protected Shell shell;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MasterPasswortVergessen window = new MasterPasswortVergessen();
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
		shell.setSize(604, 403);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/* Passwort Zurücksetzen hier Einfügen
				 * 
				 * 
				 */
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(458, 316, 118, 30);
		btnNewButton.setText("Verstanden");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 316, 110, 30);
		btnNewButton_1.setText("Abbrechen");

		Label lblHinweis = new Label(shell, SWT.NONE);
		lblHinweis.setBounds(10, 10, 566, 300);
		lblHinweis.setText(
				"Hinweis:\r\nAlle Passw\u00F6rter die in diesem Programm gespeichert wurden\r\nwerden mit dem Klicken \r\nauf Best\u00E4digen unwiderufich Gel\u00F6scht  ");

	}

}
