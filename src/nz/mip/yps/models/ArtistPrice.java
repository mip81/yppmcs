package nz.mip.yps.models;



/**
 * Class represent the money that will be paid to Artist
 * it will be applyied to appropriate type of contract
 * @author mikhailpastushkov
 *
 */
public class ArtistPrice {

	private int id;         // the is if ArtistPrice
	private int idArtist;   // id of Artist in the system
	private int idProc;     // id of Procedure
	private int idProcType; // id of Procedure Type
	private int price;      // the price  
	
}
