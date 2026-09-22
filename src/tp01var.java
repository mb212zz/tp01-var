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
        //(QUESTION 2) System.out.println("Ce programme permet\n d'ecrire sur plusieurs lignes");
        
        
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
    }
    
}
