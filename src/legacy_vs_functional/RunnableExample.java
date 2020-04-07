package legacy_vs_functional;

public class RunnableExample {

	public static void main(String[] args) {
		
		/*
		 * Legacy code
		 */
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Legacy code..");				
			}
		};
		new Thread(runnable).start();
		
		/*
		 * Simplified legacy code
		 */
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Simplified Legacy Code");
			}
		}).start();
		
		/*
		 * Functional code 
		 */
		Runnable runnableLambda = () -> {
			System.out.println("Functional code");
		};
		new Thread(runnableLambda).start();
		
		/*
		 * Simplified functional
		 */
		new Thread(() -> System.out.println("Simplified Functional")).start();
	}

}
