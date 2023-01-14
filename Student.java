public class Student extends Person{
    protected int grade;

    public Student(String name, int age, int grade){
        super(name,age);
        this.grade = grade;
    }
    @Override
    public void getInfo(){
        System.out.println(" Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Grade :" + grade);
    }
}
