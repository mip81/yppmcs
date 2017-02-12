package nz.mip.yps.models;

import java.util.Date;

/**
 * Class represent Employee (Artist)
 * in the System . 
 * @author mikhailpastushkov
 *
 */
public class Artist extends Person{

	private int salary;  		// The salary of Artits if it has appropriate contract 
	private int idTypecontract; // Id of type of contract
	private Date sDateContract; // Start date of contract 
	private Date eDateContract; // End date of contract
	private int idLocation;    	// id location of Artist
	
	
}
