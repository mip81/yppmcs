package nz.mip.yps.views.panels;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ResourceBundle;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * The class represent the JPanel
 * for customer registration in 
 * the schedule of artists
 *  
 * @author mikhailpastushkov
 *
 */
public class CustomerPanel extends JPanel {
	// Date 
			private JTextField tfDate = new JTextField();
				private JLabel lblDate = new JLabel();
		// Time
			private JTextField tfTime = new JTextField();
				private JLabel lblTime = new JLabel();
		// Artist
			private JComboBox<String> cbArtist = new JComboBox<String>(new String[]{"Art1", "Art2"});
				private JLabel lblArtist = new JLabel();		
		//Procedure
				private JComboBox<String> cbProcedure = new JComboBox<String>(new String[]{"Proc1", "Proc2"});
					private JLabel lblProcedure = new JLabel();
		//City
				private JComboBox<String> cbCity = new JComboBox<>(new String[]{"Aktau", "Astana"});
					private JLabel lblCity = new JLabel();
		//ProcedureType
				private JComboBox<String> cbProcedureType = new JComboBox<String>(new String[]{"Type1", "Type2"});
					private JLabel lblProcedureType = new JLabel();
					
		// FirstName		
			private JTextField tfFirstName = new JTextField();
				private JLabel lblFirtsName = new JLabel();
		// LastName
			private JTextField tfLastName = new JTextField();
				private JLabel lblLastName = new JLabel();
				
		// Mobile phone
			private JTextField tfMobile = new JTextField();
				private JLabel lblMobile = new JLabel();
				
		// Memo
			private JTextArea taMemo = new JTextArea();
				private JLabel lblMemo = new JLabel();
			
	
	
	/**
	 * Default constructor for Customer panel
	 */
	public CustomerPanel() {
		setLayout(new GridBagLayout());
		
		// Getting and setting translations
			ResourceBundle resource = ResourceBundle.getBundle("Labels");
			
			lblDate.setText(resource.getString("cstLblDate"));
			lblTime.setText(resource.getString("cstLblTime"));
			
			lblArtist.setText(resource.getString("cstLblArtist"));
			lblCity.setText(resource.getString("cstLblCity"));
			
			lblFirtsName.setText(resource.getString("cstLblFirstName"));
			lblLastName.setText(resource.getString("cstLblLastName"));
			lblMobile.setText(resource.getString("cstLblMobile"));
			
			lblProcedure.setText(resource.getString("cstLblProcedure"));
			lblProcedure.setText(resource.getString("cstLblProcedureType"));
			
			lblMemo.setText(resource.getString("cstLblMemo"));
			
			
			
		
		
		GridBagConstraints gbc = new GridBagConstraints();  
		
		// Set Date (tf and lbl)
		    gbc.ipadx = 12;
		    gbc.ipady = 5;
		    gbc.anchor = GridBagConstraints.LINE_START;
			gbc.weightx = 0.5;
			gbc.fill = GridBagConstraints.HORIZONTAL; // Fill only horizontal , hight will be prefered
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			
				add(lblDate, gbc);
			gbc.insets = new Insets(0,3,3,3);
			gbc.gridx = 0;
			gbc.gridy = 1;
				add(tfDate, gbc);
				
		// Set Time
			gbc.gridx = 1;
			gbc.gridy = 0;
				
				add(lblTime, gbc);
			gbc.gridx = 1;
			gbc.gridy = 1;
				add(tfTime, gbc);
		
		// Set Procedure
			gbc.gridx = 2;
			gbc.gridy = 0;
					
				add(lblProcedure, gbc);
			gbc.gridx = 2;
			gbc.gridy = 1;
				add(cbProcedure, gbc);
		
		// Set City
			gbc.gridx = 3;
			gbc.gridy = 0;
						
				add(lblCity, gbc);
			gbc.gridx = 3;
			gbc.gridy = 1;
				add(cbCity, gbc);
				
		// Set FirstName
			gbc.gridx = 0;
			gbc.gridy = 2;
			gbc.gridwidth = 2;
						
			 add(lblFirtsName, gbc);
			gbc.gridx = 0;
			gbc.gridy = 3;
			 add(tfFirstName, gbc);
			 
		// Set LastName
			gbc.gridx = 0;
			gbc.gridy = 4;
							
			 add(lblLastName, gbc);
			gbc.gridx = 0;
			gbc.gridy = 5;
			 add(tfLastName, gbc);
		
		// Set Mobile
			gbc.gridx = 0;
			gbc.gridy = 6;
								
			 add(lblMobile, gbc);
			gbc.gridx = 0;
			gbc.gridy = 7;
			 add(tfMobile, gbc);
			
			 
     	// Set Type of Procedure
			gbc.gridwidth = 1; 
	        gbc.gridx = 2;
			gbc.gridy = 2;
							
			  add(lblProcedureType, gbc);
			gbc.gridx = 2;
			gbc.gridy = 3;
			 add(cbProcedureType, gbc);	 
				
     	// Set Artist
		    gbc.gridx = 3;
			gbc.gridy = 2;
								
			  add(lblArtist, gbc);
			gbc.gridx = 3;
			gbc.gridy = 3;
			 add(cbArtist, gbc);	 	

	    // Set Memo
			 gbc.gridwidth = 1; 
		     gbc.gridx = 2;
			 gbc.gridy = 4;
								
				add(lblMemo, gbc);
			gbc.fill = GridBagConstraints.BOTH;	
			gbc.gridheight = 3;	
			gbc.gridwidth = 2;
			gbc.gridx = 2;
			gbc.gridy = 5;
			
			taMemo.setBorder(new LineBorder(Color.gray, 2));
				 add(new JScrollPane(taMemo), gbc);	 
					
					
		
		
		
		
	}

}
