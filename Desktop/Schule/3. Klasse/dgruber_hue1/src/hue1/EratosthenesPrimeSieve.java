package hue1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class EratosthenesPrimeSieve implements PrimeSieve {
    public int prime;
    public ArrayList<Integer> noPrimes;
    public ArrayList<Integer> primes;
    
    public EratosthenesPrimeSieve (int prime) {
        prime = this.prime;
        noPrimes  = new ArrayList<Integer>();
        primes = new ArrayList<Integer>();
        isPrime(prime);
        printPrimes();
    }
    
    
    @Override
    public boolean isPrime(int p) {
        if (p % 2 == 0) {
            return false;
        }
        for ( int i = 3; i*i <= p; i+=2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++) {
            System.out.println(primes.get(i));
        }
        System.out.println("ab geht die post");
    }
    
    public void getPrimes (int p) {
        
    }
    
}
