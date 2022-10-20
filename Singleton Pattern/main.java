public class main {

    public static void main(String[] args) {
        MyClass myClass=MyClass.getInstance();
        myClass.name="My Own Single Class Object";

        MyClass myClass2=MyClass.getInstance();
        myClass2.name="change in same class";

        System.out.println(myClass.name);
        System.out.println(myClass2.name);
    }
    
}