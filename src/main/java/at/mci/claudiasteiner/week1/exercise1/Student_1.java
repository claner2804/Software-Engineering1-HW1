package at.mci.claudiasteiner.week1.exercise1;

public class Student_1 {
    private String studentId; //is initialised with null
    private String name;
    private int age; //is initialized with 0
    private static int counter = 0; //static data member, class variable
    //static data members are not values that belong to a specific object to the class
    //but they are shared with all objects to the class
    //both tobias and clemens will share the same value for the static variable

    //dummy constuctor
    /*
    The Constructor is NOT a method, because it does not have a return type
    Constructors are not CALLED they are USED
    you are running a behaviour with a method, with a constructor you are allocating space in memory with new Classname(params);
     */
    public Student_1() {
        this.name = "Dummy";
        this.studentId = "XXX";
        this.age = 0;
        counter++;
    }


    //constuructor
    public Student_1(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        counter++;
    }

    public static int getCounter() {
        //System.out.println("Name of Student " + name); //you can not access non-static field in a static function
        return counter;
    }

    public static void setCounter(int counter) {
        Student_1.counter = counter;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String printStudentInfo() {
        String result = "Student name: " + this.name + "\n"
                + "Age: " + this.age + "\n"
                + "StudentId: " + this.studentId;
        return result;
    }


    public void testParams(int value) {
        value++;
        System.out.println("In method: Value: " + value);
    }


    public void testParams2(Student_1 student1) {
        System.out.println("In method: we change the age from " + student1.getAge() + "to 1000");
        student1.setAge(1000);
    }

}
