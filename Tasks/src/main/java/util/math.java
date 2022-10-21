/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class math {


        public static void first(int x, int divideby) {
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void firstby(int value) {
        first(value, 2);
//           bunu niye duzeltdim cunki tez tez isitifade ediremse bunu promoy cagira bilecem 
    }



    public static int findfactorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;

        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void foo(String s, int begin, int end) {
        String c = s.substring(begin, end);
        System.out.println(c);
    }

    public static void suitcase(int n) {
        for (; n < 7; n++) {
            for (int j = 0; j < 6 - n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void sadeeded(int a) {

        for (int i = 2; i <= a; i++) {
            if (a / i == 1) {
                System.out.println("eded sadedir");
            }

            if (a % i == 0) {

                break;
            }
        }
    }

    public static void verilenededesade(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".ededi daxil edin");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            for (int j = 2; j <= arr.length; j++) {
                if (arr[i] / j == 1) {
                    if (arr[i] % j == 0) {
                        System.out.println("sade eded");
                    }
                }
                if (arr[i] % j == 0) {

                    break;

                }
            }
        }
    }

    public static void sayi(int x) {
        int cem = 0;
        while (x > 0) {

            if (x % 10 == 0) {
                cem += 1;
            }
            if (x % 10 != 0) {
                cem += 1;
            }
            x = x / 10;

        }
        System.out.println(cem);
    }



    public static void foo2(int a, char c, boolean altalta) {

        for (int i = 0; i < a; i++) {

            if (altalta = true) {
                System.out.println(c);
            }
            if (altalta = false) {
                System.out.print(c);
            }

        }
    }

    public static void foo3(int a, int b, int c) {
        for (int i = a; i < b; i++) {

            System.out.println(Math.pow(i, c));

        }
    }

    public static int tameded() {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int result = 0;
        if (c > 0) {
            return result += 1;

        } else if (c < 0) {
            return result -= 1;
        } else {
            return result;
        }
    }

    public static boolean task13() {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".ededi daxil edin");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
            if (arr[i] == arr.length - i) {
                return true;
            }
            

        }
        return false;
    }
            public static boolean task14(boolean e){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(b==a+1){
             if(c==b+1){
                    if(d==c+1){
                        e=true;   
                    }
                    }
        }
        else{
              e=false;
        }  
        return e;
    }
                public static char task15 (int i,String d){

          char e=d.charAt(i);
        return e;
    }
                public static boolean task16(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1=sc.nextLine();
        boolean b = true;
        if(s.length()!=s1.length()){
            b=false;
        }

        for (int i = 0; i < s.length(); i++) {
            char sin = s.charAt(i);
            char s1in = s1.charAt(i);
         if(s.length()!=s1.length()){
            b=false;
            break;
        }
            if (sin != s1in) {
                               
                b = false;
  
            }

          
//       burda hemde ededleri yoxlamaq olur
        }

       return b;        
    }
                    public static boolean terseyni() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            char sag = s.charAt(i);
            char sol = s.charAt(s.length() - 1 - i);
//            System.out.println("-------");
//            System.out.println("sag=" + sag);
//            System.out.println("sol=" + sol);
            if (sag != sol) {
                b = false;
            }
//       burda hemde ededleri yoxlamaq olur
        }
       return b;
    }
                    
        public static void Cem() {
            int x=6;
        int cem = 0;
        while (x > 0) {
            int qaliq = x % 10;
            x = x / 10;
            cem += qaliq;

        }
        System.out.println(cem);

    }
        public static String task17(String s,char c,int count){

for(int i=0;i<=count;i++){
   s+=c;
}
return s;
    }
            public static boolean task18(String a,String b,String c){
        boolean d=false;
        if(a.contains(c)==true){
            if(b.contains(c)==true){
                    return d=true;
                    }
        }
        return d;
    }
            
    public static String task20(String a,String b){
        if(a.length()>b.length()){
            return a;
        }
if(a.length()<b.length()){
        return b;
}
        return null;
        }


}
