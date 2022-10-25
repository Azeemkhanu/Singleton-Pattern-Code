public class main {

    public static void main(String[] args) {
        Printer myClass=Printer.getInstance();
        myClass.name="My Own Single Class Object";

        Printer myClass2=Printer.getInstance();
        myClass2.name="change in same class";

        System.out.println(myClass.name);
        System.out.println(myClass2.name);
    }
    
}