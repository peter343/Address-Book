/**
 * Created by Andrew Peterson on 10/7/2015.
 */
public class Contact {

    private String name;//The name of the contact
    private long number; // the number of the contact
    private String address; //the address of the user

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
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

        if(this.name == ){
            return true;
        }
        else return false;
    }
}
