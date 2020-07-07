public class MyStack {
	// Attributes

    public StudentInfo topOfStack;
    public int numInStack;


    // Constructor

    public MyStack() {
        // By default we'll have an empty list.
        topOfStack = null;
        numInStack = 0;
    }


    // Methods

    public boolean push(StudentInfo someStudent) {

    	if (someStudent == null) {
            return(false);
        }
        else {
            if (numInStack == 0) {
                // Add the itemToAdd to the empty list.
                topOfStack = someStudent;
                numInStack = 1;
                return(true);
            }
            if (numInStack > 0) {
                // Add the itemToAdd to the front of the stack.
                StudentInfo currentItem = someStudent;
                for (int i = 0; i <= (numInStack); i++) {
                    if(i==0) {
                        currentItem.next = topOfStack;
                    }
                    else{
                        currentItem = currentItem.next;
                    }
                }
                topOfStack = someStudent;
                numInStack++;
                return(true);
            }
        }
        return(true); // shut up the compiler
    } // end push
   
    public StudentInfo peek() {
    StudentInfo currentItem = topOfStack;
   
    for (int i = 0; i < (numInStack - 1); i++) {
            currentItem = currentItem.next;
    }
   
        return currentItem;

    } // end peek


    public StudentInfo pop() {
            if (numInStack == 0) {
                return(null);
            }
            if (numInStack > 0) {
                StudentInfo currentItem = topOfStack;
                System.out.println("");
                StudentInfo z = topOfStack;
                topOfStack = currentItem.next;
                for (int i = 0; i < (numInStack-1); i++) {
                    currentItem = currentItem.next;
                }
                numInStack--; 
                return(z);
            }
        return (null);
    }
//displays the stack
    public void displayStack() {

        if (numInStack == 0) {
            System.out.println("");
            System.out.println("The Stack is empty!");
            return;
        }

        StudentInfo currentItem = topOfStack;

        System.out.println("Here is the Stack from front to rear:");
        for (int i = 0; i < numInStack; i++) {
            System.out.println("");
            System.out.println(currentItem.studentNumber + " " + currentItem.firstName + " " + currentItem.lastName);
            currentItem = currentItem.next;

        }
        return;
    } // end displayList

}

