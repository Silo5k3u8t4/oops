import java.util.Scanner;
class Employee
{
    int employeeID;
    String empName;
    Employee(int eid,String n)
    {
        employeeID=eid;
        empName=n;
    }
    void display()
    {
        System.out.println("\n\nEmployeeID ::- "+employeeID+"\nEmployee name ::- "+empName);
    }
}
class Engineer extends Employee
{
    String branch;
    Engineer(int  eid,String ename,String b)
    {
        super(eid, ename);
        branch=b;
    }
    void displayEng()
    {
        display();
        System.out.println( "Branch ::- "+branch);
    }
}
class Typist extends Employee
{
    int typingspeed;
    Typist(int id,String name,int speed)
    {
        super(id, name);
        typingspeed =speed;
    }
    void displayTypist()
    {
        display();
        System.out.println("Typing speed ::- "+typingspeed);
    }
}
class hiemain
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int c=0;
        String n,b;
        int S,id;
        System.out.println("1.Engineer \n2.Typist\n3.exit");
        while(true)
        {
            System.out.print("\nEnter your coice :: ");
            c=s.nextInt();
            if(c==1)
            {
                System.out.print("Enter EmployeeID :: ");
                id=s.nextInt();
                System.out.print("Enter name ::");
                n=s.next();
                System.out.print("Enter branch :: ");
                b=s.next();
                Engineer e= new Engineer(id,n,b);
                e.displayEng();
            }
            else if(c==2)
            {
                System.out.print("Enter EmployeeID :: ");
                id=s.nextInt();
                System.out.print("Enter name ::");
                n=s.next();
                System.out.print("Enter typing speed :: ");
                S=s.nextInt();
                Typist t1=new Typist(id, n, S);
                t1.displayTypist();
            }
            else if(c==3)
            {
                break;
            }
            else
            {
                System.out.println("Wrong choice!!!");
            }
        }
        s.close();

    }
}