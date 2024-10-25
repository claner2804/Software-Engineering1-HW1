package at.mci.claudiasteiner.exercise2;

public class Student {
    private String name;
    private String group;
    private int proficiencyInJava;
    private int studentID;
    private String gender;

    //dummy-Constructor
    public Student() {
        this.name = "dummy";
    }

    //Constructor
    public Student(String name, String group, int proficiencyInJava, int studentID, String gender) {
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentID = studentID;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getProficiencyInJava() {
        return proficiencyInJava;
    }

    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "The Student " +
                "named " + name +
                " in Group " + group + "\n"  +
                "has a proficiencyInJava of Level " + proficiencyInJava + "\n" +
                "studentID = " + studentID + ", " +
                "gender = " + gender + "\n";
    }
}
