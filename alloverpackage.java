package sy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SYMarks
{
 public int ctotal,etotal,mtotal;

 public void get()
  {
   try
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
     ctotal=Integer.parseInt(br.readLine());
     etotal=Integer.parseInt(br.readLine());
     mtotal=Integer.parseInt(br.readLine());
    }
   catch(Exception e){ }
  }
}
***********************************TYMarks.java********************************
package ty;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TYMarks
{
 public int theory,practicals;

 public void accept()
  {
   try
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
     System.out.println("Enter TY subject marks:");  

     System.out.println("Enter Theory marks out of 600:");         
     theory=Integer.parseInt(br.readLine());
         
     System.out.println("Enter Practical's marks out of 300:");    
     practicals=Integer.parseInt(br.readLine());
     System.out.println("Enter TY subject marks:");        
javaprac=Integer.parseInt(br.readLine());
    }
   catch(Exception e){ }
  }
}******************************student.java*************************************

import SY.SYMarks;
import TY.TYMarks;
import java.io.*;

class student
{
 int rollno;
 String name;

 public void get()
  {
   try
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
     rollno=Integer.parseInt(br.readLine());
     name=br.readLine();
    }catch(Exception e){}
  }
 public static void main(String a[])
  {
   try
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("How many object you want to create:");
     int n=Integer.parseInt(br.readLine());
  
     SYMarks sy[]=new SYMarks[n];
     TYMarks ty[]=new TYMarks[n];    
     student s[]=new student[n];

     for(int i=0;i<n;i++)
      {
       s[i]=new student();
       sy[i]=new SYMarks();
       ty[i]=new TYMarks();

       s[i].accept();
       sy[i].accept();
       ty[i].accept();

       s[i].tytotal=(ty[i].theory + ty[i].prac);
       s[i].sytotal=(sy[i].ctotal + sy[i].mtotal + sy[i].etotal);
       s[i].gtotal=(s[i].tytotal + s[i].sytotal);
       s[i].per=(((s[i].gtotal)/12)*100);

       if(s[i].per>=70)
         s[i].grade="A";
       elseif(s[i].per<70 && s[i].per>=60)
         s[i].grade="B";
       elseif(s[i].per<60 && s[i].per>=50)
         s[i].grade="C";
       elseif(s[i].per<50 && s[i].per>=40)
         s[i].grade="PASS";
       else
         s[i].grade="FAIL";
      }
      System.out.println("\nRoll No./tSname/tSYTotal/tTYTotal/tGTotal/tGPercentage/tGrade");
 
      for(int i=0;i<n;i++)
       {
         System.out.println("s[i].rollno+"/t"+s[i].sname+"/t"+s[i].sytotal+"/t"+s[i].tytotal+"/t"+s[i].gtotal+"/t"+s[i].per+"/t"+s[i].grade);
       }
      }catch(Exception e){}
     }
   }
