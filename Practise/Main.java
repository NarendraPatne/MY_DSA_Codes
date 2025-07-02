import java.util.*;
public class Main
{
public static void main (String[]args)
{
String str="abc";
str=str+"\0";
System.out.println(str);
int i;
for(i=0;str.charAt(i)!='\0';i++);
System.out.println(i);
}
}