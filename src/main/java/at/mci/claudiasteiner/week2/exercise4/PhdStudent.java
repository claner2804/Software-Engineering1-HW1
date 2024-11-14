package at.mci.claudiasteiner.week2.exercise4;

import at.mci.claudiasteiner.week1.exercise2.Student;
import java.util.List;
import java.util.ArrayList;


/**
 * The type Phd student.
 */
public class PhdStudent extends Student {

    /**
     * The Masters degree.
     */
    protected String mastersDegree;

    private List<String> teachingsupport;

    /**
     * Instantiates a new Phd student.
     *
     * @param name              the name
     * @param group             the group
     * @param proficiencyInJava the proficiency in java
     * @param studentID         the student id
     * @param gender            the gender
     */
    public PhdStudent(String name, String group, int proficiencyInJava, int studentID, String gender) {
        super(name, group, proficiencyInJava, studentID, gender);

        this.mastersDegree = "defaultDegreeName";
        this.teachingsupport = new ArrayList<>();


    }

    /**
     * Gets masters degree.
     *
     * @return the masters degree
     */
    public String getMastersDegree() {
        return mastersDegree;
    }

    /**
     * Sets masters degree.
     *
     * @param mastersDegree the masters degree
     */
    public void setMastersDegree(String mastersDegree) {
        this.mastersDegree = mastersDegree;
    }

    /**
     * Gets teachingsupport.
     *
     * @return the teachingsupport
     */
    public List<String> getTeachingsupport() {
        return teachingsupport;
    }

    /**
     * Sets teachingsupport.
     *
     * @param teachingsupport the teachingsupport
     */
    public void setTeachingsupport(List<String> teachingsupport) {
        this.teachingsupport = teachingsupport;
    }


    @Override
    public String toString() {
        return "PhdStudent{" +
                "mastersDegree='" + mastersDegree + '\'' +
                ", teachingsupport=" + teachingsupport +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", proficiencyInJava=" + proficiencyInJava +
                ", studentID=" + studentID +
                ", gender='" + gender + '\'' +
                '}';
    }
}
