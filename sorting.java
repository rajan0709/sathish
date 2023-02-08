import java.io.*;
class sorting
{
public static void main(String arg[])throwsIOException
{
int i,j,n;
int a[]=new int[100];
System.out.println("enter the values");
DataInputStream d=new DataInputStream(System.in);
System.out.println("enter the no of values");
n=Integer.parseInt(d.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(d.readLine());
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}                               
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
