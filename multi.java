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
