import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] ar={1,2,3,4,5};
        System.out.println("Max: "+ getMinAndMax(ar).getMax());
        System.out.println("Min: "+ getMinAndMax(ar).getMin());
	}

    // O(n) approach
    public static Pair getMinAndMax(int[] ar){
        int max=ar[0];
        int min=ar[0];

        for(int i=1;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
            else if(ar[i]<min){
                min=ar[i];
            }
        }

        return new Pair(max,min);
    }

    public static class Pair{
        int max;
        int min;

        public Pair(int max,int min){
            this.max=max;
            this.min=min;
        }

        public int getMax(){
            return max;
        }

        public int getMin(){
            return min;
        }
    }
}
