import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReceiverPage {

	JFrame receiverFrame;
	JTextField nameTxt;
	JTable receiverTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiverPage window = new ReceiverPage();
					window.receiverFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReceiverPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		receiverFrame = new JFrame();
		receiverFrame.setTitle("Receiver Page");
		receiverFrame.setSize(508, 244);
		receiverFrame.setLocationRelativeTo(null);
		receiverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		receiverFrame.getContentPane().setLayout(null);
		
		JButton reqBtn = new JButton("Request Item");
		reqBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int option = JOptionPane.showConfirmDialog
						(null,
						"Do you accept the terms and conditions?",
						"Confirmation",
						JOptionPane.YES_NO_OPTION);
				
				if (option == JOptionPane.YES_NO_OPTION){
					//add code dito na mag susubtract yung quantity
				}
			}
		});
		reqBtn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		reqBtn.setBounds(366, 170, 97, 23);
		receiverFrame.getContentPane().add(reqBtn);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(10, 26, 251, 20);
		receiverFrame.getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel nameLbl = new JLabel("Enter name of the Receiver:");
		nameLbl.setBounds(11, 11, 250, 14);
		receiverFrame.getContentPane().add(nameLbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 49, 452, 94);
		receiverFrame.getContentPane().add(scrollPane);
		
		receiverTable = new JTable();
		scrollPane.setViewportView(receiverTable);
		receiverTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		receiverTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Quantity"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		receiverTable.getColumnModel().getColumn(0).setResizable(false);
		receiverTable.getColumnModel().getColumn(1).setResizable(false);
		
		JLabel qtyLbl = new JLabel("Enter Quantity:");
		qtyLbl.setBounds(25, 154, 167, 14);
		receiverFrame.getContentPane().add(qtyLbl);
		
		JSpinner qtySpin = new JSpinner();
		qtySpin.setBounds(25, 172, 53, 20);
		receiverFrame.getContentPane().add(qtySpin);
		
		JButton admin = new JButton("");
		admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPasswordField adminPass = new JPasswordField(24);
				JLabel txt = new JLabel ("Enter Admin Password: ");
				Box box = Box.createHorizontalBox();
				box.add(txt);
				box.add(adminPass);
				int result = JOptionPane.showConfirmDialog(null, box, "Enter Password", JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					char[] pass = adminPass.getPassword();
					String enteredPass = new String(pass);
					
					if (enteredPass.equals("admin_Password")) {
						receiverFrame.dispose();
						AdminPage ap = new AdminPage();
						ap.adminFrame.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect password!");
					}
				}
			}
		});
		admin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		admin.setBounds(468, 11, 97, 23);
		receiverFrame.getContentPane().add(admin);
	}
}