import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class inputData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        System.out.print("Your age: ");
        int age = in.nextInt();
        in.close();
        System.out.println("Your name is " + name);
        System.out.println("Your are " + age + " years old ");
    }
}
