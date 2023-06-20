package ch13;

public class ThreadEx20 {

	public static void main(String[] args) {
		ThreadEx20_1 gc = new ThreadEx20_1();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemoery = 0;
		
		for(int i = 0; i<20; i++) {
			requiredMemoery = (int) (Math.random() * 10) * 20; 
			
			// 필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 60% 이상을 사용했을 경우 gc를 깨움 
			if(gc.freeMemory() < requiredMemoery 
					|| gc.freeMemory() < gc.totalMemory() * 0.4	) {
				gc.interrupt();
			}
			
			gc.usedMemory += requiredMemoery;
			System.out.println("usedMemory: " + gc.usedMemory);
		
		}
	}

}

class ThreadEx20_1 extends Thread {
	final static int MAX_MEMORY = 1000;
	int usedMemory = 0;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10*1000);
			}catch (InterruptedException e) {
				System.out.println("Awaken by interrupt()");
			}
			
			gc();
			System.out.println("garbase collected. Free memoery: " + freeMemory());
		}
	}
	
	public void gc() {
		usedMemory -= 300;
		if(usedMemory < 0) usedMemory = 0; 
	}
	public int totalMemory() { return MAX_MEMORY; }
	public int freeMemory() { return MAX_MEMORY - usedMemory; }
}
