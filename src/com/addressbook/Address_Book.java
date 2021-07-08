package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class Address_Book extends Contact 
{
	Scanner sc = new Scanner(System.in);
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public Address_Book(String firstname, String lastname, String address, String city, String state, String zip,
			String phone, String email) {
		super(firstname, lastname, address, city, state, zip, phone, email);
	}
	public Address_Book() {
		super();
	}
	public void insertContact(Address_Book contactDetailObject) {
		contactList.add(contactDetailObject);
	}
	
	public void editContact(String nameToEdit) {
		for (Contact editContact : contactList) {
			if (editContact.getFirstName().equals(nameToEdit)) {
				System.out.println("Edit Firstname : ");
				String firstname = sc.nextLine();
				editContact.setFirstName(firstname);
				System.out.println("Edit Lastname : ");
				String lastname = sc.nextLine();
				editContact.setLastName(lastname);
				System.out.println("Edit Address : ");
				String address = sc.nextLine();
				editContact.setAddress(address);
				System.out.println("Edit City : ");
				String city = sc.nextLine();
				editContact.setCity(city);
				System.out.println("Edit State : ");
				String state = sc.nextLine();
				editContact.setState(state);
				System.out.println("Edit Zip : ");
				String zip = sc.nextLine();
				editContact.setZip(zip);
				System.out.println("Edit PhoneNumber : ");
				String phonenumber = sc.nextLine();
				sc.nextLine();
				editContact.setPhoneNo(phonenumber);
				System.out.println("Edit Email : ");
				String email = sc.nextLine();
				editContact.setEmail(email);
			}
		}
	}
	
	public void delete(String nameToDelete) {
		int i = 0;
		for (i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).firstName.equals(nameToDelete)) {
				contactList.remove(i);
				System.out.println("Contact is Deleted");
			} else {
				System.out.println("Contact not found!");
			}
		}
	}
	
	public void printContactDetails() {
		for (Contact getInfo : contactList) {
			System.out.println("Firstname : " + getInfo.getFirstName());
			System.out.println("Lastname : " + getInfo.getLastName());
			System.out.println("Address : " + getInfo.getAddress());
			System.out.println("City : " + getInfo.getCity());
			System.out.println("State : " + getInfo.getState());
			System.out.println("Zip : " + getInfo.getZip());
			System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
			System.out.println("Email : " + getInfo.getEmail());
		}
	}
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		Address_Book Obj = new Address_Book();
		String choice = "y";
		System.out.println("Welcome to Address Book Program!");
		while (true) {
			System.out.println("Enter 1 to add, 2 to edit 3 to delete 4 to view 5 to exit");
			System.out.println("Enter choice : ");
			int switchChoice = scan.nextInt();
			scan.nextLine();
			
			switch (switchChoice) {
			case 1:
				while (choice.equals("y")) {
					System.out.println("Firstname : ");
					String firstname = scan.nextLine();
					System.out.println("Lastname : ");
					String lastname = scan.nextLine();
					System.out.println("Address : ");
					String address = scan.nextLine();
					System.out.println("City : ");
					String city = scan.nextLine();
					System.out.println("State : ");
					String state = scan.nextLine();
					System.out.println("Zip : ");
					String zip = scan.nextLine();
					System.out.println("PhoneNumber : ");
					String phonenumber = scan.nextLine();
					System.out.println("Email : ");
					scan.nextLine();
					String email = scan.nextLine();
					System.out.println("Do you want add more contact : ");
					choice = scan.nextLine();

					Address_Book contact = new Address_Book(firstname, lastname, address, city, state, zip, phonenumber,
							email);
					Obj.insertContact(contact);
				}
				break;
			case 2:
				System.out.println("Enter name of contact to Edit : ");
				String nameToEdit = scan.nextLine();
				Obj.editContact(nameToEdit);
				break;
			case 3:
				System.out.println("Enter name of contact to Delete : ");
				String deleteCon = scan.nextLine();
				Obj.delete(deleteCon);
				break;
			case 4:
				System.out.println("Contact List : ");
				Obj.printContactDetails();
				break;
			default:
				System.exit(0);
				scan.close();
			}
		}

	}

}