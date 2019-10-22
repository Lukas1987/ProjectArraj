package sk.itsovy.mati.arraj;

import java.util.Random;

public class MyArraj {
    public static void test1(){
        int [] arr = new int[7];
        int i;
        for (i = 0; i<=6; i++){
        arr[i]=i+1;
    }
    for (i=6; i>=0; i--){
        System.out.println(arr[i]+ " ");
    }
}
public static void test2(){
        int[] arr=new int[10];
        int i;
        Random rnd=new Random();
    int number = 0;

    for (i=0; i<=9; i++){
        number=random.nextInt(90)+10;
        arr[i]=number;
    }

    for (i=0; i<=9; i++){
        System.out.println(arr[i] + " ");
    }
    System.out.println(" ");

    for (i=9; i>=0; i--){
        System.out.println(arr[i] + " ");
    }
    System.out.println();
    i=0;
    while (i<=9){
        if (arr[i]% 2 == 0){
            System.out.println(arr[i]);
        }
        i++;
    }
    }
}
