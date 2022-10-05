package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Customer customer1 = new Customer("Jack","LarsKæreste","JackboiIron");
        Customer customer2 = new Customer("Oliver","Skaldepande","Madsengaming");
        Customer customer3 = new Customer("Sander","Stornæse","Ali");
        Customer customer4 = new Customer("Tobias","Tattoodværg","Sypagangan");
        Customer customer5 = new Customer("Marcus","Håramagergut","GuffegivendeGUF");
        Customer customer6 = new Customer("Sebastian","Ungfyr","TahmKench");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();

    }

    public static void printCustomers(){
        for (Customer r: customers) {
            System.out.println(customers);
        }
    }

}
