import java.util.*;
import java.io.*;
class pattern{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
 for(int j=1;j<=i;j++)
{
   System.out.print("*"); 
}
for(int k=1;k<=4-i+1;k++)
{
  System.out.print(" ");
}
for(int k=1;k<=4-i+1;k++)
{
  System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
   System.out.print("*"); 
}
System.out.println();
}
for(int i=1;i<=4;i++)
{
 for(int j=1;j<=4-i+1;j++)
{
   System.out.print("*"); 
}
for(int k=1;k<=i;k++)
{
  System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
  System.out.print(" ");
}
for(int j=1;j<=4-i+1;j++)
{
   System.out.print("*"); 
}
System.out.println();
}

}
}