package com.aylingunes.application;




public class Variables { // sınıf adı değiştirmek için Main üzerine sağ tık-->Refactor-->Rename
    public static void main(String[] args) { //açık statik döndürme yapmayan
    // System.out.println("hello java");// printf, sout enter ile aynı sonuç
        int age = 20 ;
        System.out.println(age*2); // kod çalışıyor mu testi, işlemi alıyor mu diye emülatöre bağlanmadan ara yüzsü
int x = 5 ;
int y = 11 ;
System.out.println(y/x);
//double, float tanımlamalarında küsüratlı işlem yapılabilir
        double z=5; double a=11;
        System.out.println(a/z);

   double pi=3.1415;
   int r= 5;
   double cevre = 2*pi*r;
        System.out.println(cevre);

     // sözce değişkenleri
   String name = "James" ; // name= 40 yamazsın tanımlamalara ve değerlere dikkat edelim
   String surname = "Hetfield";
        System.out.println(name);
        System.out.println(surname);
    String fullname = name+" "+surname;
        System.out.println(fullname);

     boolean isALive = true; // karakter ölü mü değil mi diye oyunda bir belirleme
     isALive = false;
        System.out.println(isALive);

        //final

      int myInteger = 5;
        System.out.println("myInteger ilk deger : "+ myInteger);
      myInteger = 4; // değer değiştirme
        System.out.println("myInteger degisti : " + myInteger);

        // final değişkenlerinin değeri değişmez, sabit kabul edilir
     final int sabit = 5;
     // sonraki aşamalarda yeni atamaları kabul etmeyecektir.



    }

//test aşamasında run with coverage şeklinde dene
// grandle dosyası silip yeniden yükleme yap

}
