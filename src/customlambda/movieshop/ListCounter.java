package customlambda.movieshop;

import java.util.List;


@FunctionalInterface
public interface ListCounter<T> {
	int count(List<T> list);
}
