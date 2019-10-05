package frame;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class InstalliatonFrame {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InstalliatonFrame window = new InstalliatonFrame();
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
		shell.setSize(619, 425);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(451, 338, 140, 30);
		btnNewButton.setText("New Button");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				new JavaFileChooser();
			}
		});
		btnNewButton_1.setBounds(464, 77, 127, 30);
		btnNewButton_1.setText("Durchsuchen ");

		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 79, 448, 26);

		Button btnExtraOrdnerErstellen = new Button(shell, SWT.CHECK);
		btnExtraOrdnerErstellen.setText("Extra Ordner Erstellen ");
		btnExtraOrdnerErstellen.setBounds(10, 111, 203, 20);

	}
}
