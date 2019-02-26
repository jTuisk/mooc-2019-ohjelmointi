/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janek
 */
import java.util.Scanner;

public class Apuohjelma {
    
    public static String AskAndGet(String question, Scanner scan){
        System.out.println(question);
        return scan.nextLine();
    }
}
