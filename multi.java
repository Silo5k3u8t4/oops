import java.util.Scanner;
class Student
{
    int regno;
    Student( int no)
    {
        regno=no;
    }
    void displayregno()
    {
        System.out.println("Regno ::- "+regno);
    }
}
class Mark extends Student
{
    int m1,m2;
    Mark(int r,int a,int b)
    {
        super(r);
        m1=a;
        m2=b;
    }
    void display
}