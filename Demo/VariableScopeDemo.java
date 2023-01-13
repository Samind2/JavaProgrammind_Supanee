public class VariableScopeDemo {
    public int i; //global Varliable

    public void method1() {
        int i = 4; //local Varliable
        int k = 2;
    }
    public void method2() {
        int i = 0;
        System.out.println(i);
    }


    public static void main(String[] args) {
        VariableScopeDemo vl = new VariableScopeDemo() ;
        vl.method2();
    }
}