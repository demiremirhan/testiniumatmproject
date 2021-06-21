package com.atmtestinium.course.business.concretes;

import com.atmtestinium.course.business.abstracts.CustomerService;

import java.util.Scanner;

public class CustomerManager implements CustomerService {

    @Override
    public Scanner LoginCustomerNumber() {
        System.out.println("Müşteri Numarasını Giriniz : ");
        Scanner custNumber = new Scanner(System.in);
        return custNumber;
    }

}
