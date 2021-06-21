package com.atmtestinium.course.customers;

public class CustomerBanking {

    private String tcKimlikNo;
    private String adSoyad;
    private float hesapBakiyesi;
    private String musteriNumarasi;

    public CustomerBanking(String tcKimlikNo, String adSoyad,String musteriNumarasi, float hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNumarasi=musteriNumarasi;
    }


    public void getInfo(){
        System.out.println("Ad Soyad : "+ getAdSoyad()+"\n"+ "Tc No : " + getTcKimlikNo()+"\n"+
                            "Hesap Bakiyesi : " +getHesapBakiyesi());
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(String musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }
}
