import java.util.Scanner;
class Student
{
    private String name;
    private int regno;
    Student(String n,int r)
    {
        this.name=n;
        this.regno=r;
    }
    void display()
    {
        System.out.println("Name :: "+this.name+"\nRegno :: "+this.regno);
    }
}
class Mark extends Student
{
    private int M1,M2,M3;
    Mark(int r,String n,int m1,int m2,int m3)
    {
        super(n,r);
        this.M1=m1;
        this.M2=m2;
        this.M3=m3;
    }
    int totalmark()
    {
        return M1+M2+M3;
    }
    void dsplayMark()
    {
        System.out.println("Mark 1 :: "+M1+"\nMark 2 :: "+M2+"\nMark 3 :: "+M3);
    }
}
class Result extends Mark
{
    Result(int r,String n,int m1,int m2,int m3)
    {
        super(r,n,m1,m2,m3);
    }
    String grade()
    {
        int t=totalmark();
        float per= t/3;
        if(per>=90)
        {
            return "A";
        }
        else if(per>=80)
        {
            return "B";
        }
        else if(per>=70)
        {
            return "C";
        }
        if(per>=60)
        {
            return "D";
        }
        else
        {
            return "Failed";
        }
    }
    void marklist()
    {
        display();
        dsplayMark();
        System.out.println("Total mark :: "+totalmark()+"\nGrade :: "+grade());
    }
}
class main
{
    public static void main(String[] args)
    {
        String n;
        System.out.println("\n\nEnter details \n======++=====");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter regno :: ");
        int r=s.nextInt();
        System.out.print("Enter name :: ");
        n=s.next();
        System.out.print("Enter mark 1 :: ");
        int m1=s.nextInt();
        System.out.print("Enter mark 2 :: ");
        int m2=s.nextInt();
        System.out.print("Enter mark 3 :: ");
        int m3=s.nextInt();
        Result R=new Result(r,n,m1,m2,m3);
        System.out.println("\nResult \n==++====++==");
        R.marklist();
    }
}