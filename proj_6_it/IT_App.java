import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Student {
    private String nicNumber;
    private String name;

    Student(String nicNumber, String name) {
        this.nicNumber = nicNumber;
        this.name = name;
    }

    public String getNicNumber() {
        return this.nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    @Override
    public String toString() {
        return "{ NIC number : " + this.nicNumber + " , Name : " + this.name + " }";
    }
}

class Institute {

    private static List<Student> studentsList = new ArrayList<>();

    public static void registerStudent(Student student) {
        studentsList.add(student);
    }

    public static void displayStudent() {
        System.out.println(studentsList);
    }
}

public class IT_App {
    public static void main(String[] args) {
        JFrame frameRegister = new JFrame("Student Register");
        frameRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegister.setLayout(null);

        JLabel lbl_nic = new JLabel("NIC Number : ");
        lbl_nic.setBounds(50, 100, 200, 30);

        JTextField txt_nic = new JTextField();
        txt_nic.setBounds(50, 135, 200, 30);

        JLabel lbl_name = new JLabel("Name : ");
        lbl_name.setBounds(50, 170, 200, 30);

        JTextField txt_name = new JTextField();
        txt_name.setBounds(50, 205, 200, 30);

        JButton btn_register = new JButton("Register");
        btn_register.setBounds(50, 250, 200, 30);

        JButton btn_display = new JButton("Display");
        btn_display.setBounds(50, 300, 200, 30);

        btn_register.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nicNumber = txt_nic.getText();
                String name = txt_name.getText();

                Student student = new Student(nicNumber, name);

                Institute.registerStudent(student);
            }

        });

        btn_display.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Institute.displayStudent();
            }

        });

        frameRegister.setSize(400, 500);

        frameRegister.add(lbl_nic);
        frameRegister.add(txt_nic);
        frameRegister.add(lbl_name);
        frameRegister.add(txt_name);
        frameRegister.add(btn_register);
        frameRegister.add(btn_display);

        frameRegister.setVisible(true);

        // Institute.registerStudent(new Student("1732372687", "kumar"));
        // Institute.registerStudent(new Student("1732372687", "ravi"));
        // Institute.registerStudent(new Student("1732372687", "ram"));

        // Institute.displayStudent();
    }
}