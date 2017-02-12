package nz.mip.yps.views.tblmodels;

import javax.swing.table.AbstractTableModel;
/**
 * Class is TableModel for JTable that 
 * is used in the search form
 * 
 * @author mikhailpastushkov
 *
 */
public class TableModelReport extends AbstractTableModel{

	// Stub data
	private Object[] headerStub = new Object[]{"Artist", "LF",  "LC", "BF", "BC", "LasF", "LasC", "ELashF","ELashC", "Amount", "Gross", "Art.Salary", "Income"};
	private Object[][] dataStub = new Object[][]{ {"Maria Zelenko", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  {"Anastasya Vladimirova", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  {"Ekaterina Ishmatova", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  {"Maxim Pastushkov", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  {"Anastasiya Bekbulatova", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  {"Vera Admin", "55",  "44", "45", "43", "33", "48", "0","0", "987", "800000", "350000", "450000"},
												  
												  {"In Total", "544",  "455", "444", "434", "443", "753", "0","0", "987", "4500000", "3500000", "850000"}
												};
		                                          
	
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
