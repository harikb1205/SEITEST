package com.sei.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DeDup {
	final int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
			20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
			13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
    public static void main(String [] args) {
    	DeDup duplicatArray = new DeDup();
    	
    	DeDup deDup = new DeDup();
             System.out.println("Input Array with Duplicates       : " + Arrays.toString(deDup.randomIntegers));
             System.out.println("After removing duplicates with original order   : " + Arrays.toString(duplicatArray.removeDups(deDup.randomIntegers)));
             System.out.println("After removing duplicates   : " + Arrays.toString(duplicatArray.removeDuplicates(deDup.randomIntegers)));
             System.out.println("After removing duplicates   : " + Arrays.toString(duplicatArray.eliminateDuplicates(deDup.randomIntegers)));

    }
    /***
     * Retains the original Order of the input order
     * @param intArray
     * @return
     */
    public Integer[] removeDups(int[] intArray) {
    	if (intArray.length < 2)
			return null;
        int count = 0;
        Integer[] interimArray = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            boolean exists = false;
            for (int j = 0; j < interimArray.length; j++) {
                if (interimArray[j]!=null && interimArray[j] == intArray[i]) {
                    exists = true;
                }
            }
            if (!exists) {
                interimArray[count] = intArray[i];
                count++;
            }
        }
        final Integer[] finalArray = new Integer[count];
        System.arraycopy(interimArray, 0, finalArray, 0, count);
        return finalArray;
    }
    
    /***
     * Sorts the Array and elimintes the duplicate
     * @param arr
     * @return
     */
    public int[] removeDuplicates(int[] arr){
    		if (arr.length < 2)
			return null;
        HashSet<Integer> set = new HashSet<Integer>();
        final int end = arr.length;
        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }

        int[] nonDupArr = new int[set.size()];
        int i = 0;
        for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
            nonDupArr[i++] = it.next();
        }
        return nonDupArr;
    }
    
	public int[] eliminateDuplicates(int[] randomIntegers) {
		if (randomIntegers.length < 2)
			return null;
		int[] unique = new int[randomIntegers.length];    
	    int n=0;
	    int[] arrflag = new int[randomIntegers.length];
	    for (int i = 0; i < randomIntegers.length; i++) {            
	        if (arrflag[i] == 0) {
	            unique[n++] = randomIntegers[i];
	            for (int j = i+1; j < randomIntegers.length; j++) {   
	                if (randomIntegers[i] == randomIntegers[j]) {                        
	                    arrflag[j]=-1;
	                }
	            }                
	        }
	    }   
	    int[] nonDupArray = new int[n];
	    for(int k=0;k<nonDupArray.length;k++){
	    	nonDupArray[k] = unique[k];
	    }
	    
		return nonDupArray;
	}    
	
}
