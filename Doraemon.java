import javax.swing.JOptionPane;

public class Doraemon {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Doraemon : Hello who are you?");
        JOptionPane.showMessageDialog(null, "Me : Hello, my name is" + name );
        JOptionPane.showMessageDialog(null, "Doraemon : oh! hi, " + name);
        JOptionPane.showMessageDialog(null, "Doraemon : what can I do for you?" );
        JOptionPane.showMessageDialog(null, name + " : I want to go the future");
        JOptionPane.showMessageDialog(null, "Doraemon : of course, What is the present year?");
        String now = JOptionPane.showInputDialog(null, name + " : It is ...");
        JOptionPane.showMessageDialog(null, "Doraemon : Ok How many years do you want to travel?");
        String year = JOptionPane.showInputDialog(null, name + ": I want to go for...");
        JOptionPane.showMessageDialog(null, "Doraemon : Ok, let goooo!");
        JOptionPane.showMessageDialog(null, "link start!!");
        int futureyear = Integer.parseInt(now)+ Integer.parseInt(year);
        JOptionPane.showMessageDialog(null, "Hello, Welocme to" + futureyear);
        
    }
}