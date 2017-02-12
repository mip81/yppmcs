package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * Frame with login and password
 * @author mikhailpastushkov
 *
 */
public class AuthFrm extends JFrame{

	private JTextField tfLogin = new JTextField();			  // Fiels for login
	private JPasswordField tfPassword = new JPasswordField(); // Field for password 
	private JLabel lblLogin = new JLabel();	   // Login label
	private JLabel lblPassword = new JLabel(); // Password label
	
	private JButton btnOk = new JButton(); 	   // This button will check credential
	private JButton btnCancel = new JButton(); // This button for canceling input
	
	// the panel for entering loging and password
	private JPanel logpasPanel = new JPanel();

	// the panel for buttons 'OK' and 'Cancel'
	private JPanel btnPanel = new JPanel();
	private JPanel btnFlowPanel = new JPanel();
	
	/**
	 * Constructor define main components
	 * of the frame and put them on the form.
	 */
	public AuthFrm() {
	
		//Get resource bundle and define labels
		ResourceBundle textBundle = ResourceBundle.getBundle("Labels");
			lblLogin.setText(textBundle.getString("authLblLogin"));
				lblPassword.setText(textBundle.getString("authLblPassword"));
				
				btnOk.setText(textBundle.getString("authBtnOk"));
				btnCancel.setText(textBundle.getString("authBtnCancel"));
				
				
		// Define layout mgr for panels
				
		 logpasPanel.setLayout(new BoxLayout(logpasPanel, BoxLayout.Y_AXIS));		
		 btnFlowPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 btnPanel.setLayout(new GridLayout(1, 2));
	
		//Add components to the panels
			
			logpasPanel.add(lblLogin);
			logpasPanel.add(tfLogin);
			logpasPanel.add(lblPassword);
			logpasPanel.add(tfPassword);
			
			btnPanel.add(btnOk);
			btnPanel.add(btnCancel);
			
			btnFlowPanel.add(btnPanel); // Add buttons to the right side
		
		   
				
		
		// Name, size and position of the frame
		setTitle("Authorization");
		setSize(250, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		// Panels to frame ( Textedits and buttons)
		add(logpasPanel, BorderLayout.CENTER);
		add(btnFlowPanel, BorderLayout.SOUTH);

		// Set actionListeners to buttons
		btnOk.addActionListener(new ActionBtnLstr());
		btnCancel.addActionListener(new ActionBtnLstr());
		
		setVisible(true);
		
		
		
	}
	
	/**
	 * Action listener for button 
	 *  on the login form
	 *  
	 * @author mikhailpastushkov
	 *
	 */
	class ActionBtnLstr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			// Check credentials
			if(e.getSource() == btnOk){
				
				JOptionPane.showMessageDialog( null , "Not ready yet");
				// Show the main window
			}
			
			// Exit from app
			if(e.getSource() == btnCancel){
				JOptionPane.showMessageDialog( null , "Exit");
				System.exit(0);
				
			}
		}
		
		
		
		
	}
	
}
