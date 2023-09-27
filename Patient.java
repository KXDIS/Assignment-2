
public class Patient {
	
			private String firstName,
			   			   middleName,
			   			   lastName,
			   			   streetAddress, 
			   			   city,
			   			   state,
			   			   emergencyName,
			   			   zipCode,
			   			   personalPhone,
			   			   emergencyPhone;
	/*
	 * @param no argument constructor
	 */
	public Patient(){
			firstName = "";
		   middleName= "";
		   lastName = "";
		   streetAddress = "";
		   city = "";
		   state = "";
		   emergencyName = "";
		   personalPhone = "";
		   emergencyPhone = "";
		   zipCode = "";
		   
	}
	/*
	 * @param firstname, middleName, lastName
	 */
	
	public Patient(String firstName, String middleName,String lastName, 
				   String streetAddress, String city,String zipCode, String state, 
				   String emergencyName,String personalPhone,String emergencyPhone )
			{
		
			super();
		//patient name initialization
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
		
		//patient address information initialization
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		
		//patient emergency contact information initialization
			this.emergencyName = emergencyName;
			this.personalPhone = personalPhone;
			this.emergencyPhone = emergencyPhone;
		}
	
	
	
	
	//Accessors and Mutators for each attribute
	
	public String getfirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getMiddleName() {
				return middleName;
			}
			public void setMiddleName(String middleName) {
				this.middleName = middleName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getStreetAddress() {
				return streetAddress;
			}
			public void setStreetAddress(String streetAddress) {
				this.streetAddress = streetAddress;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public String getEmergencyName() {
				return emergencyName;
			}
			public void setEmergencyName(String emergencyName) {
				this.emergencyName = emergencyName;
			}
			public String getZipCode() {
				return zipCode;
			}
			public void setZipCode(String zipCode) {
				this.zipCode = zipCode;
			}
			public String getPersonalPhone() {
				return personalPhone;
			}
			public void setPersonalPhone(String personalPhone) {
				this.personalPhone = personalPhone;
			}
			public String getEmergencyPhone() {
				return emergencyPhone;
			}
			public void setEmergencyPhone(String emergencyPhone) {
				this.emergencyPhone = emergencyPhone;
			}
	

public String buildFullName() {
	
	String fullName = getfirstName() + " " + getMiddleName() + " " + getLastName();
	return fullName;
}
			
			
			
			
public String buildAddress() {
	
	String emergencyContact =getStreetAddress() +  getCity() + " " + getState() + " " + getZipCode();
	return emergencyContact;
}

public String buildEmergencyContact(){
	
	String emergencyContact = getEmergencyName() + " " + getEmergencyPhone();
	return emergencyContact;
	
}

@Override
public String toString() {
	String fullPatientInfo = "Name :" + buildFullName()
							+ "\nAddress :" + buildAddress() 
							+"\nEmergency Contact: " + buildEmergencyContact();
	
	return fullPatientInfo;
	
}

}
	
