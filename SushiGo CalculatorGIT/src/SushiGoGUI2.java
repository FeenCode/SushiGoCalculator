import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class SushiGoGUI2 {

	private JFrame frmSushigo;
	private JPanel StartPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SushiGoGUI2 window = new SushiGoGUI2();
					window.frmSushigo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SushiGoGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSushigo = new JFrame();
		frmSushigo.setTitle("SushiGo!");
		frmSushigo.setBounds(100, 100, 452, 300);
		frmSushigo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StartPanel = new JPanel();
		StartPanel.setBackground(Color.DARK_GRAY);
		frmSushigo.getContentPane().add(StartPanel, BorderLayout.CENTER);

	}

}
