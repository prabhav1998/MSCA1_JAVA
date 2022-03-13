/*blueMinati
1)roll should be like primary key
2)percentage can be zero but not negative
3)sort percentage method should static , oustside of the class
4)sort percentage high to low
*/
import java.io.*;

public class Student {
    static int rollno;
    String name;
    Float percentage;
    //////////////////////////////////////////////
    Student(){};//default constructor
    Student(String Name ,Float Percentage){//{//parameterized constructor
        //this.rollno=Rollno;
        this.name=Name;
        this.percentage=Percentage;
    }
    /////////////////////////////////////////////
    public String toString() {
        return "rollnumber:" + rollno + "\n" + "name:" + name + "\n" + "percentage:" + percentage;
    }
    /////////////////////////////////////////////
    public static void sort_student(Student studentArray[],int n){
        System.out.println("got called excueting");
        Student temp=new Student();
        for(int i=0;i<n;i++){
            if(studentArray[i].percentage>studentArray[i+1].percentage){//if(studentArray[i].percentage>studentArray[i+1].percentage){
                temp.percentage = studentArray[i].percentage;//temp= studentArray[i];
                studentArray[i].percentage=studentArray[i+1].percentage;//studentArray[i]=studentArray[i+1];
                studentArray[i+1].percentage=temp.percentage;//studentArray[i+1]=temp;
            }
        }
    }
    ////////////////////////////////////////////
    public static void main(String[] args)throws Exception{
        int i,n,x;
        //int y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number of student:");
        n=Integer.parseInt(br.readLine());
        Student[] studentArray=new Student[n];
        rollno=0;
        for(i=0;i<n;i++)
        {
            /*y=1;
            do{//for roll number varification
                System.out.println("enter student rollno:");
                studentArray[i].rollno=Integer.parseInt(br.readLine());
                if(studentArray[i].rollno>=0){
                    y=0;
                }
                else{
                    System.out.print("Re-enter rollno");
                    y=1;
                }
            }while(y==1);*/
            rollno++;
            System.out.println("your rollnumber is:"+rollno);
            System.out.println("enter student name:");
            studentArray[i].name=br.readLine();
                x=1;
                do{//for percantage verification >=0
                    System.out.println("enter your percentage");
                    studentArray[i].percentage=Float.parseFloat(br.readLine());
                    if(studentArray[i].percentage>=0){
                        x = 0;
                    }else{
                        System.out.println("Re-enter percentage, enter zero or +ve percentage!");
                        x=1;
                    }
                }while(x == 1);
                studentArray[i]=new Student();   
        }
        sort_student(studentArray,n);
        for(i = 0; i < n; i++){
            System.out.println("\n" + studentArray[i].toString());
        }
    }
}