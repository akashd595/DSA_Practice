package com.dsa;

import java.util.Scanner;

public class NeedyPeople {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money to donate ");
        int money = sc.nextInt();
        Integer numberOfPeople = canDonate( money );
        System.out.println("number of people we can donate for Rs."+money+" are "+numberOfPeople);
    }
    public static Integer canDonate(Integer money){
        int n = 1;
        boolean flag = true;
        while( flag ){
            if( ( ( n * ( n + 1 ) * ( ( 2 * n ) + 1 ) ) / 6 ) > money){
                return ( n - 1 );
            } else {
                n++;
            }
        }
        return 0;
    }

}
