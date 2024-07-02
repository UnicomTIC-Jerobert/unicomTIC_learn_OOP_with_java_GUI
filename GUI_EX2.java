import javax.swing.JButton;
import javax.swing.JFrame;

class GUI_EX2{
    public static void main(String args[]){
        JFrame jframObj=new JFrame();
        jframObj.setSize(400,500);
        jframObj.setLayout(null);
        jframObj.setDefaultCloseOperation(3);

        JButton btn1=new JButton("Click Here 1");
        btn1.setBounds(50, 100, 200, 50);

        JButton btn2=new JButton("Click Here 2");
        btn2.setBounds(50, 150, 200, 50);

        jframObj.add(btn1);
        jframObj.add(btn2);

        jframObj.setVisible(true);
    }
}