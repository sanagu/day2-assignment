class RectangleMain
{

public static void main(String[] args){

Rectangle r=new Rectangle(3,4);
System.out.println("Area of a rectangle is =" + r.area());
System.out.println("perimeter of a rectangle is =" + r.perimeter());
Rectangle r1=new Rectangle(4,5);
System.out.println("Area of a rectangle is =" + r1.area());
System.out.println("perimeter of a rectangle is =" + r1.perimeter());
Rectangle r2=new Rectangle();
r2.compare(r,r1);
     }

}