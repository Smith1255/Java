/**
 * Student.java
 * 
 * Represents a college student
 * 
**/
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int testGrade1 = 0, testGrade2 = 0, testGrade3 = 0;
    
    //---------------------------------------------------------------------------------------------------
    //Sets up this Student object with the specified initial values
    //---------------------------------------------------------------------------------------------------
    public Student (String first, String last, Address home, Address school, int grade1, int grade2, int grade3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testGrade1 = grade1;
        testGrade2 = grade2;
        testGrade3 = grade3;
        
    }
    
    //---------------------------------------------------------------------------------------------------
    //Sets test values to indicated score
    //---------------------------------------------------------------------------------------------------
    public void setTestScore (int testNum, int score) {
       char test = (char) (testNum+48);
        if (score >= 0){
            switch (test) {
                case '1':
                    testGrade1 = score;
                    break;
                case '2':
                    testGrade2 = score;
                    break;
                case '3':
                    testGrade3 = score;
                    break;
                default:
                    System.out.println ("Invalid Test Number");
                }
        }else
            System.out.println ("Invalid Score");
    }
    
    //---------------------------------------------------------------------------------------------------
    //Returns the test value for the indicated test number
    //---------------------------------------------------------------------------------------------------
    public int getTestScore (int testNum) {
        char test = (char) (testNum+48);
        switch (test) {
            case '1':
                return testGrade1;
            case '2':
                return testGrade2;
            case '3':
                return testGrade3;
            default:
                System.out.println ("Invalid Test Number");
                return -1;
            }
    }
    
    //---------------------------------------------------------------------------------------------------
    //Computes the average of the 3 scores
    //---------------------------------------------------------------------------------------------------
    public double averageScore () {
        return (testGrade1 + testGrade2 + testGrade3) / 3.0;
    }
    
    //---------------------------------------------------------------------------------------------------
    //Returns this Student object as a string
    //---------------------------------------------------------------------------------------------------
    public String toString () {
        String result;
    
        result = firstName + " " + lastName + "\n";
        result += "Home Address: \n" + homeAddress + "\n";
        result += "School Address: \n" + schoolAddress + "\n";
        result += "Test Grades: \n" + testGrade1 + "\n" + testGrade2 + "\n" + testGrade3 + "\n";
        result += "Average: \n" + Math.round(averageScore()) + "\n";
        
        return result;
    }
}