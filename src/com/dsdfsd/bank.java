package com.dsdfsd;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by bharatmalik on 2017-01-24.
 */
public class bank {
    private String bankname;
  private AbstractList<branch> branches;

    public bank(String bankname) {
        this.bankname = bankname;
        this.branches = new ArrayList<branch>();
    }

    public boolean addbranch(String branchname){
        if(findbranch(branchname)==null){
            this.branches.add(new branch(branchname));
            return true;
        }
        return false;

    }

    public boolean addcustomer(String branchname,String customername,double intialamount){
      branch branch=findbranch(branchname);
        if(branch!=null){
            return branch.newcustomer(customername,intialamount);
        }
        return false;
    }

    public boolean addtranscation(String branchname,String customername,double amount){
        branch branch=findbranch(branchname);
        if(branch!=null){
            return branch.addtransaction(customername,amount);
        }
        return false;
    }

    private branch findbranch(String branchname){
        for(int i=0;i<this.branches.size();i++){
            branch checkbranch=this.branches.get(i);
            if(checkbranch.getName().equals(branchname))
                return checkbranch;
        }
        return null;
    }


    public  boolean listofcustomer(String branchname,boolean showtranscation){
        branch branch=findbranch(branchname);
        if(branch!=null){
            System.out.println("Branche details requested for " + branch.getName());
            ArrayList<customer> branchcustomers=branch.getCustomers();
            for(int i=0;i<branchcustomers.size();i++){
                customer branchcustomer=branchcustomers.get(i);
                System.out.println("customer " + branchcustomer.getName());
                if(showtranscation){
                    System.out.println("Customer transactions");

                    ArrayList<Double> transactions=branchcustomer.getTranscations();
                    for( int j=0;j<transactions.size();j++){
                        System.out.println("amount is "  + transactions.get(j));
                    }
                }


            }

        }
return false;

    }
}
