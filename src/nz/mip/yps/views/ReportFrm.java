package nz.mip.yps.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import nz.mip.yps.helpers.AppSettings;
import nz.mip.yps.views.tblmodels.TableModelReport;

/**
 *  Report form for application
 * @author mikhailpastushkov
 *
 */
public class ReportFrm extends JFrame{

	// Table to show the report
	private JTable tblReport;
	
	// Buttons
	private JButton btnOk = new JButton(AppSettings.getTransl("rptBtnOk"));
	
	// Panels
	private JPanel panelBtns = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	private JPanel panelInfoReport = new JPanel(new FlowLayout(FlowLayout.LEFT));
	
	// Labels
	private JLabel lblInfoReport = new JLabel();
	//private JLabel lblLogo = new JLabel(new ImageIcon("images/logo.png"));
	
	
	// Default constructor
	public ReportFrm() {
		
		// Settings for report form
		setTitle(AppSettings.getTransl("rptTitle"));
		setSize(850, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		// Settings for label
		Font fontLblInfo = new Font("Courier", Font.BOLD, 20);
		lblInfoReport.setIcon(new ImageIcon("images/logo.png"));
		lblInfoReport.setFont(fontLblInfo);
		lblInfoReport.setIconTextGap(200);
		lblInfoReport.setText("<html><b><BR><CENTER>Summary report of Artists <br> from 01.02.2017 to 28.02.2017</b><br><br><CENTER></html>");
		lblInfoReport.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		// Set buttons on the panel
		panelBtns.add(btnOk);
		//panelInfoReport.add(lblLogo);
		panelInfoReport.add(lblInfoReport);
	
		// Get the table with data
		tblReport = new JTable(new TableModelReport());
		
		// Add actions
		btnOk.addActionListener(new ActionBtnClose());
		
		
		add(new JScrollPane(tblReport), BorderLayout.CENTER);
		add(panelBtns, BorderLayout.SOUTH);
		add(panelInfoReport, BorderLayout.NORTH);
		
	
		setVisible(true);
		
	}
	
	/**
	 * Class ActionListner for closing frame
	 * @author mikhailpastushkov
	 *
	 */
	class ActionBtnClose implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}
}
