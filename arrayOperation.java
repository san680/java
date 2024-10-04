package in.nit.workshop;

public class arrayOperation {

	public static void main (String[] orgs) {
	
	//get the sum of array elements
		int numbers[] = {7,8,9,4,5,6};
		int sum = 0;
		for(int index = 0; index <numbers.length;index++) {
	   sum = sum+numbers[index];
	
	
}
System.out.println("sum is:"+sum);
	
     // even and odd //if condition
     for(int index=0;index<numbers.length;index++)
      if(numbers[index]%2==0){
    System.out.println("it is even numbers:"+numbers[index]);
      }else {
    	  System.out.println("it is odd numbers:"+numbers[index]);
      }

	}

}
