
	abstract class basicToDo {
		private String title;
		private String desc;	
		
		// default constructor 2 args
		basicToDo (String title, String desc) {
			printTask(title, desc, date, time );
		}
		// default no args
		basicToDo () {
			System.out.println("basicToDo: Error: You must submit a title and description. ");
		}
		// default one arg
		basicToDo (String title) {
			System.out.println("basicToDo: Error: You must submit a title and description. ");
		}		
	}	
	class apptToDo extends basicToDo{
		private String date;
		private String time;
		
		apptToDo (String title, String desc, String date, String time) {
			printTask(title,desc,date,time );
		}	
	}

	private static void printTask(String[] Task) {
		
		System.out.println("Task : " + Task);
	}
	//public static String getTask(String[] args, int index) {
	//  private int i;
		
	 // if (args.length == 0 ) 	
		//System.out.println( "Please enter a Task!");
	  //else {
	//	String action = new String("Hello"); // dummy value			
	//	String[] values = new String[args.length-1];
		
		//for (i=0; i < values.length; i++) {
		//	action = values[i];
			//if (values[i].equals("appt")) {	
			//	System.out.println("Appt: " + values[1] + values[2] + values[3]);
				//apptToDo(values[i]);
			//} else if (values[i].equals("todo")) {
				//System.out.println("Match: for: " + values[i]);
			//	printTask(values,i);
			//} else  if (values[i].equals("shop")) {
				//System.out.println("Match: while: " + values[i]);
			//	printTask(values,i);
			//} else {
			//	System.out.println("No match found for " + values[i]);
			//}		
		 //} // end for loop
	   //}  // else 
	//}
	class toString {
		private String toString() {			
	return null;
	}	
}

public class Assignment {
	
	public static void main(String args[]) {
	
	apptToDo Task1 = new apptToDo();
	System.out.println("1: "+ Task1 );
	
}
	// initial task class
	// hold for now as example
//	class InsideTheAssignment {
//		private int value1;
//		
		// Constructor with one value
//		InsideTheAssignment(int value1) {
//			private value1 = 5;	
//			System.out.println("Task :Inside the Assignment: value: "+value1);
//		}
//		// Constructor with no arguments
//		InsideTheAssignment () {		
//		}
//		class toString {
//			private String toString() {			
//			return null;
//			}
//		}	
//	}
	