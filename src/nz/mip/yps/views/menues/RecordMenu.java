package nz.mip.yps.views.menues;

import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import nz.mip.yps.utils.ResourseTranslation;


/**
 * Class keep the menu Record
 * @author mikhailpastushkov
 *
 */
public class RecordMenu extends JMenu{
	
	// Create the menues
	private JMenuItem miSave;
	private JMenuItem miEdit;
	private JMenuItem miDelete;
	private JMenuItem miClose;
	
	// Resource for translation
	private ResourceBundle resource = ResourceBundle.getBundle("Labels");
	
	// Default constructor
	public RecordMenu() {
	  
		setText(resource.getString("cstMenuRecord"));
		
		// Apply translations
		miSave = new JMenuItem(resource.getString("cstBtnSave"));
		miEdit = new JMenuItem(resource.getString("cstBtnEdit"));
		miClose = new JMenuItem(resource.getString("cstBtnClose"));
		miDelete = new JMenuItem(resource.getString("cstBtnDelete"));
		 
		// Add the menu
		add(miEdit);
		add(miSave);
		add(miDelete);
		add(new JSeparator());
		add(miClose);
		
	
		
	}
	
	/**
	 * Add listener for the "Save" menuitem
	 * @param aLstr
	 */
	public void addMiSaveLstr(ActionListener aLstr){
		miSave.addActionListener(aLstr);
	}
	
	/**
	 * Add listener for the "Edit" menuitem
	 * @param aLstr
	 */
	public void addMiEditLstr(ActionListener aLstr){
		miEdit.addActionListener(aLstr);
	}
	
	/**
	 * Add listener for the "Delete" menuitem
	 * @param aLstr
	 */
	public void addMiDeleteLstr(ActionListener aLstr){
		miDelete.addActionListener(aLstr);
	}
	
	/**
	 * Add listener for the "Exit" menuitem
	 * @param aLstr
	 */
	public void addMiCloseLstr(ActionListener aLstr){
		miClose.addActionListener(aLstr);
	}

}
