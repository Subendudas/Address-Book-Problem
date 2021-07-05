package com.addressbook;
import java.util.Scanner;
public class Address_Book
{
	public static void main(String[] args) {
		Address_Book List = new Address_Book();
		List.Entry();
		List.readEntry();
		
	}
    Scanner sc = new Scanner(System.in);
        private String first;
        private String last;
        private String address;
        private String email;
        private String city;
        private String state;
        private String phone;
        private int zip;
       
        void Entry()
        {
            first = "Subendu";
            last = "Das";
            address = "Address";
            city = "Bokaro";
            state = "Jharkhand";
            zip = 123456;
            phone = "+91 9999999999";
            email = "abc@mail.com";
            
        }
        public void readEntry()
        {
            System.out.println("First Name: "+first );
            System.out.println("Last Name: "+last );
            System.out.println("Address: "+address );
            System.out.println("City: "+city );
            System.out.println("State: "+state );
            System.out.println("Zip Code: "+zip );
            System.out.println("Phone Number: "+phone );
            System.out.println("Email: "+email );
        }
    }
