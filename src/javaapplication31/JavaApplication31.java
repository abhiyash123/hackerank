/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


///# grade student///


package javaapplication31;

import java.util.Scanner;
import java.util.*;
import java.lang.Math; 

/**
 *
 * @author 91780
 */
public class JavaApplication31 {

   
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        
        
        
      
  
        
         for (int i = 0; i < n; i++) {
            
            
             a[i] = sc.nextInt();
            
        }
         
          for (int i = 0; i < n; i++) {
        
             
              for (int j = 0; j < n; j++) {
                  
                  b[j] = a[i]/5;
                  
                  b[j] = b[j] + 1;
                  
                  b[j] = b[j] * 5;
                  
                  c[j] = b[j];
                  
                  b[j] = b[j] - a[i];
                  
                  if(b[j]<3){
                  
                      b[j] = c[j];
                  
                  }else {
                  
                  if(b[j]==3 || a[i]<38){
                  
                  b[j] = a[i];
                  
            
                  }
                  
                  }
                  
                  if(a[i]<38){
                  
                      b[j] = a[i];
                  
                  }
                 
                  
              }
              
              System.out.println(b[i]);
              
        }
          
          
          
         
          
          
          
         
         
         
         
         
       
        
    } 
    
      
      
     
}


