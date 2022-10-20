public class MyClass {
    //MyClass type instance.Our only object will be created.
    public static MyClass singleInstance=null;

    //attributes
    String name;

    //make constructor Private So acnt be access outside the class.
    private MyClass() {
    }

    public static MyClass getInstance(){
        if(singleInstance==null){
            //if our instance is not instantiated before, instansiate now.
            singleInstance=new MyClass();//instance created 
        }
        return singleInstance;//and return the object to store in variable.
    }
}
