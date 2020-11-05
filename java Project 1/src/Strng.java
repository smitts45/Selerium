
public class Strng

{
public static void main(String[] args)
{
	String s1= "This is directly defined String s1";
	System.out.println(s1);
	String s2= new String("Object defined string s2");
	System.out.println(s2);
	System.out.println(s1+ "  " +s2);
	System.out.println(s1.length());
	System.out.println(s2.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s1.isEmpty());
	System.out.println(s2.charAt(5));
	System.out.println(s1.indexOf('i'));
	System.out.println(s2.contains("dfi"));
	System.out.println(s1.toUpperCase());
	s1= s1.concat(s2);
	System.out.println(s1);
	
	String s3= " smita";
	String s4 = "smita";
	System.out.println(s3.equals(s4));
	System.out.println(s3.trim().equals(s4));
	System.out.println(s1.substring(8,14));
	System.out.println(s3.replace('s','a'));
	String[] str= s2.split(" ");
	System.out.println(str[0]);
	System.out.println(str[1]);
	System.out.println(str[2]);
	System.out.println(str[3]);
	
	
	
}
}
