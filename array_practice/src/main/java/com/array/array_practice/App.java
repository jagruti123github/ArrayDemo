package com.array.array_practice;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] num= {2,4,6,7,9,7,9};
        long count = Arrays.stream(num).filter(n->n%2==0).count();
        System.out.println(count);
        
    }
}
