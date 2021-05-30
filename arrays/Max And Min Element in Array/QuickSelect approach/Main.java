import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] ar={4,5,2,0,1,6,3};
		System.out.println(quickSelect(0,ar.length-1,3,ar));
	}
	
	public static int quickSelect(int low,int high,int k,int[] ar){
	    int pivot=ar[high];
	    
	    int smallElementEnd=low;
	    for(int i=low;i<high;i++){
	        if(ar[i]<=pivot){
	            swap(i,smallElementEnd,ar);
	            smallElementEnd++;
	        }
	    }
	    swap(high,smallElementEnd,ar);
	    
	    int greaterCount=high-smallElementEnd;
	    
	    if(greaterCount>=k){
	        return quickSelect(smallElementEnd+1,high,k,ar);
	    }
	    if(greaterCount+1==k){
	        return ar[smallElementEnd];
	    }
	    return quickSelect(low,smallElementEnd-1,k-(greaterCount+1),ar);
	}
	
	public static void swap(int first,int second,int[] ar){
	    int temp=ar[first];
	    ar[first]=ar[second];
	    ar[second]=temp;
	}
}
