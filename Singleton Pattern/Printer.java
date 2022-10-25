public class Printer {
    //MyClass type instance.Our only object will be created.
    public static Printer singleInstance=null;

    //attributes
    String name;

    //make constructor Private So acnt be access outside the class.
    private Printer() {
    }

    public static Printer getInstance(){
        if(singleInstance==null){
            //if our instance is not instantiated before, instansiate now.
            singleInstance=new Printer();//instance created 
        }
        return singleInstance;//and return the object to store in variable.
    }
}
