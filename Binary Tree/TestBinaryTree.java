//Wajdan Faheem
//665997
//The "TestLL" class.

public class TestBinaryTree{
 public static void main (String[] args)
 {
     // Place your code here

     System.out.println ("Linked List madness!");

     // Instantiate an empty linked list.
     MyBinaryTree theTree = new MyBinaryTree();

     StudentInfo someStudent;

     someStudent= new StudentInfo(888888, "Lola", "Bunny", 5);
     theTree.setRoot(someStudent);
     theTree.addToTree(theTree.getRoot(),someStudent);
     
     	
     someStudent = new StudentInfo(123456, "Daffy", "Duck", 6);
     theTree.addToTree(theTree.getRoot(), someStudent);
     

     someStudent = new StudentInfo(718552, "Phil", "Choi", 7);
     theTree.addToTree(theTree.getRoot(),someStudent);
     

     someStudent = new StudentInfo(665997, "MashyC", "Chowman", 40);
     theTree.addToTree(theTree.getRoot(),someStudent);
     

     someStudent = new StudentInfo(231323, "yivgeni", "sigaev", 60);
     theTree.addToTree(theTree.getRoot(),someStudent);
     

     someStudent = new StudentInfo(110101, "bradley", "tarrrrr", 80);
     theTree.addToTree(theTree.getRoot(),someStudent);

          
     System.out.println("In Order:");
     theTree.inOrder(theTree.getRoot());
     System.out.println("Post Order:");
     theTree.postOrder(theTree.getRoot());
     System.out.println("Pre Order:");
     theTree.preOrder(theTree.getRoot());
    
 }

}