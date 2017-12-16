package com.tribonacci_171210;

public class Xbonacci {

	  public double[] tribonacci(double[] s, int n) {
	      // hackonacci me
	      
	      double result[] = new double[n];
	      
	      for (int i=0; i<s.length && i < n; i++) {
	        result[i] = s[i];
	      }
	      
	      if ( n != 0 ) {
	        for (int i=0; i<n-3; i++) {
	          result[i+3] = result[i] + result[i+1] + result[i+2];
	          System.out.println(i + " result " + result[i]);
	        }
	        
	      } else {
	        result = new double[n];
	      }

	      return result;
	  }
	}
