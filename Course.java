public class Course {
    private String name;
    private int credit;
    private Student student;

    /** 
     * @param name
     * @param credit
     */
    public Course(String name, int credit){
        this.name=name;
        this.credit = credit;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
    public String getName(){
        return name;
    }
    public int getCredit(){
        return credit;
    }
    public Student getStudent(){
        return student;
    }
}
