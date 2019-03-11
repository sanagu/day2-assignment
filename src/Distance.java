public class Distance{
int feet;
double inches;
 public void set(int feet,double inches)
{
this.feet=feet;
this.inches=inches;
}
public void disp(){
 
if(inches>=12)
{
  feet=feet+1;
  inches=inches-12;
}
System.out.println("Distance = "+feet+"feet"+"  "+inches+"inches");

}

public Distance add(Distance c2){
Distance c3=new Distance();
c3.feet=this.feet+c2.feet;
c3.inches=this.inches+c2.inches;
return c3;
}
}
    