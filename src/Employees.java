import java.util.*;
import java.lang.Math;
 public class Employees{
int id;
String name;
double monthlyBasic;
public Employees(){

}
public Employees(int id,String name,double monthlyBasic){
this.id=id;
this.name=name;
this.monthlyBasic=monthlyBasic;
}
public double getAnnualBasic(){
return 12*monthlyBasic;

}
public double getMonthlyGrossSalary(){
  return monthlyBasic+monthlyBasic*0.05+1250+800;
}
public double getAnnualGrossSalary(){
  return 12*getMonthlyGrossSalary();
}
public double getMonthlyDeductions(){
double esic=0; 
if(monthlyBasic*0.0475 <= 5000)
esic=4.75*monthlyBasic*0.0475;
else
esic=0;
  double proTax=0;
if(getMonthlyGrossSalary()<= 10000)
proTax=50;
else
proTax=100;
return monthlyBasic*0.01+esic+proTax;
}
public double getMonthlyTakeHome(){

return getMonthlyGrossSalary()-getMonthlyDeductions();
}

public static void main(String[] args){
 

Employees e=new Employees(121,"segu",65);
System.out.println("AnnualBasic="+e.getAnnualBasic()); 
System.out.println("MonthlyGrossSalary="+e.getMonthlyGrossSalary()); 
System.out.println("AnnualGrossSalary="+e.getAnnualGrossSalary()); 
System.out.println("monthlydeductions="+e.getMonthlyDeductions()); 
System.out.println("MonthlyTakehome="+e.getMonthlyTakeHome()); 
}
}