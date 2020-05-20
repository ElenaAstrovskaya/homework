package hw6.CashDesk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer implements Comparable<Customer>{

    ArrayList<Product> list = new ArrayList<>();

    public Customer(ArrayList<Product> list) {
        this.list = list;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }

}