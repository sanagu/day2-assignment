public class DistanceMain{
public static void main(String[] args)
{
  Distance c=new Distance();
   c.set(12,13.6);
    c.disp();
  Distance c1=new Distance();
  c1.set(14,25.6);
  c1.disp();
  Distance c2;
   c2=c.add(c1);
    c2.disp();
}
}