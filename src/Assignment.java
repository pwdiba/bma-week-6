	abstract class basicTask {
		private String title;
		private String desc;
		private Boolean done;

		// default no args
		basicTask () {
			System.out.println("basicTask: Error: You must submit a title and description. ");
		}
		// default one arg
		basicTask (String title) {
			System.out.println("basicTask: Error: You must submit a title and description. ");
		}		
		// default constructor 2 args
		basicTask (String title, String desc) {
			printTask(title, desc, date, time );
		}
		public getTitle () {
			return basicTask.title;
		}
		public getDesc () {
			return basicTask.desc;
		}
		public isItDone() {
			return basicTask.done;
		}
		
	}	
	class apptTask extends basicTask{
		private String date;
		private String time;
		
		apptTask (String title, String desc, String date, String time) {
			printTask(title,desc,date,time );
		}	
	}
}
public class Assignment {
	
	public static void main(String args[]) {	
	//Auto-generated entry point for any application	
	int i;
		apptTask Task1 = new apptTask();
		System.out.println("1: "+ Task1 );

			if (args.length == 0 ) 	
				System.out.println( "Please select an action!");
			else {
				String action = new String("Hello"); // dummy value			
				String[] values = new String[args.length-1];
				
				if (args.length < 2 ) {
					System.out.println("length < 2: "+ args.length);
					// don't bother no arguments
				} else {
					for (i=1; i < args.length ; i++)  {
						values[i-1] = args[i];
					}			
					//planning to reuse this code once further along 
					// and tasks are working better
					//for (i=0; i < values.length; i++) {
					//for (String value: values)	{
						action = values[i];
						if (values[i].equals("appt")) {
							System.out.println("Match: appt:" + values[i]);
							apptTask(values,i);
						} else if (values[i].equals("remind")) {
							System.out.println("Match: remind: " + values[i]);
						} else {
							System.out.println("No match found for " + values[i]);
						}		
					//} // end for loop
				}  // else 
			}
		}
	class printTask() { 
		private  void printTask(String[] Task) {
		
		System.out.println("Task : " + Task);
		}
	}	

	class toString {
		private String toString() {			
	return null;
	}
	
	
	
}

	