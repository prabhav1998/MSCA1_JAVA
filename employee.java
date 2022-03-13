import java.io.*;

public class employee {
    String name;
    String position;
    Float salary;
    static int count;
    
    employee()// default constroctor
    {
        this.name = null;
        this.position = null;
        this.salary = 00.00f;
    }

    employee(String Name, String Position, Float Salary)// parameterized constroctor
    {
        this.name = Name;
        this.position = Position;
        this.salary = Salary;
    }

    public String toString() {
        return "Name:" + name + "\n" + "Position:" + position + "\n" + "Salary:" + salary;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of employee:");
        int n = Integer.parseInt(reader.readLine());

        employee[] e = new employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter employee name:");
            String name = reader.readLine();
            System.out.println("enter employee position:");
            String position = reader.readLine();
            Float salary = 00.00f;
            int x = 1;
            do {
                System.out.println("enter employee salary:");
                try{
                    salary = Float.parseFloat(reader.readLine());
                }catch(NumberFormatException ex){
                    System.out.println("enter in number , not charachter!");
                    x =1;
                    continue;
                }
                if(salary >= 0){
                    x = 0;
                }
                else{
                    System.out.println("enter a valid input!");
                    x = 1;
                }
            } while (x == 1);
            e[i] = new employee(name, position, salary);
            count++;
        }
        for(int i = 0; i < n; i++){
            System.out.println("\n" + e[i].toString());
        }
        System.out.print("the total number of object count is:" + count);
    }
}
