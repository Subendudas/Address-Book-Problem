package com.addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address_Book 
{
	static Scanner sc = new Scanner(System.in);
	static List<Contact> list = new ArrayList<>();
	
	public static void addContact() 
	{
				System.out.println("Edit Firstname : ");
				String firstname = sc.nextLine();
				
				System.out.println("Edit Lastname : ");
				String lastname = sc.nextLine();
				
				System.out.println("Edit Address : ");
				String address = sc.nextLine();
				
				System.out.println("Edit City : ");
				String city = sc.nextLine();
				
				System.out.println("Edit State : ");
				String state = sc.nextLine();
				
				System.out.println("Edit Zip : ");
				String zip = sc.nextLine();
				
				System.out.println("Edit PhoneNumber : ");
				String phone = sc.nextLine();
			
				
				System.out.println("Edit Email : ");
				String email = sc.nextLine();
				Contact obj = new Contact(firstname, lastname, address, city, state, zip, phone, email);
				list.add(obj);
	}
	public static void addPersons() 
	{
		System.out.println("Enter number of persons you want to add in the Address book : ");
		int noOfPersons = sc.nextInt();
		int count = 1;
		while (count <= noOfPersons) 
		{
			addContact();
			count++;
		}
	}
				
	
	public static void delete() 
	{
		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) 
			{
				list.remove(i);
	}
		else
			System.out.println("No data found");
		}
	}
	
	
	public static void main(String args[]) 
	{
		//Address_Book obj = new Address_Book();
		System.out.println("WELCOME TO ADDRESS BOOK PROBLEM");
		addPersons();
		System.out.println(list); // printing list
	}
}