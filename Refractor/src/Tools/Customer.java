package Tools;

public class Customer {
    String name;
    String address;

    public Customer(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Name: " + name + "Address: " + address;
    }
}
