import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Course> courses;
    private static int studentNumber=0;

    public Student(String name){
        this.name = name;
        studentNumber+=1;
        this.id = studentNumber;
    }

    public Student (String name, List<Course> courses){
        this.name = name;
        studentNumber+=1;
        this.id = studentNumber;
        this.courses = courses;
    }

   public void addCourse(Course course){
        courses.add(course);
   }

   public void removeCourse(Course course){
        courses.remove(course);
   }

   public String getName(){
        return name;
   }

   public int getId(){
        return id;
   }

   public List<Course> getCourses(){
        return courses;
   }

   public int getStudentAverageGrade(Course course){
        int sum=0;
        for(Assignment assignment:course.getAssignments()){
           sum+=assignment.getGrade();
        }
        return sum/courses.size();
   }
}
