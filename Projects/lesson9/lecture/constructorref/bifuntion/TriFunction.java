package lesson9.lecture.constructorref.bifuntion;

@FunctionalInterface
public interface TriFunction<S, U, R, T> {

	T apply(S s, U u, R r);
//	void show();

}
