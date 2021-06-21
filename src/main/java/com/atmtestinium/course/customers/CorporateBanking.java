package com.atmtestinium.course.customers;

public class CorporateBanking extends  CustomerBanking {


    private String sirketAdi;

    public CorporateBanking(String tcKimlikNo, String adSoyad, String musteriNumarasi,String sirketAdi, float hesapBakiyesi) {
        super(tcKimlikNo, adSoyad, musteriNumarasi, hesapBakiyesi);
        this.sirketAdi= sirketAdi;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Şirket Adı : " + getSirketAdi());
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }
}
