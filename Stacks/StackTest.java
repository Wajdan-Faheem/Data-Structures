public class StackTest {
	public static void main (String[] args)
    {

        // Instantiate an empty stack.
        MyStack theStack = new MyStack();
        
        theStack.displayStack();

        StudentInfo someStudent;
        StudentInfo peekedItem;

        //Create Lola Bunny and add to top of myStack
        someStudent= new StudentInfo(888888, "Lola", "Bunny",32);
        theStack.push(someStudent);
        theStack.displayStack();
       
        //Create Daffy Duck and add to top of myStack
        someStudent = new StudentInfo(123456, "Daffy", "Duck",34);
        theStack.push(someStudent);
        theStack.displayStack();
        
        //Create brad Duck and add to top of myStack
        someStudent = new StudentInfo(123456, "Brad", "Duck",63);
        theStack.push(someStudent);
        theStack.displayStack();
       
        //Create zen Duck and add to top of myStack
        someStudent = new StudentInfo(123456, "zen", "Duck",1);
        theStack.push(someStudent);
        theStack.displayStack();
       
        //removes from the top of stack
        StudentInfo removedStudent = theStack.pop();
        theStack.displayStack();
        
        if(removedStudent==null) {
        System.out.println("Tried to remove from empty Stack!");
        }
        else {
        System.out.println("");
        System.out.println("Popped " + removedStudent.firstName + " from the front of the Stack!");
        }
        
        removedStudent = theStack.pop();
        theStack.displayStack();    
        
        if(removedStudent==null) {
        System.out.println("Tried to remove from empty Stack!");
        }
        else {
        System.out.println("");
        System.out.println("Popped " + removedStudent.firstName + " from the front of the Stack!");
       
       peekedItem = theStack.peek();
       System.out.println("\nPeek:");
       System.out.println(peekedItem);
       
       

    } // main method

}
}