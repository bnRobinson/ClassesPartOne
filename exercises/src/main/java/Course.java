package exercises.src.main.java;

import java.util.ArrayList;

public class Course {
    private String Name;
    private String Instructor;
    private int courseCode;

    public ArrayList<String> topics;

    public Course(String Name, String Instructor, int courseCode, ArrayList<String>topics){
        this.Name=Name;
        this.Instructor= Instructor;
        this.courseCode=courseCode;
        this.topics=topics;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
}
