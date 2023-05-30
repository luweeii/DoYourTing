import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditItem {

	JFrame editItemFrame;
	JButton editCloseBtn;
	JButton editItemBtn;
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
					EditItem window = new EditItem();
					window.editItemFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditItem() {
		initialize();
	}
	private void initialize() {
		editItemFrame = new JFrame();
		editItemFrame.setTitle("Edit Item");
		editItemFrame.setSize(377, 223);
		editItemFrame.setLocationRelativeTo(null);
		editItemFrame.setDefaultCloseOperation(0);
		editItemFrame.getContentPane().setLayout(null);
		editItemFrame.setVisible(true);
		
		JLabel editINLbl = new JLabel("Edit Item Name: ");
		editINLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editINLbl.setBounds(25, 25, 109, 21);
		editItemFrame.getContentPane().add(editINLbl);
		
		JLabel editIDLbl = new JLabel("Edit Item Description:");
		editIDLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editIDLbl.setBounds(25, 60, 146, 21);
		editItemFrame.getContentPane().add(editIDLbl);
		
		JLabel editIQLbl = new JLabel("Edit Item Quantity:");
		editIQLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editIQLbl.setBounds(25, 91, 146, 21);
		editItemFrame.getContentPane().add(editIQLbl);
		
		editINTxt = new JTextField();
		editINTxt.setColumns(10);
		editINTxt.setBounds(169, 25, 153, 21);
		editItemFrame.getContentPane().add(editINTxt);
		
		editIDTxt = new JTextField();
		editIDTxt.setColumns(10);
		editIDTxt.setBounds(169, 60, 153, 21);
		editItemFrame.getContentPane().add(editIDTxt);
		
		editIQTxt = new JTextField();
		editIQTxt.setColumns(10);
		editIQTxt.setBounds(169, 91, 153, 21);
		editItemFrame.getContentPane().add(editIQTxt);
		
		JLabel editDLbl = new JLabel("Edit Date:");
		editDLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editDLbl.setBounds(25, 122, 109, 21);
		editItemFrame.getContentPane().add(editDLbl);
		
		JDateChooser editDate = new JDateChooser();
		editDate.setBounds(169, 123, 153, 21);
		editItemFrame.getContentPane().add(editDate);
		
		editItemBtn = new JButton("Edit Item");
		editItemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editItemBtn.setBounds(149, 149, 85, 21);
		editItemFrame.getContentPane().add(editItemBtn);
		
		editCloseBtn = new JButton("Close");
		editCloseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editItemFrame.dispose();
			}
		});
		editCloseBtn.setBounds(265, 149, 85, 21);
		editItemFrame.getContentPane().add(editCloseBtn);
	}
}
