package hw6.CashDesk;

import java.util.ArrayList;

public class Customer {

    ArrayList<Product> list = new ArrayList<>();

    public Customer(ArrayList<Product> list) {
        this.list = list;
    }

    public ArrayList<Product> getList() {
        return list;
    }
}