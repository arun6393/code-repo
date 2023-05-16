package t3;

public class Divider {
	  private final String output;
	  private final int divisor;

	  public Divider(String output, int divisor) {
	    this.output = output;
	    this.divisor = divisor;
	  }

	  public boolean divides(int multiple) {
	    return multiple % divisor == 0;
	  }

	  public String getOutput() {
	    return output;
	  }
	}
