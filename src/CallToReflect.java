
public class CallToReflect {
	
	public CallToReflect() {
		System.out.println("Call to reflect");
	}
	
	public void methodOne() {
		System.out.println("this is method one");
	}
	
	public void methodOne(String sample) {
		System.out.println("this is method one and the sample message is " + sample);
	}
	
	public void methodOne(String sample, String anotherSample) {
		System.out.println("this is method one and the sample message is " + sample + " " + anotherSample);
	}

}
