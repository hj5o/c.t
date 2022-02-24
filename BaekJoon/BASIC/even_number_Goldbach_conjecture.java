package BaekJoon.BASIC;
////   Problem 6588
//import java.io.IOException;
//import java.util.Scanner;
//
//public class even_number_Goldbach_conjecture {
//    public static void main(String[] args) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        int max=1000000;
//        boolean []number=new boolean[max+1];
//        number[0]=false;
//        number[1]=false;
//        for(int i=2;i<=max;i++) {
//            number[i] = true;
//        }
//
//        //에라토스테네스의 체로 소수 판별
//        for(int i=2;i<=max;i++) {
//            if (number[i]) {
//                for (int j = i+i; j <= max; j+=i){
//                    number[j]=false;
//                }
//            }
//        }
//        while(true){
//            int input=sc.nextInt();
//            boolean ok=false;
//            if(input==0)
//                break;
//            for(int i=2;i<=input/2;i++){
//                if (number[i] && number[input-i]) {
//                    System.out.println(input + " = " + i + " + " + (input - i));
//                    ok=true;
//                    break;
//
//                }
//            }
//            if(!ok){
//                System.out.println("Goldbach's conjecture is wrong.");
//            }
//
//        }
//    }
//}