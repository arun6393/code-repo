
public class Execute {

	public static void main(String args[]) {
		
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.print();
		
		list.addALoop(5, 1);
		//list.print();
		list.detectALoop();
		
	}
}
