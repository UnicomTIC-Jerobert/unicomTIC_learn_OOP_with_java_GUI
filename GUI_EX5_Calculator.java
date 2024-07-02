import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_EX5_Calculator {
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Java Calculator App");
        jFrame.setLayout(null);
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl_num1 = new JLabel("Enter Number 1 : ");
        lbl_num1.setBounds(50, 50, 150, 30);

        JTextField txt_num1 = new JTextField();
        txt_num1.setBounds(200, 50, 150, 30);

        JLabel lbl_num2 = new JLabel("Enter Number 2 : ");
        lbl_num2.setBounds(50, 100, 150, 30);

        JTextField txt_num2 = new JTextField();
        txt_num2.setBounds(200, 100, 150, 30);

        JButton btn_add = new JButton("+");
        btn_add.setBounds(50, 150, 50, 40);

        JButton btn_sub = new JButton("-");
        btn_sub.setBounds(100, 150, 50, 40);

        JButton btn_divide = new JButton("/");
        btn_divide.setBounds(150, 150, 50, 40);

        JButton btn_multiply = new JButton("x");
        btn_multiply.setBounds(200, 150, 50, 40);

        JButton btn_modulus = new JButton("%");
        btn_modulus.setBounds(250, 150, 50, 40);

        JLabel lbl_result = new JLabel("Result : ");
        lbl_result.setBounds(50, 200, 250, 30);
        lbl_result.setOpaque(true);
        lbl_result.setBackground(Color.PINK);

        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt_num1.getText());
                int num2 = Integer.parseInt(txt_num2.getText());

                int result = num1 + num2;
                System.out.println("Result of Addition is : " + result);

                lbl_result.setText("Result of Addition is : " + result);
            }
        });

        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt_num1.getText());
                int num2 = Integer.parseInt(txt_num2.getText());

                int result = num1 - num2;
                System.out.println("Result of Subtraction is : " + result);

                lbl_result.setText("Result of Subtraction is : " + result);
            }
        });

        btn_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt_num1.getText());
                int num2 = Integer.parseInt(txt_num2.getText());

                int result = num1 * num2;
                System.out.println("Result of Multiplication is : " + result);

                lbl_result.setText("Result of Multiplication is : " + result);
            }
        });

        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt_num1.getText());
                int num2 = Integer.parseInt(txt_num2.getText());

                int result = num1 / num2;
                System.out.println("Result of Division is : " + result);

                lbl_result.setText("Result of Division is : " + result);
            }
        });

        btn_modulus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt_num1.getText());
                int num2 = Integer.parseInt(txt_num2.getText());

                int result = num1 % num2;
                System.out.println("Result of Modulus Division is : " + result);

                lbl_result.setText("Result of Modulus Division is : " + result);
            }
        });

        jFrame.add(lbl_num1);
        jFrame.add(txt_num1);
        jFrame.add(lbl_num2);
        jFrame.add(txt_num2);
        jFrame.add(btn_add);
        jFrame.add(btn_sub);
        jFrame.add(btn_divide);
        jFrame.add(btn_multiply);
        jFrame.add(btn_modulus);
        jFrame.add(lbl_result);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
