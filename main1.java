/* 
//1 
public class Main {
	public static void main(String[] args) {
	String a= "mohit";
	float b=6.6f;
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.length( ));
	String a2= a.replace('t','m');
	System.out.println(a2);
	String name= "mohit meena";
	System.out.println(name.substring(0,3));
	
	}
}
*/



//2
/* 
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
	//arrays
	int[] marks= new int[3];
	marks[0]=97;
	marks[1]=98;
	marks[2]=96;
	System.out.println(marks[0]);
	System.out.println(marks.length); //length
	System.out.println(marks[0]);
	Arrays.sort(marks);  //ascending order:- result 96 (smallest v) //for this program we add new module import java.util.Arrays
	
	System.out.println(marks[0]);
	
	int[] marks2={66,67,69};
	int[][] finalmarks={{5,9,5},{8,7,6}};
	System.out.println(marks2[0] );
	System.out.println(finalmarks[1][0]); //print 8
	
	
	}
}

*/


/* 
//3
public class Main {
	public static void main(String[] args) {
	//casting
	double price=100.00;
	double finalprice= price+18;
	System.out.println(finalprice);
	//in above two line we adding int in double (this is possible) because double has capacity of 8bytes and int has capacity of 4 bytes , but if it was inverse(we add double in int :- this is not possible) example

	// int p=100;
	// int fp= p+18.0;
	
	
	int p=100;
	int fp=p+(int)18.08;
	System.out.println(fp);
	
	}
}
*/ 



/* 
#4
public class Main {
	public static void main(String[] args) {
	//constat
	final float pi=3.14f;    //now i can't change the value of pi with this code
	//pi=3.2f;
	System.out.println(pi);
	
	
	
	// operators
	int a=1;
	int b=2;
	//double a=1;
	//double b=2;
	int sum=a+b;
	int sub=a-b;
	int multi=a*b;
	int remainder=a%b; // %:- this operator is modulo
	// int/double div=a/b; // for division i have to write double instead of int (double a, double b, double div)
	System.out.println(remainder);
	
	
	
	int num=1;
	//num++ ; // this is equal to num=num+1
	//System.out.println(num++); 
	//System.out.println(++num);
	//System.out.println(num);
	
	
	//System.out.println(num--); 
	//System.out.println(--num); 
	//System.out.println(num);
	
	
	}
}
*/



/* 
#5
public class Main {
	public static void main(String[] args) {
	//Maths
	System.out.println(Math.max(5,6));
	System.out.println(Math.min(7,9));
	System.out.println(Math.random());
	System.out.println((int)(Math.random()*100));
	
	}
}
*/


/* 
#6
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
	// taking input in java
	Scanner sc =new Scanner(System.in);
	System.out.println("input your age :");
	int age= sc.nextInt();
	//float age=sc.nextFloat();
	System.out.println(age);
	
	
	System.out.println("input your name:-");
	String name=sc.nextLine(); // for printing sentence ,if i use only next instead of nextLine ,this will print only one word even i type sentence
	System.out.println(name);
	
	
	
	//comparison operator
	// a==b, a !=b, a<b, a>b, a<=b, a>=b
	}
}
*/



/* 
#7
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	//conditional statements
	
	//#
	int age=30;
	if (age>18)
	    System.out.println("can vote");
	 else
	    System.out.println("can't' vote");
	    
	  //# logical operator
	  // &&  :- logical AND operator
	  int a=30;
	  int b= 40;
	  if (a<50 && b<50)
	     System.out.println("both less");
	 // for above code both condition should true then print the output, if i took a= 60 there will nothing print
	 
	 // || :- logical OR operator
	 
	 
	 //NOT operator
	 boolean isadult=true;
	 if (isadult!=true)  // i can also write this:- if (!isadult)
	    System.out.println("is adult");
	  else
	    System.out.println("not adult");
	    
	 
	 
	 //one example on conditional statement
	 
	 Scanner sc= new Scanner(System.in);
	 // pen= 10rs and notebook =40rs
	 int cash=sc.nextInt();
	 if (cash<10) {
	 	System.out.println("cannot buy anything");
	 	System.out.println("get more cash");
	 }
	 // we use curly bracket after if ,this bracket we use when we have to print more than one statement
	 else if (cash>10 && cash <50) {
	    System.out.p

*/