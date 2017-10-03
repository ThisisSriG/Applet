import java.io.*;
class Circle
{
public static void main(String[] args)throws IOException
{
double a,r;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter r");
r=Double.parseDouble(br.readLine());
a=3.14*r*r;
System.out.println("Area of Circle="+a);
}
}

