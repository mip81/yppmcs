package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import nz.mip.yps.utils.BoxLayoutUtil;
import nz.mip.yps.views.menues.RecordMenu;
import nz.mip.yps.views.panels.CustomerPanel;

/**
 * The class represent the form 
 * of customer.
 * @author mikhailpastushkov
 *
 */
public class CustomerFrm extends JFrame{

		
	private JToolBar toolBar = new JToolBar(); // Toolbar for the client registr. form
	private JButton btnSave;
	private JButton btnEdit;
	private JButton btnDelete;
	
	// The menu for customer form
	private JMenuBar menu = new JMenuBar();
	
	// Resource to tranlate labels and othet comps.
	private ResourceBundle resource = ResourceBundle.getBundle("Labels");
	
		/**
		 *  Default construstor for the customer form
		 */
		public CustomerFrm() {
			// Default settings of the form
			setSize(600, 330);
			setTitle(resource.getString("cstTitle"));
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			
			// Buttons for toolbar
				btnEdit = new JButton("Edit", new ImageIcon("images/edit.png"));
				 btnEdit.addActionListener(new ActionsCst());
			    btnSave = new JButton("Save", new ImageIcon("images/save.png"));
			    	 btnSave.addActionListener(new ActionsCst());
			    btnDelete = new JButton("Delete", new ImageIcon("images/delete.png"));
			    	 btnDelete.addActionListener(new ActionsCst());
			
			toolBar.add(btnSave);
			toolBar.add(btnEdit);
			toolBar.add(btnDelete);
			
			// Create the menu and add it to the form
			RecordMenu rMenu = new RecordMenu();
			
				// Register listeners for the menu
			rMenu.addMiSaveLstr(new MenuActionLstrDispatcher().getSaveAction());
			rMenu.addMiEditLstr(new MenuActionLstrDispatcher().getEditAction());
			rMenu.addMiDeleteLstr(new MenuActionLstrDispatcher().getDeleteAction());
			rMenu.addMiCloseLstr(new MenuActionLstrDispatcher().getCloseAction());
			
				menu.add(rMenu);
			
				setJMenuBar(menu);
			
			
			
			add(toolBar, BorderLayout.PAGE_START);
			add(new CustomerPanel(), "Center");
		
			
			setVisible(true);
		}
		
		
		/**
		 * Action listeners for toolbar
		 *  
		 * @author mikhailpastushkov
		 *
		 */
		class ActionsCst implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Object btn = e.getSource();
				
				// Check the button and apply action
				if ((JButton)btn == btnSave){
					JOptionPane.showMessageDialog(null, "Save client in schedule");
				}
				
				if ((JButton)btn == btnDelete){
					JOptionPane.showMessageDialog(null, "Delete client from schedule");
				}
				
				if ((JButton)btn == btnEdit){
					JOptionPane.showMessageDialog(null, "Edit client in schedule");
				}
				
				
			}
			
		}
		
		/**
		 * Class dispatch the menu listeners
		 * @author mikhailpastushkov
		 *
		 */
		class MenuActionLstrDispatcher{
			
			/**
			 * Process saving data in the customer 
			 * schedule form
			 * @return ActionListener
			 */
			public ActionListener getSaveAction(){
				return new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// ------
						// DO SMTH
						
					}
				};
				
			}
			
			/**
			 * Process editing data in the customer 
			 * scedule form
			 * @return ActionListener
			 */
			public ActionListener getEditAction(){
				return new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Edit customer");
						// ------
						// DO SMTH 
					}
				};
			}
			
			/**
			 * Process deleting data of schedule customer from DB 
			 * scedule form
			 * @return ActionListener
			 */
			public ActionListener getDeleteAction(){
				return new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Delete customer from Schedule");
						// ------
						// DO SMTH
					}
				};
			}
			
			/**
			 * Process close of schedule form 
			 * @return ActionListener
			 */
			public ActionListener getCloseAction(){
				return new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Close the form");
						// ------
						// DO SMTH
					}
				};
			}
			
		} // END MenuActLstr
}
