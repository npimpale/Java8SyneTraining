
public class Lab2 {
	public static void main(String[] args) {
		Lab2Helper l2h = new Lab2Helper();
		Thread t = new Thread(l2h);
		t.start();
	}
}
