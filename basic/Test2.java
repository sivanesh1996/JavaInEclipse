package basic;

public interface Test2 {
	abstract void running();
	default void method1() {
		System.out.println("hi");
	}
}
