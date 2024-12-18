package customlambda.movieshop;

@FunctionalInterface
public interface GenericCheck<T, R> {
	R apply(T t);
}
