http://campedu.blogspot.com/2011/03/java-ass-2.html

SEM1 java ass 2
****************************Ass:2.Set:A.Que:1*********************************
Que)        Define a Student class (roll number, name, percentage). Define a default and
parameterized constructor. Override the toString method. Keep a count objects created.
Create objects using parameterized constructor and display the object count after each
object is created. (Use static member and method). Also display the contents of each
object.



*********************************Java Code***********************************

import java.io.*;
class sort
{
 int rollno;
 String name;
 float percent;

 static void sortStudent(sort[]studentArray,int n)
  {
    sort temp;
    for(int i=0;i<n;i++)
     {
       for(int j=i+1;j<n;j++)
       if(studentArray[i].percent<studentArray[j].percent)
        {
          temp=studentArray[i];
          studentArray[i]=studentArray[j];
          studentArray[j]=temp;
        }
     }
  }
 public String toString()
  {
   return "["+name+","+percent+","+rollno+"]";
  }
 public static void main(String args[])throws IOException
  {
   int n,i;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter value of n");
   n=Integer.parseInt(br.readLine());
   sort[] studentArray=new sort[20];
   for(i=0;i<n;i++)
    {
     studentArray[i]=new sort();
     studentArray[i].rollno=i+1;
     System.out.println("enter your name");
     studentArray[i].name=br.readLine();
     System.out.println("enter your percentage");
     studentArray[i].percentage=Float.parseFloat(br.readLine());
     System.out.println("rollno="+studentArray[i].rollno);
     System.out.println("name="+studentArray[i].name);
     System.out.println("percent="+studentArray[i].percent);
    }
   sort.sortStudent(studentArray,n);
   for(i=0;i<n;i++)
    {
      System.out.println(studentArray[i]);
    }
   }
}

//Output
[root@localhost~]#java sort
enter value of n
2
enter your name
Vinaya
enter your percent
65.52
rollno=1
name=Vinaya
percent=65.52
enter your name
Rutuja
enter your percent
70
rollno=2
name=Rutuja
percent=70
[Rutuja,70.0,2]
[Vinaya,65.52,1]
     
******************************************************************************

****************************Ass:2.Set:A.Que:2*********************************
Que)Write a java program to create n objects of the Student class. Assign roll numbers in
the ascending order. Accept name and percentage from the user for each object. Define a
static method â€œsortStudentâ€ which sorts the array on the basis of percentage.



*********************************Java Code***********************************

import java.io.*;
class NStudents
{
 int rollno;
 String sname;
 float per;
 public void accept()
  {
   try
    {
      BuferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter student name:");
      sname=br.readLine();
      System.out.println("Enter student percentage:");
      per=Float.valueOf(br.readLine()).floatValue();
    }
   catch(Exception e){}
  }
 public static void sortStudent(NStudents s[],int n)
  {
    float.temp;
    String temp1;

    for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
       {
        if(s[i].per > s[j].per)
         {
          temp=s[i].per;
          s[i].per=s[j].per;
          s[j].per=temp;

          temp1=s[i].sname;
          s[i].sname=s[j].sname;
          s[j].sname=temp1;
         }
       }
     }
    for(int i=0;i<n;i++)
     {
      s[i].rollno=i+1;
      System.out.println("\n"+s[i].rollno+"\t"+s[i].sname+"\t"+s[i].per);
     }
  }
public static void main(String a[])
{
 int n;
 try
  {
   BuferedReader br=new BufferedReader(new InputStreamReader(System.in));  
   System.out.println("How many objects you want to create:");
   n=Integer.parseInt(br.readLine());

   NStudent s[]=new NStudent[n];
   for(int i=0;i<n;i++)
    {
     s[i]=new NStudent();
     s[i].accept();
    }
   System.out.println("\nStudent Details:");
   System.out.println("RollNo\tName\tPercentage");
   for(int i=0;i<n;i++)
    {
     s[i].rollno=i+1;
     System.out.println("\n"+s[i].rollno+"\t"+s[i].sname+"\t"+s[i].per);
    }
   NStudent s1=new NStudents();
   System.out.println("\nStudent details in ascending order of their percentages:");
   System.out.println("Roll No\tName\tPercentage");
  
   s1.sortStudent(s,n);
  }
  catch(Exception e)
  { }
 }
}


//Output
[root@localhost Set-A]# java NStudents
How many objects you want to create:
2
Enter student name:
Priya
Enter student percentage:
88.88
Enter student name:
Vinaya
Enter student percentage:
77.78

Student Details:
Roll No  Name   Percentage
1        Priya  88.88
2        Vinaya 77.78

Student details in ascending order of their percentage:
Roll No  Name   Percentage
2        Vinaya  77.78
1        Priya   88.88
