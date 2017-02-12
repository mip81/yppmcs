package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Form for filtering data
 * @author mikhailpastushkov
 *
 */
public class FilterFrm extends JFrame{
	// Get resource for translatin 
	private ResourceBundle resource = ResourceBundle.getBundle("Labels");
			
	// Forms components
	private JLabel lblDateFrom = new JLabel();      // Label for date from
	private JLabel lblDateTo = new JLabel();  		// Label for date to
	private JLabel lblArtist = new JLabel();			// Label for Artist
	private JLabel lblCity = new JLabel();			// Label for City
	

	private JTextField tfDateFrom = new JTextField(); // Date from
	private JTextField tfDateTo = new JTextField(); // Date to 
	private JComboBox<String> cbArtist = new JComboBox<String>(new String[]{ "All", "Maria Zelenko", "Maxim Pastushkov"});
	private JComboBox<String> cbCity = new JComboBox<String>(new String[]{"Auckland", "Aktau", "Astana"});
	
	private JButton btnApply = new JButton();
	private JButton btnCancel = new JButton();
	
	// Panels for form
	private JPanel panelMain = new JPanel(new GridLayout(2, 3));
	//private JPanel panelLbl= new JPanel(new FlowLayout(FlowLayout.LEFT));
	//private JPanel panelInput = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel panelBtn = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	public FilterFrm(){
		
		// Settings of form
		setTitle(resource.getString("fltrTitle"));
		setSize(450, 120);
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Load the translations for comps
			lblDateFrom.setText(resource.getString("fltrDateFrom"));
			lblDateTo.setText(resource.getString("fltrDateTo"));
			lblArtist.setText(resource.getString("fltrByArtist"));
			lblCity.setText(resource.getString("fltrByCity"));
			btnApply.setText(resource.getString("fltrBtnApply") );
			btnCancel.setText(resource.getString("fltrBtnCancel"));
			
		// Add components to the panels
			panelMain.add(lblDateFrom);
			panelMain.add(lblArtist);
			panelMain.add(lblCity);
			
			panelMain.add(tfDateFrom);
			panelMain.add(cbArtist);
			panelMain.add(cbCity);
			
			panelBtn.add(btnApply);
			panelBtn.add(btnCancel);
			
			
		// Add the panels to main panel
			//panelMain.add(panelLbl);
			//panelMain.add(panelInput);
			add(panelMain, BorderLayout.CENTER);	 // Inputs with labels
			add(panelBtn, BorderLayout.SOUTH);   // Buttons apply and cancel
			
			
		
		setVisible(true);
		
		
	}

}
