import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] ar={0,0,0,1,1,0,2,2,0,1,0};
		dutchFlag(ar);
		System.out.println(Arrays.toString(ar));
	}
	
    // O(n) but with two iteration
	public static void dutchFlag(int[] ar){
	    int nextZero=0;
	    int nextTwo=ar.length-1;
	    
	    for(int i=0;i<ar.length;i++){
	        if(ar[i]==0){
	            swap(ar,i,nextZero);
	            nextZero++;
	        }
	    }
		
	    for(int i=nextZero;i<ar.length && i<=nextZero;i++){
	        if(ar[i]==2){
	            swap(ar,i,nextTwo);
	            nextTwo--;
	        }
	    }
	}
	
	public static void swap(int[] ar,int i,int j){
	    if(i==j){
	        return;
	    }
	    int temp=ar[i];
	    ar[i]=ar[j];
	    ar[j]=temp;
	}
}
