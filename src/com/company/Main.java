package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(canIGoOutside(11, 33));
        System.out.println(canIGoOutside(45, 23));
        System.out.println(canIGoOutside(43, 29));
        System.out.println(canIGoOutside(46, 59));

        System.out.println("\n"+canIGoOutside(geniraitRandomInt(), geniraitRandomInt()));
    }

    public static String canIGoOutside (int age,int temperature){
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return "Можно идти гулять";
        } else if( age < 20 && temperature >0 && temperature < 28){
            return "Можно идти гулять";
        }else if (age < 45 && temperature >-10 && temperature < 25){
            return "Можно идти гулять";
        }else  return "Остовайтесь дома";
    }

     public static int geniraitRandomInt(){
         Random random = new Random();
         return random.nextInt(100);
     }
}
