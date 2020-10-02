package com.aylingunes.application;

public class Statements {
    public static void main(String[] args) {
    int x= 5 ;
        System.out.println(x);
        x = x +1 ;
        System.out.println(x);
        x++;
        System.out.println(x); //x--; ile 1 azalır
        x = 30;
        int y = 4 ;
        System.out.println(x>y); // boolean cevap verir
        y = 30 ;
        System.out.println(x>y); // false verir
        System.out.println(x>=y); // true verir ikisi de eşitti
        System.out.println(x==y); // eşit mi der true verir
        System.out.println(x!=y); // eşit değil mi der false verir
   // end or işlemleri &&  ||
        x = 30;
        y= 30;
        int z = 5;
        System.out.println(x<y);
        System.out.println(x<y && y<z); // her ikisi de doğruysa doğru döndürür. biri sağlanmazsa false olur
        // || or için her iki sorgudan biri sağlanırsa true verir. basic mantık
        // if statements koşullu ifadeler
        if (x<y){
            System.out.println("y is bigger");
            // x=30, güncellemesi yaparsan buradan dönüt alamazsın
        } else if (y<x){
            System.out.println("x is bigger");
        } else if (x==y){           // bunun yerine sadece else ekle. olasılıklar bittiği için
            System.out.println("x=y"); // else dersen hiç bir koşul sağlanmazsa bunu yazdır der
        }

       //switch kontrolleri
        int day = 2;
        String dayString = "";
      /*  if (day ==1){
            dayString = "Monday";

        }else if (day ==2){
            dayString = "Tuesday";
        } else if( day ==3){
            dayString="Wednesday";
        } else { // hiç biri sağlanmazsa pazara ata
            dayString="sunday";
        }
        System.out.println(dayString);
        */



        switch(day) {
            case 1:
                dayString= "monday";
                break ; // kır
            case 2:
                dayString= "Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            default:
                dayString="sunday";
        }
        System.out.println(dayString);





    }
}
