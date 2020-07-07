public class QueueTest {


//The "TestLL" class.

	 public static void main (String[] args){
	     // Place your code here

	     System.out.println ("Linked List madness!");

	     // Instantiate an empty linked list.
	     MyQueue theQueue = new MyQueue();

	     StudentInfo someStudent;

	     someStudent= new StudentInfo(888888, "Lola", "Bunny",56);
	     theQueue.enqueue(someStudent);
	     theQueue.displayQueue();

	     someStudent = new StudentInfo(123456, "Daffy", "Duck",67);
	     theQueue.enqueue(someStudent);
	     theQueue.displayQueue();

	     someStudent = new StudentInfo(718552, "Phil", "Choi",12);
	     theQueue.enqueue(someStudent);
	     theQueue.displayQueue();

	     someStudent = new StudentInfo(110101, "bradley", "tarrrrr",2);
	     theQueue.enqueue(someStudent);
	     theQueue.displayQueue();

	     StudentInfo removedItem = theQueue.dequeue();
	     
	     theQueue.displayQueue();
	     
	     if (removedItem == null) {
	    	 System.out.println("Tried to remove from empty list");
	     }
	     else {
	    	 System.out.println("Removed " + removedItem.firstName);
	     }
	     theQueue.displayQueue();

	     removedItem = theQueue.dequeue();
	     
	     theQueue.displayQueue();
	     
	     if (removedItem == null) {
	    	 System.out.println("Tried to remove from empty list");
	     }
	     else {
	    	 System.out.println("Removed " + removedItem.firstName);
	     }
	 
	     theQueue.displayQueue();

	     System.out.println("");
	     System.out.println("Goodbye!");
	 } // main method

	} // TestLL class

