package practice;

public class SecondMax{

	public static void main(String[] args) {
     
int ar[]={10,70,20,30,50};
int max=Integer.MIN_VALUE;
int secondMax=Integer.MIN_VALUE;
int i=0;

while(ar.length>i) {
if(ar[i]>max) {
secondMax=max;
max=ar[i];
}

else if(ar[i]>secondMax) {
secondMax=ar[i];
}
i++;
}

System.out.println("Second max is:"+secondMax);
}
}

