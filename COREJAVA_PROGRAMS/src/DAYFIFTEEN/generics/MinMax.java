package DAYFIFTEEN.generics;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
