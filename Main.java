import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Data Student");
        window.setSize( 300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JButton button = new JButton( "Tampilkan Data Mahasiswa");
        window.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Student student = new Student("DICKY DWI APRIYANTO", 20, 3);
                student.getInfo();        
                Course course = new Course("UAS PBO", 90);
                course.setStudent(student);

                System.out.println("Course Name :" + course.getName());
                System.out.println("Credit :" + course.getCredit());
                System.out.println("Student : " + course.getStudent().name);


            }
        });
        window.setVisible(true);
    }
    
}
