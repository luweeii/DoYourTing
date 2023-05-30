import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddItem {

	JFrame addItemFrame;
	JButton addCloseBtn;
	JButton addItemBtn;
	JTextField itemNameEnter;
	JTextField itemDescriptionEnter;
	JTextField quantityEnter;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItem window = new AddItem();
					window.addItemFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddItem() {
		initialize();
	}

	private void initialize() {
		addItemFrame = new JFrame();
		addItemFrame.setTitle("Add Items");
		addItemFrame.setSize(393, 225);
		addItemFrame.setLocationRelativeTo(null);
		addItemFrame.setDefaultCloseOperation(0);
		addItemFrame.getContentPane().setLayout(null);
		addItemFrame.setVisible(true);
		
		JLabel enterINLbl = new JLabel("Enter Item Name: ");
		enterINLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		enterINLbl.setBounds(35, 20, 109, 21);
		addItemFrame.getContentPane().add(enterINLbl);
		
		JLabel enterIDLbl = new JLabel("Enter Item Description:");
		enterIDLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		enterIDLbl.setBounds(35, 55, 146, 21);
		addItemFrame.getContentPane().add(enterIDLbl);
		
		JLabel enterQLbl = new JLabel("Enter Quantity:");
		enterQLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		enterQLbl.setBounds(35, 86, 109, 21);
		addItemFrame.getContentPane().add(enterQLbl);
		
		itemNameEnter = new JTextField();
		itemNameEnter.setBounds(179, 20, 153, 21);
		addItemFrame.getContentPane().add(itemNameEnter);
		itemNameEnter.setColumns(10);
		
		itemDescriptionEnter = new JTextField();
		itemDescriptionEnter.setColumns(10);
		itemDescriptionEnter.setBounds(179, 55, 153, 21);
		addItemFrame.getContentPane().add(itemDescriptionEnter);
		
		quantityEnter = new JTextField();
		quantityEnter.setColumns(10);
		quantityEnter.setBounds(179, 87, 153, 21);
		addItemFrame.getContentPane().add(quantityEnter);
		
		JDateChooser addDate = new JDateChooser();
		addDate.setBounds(179, 118, 153, 21);
		addItemFrame.getContentPane().add(addDate);
		
		JLabel enterDLbl = new JLabel("Enter Date:");
		enterDLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		enterDLbl.setBounds(35, 117, 109, 21);
		addItemFrame.getContentPane().add(enterDLbl);
		
		addItemBtn = new JButton("Add Item");
		addItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addItemBtn.setBounds(149, 149, 85, 21);
		addItemFrame.getContentPane().add(addItemBtn);
		
		addCloseBtn = new JButton("Close");
		addCloseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addItemFrame.dispose();
			}
		});
		addCloseBtn.setBounds(265, 149, 85, 21);
		addItemFrame.getContentPane().add(addCloseBtn);
		
	}
}
