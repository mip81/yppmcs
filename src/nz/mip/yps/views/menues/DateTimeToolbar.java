package nz.mip.yps.views.menues;

import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
/**
 * Class JToolbar show date and time 
 * 
 * @author mikhailpastushkov
 *
 */
public class DateTimeToolbar extends JToolBar{

	private SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdfDate = new SimpleDateFormat("EE MMMM YYYY");
	private Date date = new Date();
	
	public DateTimeToolbar() {
		JPanel dtPanel = new JPanel(new GridLayout(2, 1));
		dtPanel.add(new JLabel(sdfTime.format(date)));
		dtPanel.add(new JLabel(sdfDate.format(date)));
		
		add(dtPanel);
	}
}
