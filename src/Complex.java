public class Complex{
 private int real;
private  double imaginary;
 
public void set(int real,double imaginary)
{
this.real=real;
this.imaginary=imaginary;
}
public void disp(){

System.out.println(real+"+"+"i"+imaginary);
}
public Complex sum(Complex c)
{
   Complex c1=new Complex();
    c1.real=this.real+c.real;
    c1.imaginary=this.imaginary+c.imaginary;
    return c1;`		
}
}



