import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyItems {

	JFrame modifyItemsFrame;
	JFrame addItemFrame;
	JFrame editItemFrame;
	JTable stockModify;
	JTextField itemNameEnter;
	JTextField itemDescriptionEnter;
	JTextField quantityEnter;
	JTextField editINTxt;
	JTextField editIDTxt;
	JTextField editIQTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyItems window = new ModifyItems();
					window.modifyItemsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModifyItems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		modifyItemsFrame = new JFrame();
		modifyItemsFrame.setTitle("Modify Items");
		modifyItemsFrame.setSize(790, 379);
		modifyItemsFrame.setLocationRelativeTo(null);
		modifyItemsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modifyItemsFrame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 756, 273);
		modifyItemsFrame.getContentPane().add(scrollPane);
		
		stockModify = new JTable();
		stockModify.setModel(new DefaultTableModel(
			new Object[][] {
				{"A4 Paper", "Papel", "200", "March 29, 2023"},
			},
			new String[] {
				"Item Name", "Item Description", "Item Quantity", "Date of Restock"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(stockModify);
		
		JButton addItemBtn = new JButton("Add Item");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddItem ai = new AddItem();
				ai.addItemFrame.setVisible(true);
			}
		});
		addItemBtn.setBounds(10, 293, 123, 39);
		modifyItemsFrame.getContentPane().add(addItemBtn);
		
		JButton editItemBtn = new JButton("Edit Item");
		editItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditItem ei = new EditItem();
				ei.editItemFrame.setVisible(true);
			}
		});
		editItemBtn.setBounds(143, 293, 123, 39);
		modifyItemsFrame.getContentPane().add(editItemBtn);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyItemsFrame.dispose();
				AdminPage ap = new AdminPage();
				ap.adminFrame.setVisible(true);
			}
		});
		backBtn.setBounds(643, 293, 123, 39);
		modifyItemsFrame.getContentPane().add(backBtn);
	}
	void enableModifyItemsFrame() {
		modifyItemsFrame.setEnabled(true);
	}
}