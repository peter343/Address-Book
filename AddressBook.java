import java.util.Arrays;

/**
 *CS 180 - AddressBook - Lab07
 *
 * Creates an address book program
 *
 * @author Andrew Peterson, peter343@purdue.edu
 * @version 10.7.15
 */
public class AddressBook {
    private int totalContacts;    // The total number of Contacts currently in this AddressBook
    private int maxContacts;      // The maximum number of Contacts this AddressBook can hold
    private Contact[] contacts;   // The array that holds the Contacts of this AddressBook
    private int index;            // Stores the location in the array where a contact of the same name was found

    public AddressBook() {
        totalContacts = 0;
        maxContacts = 10;
        contacts = new Contact[maxContacts];
    }

    public boolean addContact(Contact contact){
        if(totalContacts == maxContacts){
            contacts = Arrays.copyOf(contacts , maxContacts *= 2);
        }
        if(!contains(contact)) {
            contacts[totalContacts] = contact;
            totalContacts++;
            return true;
        }
        else if(contains(contact)){
            if(contact.getNumber() != 0) {
                contacts[index].setNumber(contact.getNumber());
                if(contact.getAddress() != null)
                    contacts[index].setAddress(contact.getAddress());
                return false;
            }
        }


        return false;

    }
    public boolean removeContact(Contact contact){
        if(contains(contact)){
            for (int i = 0; i < contacts.length; i++) {
                if(contacts[i].equals(contact)){
                    contacts[i] = null;
                    totalContacts--;
                    for (int j = i; j < contacts.length - 1; j++) {
                        contacts[j] = contacts[j+1];
                    }
                    return true;
                }
            }
        }
        return false;
    }
    public Contact getContactByName(String name){
        for (int i = 0; i < contacts.length; i++) {

            if(contacts[i].getName().equals(name))
                return contacts[i];
        }
        return null;

    }
    public boolean contains(Contact contact){
        int count = 0;
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] == null) {
                count++;

            }

            else if(contacts[i].getName().equals(contact.getName())) {
                index = i;
                return true;
            }
        }
       if(count == maxContacts - 1)
            return false;
        return false;
    }
    public void printAddressBook() {

        for (int i = 0; i < this.totalContacts; i++) {

            if(contacts[i] == null) {
                continue;
            }
            else {
            
                System.out.printf("Name: %s%n", this.contacts[i].getName());
                System.out.printf("Number: %d%n", this.contacts[i].getNumber());
                System.out.printf("Address: %s%n%n", this.contacts[i].getAddress());
            }
        }
    }

}
