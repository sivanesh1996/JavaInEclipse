package practice;

public class ClassRoom {
	 private static int NumOfStudents;
	 static int totelNumOfDesks;
	 static int[] occupiedDesks;
	 static boolean[][] arr;
	 static int count = 0;



	 public static void main(String[] args) {

	  seatingStudents1(new int[] {12, 2, 6, 7, 11  });// 6,4 //8,1,8
	  

	 }

	 public static void seatingStudents1(int[] b) {
	  int count = 0;
	  int k = b[0];
	  boolean[] arr = new boolean[k];
	  for (int i = 0; i < k; i++) {
	   arr[i] = new Desk().occupied;
	  }
	  for (int i = 1; i < b.length; i++) {
	   int oc = b[i];
	   arr[oc - 1] = true;
	  }
	  for (boolean e : arr) {
	   System.out.println(e);
	  }
	  
	  System.out.println("You can place the students in "+placeNewStudent(2,arr)+ " ways.");
	 }
	 public static void seatingStudents(int[] a) {
	 
	  totelNumOfDesks = a[0];

	  arr = new boolean[totelNumOfDesks / 2][2];
	  for (int i = 0; i < totelNumOfDesks / 2; i++) {
	   for (int j = 0; j < 2; j++) {

	    System.out.print((arr[i][j] = false) + " ");

	   }

	   System.out.println();
	   System.out.println();
	  }
	  int[] occupiedDesks = new int[a[0]];
	  for (int i = 1; i < occupiedDesks.length; i++) {
	   arr[a[i] / 2][a[i] % 2] = true;
	  }
	  // return result;
	 }
	 public static int placeNewStudent(int St, boolean[] arr) {
	   count = 0;
	  for (int i = 0; i < arr.length - 1; i++) {
	   if (i == 0) {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      if (arr[i + 1] == false) {
	       count = count + 1;
	      }
	      if (arr[i + 2] == false) {
	       count = count + 1;
	      }
	     }
	    }
	    i++;
	   } else if (i == arr.length - 2) {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      if (arr[i + 1] == false) {
	       count = count + 1;
	      }

	     }
	    }else{
	     i++;
	          }
	   } else {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      if (arr[i + 1] == false) {
	       count = count + 1;
	      }
	      if (arr[i + 2] == false) {
	       count = count + 1;
	      }

	     }
	     i++;
	    }else{
	     i++;
	    }
	   }
	         
	  }
	  for (int i = 1; i < arr.length-1 ; i++) {
	   if (i == 1) {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      
	      if (arr[i + 2] == false) {
	       count = count + 1;
	      }
	     }
	    }
	    i++;
	   } else if (i == arr.length -2) {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      if (arr[i + 2] == false) {
	       count = count + 1;
	      }

	     }
	    }else{
	     i++;
	          }
	   } else {
	    if (arr[i] == false) {
	     if (arr[i] == false) {
	      if (arr[i + 2] == false) {
	       count = count + 1;
	      }
	     }
	     i++;
	    }else{
	     i++;
	    }
	   }
	         
	  }
	  return count;
	 }
	}

	class Desk {
	 boolean occupied;

	 Desk() {
	  occupied = false;
	 }
}