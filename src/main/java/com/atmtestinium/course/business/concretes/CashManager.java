package com.atmtestinium.course.business.concretes;

import com.atmtestinium.course.business.abstracts.CashService;
import com.atmtestinium.course.customers.CustomerBanking;

import java.util.Scanner;

public class CashManager implements CashService {


    Scanner scan= new Scanner(System.in);
    @Override
    public float insertCash(CustomerBanking customerBanking) {
        while(true){
            try{
                return scan.nextFloat();
            }catch (Exception e){
                scan.next();
                System.out.println("Lütfen bir sayı giriniz!!!");
            }
        }
    }

    @Override
    public void withDrawMoney(CustomerBanking customerBanking) {
        System.out.println("Çekilecek olan tutar : ");
        float cash = insertCash(customerBanking);
        float balance = customerBanking.getHesapBakiyesi();

        if (cash>balance){
            System.out.println("-_-_ Bakiye yetersiz. -_-_");
        }else if (cash<0){
            System.out.println("Geçerli değer giriniz.");
        }else{
            customerBanking.setHesapBakiyesi(balance-cash);
        }
        System.out.println("Güncel bakiye : "+ customerBanking.getHesapBakiyesi());
    }

    @Override
    public void depositMoney(CustomerBanking customerBanking) {
        System.out.println("Para yatırma miktarını giriniz : " );
        float cash = insertCash(customerBanking);
        float balance = customerBanking.getHesapBakiyesi();
        if (cash<0){
            System.out.println("lütfen geçerli değer giriniz!!!");
        }else{
            customerBanking.setHesapBakiyesi(cash+balance);
        }

        System.out.println("Güncel bakiye : " +customerBanking.getHesapBakiyesi());
    }

    @Override
    public void selectFunc(CustomerBanking customerBanking) {
        System.out.println("İşlem Tipi\n" + "--------------\n"+"Para YATIRMA işlemi için 1 basınız.\n"+
                                                                "Para ÇEKME işlemi için 2 basınız. \n");

        String selectedNum = scan.nextLine();

        switch (selectedNum){
            case"1":
                CashManager cashManager1 = new CashManager();
                cashManager1.depositMoney(customerBanking);
                scan.nextLine();
                break;
            case "2":
                CashManager cashManager2 = new CashManager();
                cashManager2.withDrawMoney(customerBanking);
                scan.nextLine();
                break;
            default:
                System.out.println("\n eksik ya da hatalı numara tuşladınız \n");
                break;
        }
    }

}
