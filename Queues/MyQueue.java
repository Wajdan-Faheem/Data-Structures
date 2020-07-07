public class MyQueue {
	 // Attributes

    public StudentInfo frontOfQueue;
    public int numInQueue;


    // Constructor

    public MyQueue() {
        // By default we'll have an empty list.
        frontOfQueue = null;
        numInQueue = 0;
    }


    // Methods

    public boolean enqueue(StudentInfo itemToAdd) {

        if (itemToAdd == null) {
            return(false);
        }
        else {
            if (numInQueue == 0) {
                // Add the itemToAdd to the empty Queue.
                frontOfQueue = itemToAdd;
                numInQueue = 1;
                return(true);
            }
            if (numInQueue > 0) {
                // Add the itemToAdd to the Queue.
                StudentInfo currentItem = frontOfQueue;

                for (int i = 0; i < (numInQueue - 1); i++) {
                    currentItem = currentItem.next;
                }
                
                currentItem.next = itemToAdd;
                numInQueue++;
                return(true);

            }
        }
        return(true); // shut up the compiler
    } // end enqueue


    public StudentInfo dequeue() {
            if (numInQueue == 0) {
                return(null);
            }
            if (numInQueue > 0) {
                StudentInfo currentItem = frontOfQueue;
                StudentInfo temp = currentItem;
                frontOfQueue = currentItem.next;
                for (int i = 0; i < (numInQueue-1); i++) {
                    currentItem = currentItem.next;
                }
                numInQueue--;
                return(temp);
            }
        return (null);
    }

    public void displayQueue() {

        if (numInQueue == 0) {
            System.out.println("");
            System.out.println("The list is empty!");
            return;
        }

        StudentInfo currentItem = frontOfQueue;

        System.out.println("");
        System.out.println("Here is the list from front to rear:");
        for (int i = 0; i < numInQueue; i++) {
           // System.out.println(i+"a\t"+currentItem.firstName);
            System.out.println("");
            System.out.println(currentItem.studentNumber + " " + currentItem.firstName + " " + currentItem.lastName);
            currentItem = currentItem.next;

        }
        return;
    } // end displayQueue


}

