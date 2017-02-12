package nz.mip.yps.models;

/**
 * Class that represent a person 
 * that will be used for Client and Artist
 * class
 * @author mikhailpastushkov
 *
 */
abstract class Person {

    private int id;
    private String fname;   // First name
    private String lname;   // Last name
    private int idAddress;  // id Address 
    private String mobile;	// Mobile phone number
    private String phone;	// Land phone number
    private String location; // Location (City)
    private String email;    // Email of person
    private String photo;    // Photo of person
    
    
    // Gettings and Settingd
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	
	
	
	
}
