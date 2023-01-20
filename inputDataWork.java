import java.util.Scanner;

public class inputDataWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Your name: ");
        String name = in.nextLine();
        System.out.print(" Your surname: ");
        String surname = in.nextLine();
        System.out.print(" Your nickname: ");
        String nickname = in.nextLine();
        System.out.print(" Enter Your major: ");
        String Major = in.nextLine();
        System.out.print("Your studentid: ");
        int id = in.nextInt();

        in.close();
        System.out.println("Your name is " + name + " " + surname);
        System.out.println("Your nickname is " + nickname);
        System.out.println("Your major is " + Major);
        System.out.println("Your student id " + id );

    }
}
