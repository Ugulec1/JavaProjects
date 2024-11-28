package Baslangic;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Windows , Linux , Java ,Network;
    System.out.println("Windows Notunu gir");
    Windows =sc.nextInt();
    System.out.println("Linux Notunu gir");
    Linux = sc.nextInt();
    System.out.println("Java Notunu gir");
    Java = sc.nextInt();
    System.out.println("Network notunu gir");
    Network = sc.nextInt();
    double sonuc =(Windows+Linux+Java+Network)/4.0;
    System.out.println((sonuc)>=60? "geçti":"kaldı");


    }
}
