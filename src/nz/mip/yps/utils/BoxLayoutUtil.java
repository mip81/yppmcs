package nz.mip.yps.utils;

import java.awt.Component;
import java.awt.Dimension;
import java.util.*;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This helper class help 
 * to work with BoxLayout manager
 * 
 * @author mikhailpastushkov
 *
 */
public class BoxLayoutUtil {
	
	/**
	 * Create and return the JPanel
	 * with BoxLayout (Vertical)
	 * 
	 * @return JPanel
	 */
	public static JPanel getVerticalPanel(){
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		return panel;
	}
	
	
	/**
	 * Create and return the JPanel
	 * with BoxLayout (Horizontal)
	 * 
	 * @return JPanel
	 */
	public static JPanel getHorizontalPanel(){
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		return panel;
	}

	/**
	 * Change the maximum height
	 * to as in prefered
	 * 
	 * @param ArrayList<JComponent>  
	 */
	public static void setMaxHeightAsPref(ArrayList<JComponent> comps){
		
		Dimension dim ; // For keeping dimension of comp
		
		// Go thorough list of comps
		for(JComponent comp : comps){
			dim = comp.getMaximumSize();
			dim.height = comp.getPreferredSize().height;
			comp.setSize(dim);
			
		}
		
	}

}
