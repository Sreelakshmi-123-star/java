import java.util.*;
class NegException extends Exception{
NegException(String s){
super(s);
}
}
class Average{
static void avg(int n) throws NegException
{
int sum=0,av,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers: ");
for(int i=0; i<n;i++)
{
a=sc.nextInt();
if(a<0)
{
throw new NegException("Negative nos: ");
}
else
{
sum=sum+a;
}
}
av=sum/n;
System.out.println(" avg of nos ="+av);
}
}
class exception2{
public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the limit of numbers.... ");
int n=sc1.nextInt();
Average a1=new Average();
try
{
a1.avg(n);
}
catch(NegException s)
{
System.out.println("negative nos...");
}
finally{
System.out.println("end....");
}
}
}

