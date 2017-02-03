package com.dsdfsd;

import java.util.ArrayList;

/**
 * Created by bharatmalik on 2017-01-24.
 */
public class branch {
    private String name;
    private ArrayList<customer> customers;

    public branch(String name) {
        this.name = name;
        this.customers = new ArrayList<customer>();
    }


    public boolean newcustomer(String customername,double intialamount){
        if (findcustomer(customername) == null)
                 {this.customers.add(new customer(customername,intialamount));
                     return true;

        }
        return false;

    }
    public boolean addtransaction(String customername,double amount){
        customer existingcustomer=findcustomer(customername);
        if(existingcustomer!=null){
            existingcustomer.addtransaction(amount);
            return true;

        }
        return false;
    }

    private customer findcustomer(String customername){
        for(int i=0;i<this.customers.size();i++){
            customer checkcustomer=this.customers.get(i);
            if(checkcustomer.getName().equals(customername))
                return checkcustomer;
        }
        return null;
    }



    public String getName() {
        return name;
    }

    public ArrayList<customer> getCustomers() {
        return customers;
    }
}
