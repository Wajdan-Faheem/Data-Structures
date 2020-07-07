public class StudentInfo {


    // Attributes

    public int studentNumber;
    public String firstName;
    public String lastName;
    public int age;
    public StudentInfo next;  // Holds the ref value of the next student in the linked list.
    
    
    // Constructors

    public StudentInfo() {
	// Populate the attributes with bogus data.
    	studentNumber = -1;
    	firstName = "a";
    	lastName = "z";
        age = -1;
    	next = null;
    }

    public StudentInfo(int sN, String fN, String lN, int age) {
    	studentNumber = sN;
    	firstName = fN;
    	lastName = lN;
        this.age = age;
    	next = null;
    }
    
    
    // Methods

    
}