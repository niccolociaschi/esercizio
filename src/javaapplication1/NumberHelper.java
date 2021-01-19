/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author informatica
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven(int n) {
        // ritorna true se number numero pari, altrimenti ritorna false
        if (n%2== 0){
            return true;
        }
        return false;
    }

    public boolean isOdd(int n) {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if (n%2!= 0){
            return true;
        }
        return false;
    }
    
    public int sum(int n, int somma){
        // ritorna la somma tra number e n
       int somma=0;
        somma=number + n;
        return somma;
    }

    public boolean isPrime(int n) {
        // ritorna true se number è un numero primo, altrimenti ritorna false
    for(int i=1;i<=n/2;i++){
   if(number&i!=0){
   return true;
   } 
   return false;
   }
};
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
            
    }
}
