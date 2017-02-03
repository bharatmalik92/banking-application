package com.dsdfsd;

public class Main {

    public static void main(String[] args) {
bank bank =new bank("rideau street");
        bank.addbranch("orleans");
        bank.addbranch("baseline");
        bank.addcustomer("orleans","bharat",10.23);
        bank.addcustomer("baseline","kanvar",15.90);
        bank.addtranscation("baseline","kanvar",22.2);
        bank.listofcustomer("orleans",false);

        bank.addcustomer("orleans","rahul",11.4);
        bank.addcustomer("orleans","rahuasdl",11.2);
        bank.addcustomer("orleans","rahasdul",11.1);
        bank.listofcustomer("orleans",false);
        bank.listofcustomer("orleans",true);


    }
}
