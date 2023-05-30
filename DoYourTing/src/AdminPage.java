import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage {

	JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.adminFrame.setVisible(true);
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
		adminFrame = new JFrame();
		adminFrame.setTitle("Admin Page");
		adminFrame.setSize(468, 216);
		adminFrame.setLocationRelativeTo(null);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.getContentPane().setLayout(null);
		
		JButton vslBtn = new JButton("View Stock Level");
		vslBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminFrame.dispose();
				StockLevel sl = new StockLevel();
				sl.stockLevelFrame.setVisible(true);
			}
		});
		vslBtn.setBounds(22, 63, 143, 31);
		adminFrame.getContentPane().add(vslBtn);
		
		JButton miBtn = new JButton("Modify Items");
		miBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminFrame.dispose();
				ModifyItems mi = new ModifyItems();
				mi.modifyItemsFrame.setVisible(true);
			}
		});
		miBtn.setBounds(22, 108, 143, 31);
		adminFrame.getContentPane().add(miBtn);
		
		JButton bhrBtn = new JButton("<html><center>Backup History</center><center>Report</center></html>");
		bhrBtn.setBounds(288, 63, 143, 31);
		adminFrame.getContentPane().add(bhrBtn);
		
		JButton rpBtn = new JButton("Receiver Page");
		rpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int receiver = JOptionPane.showConfirmDialog(null,"Are you sure you want to go back?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if (receiver == JOptionPane.YES_OPTION) {
					adminFrame.dispose();
					ReceiverPage rp = new ReceiverPage();
					rp.receiverFrame.setVisible(true);
				}
			}
		});
		rpBtn.setBounds(288, 108, 143, 31);
		adminFrame.getContentPane().add(rpBtn);
		
		JLabel welcomeLbl = new JLabel("Welcome Admin!");
		welcomeLbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		welcomeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLbl.setBounds(104, 21, 250, 31);
		adminFrame.getContentPane().add(welcomeLbl);
	}

}