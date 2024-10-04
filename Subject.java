package in.nit.workshop;

public class Subject {
	// properties of subject
			public String subjectname;
			public String subjectcode;
			
			//constructor
			public Subject() {
				System.out.println("defualt constructor");
			}
			
			//instance methods
			public void getSubjectDetails() {
			System.out.println("this is getSubjectDetais");

		}

		public void getSubjectDetails(String subjectName) {
			System.out.println("this is getSubjectDetails method");
			System.out.println("subject name:"+ subjectName);
		}
			
		// to get the length of the given subject
		
		public void getNumberOFChar(String subjectName) {
			System.out.println("finding the Char count");
			System.out.println("subject Char count:"+subjectName.length());
		}
		
		
		
		
			
		}
		
	