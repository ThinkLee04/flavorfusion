/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dinhl
 */
public class AccountDAO {
    
    //Auto generate CustomerId by Time
    public static String generateId(){
        //Get time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");
        
        //Format getted time
        String formattedDateTime = now.format(formatter);
        String alphabet = decimalToAlphabet(Long.parseLong(formattedDateTime));
        String id = "CUS" + alphabet;

        return id;
    }
    
    //Convert decimal to alphabet by ASCII
    public static String decimalToAlphabet(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            number--;
            char digit;
            if (number % 36 < 10) {
                digit = (char) ('0' + (number % 36)); // Map to '0'-'9'
            } else {
                digit = (char) ('a' + (number % 36 - 10)); // Map to 'a'-'z'
            }
            result.insert(0, digit);
            number = number / 36;
        }

        return result.toString().toUpperCase();
    }
    
    public static void main(String[] args) {
        String id = generateId();
        System.out.println(id);
    }

}
