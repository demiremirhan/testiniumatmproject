package com.atmtestinium.course.business.abstracts;

import com.atmtestinium.course.customers.CustomerBanking;

public interface CashService {

    public float insertCash(CustomerBanking customerBanking);
    public void withDrawMoney(CustomerBanking customerBanking);
    public void depositMoney(CustomerBanking customerBanking);
    public void selectFunc(CustomerBanking customerBanking);

}
