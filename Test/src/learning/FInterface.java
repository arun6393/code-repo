package learning;

@FunctionalInterface
public interface FInterface {

	default void proceed() {
		System.out.println("yes");
	}
	
	void accept();
	
}
