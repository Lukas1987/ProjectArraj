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
        Random rnd=new Random();
        int[] arr=new int[10];
        int number;
        for (int i=0; i<=9; i++){
        number= rnd.nextInt(90)+10;
        arr[i]=number;
            System.out.println(arr[i]+" ");
    }
        System.out.println();
        for (int i=9; i>=0; i--) {
            System.out.println(arr[i]+" ");
    }
    System.out.println(" ");
        for (int i=0; i<=9; i++){
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void test3(){
        Random rnd = new Random();
        int[]arr= new int[12];
        int number;
        double aritAverage=0;
        int min = 100, max=0;
        int secMin = 100, secMax = 0;
        int odd = 0, even = 0;
        System.out.println();
        for(int i = 0; i<=11; i++){
            number = rnd.nextInt(90)+10;
            arr[i]=number;
            System.out.println(arr[i]+ " ");
            aritAverage+=arr[i];
            if (arr[i]%2!=0){
                odd++;
            } else {
                even++;
            }
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max= arr[i];
            }
            for (int i=0; i<arr.length; i++){
                if (secMin>arr[i] && min!=arr[i]){
                secMin=arr[i];
                }
            }
                if (secMax<arr[i] && max!=arr[i]){
                    secMax=arr[i];
                }
            }

            aritAverage/=12;
            System.out.println();
            System.out.println("arit Average: "aritAverage);
            System.out.println("odd numbers: " +odd);
            System.out.println("even number: "+even);
            System.out.println("smallest number: " + min);
            System.out.println("second smallest number: " +secMin);
            System.out.println("largest number: " + max);
            System.out.println("second largest number: "+secMax);
    }
}
    public static void test4() {
            int arr[]=new int[20];
            arr[0]=0;
            System.out.println(arr[0]+ " ");
            arr[1]=1;
            System.out.println(arr[1]+ " ");
            for (int i = 2; i<=19; i++) {
                arr[i]=arr[i-1]+arr[i-2];
                System.out.println(arr[i]+ " ");
            }
    }
    public static void test5() {
            int[]field1=new int[10];
            for (int i=0; i<=9; i++);
            field1[i]=(int)Math.pow(2,i);
            System.out.print(field1[i]+" ");
        }

    }

    public static void test6() {
        int[]field1=new int[10];
        int[]field2=new int[10];
        field1[0]=1;
        System.out.print(field1[0]+" ");
        for (int i=1; i<=9; i++) {
            field1[i]=field1[i-1]*2;
            System.out.print(field1[i]+" ");
        }
        System.out.print();
        for (int i=0; i<=0; i++) {
            field2[9-i]=field1[i];
        }
        System.out.println();
    }
}


