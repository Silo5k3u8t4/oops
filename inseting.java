import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
class dbinsert extends JFrame implements ActionListener
{
    Connection DBConnect()
    {
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
        
    }
    JTextField tregno,name,mark;
    JButton sea,lis,ins,del,upd,cle;
    JLabel lregno,lname,lmark,status;
    dbinsert()
    {
        setTitle("Student Management System");
        setSize(600,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        lregno=new JLabel("Register number");
        lregno.setBounds(20,50,100,50);
        add(lregno);
        tregno=new JTextField();
        tregno.setBounds(180,50,100,50);
        add(tregno);
        lname=new JLabel("Name");
        lname.setBounds(20,110,100,50);
        add(lname);
        name=new JTextField();
        name.setBounds(180,110,100,50);
        add(name);
        lmark=new JLabel("Mark");
        lmark.setBounds(20,170,100,50);
        add(lmark);
        mark=new JTextField();
        mark.setBounds(180,170,100,50);
        add(mark);
        ins=new JButton("Insert");
        ins.setBounds(350,150,100,50);
        add(ins);
        cle=new JButton("Clear");
        cle.setBounds(350,300,100,50);
        add(cle);
        status=new JLabel("-----------");
        status.setBounds(50,350,250,50);
        add(status);
        ins.addActionListener(this);
        cle.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        Object source;
        source=ae.getSource();
        if(source==ins)
            insert();
        else if(source==cle)
            clear();
    }
    void insert()
    {
        Connection con=null;
        String sql;
        try{
            con=DBConnect();
            String reg=tregno.getText();
            Statement stmnt=con.createStatement();
            sql="select * from s4ct where regno = '"+reg+"'";
            ResultSet rs=stmnt.executeQuery(sql);
            if(rs.next())
            {
                status.setText(reg+" already exists!!!");
            }
            else
            {
                String sname=name.getText();
                int smark=Integer.parseInt(mark.getText());
                sql="insert into s4ct(regno,Name,Mark) values (?,?,?)";
                PreparedStatement prs=con.prepareStatement(sql);
                prs.setString(1,reg);
                prs.setString(2,sname);
                prs.setInt(3,smark);
                prs.executeUpdate();
                status.setText(reg+" successfully Inserted!!!");
            }
            con.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    void clear()
    {
        tregno.setText("");
        name.setText("");
        mark.setText("");
        status.setText("");
    }
    public static void main(String args[])
    {   
        new dbinsert();
    }
}