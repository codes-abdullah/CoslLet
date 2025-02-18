package codes.abdullah.cosl.utils;

import java.util.Arrays;
import java.util.Iterator;

class Column implements Iterator<String> {
	private int ptr;
	private String[] arr;
	private boolean infinite;
	private Column parent;
	private String name;

	Column(String[] arr, boolean infinite) {
		this.arr = arr;
		this.infinite = infinite;
		reset();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParent(Column listener) {
		this.parent = listener;
	}

	public void setInfinite(boolean infinite) {
		this.infinite = infinite;
	}

	@Override
	public boolean hasNext() {

		if (infinite)
			return true;
		return ptr < arr.length;
	}

	public boolean isLast() {
		return ptr == arr.length - 1;
	}

	@Override
	public String next() {
		String out = arr[ptr++];
		if (shouldReset(this))
			this.reset();
		return out;
	}

	public String getCurrent() {
		return arr[ptr];
	}

	private static boolean shouldReset(Column c) {
		if (c.infinite && c.ptr == c.arr.length)
			return true;
		return false;
	}

	private void reset() {
		ptr = 0;
		if (parent != null)
			parent.next();
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public int length() {
		return arr.length;
	}

}
