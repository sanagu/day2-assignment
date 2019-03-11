class TimeMain{
public static void main(String[] args)
{
   Time t1=new Time();
   t1.setTime(1,70);
    t1.showTime();
   Time t2=new Time();
   t2.setTime(2,80);
 t2.showTime();
   Time t3;
   t3=t1.add(t2);
   t3.showTime();
}
}
