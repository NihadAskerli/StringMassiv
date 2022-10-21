/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringmassivler;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Arrays {

    public static void main(String[] args) {
//// boolean b= detectSymetry("hello");
//        String s = "hello";
//        boolean b = true;
//        for (int i = 0; i < s.length(); i++) {
//            char sag = s.charAt(i);
//            char sol = s.charAt(s.length() - 1 - i);
//            System.out.println("-------");
//            System.out.println("sag=" + sag);
//            System.out.println("sol=" + sol);
//            if (sag != sol) {
//                b = false;
//            }
//        System.out.println("b=" + b);
//       }
//    }
//
//    public static boolean detectSymetry(String s) {
//        boolean b = true;
//        for (int i = 0; i < s.length(); i++) {
//            char sag = s.charAt(i);
//            char sol = s.charAt(s.length() - 1 - i);
//            System.out.println("-------");
//            System.out.println("sag=" + sag);
//            System.out.println("sol=" + sol);
//            if (sag != sol) {
//                return false;
//            }
//
//        }
//        System.out.println("finished");
//       return true;
//      
//   }
        String s = "salam    necesen    hardasan    gel   bakiya   ";
        String[] mass = s.split(" ");
        String netice = "";
        for (int d = 0; d< mass.length; d++) {
            String elem = mass[d];
            if (!elem.isEmpty()) {
                netice += elem + " ";
            }
        }
            netice = netice.trim();
            System.out.println(netice);

        }
    

    public static void coxsiraliMassiv() {
        int[][] arr = new int[2][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                Scanner sc = new Scanner(System.in);
                System.out.println("i=" + i + "j=" + j + ".ededi daxil edin");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("i=" + i + ",j=" + j + "=" + arr[i][j]);
            }
        }
    }

    public static void birlimassiv() {
        int[] arr = new int[5]; //bu yanliz istediyimiz ededleri daxil edende ise yariyir{0,0,0,0,0};
//       int i=arr[4];
//        System.out.println(i);
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(i + ".ededi daxil edin");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "." + arr[i]);
        }

    }
}
