package p08;

public class Worker implements WorkerInterface {

	@Override
	public void work() {
		System.out.println("specific");
		WorkerInterface.super.work();
	}
	
	public static void main(String[] args) {
		new Worker().work();
	}

}
