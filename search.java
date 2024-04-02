import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
class dbopsearch extends JFrame implements ActionListener
{
JTextField regno,name,mark;
JButton sea,cle;
JLabel lregno,lname,lmark,status;
dbopsearch(){
setTitle("Student Management System");
setSize(600,600);
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
lregno=new JLabel("Register number");
lregno.setBounds(50,50,150,50);add(lregno);
regno=new JTextField();
regno.setBounds(160,50,150,50);add(regno);
lname=new JLabel("Name");
lname.setBounds(50,110,150,50);add(lname);
name=new JTextField();
name.setBounds(160,110,150,50);add(name);
lmark=new JLabel("Mark");
lmark.setBounds(50,170,150,50);add(lmark);
mark=new JTextField();
mark.setBounds(160,170,150,50);add(mark);
sea=new JButton("Search");sea.setBounds(480,100,100,50);add(sea);
cle=new JButton("Clear");cle.setBounds(480,150,100,50);add(cle);
status=new JLabel("-----------");status.setBounds(50,350,250,250);add(status);
sea.addActionListener(this);
cle.addActionListener(this);
setVisible(true);
}
public void actionPerformed(ActionEvent ae){
Object source;
source=ae.getSource();
if(source==sea)
search();
else if(source==cle)
clear();
}void search()
{
Connection con=null;
try{
con=DBConnect();
int reg=Integer.parseInt(regno.getText());
String sql="select id,name,mark from s4ct where id=?";
PreparedStatement prs=con.prepareStatement(sql);prs.setInt(1,reg);
ResultSet rs=prs.executeQuery();
if(!rs.next())
{
status.setText("There is no student with register number : "+reg+" in this class!!!");
}
else
{
name.setText(rs.getString(2));
mark.setText(Integer.toString(rs.getInt(3)));
status.setText("Student with : "+reg+" found in this class");
}
con.close();
}
catch(SQLException e){e.printStackTrace();}
}
void clear(){
regno.setText("");
name.setText("");
mark.setText("");
status.setText("");
}
Connection DBConnect()
{
Connection conn=null;
try{
Class.forName("com.mysql.cj.jdbc.Driver");
conn=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/myDB","root","Password*123");
}catch(Exception e)
{ System.out.println(e);}
return conn;
}
public static void main(String args[])
{
new dbopsearch();
}
}