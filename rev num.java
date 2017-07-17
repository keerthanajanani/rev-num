# rev-num
import java.io.*;
import java.util.*;
public class rev num
{
public static void main(String args[])throws IOException
{
int n,rev=0;
BufferedReader br=new BufferedReader(newInputStreamReader(System.in));
System.out.println("Enter the number to reverse");
n=Integer.parseInt(br.readLine());
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.println("reverse of entered number is : "+rev);
}
}
