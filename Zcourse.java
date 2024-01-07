public class Zcourse {
    private String courseName;
    private Zinstructor instructor;
    private Ztestbook textbook;

    public Zcourse(String course, Zinstructor instr, Ztestbook text) {
        courseName = course;
        instructor = instr;
        textbook = text;

    }

    public String getName() {
        return courseName;
    }

    public Zinstructor getInstructor() {
        return new Zinstructor(instructor);
    }

    public Ztestbook getTestbook() {
        return new Ztestbook(textbook);
    }

    public String toString() {
        String str = "Course Name: " + courseName + "\nInstructor: " + instructor + "\nTextbook: " + textbook;
        return str;
    }
}
