//Wajdan Faheem
//665997
public class StudentInfo {


    // Attributes

    private int studentNumber;
    private String firstName;
    private String lastName;
    private int age;
    private StudentInfo left;
    private StudentInfo right; 


    // Constructors

    public StudentInfo(int sN, String fN, String lN,int sA) {
    	studentNumber = sN;
        firstName = fN;
        lastName = lN;
        age = sA;
        right = null;
        left = null;
    }
		
	

	public int getStudentNumber() {
		return studentNumber;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fN) {
		firstName = fN;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lN) {
		lastName = lN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int sA) {
		age = sA;
	}

	public StudentInfo getLeft() {
		return left;
	}

	public void setLeft(StudentInfo left) {
		this.left = left;
	}

	public StudentInfo getRight() {
		return right;
	}

	public void setRight(StudentInfo right) {
		this.right = right;
	}



    // Methods


}