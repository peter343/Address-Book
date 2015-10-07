import java.util.ArrayList;

/**
 * Created by Andrew Peterson on 10/7/2015.
 */
public class AddressBook {
    private int totalContacts;    // The total number of Contacts currently in this AddressBook
    private int maxContacts;      // The maximum number of Contacts this AddressBook can hold
    private Contact[] contacts;   // The array that holds the Contacts of this AddressBook


    public AddressBook() {
        totalContacts = 0;
        maxContacts = 10;
        contacts = new ArrayList<Contact>[];
    }

    public boolean addContact(Contact contact){
        int lastIndex = contacts.length - 1;
        if(contains(contact)){
            if(contact.getNumber() != 0 && contact.getAddress() != null){
                contact.setNumber(contact.getNumber());
                contact.setAddress(contact.getAddress());
                return false;
            }
        }
        if(totalContacts == maxContacts){
            maxContacts *= 2;
        }
        contacts[lastIndex] = new Contact(contact.getName(), contact.getNumber(), contact.getAddress());
        return true;

    }
    public boolean removeContact(Contact contact){
        //TODO Implement
        if(contains(contact)){
            contact.getName();
        }
    }
    public Contact getContactByName(String name){

    }
    public boolean contains(Contact contact){
        for (int i = 0; i < contacts.length; i++) {

        }
        return false; //TODO
    }
    public void printAddressBook() {
        for (int i = 0; i < this.totalContacts; i++) {
            System.out.printf("Name: %s%n", this.contacts[i].getName());
            System.out.printf("Number: %d%n", this.contacts[i].getNumber());
            System.out.printf("Address: %s%n%n", this.contacts[i].getAddress());
        }
    }

}
