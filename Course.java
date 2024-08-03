import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private List<Student> students;
    private List<Assignment> assignments;
    private static int courseNumber=0;

    public Course(String courseName, List<Student> students, List<Assignment> assignments) {
        this.courseName = courseName;
        courseNumber+=1;
        this.id = courseNumber;
        this.students = students;
        this.assignments = assignments;
    }

    public Course (String courseName, List<Student> students) {
        this.courseName = courseName;
        courseNumber+=1;
        this.id = courseNumber;
        this.students = students;
    }

    public Course (String courseName) {
        this.courseName = courseName;
        courseNumber+=1;
        this.id = courseNumber;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public int getNumberOfAssignments() {
        return assignments.size();
    }

}

