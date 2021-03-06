package tv.porst.swfretools.dissector.gui.main.panels;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import tv.porst.splib.gui.GuiHelpers;
import tv.porst.swfretools.utils.as3.ResolvedCode;

/**
 * Panel to display ActionScript 3 code.
 */
public final class AS3CodePanel extends JPanel implements IExtraPanel {

	/**
	 * Creates a new panel object.
	 * 
	 * @param code The code to display.
	 */
	public AS3CodePanel(final ResolvedCode code) {
		super(new BorderLayout());

		final JTextArea area = new JTextArea(AS3CodePrinter.getCodeText(code));
		area.setEditable(false);
		area.setFont(new Font(GuiHelpers.getMonospaceFont(), 0, 12));

		add(new JScrollPane(area));
	}

	@Override
	public JPanel getPanel() {
		return this;
	}

	@Override
	public String getTabName() {
		return "Code";
	}
}