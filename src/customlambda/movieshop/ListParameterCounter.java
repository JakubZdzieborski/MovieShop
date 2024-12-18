package customlambda.movieshop;

import java.util.List;

@FunctionalInterface
public interface ListParameterCounter<T, U> {
	int countByParameter(List<T> list, U role);
}
