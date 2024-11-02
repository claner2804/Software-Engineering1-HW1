package at.mci.claudiasteiner.week2.exercise4;

import at.mci.claudiasteiner.week1.exercise2.Student;
import java.util.List;
import java.util.ArrayList;


public class PhdStudent extends Student {

    protected String mastersDegree;

    private List<String> teachingsupport;

    public PhdStudent(String name, String group, int proficiencyInJava, int studentID, String gender) {
        super(name, group, proficiencyInJava, studentID, gender);

        this.mastersDegree = "defaultDegreeName";
        this.teachingsupport = new ArrayList<>();


    }

    public String getMastersDegree() {
        return mastersDegree;
    }

    public void setMastersDegree(String mastersDegree) {
        this.mastersDegree = mastersDegree;
    }

    public List<String> getTeachingsupport() {
        return teachingsupport;
    }

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
