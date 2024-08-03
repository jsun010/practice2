public class Assignment {
    private int id=0;

    private Course course;
    private static int assignmentNumber=0;
    private String assignmentName;


    public Assignment(String assignmentName, Course course) {
        this.course = course;
        assignmentNumber+=1;
        this.id=assignmentNumber;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public String getAssignmentName() {
        return assignmentName;
    }



}
