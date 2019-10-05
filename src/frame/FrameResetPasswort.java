package frame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import main.var;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Control;

public class FrameResetPasswort {

	protected Shell shell;
	private Text PasswortText;
	private Text PasswortWText;

	public static void main(String[] args) {
		try {
			FrameResetPasswort window = new FrameResetPasswort();
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
		shell.setImage(SWTResourceManager.getImage(FrameResetPasswort.class, "/pictures/passwort-48.png"));
		shell.setSize(556, 428);
		shell.setText(var.ProjectName);

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(420, 341, 108, 30);
		btnNewButton.setText("OK ");

		Button btnAbbrechen = new Button(shell, SWT.NONE);
		btnAbbrechen.setText("Abbrechen");
		btnAbbrechen.setBounds(10, 341, 108, 30);

		Label lblPasswort = new Label(shell, SWT.NONE);
		lblPasswort.setBounds(10, 10, 198, 20);
		lblPasswort.setText("Passwort:");

		Label lblPasswortWiderholen = new Label(shell, SWT.NONE);
		lblPasswortWiderholen.setBounds(10, 102, 198, 20);
		lblPasswortWiderholen.setText("Passwort Wiederholen:");

		PasswortText = new Text(shell, SWT.BORDER);
		PasswortText.setBounds(10, 36, 518, 26);

		PasswortWText = new Text(shell, SWT.BORDER);
		PasswortWText.setBounds(10, 128, 518, 26);

		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.setBounds(10, 257, 518, 20);
		btnCheckButton.setText("Verstanden");

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setText(var.MessagePasswortVergesen);
		lblNewLabel.setBounds(10, 160, 518, 91);

		Label FailText = new Label(shell, SWT.NONE);
		FailText.setVisible(false);
		FailText.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		FailText.setText("Passw\u00F6rter stimmen nicht \u00FCberein");
		FailText.setBounds(10, 315, 518, 20);
		shell.setTabList(new Control[]{PasswortText, PasswortWText, btnCheckButton, btnNewButton, btnAbbrechen});

		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (btnCheckButton.getSelection() == true) {

					if (PasswortText.getText() == PasswortWText.getText()) {
																			
						var.AdminPasswortVorläufig = PasswortText.getText();
						
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
