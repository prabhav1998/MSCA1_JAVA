package MScCAI;
 
import java.io.BufferedReader;
import java.io.*;
 
public class MScCAIMarks {
 public int semItotal,semIItotal;

 public void get() throws IOException {
    System.out.println("Enter MScCAI semI total:");
    System.out.println("Enter MScCAI semII total:");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    semItotal=Integer.parseInt(br.readLine());
    semIItotal=Integer.parseInt(br.readLine());
    }
}