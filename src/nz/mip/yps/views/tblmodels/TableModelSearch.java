package nz.mip.yps.views.tblmodels;

import javax.swing.table.AbstractTableModel;
/**
 * Class is TableModel for JTable that 
 * is used in the search form
 * 
 * @author mikhailpastushkov
 *
 */
public class TableModelSearch extends AbstractTableModel{

	// Stub data
	private Object[] headerStub = new Object[]{"Date", "Time",  "Fullname", "Mobile", "Procedure"};
	private Object[][] dataStub = new Object[][]{ {"11.02.2017","10:00", "Jennifer Lopez", "021xxxxxx", "Lips"},
												  {"11.02.2017","10:00", "Jennifer Lopez", "021xxxxxx", "Lips"},
		                                          {"11.02.2017","10:00", "Jennifer Lopez", "021xxxxxx", "Lips"},
		                                          {"11.02.2017","10:00", "Jennifer Lopez", "021xxxxxx", "Lips"},};
	
	@Override
	public String getColumnName(int column) {
		
		return (String) headerStub[column];
	}

	@Override
	public int getRowCount() {
		
		return dataStub.length;
	}

	@Override
	public int getColumnCount() {
		
		return headerStub.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return dataStub[rowIndex][columnIndex];
	}

}
