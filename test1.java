import java.util.*;
class even extends Thread
{
public void run(){
for(int i=0;i<=100;i++)
{
if(i%2==0){
System.out.println(i);
}
}
}
}
class test1
{
public static void main(String args[])
{
even t=new even();
t.start();
}
}


