
public class Demo1 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("Hello");
			}
		});
		t.start();

		Thread t1 = new Thread(() -> {
			System.out.println("Hello1");
		});
		t1.start();
	}

}