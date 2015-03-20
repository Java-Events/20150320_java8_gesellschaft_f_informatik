package p08;

public interface WorkerInterface {
	public default void work() {
		System.out.println("Default Impl");
	}
}
