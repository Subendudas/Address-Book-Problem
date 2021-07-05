package com.addressbook;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class Address_Book
{
	public static void main(String[] args) {
		Address_Book obj = new Address_Book(); 
	System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
		System.out.println("Create Contact");
		addContact();
		obj.editContact();
	}
	static Scanner sc = new Scanner(System.in);
	static List<Contact> list = new LinkedList<Contact>();
	
	public static void addContact() 
	{
		System.out.print("Enter Firts Name : ");
		String firstName = sc.nextLine();
		System.out.print("Enter your Last Name : ");
		String lastName = sc.nextLine();
		System.out.print("Enter your Address : ");
		String address = sc.nextLine();
		System.out.print("Enter your City : ");
		String city = sc.nextLine();
		System.out.print("Enter your State : ");
		String state = sc.nextLine();
		System.out.print("Enter your Zip code : ");
		String zip = sc.nextLine();
		System.out.print("Enter your PhoneNo : ");
		String phone = sc.nextLine();
		System.out.print("Enter your Email : ");
		String email = sc.nextLine();
		Contact obj = new Contact(firstName, lastName, address, city, state, zip, phone, email);
		list.add(obj);
	}

	public static void editContact() {
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name which you want to edit: ");
		String firstName = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			if (( list.get(i)).getFirstName().equalsIgnoreCase(firstName)) {
				list.remove(i);
				addContact();
				System.out.println("Data Added Successfully.");
			} else {
				System.out.println("No data found in Address Book");
			}
		}
	}
}

