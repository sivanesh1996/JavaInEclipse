package oneDArray;

public class PrintDup {

	public static void main(String[] args) {
	     int arr[]= {1,2,3,1,4,5,6,2,1,6};
	     int freq[]=new int[arr.length];
	     int dup[]=new int[arr.length];

	     for(int i=0;i<arr.length;i++) {
	    	 int no=arr[i],count=1;
	    	 for(int j=i+1;j<arr.length;j++) {
	    		 if(no==arr[j]) {
	    			 count++;
	    			 freq[j]=-1;
	    		 }
	    		 if(freq[i]!=-1) {
	    			 freq[i]=count;
	    		 }
	    	 }
	     }
	     
	     int k=0;
	     for(int i=0;i<arr.length;i++) {
	     if(freq[i]>1) 
	    	 dup[k]=arr[i];
	     k++;
	}
	     
	     for(int i=0;i<dup.length;i++) {
	    	 if(dup[i]>0)
	    		 System.out.println(dup[i]);
	     }
	}

}
