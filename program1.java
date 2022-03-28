import java.io.*;
class Employee{
    protected double salary;
    private String name, department; Employee () {}
    int eid;    
    static int id=1;
    Employee (String name, String department, double salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
        eid=id;
        id++;
    }
    void display(){
        System.out.println("ID of employee is ="+eid);
        System.out.println("name of employee is :"+name); System.out.println("department of employee "+department); System.out.println("salary of employee : "+salary);
    }
    void max(){
    }

}

class Manager extends Employee{
    private double bonus=0.3;
    Manager() {} //double salary;
    Manager (String name, String department, double salary){
        super (name, department, salary);
    }
    void display(){
        super.display();
        super.salary+=super.salary*bonus;
        System.out.println("Total salary of employee is "+ super.salary);
    }
    void sort (Manager M[]){
        Manager temp;
        for (int i=0;i<M. length; i++){
            for(int j=0; j<M. Length-i-1; j++){
                if (M[j].salary < M[j+1].salary)
                {
                    temp=M[j];
                    M[j] =M[j+11];
                    M[j+1]=temp;
                }
            }
        }
    }
}
class Program1{
public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    double salary;
    String name, department;
    System.out.println("How many employee you want");
    int n= Integer.parseInt(br.readLine());
    Manager M[] = new Manager [n];
    Manager mc = new Manager();
    for(int i=0;i<n;i++){
        System.out.println("Enter name of employee: ");
        name = br.readLine();
        System.out.println("Enter department of employee :");
        department= br. readLine();
        System.out.println("Enter salary of employee :");
        while(true){
            salary = Double.parseDouble (br. readLine()); parseDouble(br.readLine());
            if(salary<=0){
                System.out.println("Invalid Enter valid salary");
            }else{
                break;
            }
        }
        M[i]= new Manager (name, department, salary);
    }
    mc.sort (M);
    double max = M[0].salary;
    System.out.println("Manager details with maximum salry: ");
    for (int i=0;i<M. length;i++){
        if(M[i].salary = max){
            System.out.println("");
            M[i].display();
        }else{
            break;
        }
    }
}
}
