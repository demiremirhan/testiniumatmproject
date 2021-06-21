package com.atmtestinium.course.customers;

public class PersonalBanking extends CustomerBanking {

    private String evAdresi;

    public PersonalBanking(String tcKimlikNo, String adSoyad,String evAdresi,String musteriNumarasi, float hesapBakiyesi) {
        super(tcKimlikNo, adSoyad,musteriNumarasi ,hesapBakiyesi );
        this.evAdresi=evAdresi;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Ev Adresi : " + getEvAdresi());
    }


    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
}
