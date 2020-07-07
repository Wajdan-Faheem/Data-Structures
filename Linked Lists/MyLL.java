package linkList;

public class MyLL{

    // Attributes

    public StudentInfo frontOfList;
    public int numInList;


    // Constructor

    public MyLL() {
        // By default we'll have an empty list.
        frontOfList = null;
        numInList = 0;
    }


    // Methods

    public boolean addToRear(StudentInfo itemToAdd) {

        if (itemToAdd == null) {
            return(false);
        }
        else {
            if (numInList == 0) {
                // Add the itemToAdd to the empty list.
                frontOfList = itemToAdd;
                numInList = 1;
                return(true);
            }
            if (numInList > 0) {
                // Add the itemToAdd to the rear of the list.
                StudentInfo currentItem = frontOfList;

                for (int i = 0; i < (numInList - 1); i++) {
                    currentItem = currentItem.next;
                }
                // currentItem is now pointing at the rear item in the list.
                currentItem.next = itemToAdd;
                numInList++;
                return(true);

            }
        }
        return(true); // shut up the compiler
    } // end addToRear


    public boolean addToFront(StudentInfo itemToAdd) {

        if (itemToAdd == null) {
            return(false);
        }
        else {
            if (numInList == 0) {
                // Add the itemToAdd to the empty list.
                frontOfList = itemToAdd;
                numInList = 1;
                return(true);
            }
            if (numInList > 0) {
                // Add the itemToAdd to the front of the list.
                StudentInfo currentItem = itemToAdd;
                for (int i = 0; i <= (numInList); i++) {
                    if(i==0) {
                        currentItem.next = frontOfList;
                    }
                    else{
                        currentItem = currentItem.next;
                    }
                }
                frontOfList = itemToAdd;
                numInList++;
                return(true);
            }
        }
        return(true); // shut up the compiler
    }

    public StudentInfo removeFromRear() {
            if(numInList==0){
                return(null);
            }
            if (numInList > 0) {
                // Iterating to the rear of the list.
                StudentInfo currentItem = frontOfList;
                for (int i = 0; i < (numInList - 1); i++) {
                    currentItem = currentItem.next;
                }
            	StudentInfo temp = currentItem;
                // currentItem is now null.
                currentItem.next = null;
                numInList--;
                return(temp);
            }
            return (null);
    } //end removeFromRear

    public StudentInfo removeFromFront() {
            if (numInList == 0) {
                return(null);
            }
            if (numInList > 0) {
                StudentInfo currentItem = frontOfList;
                StudentInfo temp = currentItem;
                frontOfList = currentItem.next;
                for (int i = 0; i < (numInList-1); i++) {
                    currentItem = currentItem.next;
                }
                numInList--;
                return(temp);
            }
        return (null);
    }

    public void displayList() {

        if (numInList == 0) {
            System.out.println("");
            System.out.println("The list is empty!");
            return;
        }

        StudentInfo currentItem = frontOfList;

        System.out.println("");
        System.out.println("Here is the list from front to rear:");
        for (int i = 0; i < numInList; i++) {
           // System.out.println(i+"a\t"+currentItem.firstName);
            System.out.println("");
            System.out.println(currentItem.studentNumber + " " + currentItem.firstName + " " + currentItem.lastName);
            currentItem = currentItem.next;

        }
        return;
    } // end displayList


}