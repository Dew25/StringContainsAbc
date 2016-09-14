/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcontainsabc;

import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class StringContainsAbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String text = scanner.nextLine();
        char[] textArr= text.toCharArray();
        int letterAmount=0;
        String abcString="абвгдеёжзиклмнопрстуфхцчшщъыьэюя";
        char[] abcRus = abcString.toCharArray();
        for (char ch : textArr) {
            
        }
        System.out.printf("Данный текст содержит %d букв русского алфавита",letterAmount);
    }
    
}
