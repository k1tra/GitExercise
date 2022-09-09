import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker!");
    }
    Scanner sc = new Scanner(System.in);
    public String greet () {
        System.out.println("Indtast dit navn");
       String navn = sc.next();
        return navn;
    }
    public static void main(String[] args){
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
    }


}
