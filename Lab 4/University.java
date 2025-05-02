class University {
    // Static variable: Shared by all student objects
    static String universityName = "UPES University";

    // Non-static variable: Unique to each student object
    String studentName;

    // Constructor to set the student's name
    public University(String name) {
        studentName = name;
    }


    public static void showUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void showStudentName() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {

        University student1 = new University("Ayush");
        University student2 = new University("Rishu");
        University student3 = new University("Daksh");


        showUniversityName();


        student1.showStudentName();
        student2.showStudentName();
        student3.showStudentName();


        universityName = "ABC University";


        showUniversityName();
    }
}
