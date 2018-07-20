package com.syn.training.java8.streams;


import java.util.List;
import java.util.function.Predicate;

public interface Manager<T> {
	public List<T> getList();

	public default void create(T t) {
		getList().add(t);
	}

	public default List<T> list() {
		return getList();
	}

	public default void delete(Predicate<T> predicate) {
		getList().removeIf(predicate);
	}

	public void update(T t);
}
