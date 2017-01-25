import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JTree;
import java.awt.Button;
import java.awt.Font;

public class GamblingWindow {

	private JFrame frame;
	private JTextField txtTxtnumbercount;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamblingWindow window = new GamblingWindow();
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
	public GamblingWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 620, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTxtlog = new JTextPane();
		txtpnTxtlog.setBounds(12, 12, 596, 320);
		frame.getContentPane().add(txtpnTxtlog);
		
		txtTxtnumbercount = new JTextField();
		txtTxtnumbercount.setBounds(12, 365, 140, 25);
		frame.getContentPane().add(txtTxtnumbercount);
		txtTxtnumbercount.setColumns(10);
		
		JButton btnGetNumbers = new JButton("Generate");
		btnGetNumbers.setBounds(164, 365, 140, 25);
		frame.getContentPane().add(btnGetNumbers);
		
		JLabel lblNumberCount = new JLabel("Draw count:");
		lblNumberCount.setBounds(12, 345, 140, 15);
		frame.getContentPane().add(lblNumberCount);
		
		JButton btnSaveToCsv = new JButton("Save to CSV");
		btnSaveToCsv.setBounds(316, 420, 140, 25);
		frame.getContentPane().add(btnSaveToCsv);
		
		JButton btnLoadFromCsv = new JButton("Load from CSV");
		btnLoadFromCsv.setBounds(468, 420, 140, 25);
		frame.getContentPane().add(btnLoadFromCsv);
		
		JButton btnCalculateChances = new JButton("Calculate chances");
		btnCalculateChances.setBounds(316, 365, 292, 25);
		frame.getContentPane().add(btnCalculateChances);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 420, 292, 25);
		frame.getContentPane().add(textField);
		
		JLabel lblFileLocation = new JLabel("FIle location:");
		lblFileLocation.setBounds(12, 402, 292, 15);
		frame.getContentPane().add(lblFileLocation);
	}
}
