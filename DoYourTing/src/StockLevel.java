import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockLevel {

	 JFrame stockLevelFrame;
	 JTable stockItems;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockLevel window = new StockLevel();
					window.stockLevelFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StockLevel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		stockLevelFrame = new JFrame();
		stockLevelFrame.setTitle("Select Item");
		stockLevelFrame.setSize(352, 221);
		stockLevelFrame.setLocationRelativeTo(null);
		stockLevelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stockLevelFrame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 319, 131);
		stockLevelFrame.getContentPane().add(scrollPane);
		
		stockItems = new JTable();
		scrollPane.setViewportView(stockItems);
		stockItems.setModel(new DefaultTableModel(
			new Object[][] {
				{"A4 Paper", new Integer(200)},
			},
			new String[] {
				"Item Name", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		stockItems.getColumnModel().getColumn(0).setResizable(false);
		stockItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton historyBtn = new JButton("See History");
		historyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItemHistory ih = new ItemHistory();
				ih.itemHistoryFrame.setVisible(true);
			}
		});
		historyBtn.setBounds(10, 153, 113, 23);
		stockLevelFrame.getContentPane().add(historyBtn);
		
		JButton stockLevelBack = new JButton("Back");
		stockLevelBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stockLevelFrame.dispose();
				AdminPage ap = new AdminPage();
				ap.adminFrame.setVisible(true);
			}
		});
		stockLevelBack.setBounds(215, 154, 113, 23);
		stockLevelFrame.getContentPane().add(stockLevelBack);
	}

}