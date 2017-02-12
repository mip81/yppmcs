package nz.mip.yps.utils;


import java.util.ResourceBundle;

import javax.swing.JComponent;

/**
 * The class has static method that 
 * help translate the forms used by
 * application.
 * 
 * @author mikhailpastushkov
 *
 */
public class ResourseTranslation {
	
	static ResourceBundle resource = ResourceBundle.getBundle("Labels");
	
	// Translation Customer form
	static void transCustFrm(JComponent[] comps){
	  
		for(JComponent comp : comps){
			String name = comp.getName(); // Get the name of component
			switch (name) {
			case "":
				
				break;

			default:
				break;
			}
			
		}
	}

}
