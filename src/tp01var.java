/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mbenjelloun
 */
import java.util.Scanner
public class tp01var {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*(QUESTION 2) 
        System.out.println("Ce programme permet\n d'ecrire sur plusieurs lignes");
        */
        
       /* (QUESTION 4)
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int temp = 0;
        System.out.print("Saisir x :");
        x = sc.nextInt();
        System.out.print("Saisir y :");
        y = sc.nextInt();
        System.out.print("Avant permutation x=" + x + " y=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.print("Après permutation x=" + x + " y=" + y);
      */
       
       Scanner sc = new Scanner(System.in);
       int a = 0;
       int b = 0;
       int c = 0;
       System.out.print("Saisir a :");
       a = sc.nextInt();
       System.out.print("Saisir b :");
       b = sc.nextInt();
       c = (a+b)*2;
       System.out.print("(a + b) * 2 =" + c);
       
    }
    
}
