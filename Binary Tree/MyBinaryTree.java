//Wajdan Faheem
//665997
public class MyBinaryTree{
    
    // Attributes

    public StudentInfo root;
    public int numInTree;


    // Constructor

    public MyBinaryTree() {
        // By default we'll have an empty list.
        root = null;
        numInTree = 0;
    }


    // Methods
    public void setRoot(StudentInfo TargetRoot) {
    	root = TargetRoot;
   
    	}
    public StudentInfo getRoot() {
    	return root;
    }
    
    public void addToTree(StudentInfo node,StudentInfo itemToAdd) {

        if (numInTree == 0) {
        	numInTree++;
        }
        else {
            StudentInfo currentItem = node;
        	if (itemToAdd.getStudentNumber() >= currentItem.getStudentNumber()) {
	        	if (currentItem.getRight() == null) {
	        		currentItem.setRight(itemToAdd);
	            	numInTree++;
	        	}
	        	else{
	        		addToTree(currentItem.getRight(),itemToAdd);
	        	}
        	}
        	
        	else {
        		if (currentItem.getLeft() == null) {
	        		currentItem.setLeft(itemToAdd);
	            	numInTree++;
	        	}
	        	else{
	        		addToTree(currentItem.getLeft(),itemToAdd);
	        	}
        	}	
            }
    
    }       

    //InOrder Traversal
    public void inOrder(StudentInfo root){
        if(root == null){
            return;
        }
        inOrder(root.getLeft());
        System.out.println("Student Number: "+root.getStudentNumber()+"/ reference value: "+root);
        inOrder(root.getRight());
    }

    //PostOrder Traversal
    public void postOrder(StudentInfo root){
        if(root == null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println("Student Number: "+root.getStudentNumber()+"/ reference value: "+root);
    }

    //PreOrder Traversal
    public void preOrder(StudentInfo root){
        if(root == null){
            return;
        }
        System.out.println("Student Number: "+root.getStudentNumber()+"/ reference value: "+root);
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
}
   


