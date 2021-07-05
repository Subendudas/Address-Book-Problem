package com.addressbook;

public class Contact {
	////Initialize all the parameters
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String phone;
		private String email;
		// call by Constructor
		public Contact(String firstName, String lastName, String Address, String city, String state, String zip, String phone,
				String email) 
		{
			// Using Super key
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phone = phone;
			this.email = email;
		}
		public String getFirstName() {
			// TODO Auto-generated method stub
			return firstName;
		}
		
}
