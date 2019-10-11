package org.passwort.frame.master;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.passwort.file.FileMaster;
import org.passwort.main.var;

public class FrameMasterReset {

	protected Shell shell;
	private Text FPT;
	private Text FPT2;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FrameMasterReset window = new FrameMasterReset();
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
		shell.setImage(SWTResourceManager.getImage(FrameMasterReset.class, "/pictures/passwort-48.png"));
		shell.setSize(607, 509);
		shell.setText(var.ProjectName);

		FPT = new Text(shell, SWT.BORDER);
		FPT.setBounds(10, 36, 569, 26);

		FPT2 = new Text(shell, SWT.BORDER);
		FPT2.setBounds(10, 124, 569, 26);

		Label lblNeuesPasswort = new Label(shell, SWT.NONE);
		lblNeuesPasswort.setBounds(10, 10, 569, 20);
		lblNeuesPasswort.setText("Neues Passwort :");

		Label lblNeuesPasswortWiederholen = new Label(shell, SWT.NONE);
		lblNeuesPasswortWiederholen.setBounds(10, 98, 569, 20);
		lblNeuesPasswortWiederholen.setText("Neues Passwort Wiederholen :");

		Button btnVerstanden = new Button(shell, SWT.CHECK);
		btnVerstanden.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnVerstanden.setBounds(10, 401, 111, 20);
		btnVerstanden.setText("Verstanden");

		Button btnOk = new Button(shell, SWT.NONE);

		btnOk.setBounds(489, 422, 90, 30);
		btnOk.setText("OK !");

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 156, 569, 239);
		lblNewLabel.setText(
				"Hinweis: \r\nAlle deine Aktuell Gespeicherten Passw\u00F6rter werden Gel\u00F6scht und k\u00F6nnen nicht wieder Erstellt werden.");

		Label lblP = new Label(shell, SWT.NONE);
		lblP.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblP.setBounds(10, 427, 474, 20);
		lblP.setText("Das Passwort Stimmt nicht \u00FCberein");
		lblP.setVisible(false);

		btnOk.addSelectionListener(new SelectionAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void widgetSelected(SelectionEvent e) {

				String SFPT = FPT.getText();
				String SFPT2 = FPT2.getText();

				if (equals(SFPT) == equals(SFPT2)) {

					if (btnVerstanden.getSelection()) {

						var.MasterPass = FPT.getText();
						FileMaster.WriteMaster();

					} else {

						lblP.setText("Du must Verstanden auswählen !");
						lblP.setVisible(true);

					}

				} else {
					System.out.println(SFPT2.toString());
					System.out.println(SFPT.toString());
					lblP.setText("Das Passwort stimmt Nicht Überein");
					lblP.setVisible(true);

				}

			}
		});

	}
}
