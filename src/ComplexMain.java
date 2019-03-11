public class ComplexMain
{
    public static void main(String[] args)
    {
      Complex obj1=new Complex();
      obj1.set(3,4);
      obj1.disp();
      Complex obj2=new Complex();
      obj2.set(4,5);
      obj2.disp();
      Complex c;
       c= obj1.sum(obj2);
	c.disp();
    }
}