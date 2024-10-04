package in.nit.workshop;

public class BrandName {

	
	public static void main (String[] orgs) {
		   //declare array
		  String Brandnames[] = {"SK","Gk","HK","GK"};
		
		  for (int index = 0; index <Brandnames.length; index++){
			  System.out.println(Brandnames[index]);
		 // declare array 
		  
		   System.out.println("revers array elements"); 
		   for (int index = 0; index <Brandnames.length-1; index--){
				  System.out.println(Brandnames[index]);
	
	
		}
	
	}
	
}
}