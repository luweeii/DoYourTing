import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
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
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Admin Page");
		frame.setBounds(100, 100, 468, 216);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("View Stock Level");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StockLevel sl = new StockLevel();
				sl.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(22, 63, 143, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnModifyItems = new JButton("Modify Items");
		btnModifyItems.setBounds(22, 108, 143, 31);
		frame.getContentPane().add(btnModifyItems);
		
		JButton btnBackupHistoryReport = new JButton("<html><center>Backup History</center><center>Report</center></html>");
		btnBackupHistoryReport.setBounds(288, 63, 143, 31);
		frame.getContentPane().add(btnBackupHistoryReport);
		
		JButton btnReceiverPage = new JButton("Receiver Page");
		btnReceiverPage.setBounds(288, 108, 143, 31);
		frame.getContentPane().add(btnReceiverPage);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(104, 21, 250, 31);
		frame.getContentPane().add(lblNewLabel);
	}

}
