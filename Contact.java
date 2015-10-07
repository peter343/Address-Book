/**
 *CS 180 - Contact - Lab07
 *
 * Defines the contact object
 *
 * @author Andrew Peterson, peter343@purdue.edu
 * @version 10.7.15
 */
public class Contact {

    private String name;//The name of the contact
    private long number; // the number of the contact
    private String address; //the address of the user

    public Contact(String name) {
        //this.name = name;
        //this(name, 0);
        this(name, 0, null);
    }
    public Contact(String name, long number){
            //this.name = name;
            //this.number = number;
        this(name, number, null);
    }

    public Contact(String name, long number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean equals(Contact s){

        if(this.name.equals(s.getName())){
            return true;
        }
        else return false;
    }
}
