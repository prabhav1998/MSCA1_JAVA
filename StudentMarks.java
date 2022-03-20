package MScCAI;
import MScCAIMarks.*;
import MScCAIIMarks.*;
import java.io.*;
class StudentInfo {
    int rollno;
    String name;
    public float tyt,syt;
    public float per;
    public void get() throws IOException{
        System.out.println("Enter roll number and name of the student: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        rollno=Integer.parseInt(br.readLine());
        name=br.readLine();
    }
  
}
public class StudentMarks {
    public static void main(String[] args) throws IOException{  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students:");
        int n=Integer.parseInt(br.readLine());
        MScCAIMarks sy[]=new MScCAIMarks[n];
        MScCAIIMarks ty[]=new MScCAIIMarks[n];
        StudentInfo si[]=new StudentInfo[n];
        for(int i=0;i<n;i++){
            si[i]=new StudentInfo();
            sy[i]=new MScCAIMarks();
            ty[i]=new MScCAIIMarks();
            si[i].get();
            sy[i].get();
            ty[i].get();  
            si[i].syt=MScCAIMarks[i].semI+MScCAIMarks[i].semII;
            si[i].tyt=MScCAIIMarks[i].semI+MScCAIIMarks[i].semII;
            
            si[i].per=(si[i].gt/600)*100;
            if(si[i].per>=70) si[i].grade="A";
            else if(si[i].per>=60) si[i].grade="B";
            else if(si[i].per>=50) si[i].grade="C";
            else if(si[i].per>=40) si[i].grade="Pass";
            else si[i].grade="Fail";
        }
        System.out.println("Roll No\tName\tSyTotal\tTyTotal\t\tPercentage");
        for(int i=0;i<n;i++){
            System.out.println(si[i].rollno+"\t"+si[i].name+"\t"+si[i].syt+"\t"+si[i].tyt+"\t"+"\t"+si[i].per+"\t");  
        }
    }  
}