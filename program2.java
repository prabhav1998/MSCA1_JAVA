import java.io.*;
abstract class Shape{
    final double pi=3.14; abstract void area();
    abstract void vplume ();
}
class Sphere extends Shape{
    double r;
    void accept () throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in)); System.out.println("Enter radius for sphere");
        while(true){
            r = Double.parseDouble(br. readLine());
            if(10)
                break;
            else
                System.out.println("please enter valid radius");
        }
    }
void area(){
    System.out.println("Area of sphere is :"+(4*pi*r*r));
}
class Cone extends Shape{
    void accept() throws IOException{
        double r,h;
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in)); System.out.println("Enter radius for cone");
        while(true){
            r = Double.parseDouble(br.readLine());
            if(r>0) 
                break;
            else
                System.out.println("please enter valid radius");
        }
    System.out.println("Enter height for cone");
    while(true){
        h = Double.parseDouble(br.readLine());
        if(h>0)
            break;
        else
            System.out.println("please enter valid height");
    }
    }
void area(){
    System.out.println("Area of cone :"+(pi*r*(r + Math.pow(h*h+r*r, 0.5))));
}
void volume (){
    System.out.println("Volume of cone : "+1/3*pi*r*r);

}

}

class Cylinder extends Shape{
    double r,h;
    void accept() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); System.out.println("Enter radius for cylinder");
    while(true){
        r = Double.parseDouble(br. readLine());
        if(10)
            break;
        else
            System.out.println("please enter valid radius");
    }
    System.out.println("Enter height for cylinder");
    while(true){
        h = Double.parseDouble(br.readLine());
        if (h>0)
            break;
        else
            System.out.println("please enter valid height");
    }
}
    void area(){
        System.out.println("area of cylinder : "+(2*pi*r));
    }

void volume ( ){
    System.out.println("volume of cylinder "+pi*r*r*h);
}

}
class Box extends Shape{
    double l,b,h;
    void accept() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter length for box");
        while(true){
        l = Double.parseDouble(br.readLine());
        if(l=0)
            break;
        else
            System.out.println("please enter valid length");
        }
    System.out.println("Enter breadth for box");
    while (true){
        b = Double.parseDouble(br.readLine());
        if (b>0)
            break;
        else
            System.out.println("please enter valid breadth");
    }
    System.out.println("Enter height for box");
    while(true){
        h = Double.parseDouble(br.readLine());
        if (h>0)
            break;
        else
            System.out.println("please enter valid height");
        }
}
void area(){
System.out.println("area of box:" +(2*1*h+2*b*h+2*1*b));
}

void volume(){
    System.out.println("volume of box:"+(1*b*h));
}

}

class Program2
{
    public static void main(String args[]) throws IOException{
        Sphere s= new Sphere();
        Cone c = new Cone();
        Cylinder cl = new Cylinder();
        Box b = new Box();
        s.accept();
        s.area();
        s.volume();
        c.accept();
        c.area();
        c.volume();
        cl.accept();
        cl.area();
        cl.volume ();
        b.accept();
        b.area();
        b.volume();
} 
}
}