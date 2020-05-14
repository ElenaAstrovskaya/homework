package hw6.CashDesk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> list1 = new ArrayList<>();
        list1.add(new Product("Milk", 1.6));
        list1.add(new Product("Bread", 1.2));
        list1.add(new Product("Eggs", 2.3));

        ArrayList<Product> list2 = new ArrayList<>();
        list2.add(new Product("Sweets", 4.1));
        list2.add(new Product("Wine", 25));
        list2.add(new Product("Condoms", 12));

        ArrayList<Product> list3 = new ArrayList<>();
        list3.add(new Product("Antiseptic", 4.5));
        list3.add(new Product("Toilet paper", 3.2));
        list3.add(new Product("Buckwheat", 5.0));

        Customer customer1 = new Customer(list1);
        Customer customer2 = new Customer(list2);
        Customer customer3 = new Customer(list3);;

        Desk desk = new Desk();
        desk.addCustomer(customer1);
        desk.newCustomer();
        desk.layOutProducts(customer1);
        System.out.print("Your amount is ");
        desk.sum(customer1);
        desk.deleteCustomer();
        System.out.println();

        desk.addCustomer(customer2);
        desk.newCustomer();
        desk.layOutProducts(customer2);
        System.out.print("Your amount is ");
        desk.sum(customer2);
        desk.deleteCustomer();
        System.out.println();

        desk.addCustomer(customer3);
        desk.newCustomer();
        desk.layOutProducts(customer3);
        System.out.print("Your amount is ");
        desk.sum(customer3);
        desk.deleteCustomer();
    }
}