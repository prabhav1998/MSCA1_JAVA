package MScCAII;
import java.io.*;
public class MScCAIIMarks {
    public int semItotal,semIItotal;

    public void get() throws IOException {
       System.out.println("Enter MScCAII semI total:");
       System.out.println("Enter MScCAII semII total:");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       semItotal=Integer.parseInt(br.readLine());
       semIItotal=Integer.parseInt(br.readLine());
       }
}
