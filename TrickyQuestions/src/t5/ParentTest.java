package t5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentTest{
	public static void main(String args[]) {
		Parent p=new Child();
		Parent p1=new Parent();
		Child c=new  Child();
	}
}



class Parent {
    private void doSomething() throws FileNotFoundException {}
}
class Child extends Parent {
    private void doSomething() throws IOException {}
}