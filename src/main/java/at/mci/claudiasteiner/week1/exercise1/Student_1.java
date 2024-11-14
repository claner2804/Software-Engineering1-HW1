package at.mci.claudiasteiner.week1.exercise1;

/**
 * The type Student 1.
 */
public class Student_1 {
    private String studentId; //is initialised with null
    private String name;
    private int age; //is initialized with 0
    private static int counter = 0; //static data member, class variable
    //static data members are not values that belong to a specific object to the class
    //but they are shared with all objects to the class
    //both tobias and clemens will share the same value for the static variable

    /**
     * Instantiates a new Student 1.
     */
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


    /**
     * Instantiates a new Student 1.
     *
     * @param name      the name
     * @param studentId the student id
     */
//constuructor
    public Student_1(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        counter++;
    }

    /**
     * Gets counter.
     *
     * @return the counter
     */
    public static int getCounter() {
        //System.out.println("Name of Student " + name); //you can not access non-static field in a static function
        return counter;
    }

    /**
     * Sets counter.
     *
     * @param counter the counter
     */
    public static void setCounter(int counter) {
        Student_1.counter = counter;
    }


    /**
     * Gets student id.
     *
     * @return the student id
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets student id.
     *
     * @param studentId the student id
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Print student info string.
     *
     * @return the string
     */
    public String printStudentInfo() {
        String result = "Student name: " + this.name + "\n"
                + "Age: " + this.age + "\n"
                + "StudentId: " + this.studentId;
        return result;
    }


    /**
     * Test params.
     *
     * @param value the value
     */
    public void testParams(int value) {
        value++;
        System.out.println("In method: Value: " + value);
    }


    /**
     * Test params 2.
     *
     * @param student1 the student 1
     */
    public void testParams2(Student_1 student1) {
        System.out.println("In method: we change the age from " + student1.getAge() + "to 1000");
        student1.setAge(1000);
    }

}
