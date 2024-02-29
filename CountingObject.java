import java.util.Scanner;

class Count{
    int t=0;
    Count(){
        t++;
    }
}
public class CountingObject extends Counts{
    public static void main(String s[] args){
        int t=1;
        Scanner sc= new Scanner(System.in)
        do{
            new Count();
            System.out.println("Enter 1 to make a new object or enter 0 to exit:")
            t= sc.nextInt();
        }while (t>0);
        sc.close();
        System.out.println("total objects are:"+Count.t);
    }
}