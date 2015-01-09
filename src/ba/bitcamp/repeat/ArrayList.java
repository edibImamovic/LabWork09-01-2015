package ba.bitcamp.repeat;

import java.util.Collection;

public class ArrayList<S> {

	S[] array;
	int size;
	private final int DEFAULT_SIZE = 10;

	public ArrayList() {
		size = 0;
		array = (S[]) new Collection[DEFAULT_SIZE];
	}

	public void add(S value) {
		if (size == array.length) {
			resize();
		}

		array[size] = value;
		size++;
	}

	private void resize() {

		S[] result = (S[]) new Collection[array.length * 2];

		for (int i = 0; i < array.length; i += 1) {
			result[i] = array[i];
		}

		array = result;

	}

	public int getsize() {
		return size;
	}

	public String toString() {
		String str = "";

		for (int i = 0; i < size; i++) {
			str += array[i] + " ";
		}

		return str;

	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Size is not valid");
		}
		for (int i = index; i < size; i++) {
			array[i] = array[i + 1];
		}
		size--;

	}

	public void add(S value, int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Size is not valid");
		}
		if (size == array.length) {
			resize();
		}
		for (int i = size; i < index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = value;
		size++;
	}

}
