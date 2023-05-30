import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ItemHistory {

	 JFrame itemHistoryFrame;
	 JTable itemHistory;
	 JButton itemHistoryBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItemHistory window = new ItemHistory();
					window.itemHistoryFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ItemHistory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		itemHistoryFrame = new JFrame();
		itemHistoryFrame.setTitle("Item History");
		itemHistoryFrame.setSize(606, 261);
		itemHistoryFrame.setLocationRelativeTo(null);
		itemHistoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		itemHistoryFrame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 567, 170);
		itemHistoryFrame.getContentPane().add(scrollPane);
		
		itemHistory = new JTable();
		scrollPane.setViewportView(itemHistory);
		itemHistory.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item Name", "Item Description", "Receiver Name", "Date Received", "Quantity Received", "Quantity Left"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		itemHistory.getColumnModel().getColumn(1).setPreferredWidth(93);
		itemHistory.getColumnModel().getColumn(2).setPreferredWidth(107);
		itemHistory.getColumnModel().getColumn(3).setPreferredWidth(97);
		itemHistory.getColumnModel().getColumn(4).setPreferredWidth(108);
		itemHistory.getColumnModel().getColumn(5).setPreferredWidth(90);
		
		itemHistoryBack = new JButton("Back");
		itemHistoryBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemHistoryFrame.dispose();
				StockLevel sl = new StockLevel();
				sl.stockLevelFrame.setVisible(true);
			}
		});
		itemHistoryBack.setBounds(10, 191, 89, 23);
		itemHistoryFrame.getContentPane().add(itemHistoryBack);
	}

}