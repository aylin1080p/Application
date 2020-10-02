package com.aylingunes.application;

public class Loops {
    public static void main (String[] args) {
        // for loop
int [] myNumbers = {12,15,18,21,24};
// int x = myNumbers[0]; --->
// System.out.println(x); // bu işlemi dizideki tüm değerler için yapacaksak loop kullanırız

for (int i=0; i<myNumbers.length; i++ ) {
    // sıfırdan başlayıp dizi boyutuna ulaşana kadar artarak devam et

    int x = myNumbers[i] / 3 * 5;
    System.out.println(x);
}
// aynı anlamda kısa kullanım aşağıda
for (int number : myNumbers) { // i yerine number dedik
    System.out.println(number); // işlemleri number/3*5 gibi belitebilirsin
}

for (int a =0; a<10; a++){ // 0dan 10a kadar 10laçarparak yazar
    int b = a*10;
    System.out.println(b);
}
//while loops

        int j = 0;
while (j<10){
    System.out.println( "test " +j);
    j++;
}



    }
}
