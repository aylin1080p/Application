package com.aylingunes.application;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
      // diziler/arrays

  String[] myStringArray = new String[3]; // mystringarray diye string tipli bir dizi oluştur ve 3 eleman alsın
  // diziye eleman atama
  myStringArray [0] = "James";
  myStringArray [1] = "Lars";
  myStringArray [2] = "kirk";
        System.out.println(myStringArray[1]);
        // webden veri çekerken sıralı dizi halinde çağırma yapacağız, sonrasında
        int [] myIntegerArray = new int[3]; // 3 eleman tutan bir int dizisi oluşturuldu
        myIntegerArray[0]= 50 ;
        myIntegerArray[1]= 60 ;
        myIntegerArray[2]= 70 ;
/// array index out of bounds, sınır dışında bir elemana işlem yapılmamalı
        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8}; // belirsiz sayıda başlamalarda
        System.out.println(myNumberArray[3]); //4 yazdırmalı

    // list --> daha esnek kayıt toplama amaçlar
        ArrayList<String> myMusicians = new ArrayList<String>() ;
        myMusicians.add("JAmes");
        myMusicians.add("lars");
        myMusicians.add(1,"kirk"); // daha öne ekleme yaparken add seçeneklerini kullan
        System.out.println( myMusicians.get(0));

        //set--> bir kez aynı elemandan ekleme yapılabiliyor
        HashSet<String> mySet = new HashSet<>(); // listeyle kullanımı aynı
        mySet.add ("james");
        mySet.add("james");
        System.out.println(mySet.size()); // 1 döndürdü 2.aynı ekleme yapılmadı

  //HashMap --> anahtar kelime ve değer eşleşmesi amaçlanır, indeks yerine anahtarı sen belirle
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name","James");
        myHashMap.put("instrument", "Guitar");
        System.out.println(myHashMap.get("name")); // james yazdırıyor
        System.out.println(myHashMap.get("instrument"));

HashMap<String,Integer> mySecondMap = new HashMap<>(); // int değil sınıf adı olarak Integer demelisin-->hata verir
mySecondMap.put("run",100);
mySecondMap.put("basketball",200);
        System.out.println(mySecondMap.get("run"));






    // Arraysclass end
    }


}
