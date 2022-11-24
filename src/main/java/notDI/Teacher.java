package notDI;

public class Teacher {
    private Student student;

    public Teacher() {
        student = new Student("Hiep", 10);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                '}';
    }

    public double getStudentMark() {
        return student.getMark();
    }
}
