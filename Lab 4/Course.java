import java.util.Scanner;

class Course {

    String courseName;
    String courseCode;


    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }


    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        // Create a Course object using user input
        Course course1 = new Course(courseName, courseCode);


        course1.displayCourseDetails();

        
        scanner.close();
    }
}
