package coursework2;
import java.util.Scanner;
import java.util.ArrayList;
public class CourseWork2 {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList();
        Scanner kuku=new Scanner(System.in);
        System.out.println("Enter Student(Enter exit when done)");
        int n=1;
        while(true){
            System.out.print("Enter Student" +n+ ":");
            String ku = kuku.next();
            if(ku.toLowerCase().equals("exit"))
                break;
            else
            {
                while(n==1){
                    int mark[]= new int[7];
        int i = 0;
        String grd;
        float sum =0;
        
     
     
     System.out.println("Input Course Name 1");
       String b=kuku.next();
     System.out.println(b);
     System.out.println("Input Marks Course Name 1");
     
         mark[i]=kuku.nextInt();
         sum= sum+ mark[i];
     
     
     System.out.println("Input Course Name 2");
       String c=kuku.next();
     System.out.println(c);
     System.out.println("Input Marks Course Name 2");
     
         mark[i]=kuku.nextInt();
         sum= sum+ mark[i];
     
    
      System.out.println("Input Course Name 3");
       String d=kuku.next();
     System.out.println(d);
     System.out.println("Input Marks Course Name 3");
     
         mark[i]=kuku.nextInt();
         sum= sum+ mark[i];
     
    
      System.out.println("Input Course Name 4");
       String e=kuku.next();
     System.out.println(e);
     System.out.println("Input Marks Course Name 4");
    
         mark[i]=kuku.nextInt();
         sum= sum+ mark[i];
     
     
      System.out.println("Input Course Name 5");
       String f=kuku.next();
     System.out.println(f);
     System.out.println("Input Marks Course Name 5");
    
         mark[i]=kuku.nextInt();
         sum= sum+ mark[i];
     
     
      System.out.println("Input Course Name 6");
       String g=kuku.next();
     System.out.println(g);
     System.out.println("Input Marks Course Name 6");
    
         mark[i]=kuku.nextInt();
         sum =sum+ mark[i];
         
         double av=(sum*100)/600;
         System.out.println("Average got is: "+av);
                
                
                name.add(ku);
                n++;
                }
            }
        }
    }
    
}
