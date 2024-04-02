import java.util.Scanner;
class Rectangle
{
    Scanner s=new Scanner(System.in);
    int length,breadth;
    Rectangle()
    {
        System.out.print("Enter length:: ");
        this.length=s.nextInt();
        System.out.print("Enter breadth:: ");
        this.breadth=s.nextInt();
    }
    void displayLB()
    {
        System.out.println("length :- "+length);
        System.out.println("breadth :- "+breadth);
    }
    int area()
    {
        int a=length*breadth;
        return a;
    }
}
class Box extends Rectangle
{
    int height;
    Box()
    {
        System.out.print("Enter height:: ");
        this.height=s.nextInt();
    }
    void displayH()
    {
        displayLB();
        System.out.println("height :- "+height);
    }
    
    int volume()
    {
        int v=length*breadth*height;
        return v;
    }
}
class Main
{   
    public static void main(String[] args)
    {   
        Scanner p=new Scanner(System.in);
        System.out.println("1.Rectangle.\n2.Box\n3.Exit");
        int ch=0;
        while(ch!=3)
        {
            System.out.print("Enter your choice :: ");
            ch=p.nextInt();
            if(ch==1)
            {
                Rectangle r=new Rectangle();
                r.displayLB();
                System.out.println("The area :: "+r.area());
            }
            else if(ch==2)
            {
                Box B=new Box();
                B.displayH();
                System.out.println("The Volume :: "+B.volume());
            }
        }
    }
}