package hw6.CashDesk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Desk {

    Queue<Customer> queue = new LinkedList<>();

    void addCustomer(Customer customer){
        queue.add(customer);
        System.out.println("Customer is added");
    }

    void newCustomer(){
        queue.peek();
        System.out.println("Customer is come");
    }

    void sum(Customer customer) {
        double sum = 0;
        ArrayList<Product> list;
        list = customer.getList();
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