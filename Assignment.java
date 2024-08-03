public class Assignment {
    private int id=0;
    private int grade;
    private Course course;
    private static int assignmentNumber=0;
    private String assignmentName;

    public Assignment(String assignmentName, Course course, int grade) {
        this.course = course;
        assignmentNumber+=1;
        this.id=assignmentNumber;
        this.grade=grade;
        this.assignmentName=assignmentName;
    }

    public Assignment(String assignmentName, Course course) {
        this.course = course;
        assignmentNumber+=1;
        this.id=assignmentNumber;
    }

    public int getId() {
        return id;
    }

    public int getGrade(){
        return grade;
    }

    public Course getCourse() {
        return course;
    }

    public String getAssignmentName() {
        return assignmentName;
    }



}
