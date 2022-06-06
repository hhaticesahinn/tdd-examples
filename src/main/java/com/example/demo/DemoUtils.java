package com.example.demo;

import java.util.List;

public class DemoUtils {

    private String academy = "deneme2";
    private  String academyDuplicate = academy;
    private List<String> academyList = List.of("ha","ti","ce");

    public String[] getAlfabeninIlkHarfleri() {
        return alfabeninIlkHarfleri;
    }

    public void setAlfabeninIlkHarfleri(String[] alfabeninIlkHarfleri) {
        this.alfabeninIlkHarfleri = alfabeninIlkHarfleri;
    }

    private  String[] alfabeninIlkHarfleri = {"A","B","C"};

    public int add(int x, int y) {
        return x+y;
    }

    public Object checkNull(String val) {

       if(val == null)
           return null;
       return  val;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getAcademyDuplicate() {
        return academyDuplicate;
    }

    public void setAcademyDuplicate(String academyDuplicate) {
        this.academyDuplicate = academyDuplicate;
    }

    public boolean isGreater(int n1, int n2) {

        if(n1> n2)
            return true;
        return  false;
    }

    public List<String> getAcademyList() {
        return academyList;
    }

    public void setAcademyList(List<String> academyList) {
        this.academyList = academyList;
    }

    public String throwException(int i) throws Exception {
        if(i < 0)
            throw new Exception("Girilen sayı sıfırdan küçük olamaz");
        return "Girilen değer sıfırdan küçük ya da eşit";
    }

    public void timeOutFunc() throws  InterruptedException {
        System.out.println("Sleepe başlıyorum");
        Thread.sleep(2500);
        System.out.println("Sleep Bitti");
    }
}
