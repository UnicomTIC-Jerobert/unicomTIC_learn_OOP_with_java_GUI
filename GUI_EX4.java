import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GUI_EX4{

    public static void main(String args[]){
        JFrame jframObj=new JFrame();
        jframObj.setSize(400,500);
        jframObj.setLayout(null);
        jframObj.setDefaultCloseOperation(3);

        JButton btn1=new JButton("Click Here 1");
        btn1.setBounds(50, 100, 200, 50);
        btn1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(jframObj, "Button 1 clicked", "Message Box", 0);
            }

        });

        JButton btn2=new JButton("Click Here 2");
        btn2.setBounds(50, 150, 200, 50);
        btn2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button 2 clicked", "Message Box", 0);
            }

        });

        jframObj.add(btn1);
        jframObj.add(btn2);

        jframObj.setVisible(true);
    }
}