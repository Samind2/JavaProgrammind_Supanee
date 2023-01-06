public class stdent {
    public String name ;
    public int age ;
    public String group ;

    public static void main(String[] args) {
        stdent Chokchai = new stdent() ;
        //Chokchai.name = "Chokchai";
        //Chokchai.age = 14;
        //Chokchai.group = "65/40";

        Chokchai.setData("Chokchai" , 14, "65/40");
        Chokchai.getData();

        //Chokchai.printName();
        //Chokchai.printAge();
        //Chokchai.printGroup();

        System.out.println("------------------------------------------------------------");
        Chokchai.setData("Aubchock", 20, "65/40");
        Chokchai.getData();
        //Chokchai.printName();
        //Chokchai.printAge();
        //Chokchai.printGroup();
    }

        public void setData(String name, int age, String group) {
            this.name = name ;
            this.age = age ;
            this.group = group ;
        }

        public void getData(){
            System.out.println(this.name + " is " + this.age + " year old and is in group " + this.group);
        
    }
    public void printName() {
        System.out.println("Student name \\" + this.name);
    }
    public void printAge() {
        System.out.println("Student age \\" + this.age);
    }
    public void printGroup() {
        System.out.println("Student group \\" + this.group);
    }

}

