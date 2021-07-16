package com.math;

import java.util.List;

public class Calculator {

    public int sum( Integer first, Integer second) { 
        return first + second;
    }
    
    public int calculateNumbersSum(List<Integer> input, boolean onlyPositive ) { 
        int sum = 0 ; 
        if (input.size() > 10 ) { 
            System.out.println("too long");
        }
        for( int i= 0 ; i<input.size(); i++) {
            if ( onlyPositive ) {
                if (input.get(i) > 0 ) { 
                    sum = sum + input.get(i);
                }
            } else { 
                if (input.get(i) < 0 ) { 
                    sum = sum + input.get(i);
                }
            }
        }
        return sum;
    }
    
    
}
