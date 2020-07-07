package linkList;

//The "TestLL" class.

public class TestLL{
 public static void main (String[] args)
 {
     // Place your code here

     System.out.println ("Linked List madness!");

     // Instantiate an empty linked list.
     MyLL theLL = new MyLL();

     StudentInfo someStudent;

     someStudent= new StudentInfo(888888, "Lola", "Bunny");
     theLL.addToRear(someStudent);
     theLL.displayList();

     someStudent = new StudentInfo(123456, "Daffy", "Duck");
     theLL.addToRear(someStudent);
     theLL.displayList();

     someStudent = new StudentInfo(718552, "Phil", "Choi");
     theLL.addToRear(someStudent);
     theLL.displayList();


     someStudent = new StudentInfo(665997, "MashyC", "Chowman");
     theLL.addToFront(someStudent);
     theLL.displayList();

     someStudent = new StudentInfo(231323, "yivgeni", "sigaev");
     theLL.addToFront(someStudent);
     theLL.displayList();

     someStudent = new StudentInfo(110101, "bradley", "tarrrrr");
     theLL.addToRear(someStudent);
     theLL.displayList();

     StudentInfo removedItem = theLL.removeFromRear();
     
     theLL.displayList();
     
     if (removedItem == null) {
    	 System.out.println("Tried to remove from empty list");
     }
     else {
    	 System.out.println("Removed " + removedItem.firstName);
     }
     theLL.displayList();

     removedItem = theLL.removeFromFront();
     
     theLL.displayList();
     
     if (removedItem == null) {
    	 System.out.println("Tried to remove from empty list");
     }
     else {
    	 System.out.println("Removed " + removedItem.firstName);
     }
 
     theLL.displayList();

     System.out.println("");
     System.out.println("Goodbye!");
 } // main method

} // TestLL class