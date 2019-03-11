class Time{
int hour;
int minutes;
public void setTime(int hour,int minutes)
{
   this.hour=hour;
   this.minutes=minutes;
}
public void showTime()
{
if(minutes>=60)
{
    minutes=minutes-60;
   hour=hour+1;
}
System.out.println("Time ="+hour+"hours"+" "+minutes+"miutes");
}
public Time add(Time t3)
{
    Time t=new Time();
   t.hour=this.hour+t3.hour;
   t.minutes=this.minutes+t3.minutes;
   return t;
}
}