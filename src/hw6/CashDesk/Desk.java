package hw6.CashDesk;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Desk{
    PriorityQueue<Customer> queue = new PriorityQueue<>();

    void addCustomer(Customer customer){
        queue.add(customer);
        System.out.println("Customer is added");
    }

    void newCustomer(){
        queue.peek();
        System.out.println("Customer is come");
    }

    void layOutProducts(Customer customer){
        System.out.print("I want to buy: ");
        ArrayList<Product> list = customer.getList();
        for (Product l : list) {
            System.out.print(l.getName() + " ");
        }
        System.out.println();
    }

    void sum(Customer customer) {
        double sum = 0;
        ArrayList<Product> list = customer.getList();
        for (Product l : list) {
            sum += l.getPrice();
        }
        System.out.println(sum);
    }

    void deleteCustomer(){
        Customer customer = queue.remove();
        System.out.println("Customer is gone");
    }
}