package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
    
    System.out.println("main method is started");
   
    // assign the value
    Person.country="india";
     Person.state = "karnataka";
     
     
     
     // assign the value
    System.out.println("country is:"+Person.country);
    System.out.println("country is:"+Person.state);
	
	//create object
    Person person = new Person();
    person.personName = "santu";
    person.qualification = "engineering";
    person.pancardNumber = "SBINK1686";
    person.AadharcardNumber = "123654987789";
    
    
    System.out.println("personName is:"+person.personName);
    System.out.println("qualification is:"+person.qualification);
    System.out.println("pancardNumber is:"+person.pancardNumber);
    System.out.println("AadharcardNumber is:"+person.AadharcardNumber);
	
	//invoke the method
    Person.displayInfo();
    person.getInformation();
	
	}

}
