import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener{
    JLabel lbln1,lbln2,lblres,head;
    JTextField txtn1,txtn2,txtres;
    JButton btnadd,btnsub,btnclr;
    Calculator(){
        JFrame jfrm=new JFrame("Math calculator");
        lbln1=new JLabel("NUMBER 1 ::: ");
        lbln2=new JLabel("NUMBER 2 ::: ");
        lblres=new JLabel("RESULT  ::: ");
        head=new JLabel("_++_++_++_CALCULATOR_++_++_++_");
        txtn1=new JTextField("");
        txtn2=new JTextField("");
        txtres=new JTextField("0");
        btnadd=new JButton("ADD");
        btnsub=new JButton("SUB");
        btnclr=new JButton("CLEAR");
        txtres.setEditable(false);
        jfrm.setSize(500,500);
        jfrm.setLayout(null);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbln1.setBounds(100,50,100,50);
        lbln2.setBounds(100,120,100,50);
        lblres.setBounds(100,196,100,50);
        head.setBounds(118,10,450,50);
        txtn1.setBounds(250,50,100,50);
        txtn2.setBounds(250,100,100,50);
        txtres.setBounds(250,200,100,50);
        btnadd.setBounds(100,300,75,50);
        btnsub.setBounds(180,300,75,50);
        btnclr.setBounds(300,300,75,50);
        jfrm.add(head);
        jfrm.add(lbln1);
        jfrm.add(lbln2);
        jfrm.add(lblres);
        jfrm.add(txtn1);
        jfrm.add(txtn2);
        jfrm.add(txtres);
        jfrm.add(btnadd);
        jfrm.add(btnsub);
        jfrm.add(btnclr);
        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnclr.addActionListener(this);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        float n1,n2,r;
        n1=Float.parseFloat(txtn1.getText());
        n2=Float.parseFloat(txtn2.getText());
        String cmd=ae.getActionCommand();
        if(cmd.equals("ADD")){
            r=n1+n2;
            txtres.setText(Float.toString(r));
        }
        else if(cmd.equals("SUB")){
            r=n1-n2;
            txtres.setText(Float.toString(r));
        }
        else{
            txtn1.setText("");
            txtn2.setText("");
            txtres.setText("0");
        }
    }
}
class maincalc{
    public static void main(String[] args) {
        new Calculator();
    }
}