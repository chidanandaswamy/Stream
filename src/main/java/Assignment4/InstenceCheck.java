package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class InstenceCheck {
	
	 public static void main(String[] arg) {
		   
	      ArrayList mylist=new ArrayList();
	      
	      System.out.println("Enter the number of instence : ");
	      Scanner sc=new Scanner(System.in);
	     
	      int t=sc.nextInt();
	      System.out.println("Enter the class name : ");
	    
	      for(int i=0;i<t;i++){
	    	  
	         String s=sc.next();
	         
	         if(s.equalsIgnoreCase("Student"))mylist.add(new Student());
	         if(s.equalsIgnoreCase("Rockstar"))mylist.add(new Rockstar());
	         if(s.equalsIgnoreCase("Hacker"))mylist.add(new Hacker());
	      }
	      System.out.println(count(mylist));
	 }

	static String count(ArrayList mylist)
	   {
	      int a=0,b=0,c=0;
	      for(int i=0;i<mylist.size();i++)
	      {
	         Object element=mylist.get(i);
	         if(element instanceof Student)
	            a++;
	         if(element instanceof Rockstar)
	            b++;
	         if(element instanceof Hacker)
	            c++;
	      }
	      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
	      return ret;
	   }

	  
  }
	
