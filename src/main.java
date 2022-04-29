import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		List<Address> addressBook = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while (true) {
			mainScreen();
			int selector = input.nextInt();
			switch(selector) {
				case 1: 
					System.out.println("Please enter the following information: ");
					System.out.println("First name: ");
					input.nextLine();
					String firstName = input.nextLine();
					System.out.println("Last name: ");
					String lastName = input.nextLine();
					System.out.println("Phone Number: ");
					String phoneNum = input.nextLine();
					System.out.println("Email Address: ");
					String email = input.nextLine();
					addressBook.add(addToAddressBook(firstName, lastName, phoneNum, email));
					break;
				case 2: System.out.println("Enter the email of the entry to be deleted: ");
					input.nextLine();
					String emailSearch = input.nextLine();
					for(Address address : addressBook){
						if (address.getEmail().equals(emailSearch)) {
							addressBook.remove(address);
							System.out.println("Deleted the following entry: \n" + address.toString());
							break;
						}
						else {
							System.out.println("Entry not found.\n");
						}
					}					
					break;
				case 3: 
					boolean flag = true;
					while (flag) {
						System.out.println("Enter your Search Type: \n1) First Name\n2) Last Name\n3) Phone Number\n4) Email\n");
						int searchSelector = input.nextInt();
						switch(searchSelector) {
							case 1: System.out.println("Enter First Name for Search: ");
								input.nextLine();
								ArrayList<Address> matchesFn = new ArrayList<Address>();
								String firstNameSearch = input.nextLine();
								for(Address address : addressBook){
										if (address.getFirstName().equals(firstNameSearch)) {
											matchesFn.add(address);
										}
								}
								if (matchesFn.size() > 0) {
									System.out.println("Found the Following: \n" + matchesFn.toString());
								}										
								else {
									System.out.println("Entries not found.\n");
								}
								flag = false;
								break;
							case 2: System.out.println("Enter Last Name for Search: ");
								input.nextLine();
								ArrayList<Address> matchesLn = new ArrayList<Address>();
								String lastNameSearch = input.nextLine();
								for(Address address : addressBook){
									if (address.getLastName().equals(lastNameSearch)) {
										matchesLn.add(address);
									}
								}
								if (matchesLn.size() > 0) {
									System.out.println("Found the Following: \n" + matchesLn.toString());
								}
								else {
									System.out.println("Entries not found.\n");
								}
								flag = false;
								break;
							case 3: System.out.println("Enter Phone Number for Search: ");
									input.nextLine();
									ArrayList<Address> matchesPn = new ArrayList<Address>();
									String phoneNumSearch = input.nextLine();
									for(Address address : addressBook){
										if (address.getPhoneNum().equals(phoneNumSearch)) {
											matchesPn.add(address);
										}
									}
									if (matchesPn.size() > 0) {
										System.out.println("Found the Following: \n" + matchesPn.toString());
									}
									else {
										System.out.println("Entries not found.\n");
									}
									flag = false;
									break;
							case 4: System.out.println("Enter Email for Search: ");
									input.nextLine();
									ArrayList<Address> matchesEm = new ArrayList<Address>();
									String emailQSearch = input.nextLine();
									for(Address address : addressBook){
										if (address.getEmail().equals(emailQSearch)) {
											matchesEm.add(address);
										}
									}
									if (matchesEm.size() > 0) {
										System.out.println("Found the Following: \n" + matchesEm.toString());
									}
									else {
										System.out.println("Entries not found.\n");
									}
									flag = false;
									break;
							default: System.out.println("Invalid option.\n"); 
								break;
						}
					}
					break;
				case 4: System.out.println(addressBook.toString());
					break;
				case 5: addressBook.removeAll(addressBook);
					break;
				case 6: input.close();
					System.exit(0);
					break;
				default: 
					System.out.println("Invalid Response.");
					mainScreen();
					break;
			}
		}
	}
	
	public static void mainScreen() {
		System.out.println("\n1) Add an Entry \n2) Remove an Entry \n3) Search for a specific Entry \n4) Print Address Book \n5) Delete Book \n6) Quit"
				+ "\n\nPlease select what you'd like to do with the database: ");
	}
	
	public static Address addToAddressBook(String fn, String ln, String pn, String em) {
		Address newEntry = new Address(fn, ln, pn, em);
		return newEntry;
	}

}
