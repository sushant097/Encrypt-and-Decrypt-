package com.Swing_encrypt.Decrypt.EditSwing;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ProWinJVM
 */
public class then {
 
   private static final int[] chain={
       1941,12394,23093,9023,2111,193,93,293,345,8765,34,9873,8346,345
   };
    
    


    public  String encryptcon(String mess,int code) {
        Random rand = new Random();
        String result = "";
        int l = mess.length();
        char ch;
        int ck = 0;
        for (int i = 0; i < l; i++) {
            if(ck >=chain.length -1) ck =0;
            ch = mess.charAt(i);
            ch += code+chain[ck]; //shift the random  spaces  in result
            result += ch;
            ck++;
        }
        code +=7342198;
        String str = Integer.toString(code);
        
        return result+str;
    }

    public  String decryptcon(String mess,int check) {
        Scanner in = new Scanner(System.in);
        int len = mess.length();
        String[] numbers = mess.split("[^0-9]+");
        String str1 = Arrays.toString(numbers);
        str1 = str1.substring(1, str1.length()-1).replaceAll(",","");
        str1 = str1.trim();
        //System.out.println("The new string is:"+str1);
         int code = Integer.parseInt(str1);//to obtain the code
         code -=7342198;//subtracts the exceeds value
        //System.out.println("The code is: "+code);
        mess =mess.replaceAll("\\d+$", "" ); // to remove the string in the last
       // System.out.println("new string is:"+mess);
        
        
        
        if(check == code){
          String result = "";
        int l = mess.length();
       int checkn[] = new int[l];
        char ch;
        int ck=0;
        for (int i = 0; i < l; i++) {
            if(ck >= chain.length -1) ck =0;
            ch = mess.charAt(i);
            ch -= code+chain[ck]; //shift the random  spaces  in result
            result += ch;
            ck++;
        }
        return result;
        }else{
           
            return null;
        }
        //Integer cod = Integer.parseInt(temp);
        
        

    }

    
}
