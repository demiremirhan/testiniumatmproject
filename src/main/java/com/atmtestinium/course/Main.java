package com.atmtestinium.course;

import com.atmtestinium.course.business.concretes.CashManager;
import com.atmtestinium.course.business.concretes.CustomerManager;
import com.atmtestinium.course.customers.CorporateBanking;
import com.atmtestinium.course.customers.CustomerBanking;
import com.atmtestinium.course.customers.PersonalBanking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        CustomerBanking customerBanking;
        Map<String, CustomerBanking> customerList = new HashMap<>();

        customerList.put("01", new PersonalBanking(
                "12345678912","Test edelim","antalya",
                "01",123.45f));

        customerList.put("02",new PersonalBanking(
                "45678913254","bu da test edilsin","dünya",
                "02",25.45f));

        customerList.put("03",new CorporateBanking(
                "98765432114","Intellij Idea",
                "03","Testinium",456.78f));

        customerList.put("04",new CorporateBanking(
                "35715945615","Testinium",
                "04","Loadium",7898.45f));

        customerList.put("05", new PersonalBanking(
                "15975312315","Emirhan Demir","Balıkesir",
                "05",111.11f));

        CustomerManager customerManager = new CustomerManager();
        String custNo = customerManager.LoginCustomerNumber().nextLine();
        if (customerList.containsKey(custNo)){
            customerList.get(custNo).getInfo();

        }else {
            System.out.println(" User not found");
        }

        CashManager cashManager = new CashManager();
        cashManager.selectFunc(customerList.get(custNo));

    }
}
