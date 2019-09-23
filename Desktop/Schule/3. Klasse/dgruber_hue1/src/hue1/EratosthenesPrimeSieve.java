package hue1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
    public ArrayList<Integer> primeNumbers;
    public boolean primes[];
    
    public EratosthenesPrimeSieve (int prime) {
        this.prime = prime;
        primeNumbers  = new ArrayList<Integer>();
        primes = new boolean[prime+1];
        Arrays.fill(primes, true);
        isPrime(this.prime);
        getPrimes(this.prime);
        printPrimes();
    }
    
    
    @Override
    public boolean isPrime(int p) {
        for (int i = 2; i*i <= p; i++) {
            if (primes[i]) {
                for (int j = i * 2; j <= p; j += i) {
                    primes[j] = false;
                }
            }
        }
        
        return true;
    }

    public void getPrimes(int p) {
        for (int i = 2; i <= p; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }
    }
    
    @Override
    public void printPrimes() {
        for (int i = 0; i < primeNumbers.size(); i++) {
            System.out.println(primeNumbers.get(i));
        }
    }
    
}
