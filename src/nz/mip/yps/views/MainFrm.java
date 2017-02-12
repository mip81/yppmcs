package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import nz.mip.yps.views.menues.DateTimeToolbar;

/**
 * Class represent the main form 
 * that show schedule of artist
 * 
 * @author mikhailpastushkov
 *
 */
public class MainFrm extends JFrame{
	
	// Toolbar for the main form
	private JToolBar toolbar;
	// Resource for translation label
	private ResourceBundle resource = ResourceBundle.getBundle("Labels");
	// Tabel of the schedule of Artist
	private JTable tblShedule = new JTable();
	// Panel for table
	private JPanel panelTbl = new JPanel(new BorderLayout());
	
	
	// Buttons fot toolbar
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnFilter;
	private JButton btnFilterDelete;
	private JButton btnSearch;
	private JButton btnReport;
	private JButton btnImport;
	private JButton btnSettings;
	
	// ActionFactory 
	private ActionMainFactory actionFactory = new ActionMainFactory();
	
	
	/**
	 * Default contructor for the Main form
	 */
	public MainFrm() {
		
		// Form settings
		setTitle(resource.getString("mainTitle"));
		setSize(900, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		// Stub for table
		 	Object stubColNames[] =  new Object[]{
		 		"Date", "Time", "Name", "Mobile", "Procedure", "Type", "Artist", "City", "Memo" 
		 	};
		 	
		 	Object [][] stubRows = new Object[][]{
		 		{"10.02.2015", "10:00", "Alicia Keys", "0211693322", "Eyebrows", "First", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Cici Wang", "0211693322", "Eyebrows", "First", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Michael Jackson", "0211693322", "Eyebrows", "First", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		{"10.02.2015", "10:00", "Margaret Prince", "0211693322", "Lips", "Correction", "Yevgeniya Pastushkova", "Auckland", "Wow!"},
		 		
		 	};
		 	
			tblShedule = new JTable(stubRows, stubColNames);
		
		// Add table to panel
		panelTbl.add(new JScrollPane(tblShedule), BorderLayout.CENTER);
		
		add(panelTbl, BorderLayout.CENTER);
		
			toolbar = getToolBar();
		JPanel panelTB = new JPanel(new FlowLayout(FlowLayout.LEFT));	
		panelTB.add(toolbar);             	// Set Toolbar
		panelTB.add(new DateTimeToolbar()); // Set DateTime Toolbar 
		
		add(panelTB,  BorderLayout.NORTH);
		
		setJMenuBar(getMainMenuBar());     // Set Menubar 
		setVisible(true);
		
	}
	
	
	/**
	 * Build and return toolbar for the main form
	 * @return JToolbar
	 */
	private JToolBar getToolBar(){
		// Generate buttons and add translations
					btnAdd = new JButton(resource.getString("mainBtnAddNew"), new ImageIcon("images/addClient.png"));
						btnAdd.addActionListener(actionFactory.getAddNewAction());
						
					btnDelete = new JButton(resource.getString("mainBtnDelete"),  new ImageIcon("images/deleteClient.png"));
					btnFilter = new JButton(resource.getString("mainBtnFilter"),  new ImageIcon("images/filter.png"));
					btnFilterDelete = new JButton(resource.getString("mainBtnRemoveFilter"), new ImageIcon("images/delFilter.png"));
					btnSearch = new JButton(resource.getString("mainBtnSearch"), new ImageIcon("images/search.png"));
					btnReport = new JButton(resource.getString("mainBtnReport"), new  ImageIcon("images/report.png"));
					btnImport = new JButton(resource.getString("mainBtnImport"), new  ImageIcon("images/import.png"));
					btnSettings = new JButton(resource.getString("mainBtnSettings"), new  ImageIcon("images/settings.png"));
		JToolBar toolbar = new JToolBar();
		
		// Add buttons to toolbar
			toolbar.add(btnAdd);
			toolbar.add(btnDelete);
			toolbar.add(btnFilter);
			toolbar.add(btnFilterDelete);
			toolbar.add(btnSearch);
			toolbar.add(btnReport);
			toolbar.add(btnImport);
			toolbar.add(btnSettings);
				
		return toolbar;
	}
	

	/**
	 *	Create and return menubar 
	 * @return JMenuBar
	 */
	private JMenuBar getMainMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		
		// Create client menu
		JMenu clientMenu = new JMenu(resource.getString("mainBtnMenuClient"));
			JMenuItem miAddClient = new JMenuItem(resource.getString("mainBtnAddNew"));
				miAddClient.addActionListener(actionFactory.getAddNewAction());
			JMenuItem miDeleteClient = new JMenuItem(resource.getString("mainBtnDelete"));
			JMenuItem miSearchClient = new JMenuItem(resource.getString("mainBtnSearch"));
				clientMenu.add(miAddClient);
				clientMenu.add(miDeleteClient);
				clientMenu.add(miSearchClient);
			menuBar.add(clientMenu);
		 
		// Create filter menu 
		JMenu filterMenu = new JMenu(resource.getString("mainBtnFilter"));
		 	JMenuItem miApplyFilter = new JMenuItem(resource.getString("mainBtnApplyFilter"));
		 	JMenuItem miRemoveFilter = new JMenuItem(resource.getString("mainBtnRemoveFilter"));
		 		filterMenu.add(miApplyFilter);
		 		filterMenu.add(miRemoveFilter);
		 	menuBar.add(filterMenu);
		 	
		 // Create report menu
		JMenu reportMenu = new JMenu(resource.getString("mainBtnReport"));
		 	JMenuItem imLastMonthReport = new JMenuItem(resource.getString("mainBtnLastMonthReport"));
		 	JMenuItem imCustomReport = new JMenuItem(resource.getString("mainBtnCustomReport"));
		 		reportMenu.add(imLastMonthReport);
		 		reportMenu.add(imCustomReport);
		 	menuBar.add(reportMenu);
		 	
		// Create about menu
		 	JMenu aboutMenu = new JMenu(resource.getString("mainBtnAbout"));
		 	menuBar.add(aboutMenu);
			
			return menuBar;
		
	}
	
	/**
	 * 
	 */
	class ActionMainFactory{
		
		// Add new clients Listener 
		public ActionListener getAddNewAction(){
			return new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					new CustomerFrm();
					
				}
				
			};
			
			
		}
		
	}

}
