package LRU;

public class LRUTest {
	
	public static void main(String args[]) {
		LRUCache cache=new LRUCache(3);
		cache.add(1, 1);
		cache.add(2, 2);
		cache.add(3, 3);
		cache.add(3, 4);
		cache.display();
		cache.get(1);
		cache.display();
		
	}

}
