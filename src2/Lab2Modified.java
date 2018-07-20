
public class Lab2Modified {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println("HelloNew");
		});

		t.start();
	}
}
