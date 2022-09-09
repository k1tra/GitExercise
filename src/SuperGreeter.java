import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker!");
    }
    public void greet() {
        System.out.println("Indtast dit navn");
        Scanner sc = new Scanner(System.in);

       String navn = sc.next();
        System.out.println("Hej "+ navn);
    }
    public static void main(String[] args){
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
    }


}
