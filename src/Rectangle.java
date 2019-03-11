class Rectangle{
private double length;
private double breadth;
Rectangle(){

}
public Rectangle(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}
public double area(){
return length*breadth;
}
public double perimeter(){
return 2*(length+breadth);
}
public void compare(Rectangle r,Rectangle r1){
if((r.area() == r1.area())&&(r.perimeter() == r1.perimeter()))
System.out.println("Areas are same");
else
System.out.println("Areas are not same");
}
}