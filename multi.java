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
    void displayMark()
    {
        System.out.println("Mark 1 ::- "+m1+"\nMark 2 ::- "+m2);
    }
}
interface sports
{
    int sportsweightage=20;
    void displaysports();
}
class Result extends Mark implements sports
{
    int total=0;
    Result(int a,int b,int c)
    {
        super(a,b,c);
        total=b+c;
    }
    void displaysports()
    {
        System.out.println("Weightage ::- "+sportsweightage);
    }
    void displayResult()
    {
        displayregno();
        displayMark();
        displaysports();
        System.out.println("Total ::- "+(total+sportsweightage));
    }
}
class Mainm
{
    public static void main(String[]arsg)
    {
        int no,m1,m2;
        Scanner so=new Scanner(System.in);
        System.out.println("Enter details::::\nregno\nmark 1\nmark 2\n::::::::");
        no=so.nextInt();
        m1=so.nextInt();
        m2=so.nextInt();
        Result r1 =new Result(no,m1,m2);
        r1.displayResult();
    }
}