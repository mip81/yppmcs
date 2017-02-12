package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import nz.mip.yps.views.tblmodels.TableModelSearch;

/**
 *  Form for searching clients 
 *  in the main table of schedule 
 * @author mikhailpastushkov
 *
 */
public class SearchFrm extends JFrame{
	private ResourceBundle resource = ResourceBundle.getBundle("Labels");
	
	// Buttons and labels of the form
	private JLabel lblSearch = new JLabel(resource.getString("srchFind")); 	// Label for title layout
	private JTextField tfSearchString = new JTextField();	               // Input for searching
	private JPanel panelResult = new JPanel(new BorderLayout());         // Panel to return result
	private String lblSearchIn = new String(resource.getString("srchSearchIn"));  // For title border
	private JButton btnFind = new JButton(resource.getString("srchFind"));		 //  Button 'Find'
	private JLabel lblFind = new JLabel(resource.getString("srchFind"));		 	//   Label 'Find'
	private JButton btnCancel = new JButton(resource.getString("srchCancel")); //	 Button 'Cancel'
	private JRadioButton rbNames = new JRadioButton(resource.getString("srchInNames")); // Where to search
	private JRadioButton rbPhones = new JRadioButton(resource.getString("srchInPhones"));
	private ButtonGroup btnGroup = new ButtonGroup();
	private GridBagConstraints gbc = new GridBagConstraints(); 							// Constraint for layout
	
	JTable tblSrchRslt = new JTable();							// To show results of search
	private JPanel panelSrch = new JPanel(new GridBagLayout());  // The search panel
	private JPanel panelSrchPlace = new JPanel(new GridLayout(2,1)); // Panel to choose where to search
	private JPanel panelBtns = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0 ,0));
	
	/**
	 * Default constructor of the search form
	 */
	public SearchFrm() {
		
		setTitle(resource.getString("srchTitle"));
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Add RB to group
		btnGroup.add(rbNames);
		btnGroup.add(rbPhones);
		rbPhones.setSelected(true);  // Default search by the phone
		
		
		// Place components on the panels giving appropriate constraints
		panelSrchPlace.add(rbNames);
		panelSrchPlace.add(rbPhones);
		panelSrchPlace.setBorder(new TitledBorder(resource.getString("srchSearchIn")));
		
		// Label
		gbc.fill = GridBagConstraints.HORIZONTAL;  	// Fill only Horizontal
		gbc.anchor = GridBagConstraints.LINE_START; // Alignment all components
		gbc.insets = new Insets(3, 6, 3, 6);
		gbc.weightx = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelSrch.add(lblSearch, gbc);
		
		// TextField
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		panelSrch.add(tfSearchString, gbc);
		
		// RB where to search
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panelSrch.add(panelSrchPlace, gbc);
		
		// Buttons 'Find' and 'Cancel'
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.LAST_LINE_END;
			panelBtns.add(btnFind);
			panelBtns.add(btnCancel);
		panelSrch.add(panelBtns, gbc);
		
		// Add ActionListeners to buttons
		btnFind.addActionListener(new ActionBtns());
		
	    add(panelSrch, BorderLayout.NORTH);
	   
		
		setVisible(true);
	}
	
	
	class ActionBtns implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JScrollPane pane = new JScrollPane(new JTable(new TableModelSearch()));
			pane.setBorder(new TitledBorder("Results:"));
			
			setSize(400, 400);
			 add( pane , BorderLayout.CENTER);
			
		}
		
		
		
	}
	
}
