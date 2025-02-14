package codes.abdullah.parcel;

import codes.abdullah.digits.Digits;

public class Check {
	private final static int ARRAY_SAFE_CAPACITY = (1 << 29);
	private Check() {
	}

	// =================================================
	// =================================================
	// =================== require above or equals zero
	// =================================================
	// =================================================

	// ===========
	// ===========
	// ===========Bytes
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(byte, CharSequence)
	 */
	public static byte aboveOrEqualsZero(byte n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static byte aboveOrEqualsZero(byte n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(byte, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(byte n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(byte n, CharSequence msg)
			throws IllegalArgumentException {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Shorts
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(short, CharSequence)
	 */
	public static short aboveOrEqualsZero(short n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static short aboveOrEqualsZero(short n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(short, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(short n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(short n, CharSequence msg) {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Integers
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(int, CharSequence)
	 */
	public static int aboveOrEqualsZero(int n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static int aboveOrEqualsZero(int n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(int, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(int n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(int n, CharSequence msg) {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Longs
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(long, CharSequence)
	 */
	public static long aboveOrEqualsZero(long n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static long aboveOrEqualsZero(long n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(long, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(long n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(long n, CharSequence msg) {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Floats
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(float, CharSequence)
	 */
	public static float aboveOrEqualsZero(float n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static float aboveOrEqualsZero(float n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(float, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(float n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(float n, CharSequence msg) {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Doubles
	// ===========
	// ===========
	/**
	 * @see #aboveOrEqualsZero(double, CharSequence)
	 */
	public static double aboveOrEqualsZero(double n) throws IllegalArgumentException {
		return aboveOrEqualsZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n < 0
	 */
	public static double aboveOrEqualsZero(double n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveOrEqualsZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveOrEqualsZeroAndGet(double, CharSequence)
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(double n) {
		return aboveOrEqualsZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < 0
	 */
	public static IllegalArgumentException aboveOrEqualsZeroAndGet(double n, CharSequence msg) {
		if (n < 0) {
			return new IllegalArgumentException(String.format("%f < 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== require above zero
	// =================================================
	// =================================================

	// ===========
	// ===========
	// ===========Bytes
	// ===========
	// ===========
	/**
	 * @see #aboveZero(byte, CharSequence)
	 */
	public static byte aboveZero(byte n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static byte aboveZero(byte n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(byte, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(byte n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(byte n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Shorts
	// ===========
	// ===========
	/**
	 * @see #aboveZero(short, CharSequence)
	 */
	public static short aboveZero(short n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static short aboveZero(short n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(short, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(short n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(short n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Integers
	// ===========
	// ===========
	/**
	 * @see #aboveZero(int, CharSequence)
	 */
	public static int aboveZero(int n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static int aboveZero(int n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(int, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(int n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(int n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Longs
	// ===========
	// ===========
	/**
	 * @see #aboveZero(long, CharSequence)
	 */
	public static long aboveZero(long n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static long aboveZero(long n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(long, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(long n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(long n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Floats
	// ===========
	// ===========
	/**
	 * @see #aboveZero(float, CharSequence)
	 */
	public static float aboveZero(float n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static float aboveZero(float n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(float, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(float n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(float n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// ===========
	// ===========
	// ===========Doubles
	// ===========
	// ===========
	/**
	 * @see #aboveZero(double, CharSequence)
	 */
	public static double aboveZero(double n) throws IllegalArgumentException {
		return aboveZero(n, null);
	}

	/**
	 * @throws IllegalArgumentException if n <= 0
	 */
	public static double aboveZero(double n, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = aboveZeroAndGet(n, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #aboveZeroAndGet(double, CharSequence)
	 */
	public static IllegalArgumentException aboveZeroAndGet(double n) {
		return aboveZeroAndGet(n, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n <= 0
	 */
	public static IllegalArgumentException aboveZeroAndGet(double n, CharSequence msg) {
		if (n <= 0) {
			return new IllegalArgumentException(String.format("%d <= 0, %s", n, nonull(msg)));
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== between
	// =================================================
	// =================================================

	// ===========
	// ===========
	// ===========Bytes
	// ===========
	// ===========
	/**
	 * @see #between(byte, byte, byte, CharSequence)
	 */
	public static byte between(byte n, byte min, byte max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static byte between(byte n, byte min, byte max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(byte, byte, byte, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(byte n, byte min, byte max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(byte n, byte min, byte max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// ===========
	// ===========
	// ===========Shorts
	// ===========
	// ===========
	/**
	 * @see #between(short, short, short, CharSequence)
	 */
	public static short between(short n, short min, short max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static short between(short n, short min, short max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(short, short, short, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(short n, short min, short max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(short n, short min, short max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// ===========
	// ===========
	// ===========Integers
	// ===========
	// ===========
	/**
	 * @see #between(int, int, int, CharSequence)
	 */
	public static int between(int n, int min, int max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static int between(int n, int min, int max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(int, int, int, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(int n, int min, int max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(int n, int min, int max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// ===========
	// ===========
	// ===========Longs
	// ===========
	// ===========
	/**
	 * @see #between(long, long, long, CharSequence)
	 */
	public static long between(long n, long min, long max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static long between(long n, long min, long max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(long, long, long, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(long n, long min, long max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(long n, long min, long max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// ===========
	// ===========
	// ===========Floats
	// ===========
	// ===========
	/**
	 * @see #between(float, float, float, CharSequence)
	 */
	public static float between(float n, float min, float max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static float between(float n, float min, float max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(float, float, float, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(float n, float min, float max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(float n, float min, float max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// ===========
	// ===========
	// ===========Doubles
	// ===========
	// ===========
	/**
	 * @see #between(double, double, double, CharSequence)
	 */
	public static double between(double n, double min, double max) throws IllegalArgumentException {
		return between(n, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if n < min || n > max
	 */
	public static double between(double n, double min, double max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = betweenAndGet(n, min, max, msg);
		if (e != null)
			throw e;
		return n;
	}

	/**
	 * @see #betweenAndGet(double, double, double, CharSequence)
	 */
	public static IllegalArgumentException betweenAndGet(double n, double min, double max) {
		return betweenAndGet(n, min, max, null);
	}

	/**
	 * return {@link IllegalArgumentException} if n < min || n > max
	 */
	public static IllegalArgumentException betweenAndGet(double n, double min, double max, CharSequence msg) {
		if (n < min)
			return new IllegalArgumentException(String.format("%f < min(%f), %s", n, min, nonull(msg)));
		else if (n > max)
			return new IllegalArgumentException(String.format("%f > max(%f), %s", n, max, nonull(msg)));
		return null;
	}

	// =================================================
	// =================================================
	// =================== bmp and code-point
	// =================================================
	// =================================================


	// =================================================
	// =================================================
	// =================== integers and longs
	// =================================================
	// =================================================

	// ===========
	// ===========
	// =========== Integers
	// ===========
	// ===========

	/**
	 * @see #integers(CharSequence, int, int, int)
	 */
	public static CharSequence integers(CharSequence cs) throws IllegalArgumentException {
		return integers(cs, 0);
	}

	/**
	 * @see #integers(CharSequence, int, int, int)
	 */
	public static CharSequence integers(CharSequence cs, int from) throws IllegalArgumentException {
		return integers(cs, from, cs.length());
	}

	/**
	 * @see #integers(CharSequence, int, int, int)
	 */
	public static CharSequence integers(CharSequence cs, int from, int to) throws IllegalArgumentException {
		return integers(cs, from, to, 10);
	}

	/**
	 * return {@link IllegalArgumentException} if given cs contains non integerss
	 * according to {@link Digits#ints}
	 */
	public static CharSequence integers(CharSequence cs, int from, int to, int radix) throws IllegalArgumentException {
		IllegalArgumentException e = integersAndGet(cs, from, to, radix);
		if (e != null)
			throw e;
		return cs;
	}

	// =====================

	/**
	 * @see #integersAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException integersAndGet(CharSequence cs) {
		return integersAndGet(cs, 0);
	}

	/**
	 * @see #integersAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException integersAndGet(CharSequence cs, int from) {
		return integersAndGet(cs, from, cs.length());
	}

	/**
	 * @see #integersAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException integersAndGet(CharSequence cs, int from, int to) {
		return integersAndGet(cs, from, to, 10);
	}

	/**
	 * return {@link IllegalArgumentException} if given cs contains non integerss
	 * according to {@link Digits#ints}
	 */
	public static IllegalArgumentException integersAndGet(CharSequence cs, int from, int to, int radix) {
		try {
			Digits.ints.parse(cs, from, to, radix);
		} catch (NumberFormatException e) {
			return new IllegalArgumentException("detect non digits in: " + cs, e);
		}
		return null;
	}

	// ===========
	// ===========
	// =========== Longs
	// ===========
	// ===========

	/**
	 * @see #longs(CharSequence, int, int, int)
	 */
	public static CharSequence longs(CharSequence cs) throws IllegalArgumentException {
		return longs(cs, 0);
	}

	/**
	 * @see #longs(CharSequence, int, int, int)
	 */
	public static CharSequence longs(CharSequence cs, int from) throws IllegalArgumentException {
		return longs(cs, from, cs.length());
	}

	/**
	 * @see #longs(CharSequence, int, int, int)
	 */
	public static CharSequence longs(CharSequence cs, int from, int to) throws IllegalArgumentException {
		return longs(cs, from, to, 10);
	}

	/**
	 * return {@link IllegalArgumentException} if given cs contains non longs
	 * according to {@link Digits#longs}
	 */
	public static CharSequence longs(CharSequence cs, int from, int to, int radix) throws IllegalArgumentException {
		IllegalArgumentException e = longsAndGet(cs, from, to, radix);
		if (e != null)
			throw e;
		return cs;
	}

	// =====================

	/**
	 * @see #longsAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException longsAndGet(CharSequence cs) {
		return longsAndGet(cs, 0);
	}

	/**
	 * @see #longsAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException longsAndGet(CharSequence cs, int from) {
		return longsAndGet(cs, from, cs.length());
	}

	/**
	 * @see #longsAndGet(CharSequence, int, int, int)
	 */
	public static IllegalArgumentException longsAndGet(CharSequence cs, int from, int to) {
		return longsAndGet(cs, from, to, 10);
	}

	/**
	 * return {@link IllegalArgumentException} if given cs contains non longs
	 * according to {@link Digits#longs}
	 */
	public static IllegalArgumentException longsAndGet(CharSequence cs, int from, int to, int radix) {
		try {
			Digits.longs.parse(cs, from, to, radix);
		} catch (NumberFormatException e) {
			return new IllegalArgumentException("detect non digits in: " + cs, e);
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== unsorted indexes
	// =================================================
	// =================================================

	/**
	 * @see #unsortedIndexesAndGet(int[], int)
	 * @throws IllegalArgumentException
	 */
	public static void unsortedIndexes(int[] indexes, int current) throws IllegalArgumentException {
		IllegalArgumentException e = unsortedIndexesAndGet(indexes, current);
		if (e != null)
			throw e;
	}

	/**
	 * useful tool for loops while working with arrays and indexes, this tool does
	 * not do iteration over the array, instead it will only check if
	 * <b>indexes[current] <= indexes[0]</b>, return the exception <b>current</b>:
	 * must be the loop index
	 * 
	 * @return {@link IllegalArgumentException}
	 */
	public static IllegalArgumentException unsortedIndexesAndGet(int[] indexes, int current) {
		if (current > 0 && indexes[current] <= indexes[0]) {
			return new IllegalArgumentException(String.format(
					"indexes[%s](%s) <= indexes[0](%s), consider passing a sorted array to avoid this exception",
					current, indexes[current], indexes[0]));
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== range
	// =================================================
	// =================================================

	// ===========
	// ===========
	// ===========Bytes
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(byte, byte, byte, byte, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(byte from, byte to) throws IllegalArgumentException {
		range(from, to, Byte.MAX_VALUE);
	}

	/**
	 * @see #range(byte, byte, byte, byte, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(byte from, byte to, byte max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(byte, byte, byte, byte, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(byte from, byte to, byte max, byte min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(byte from, byte to, byte max, byte min, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(byte, byte, byte, byte, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(byte from, byte to) {
		return rangeAndGet(from, to, Byte.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(byte, byte, byte, byte, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(byte from, byte to, byte max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(byte, byte, byte, byte, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(byte from, byte to, byte max, byte min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(byte from, byte to, byte max, byte min, CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}
	// ===========
	// ===========
	// ===========Shorts
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(short, short, short, short, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(short from, short to) throws IllegalArgumentException {
		range(from, to, Short.MAX_VALUE);
	}

	/**
	 * @see #range(short, short, short, short, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(short from, short to, short max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(short, short, short, short, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(short from, short to, short max, short min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(short from, short to, short max, short min, CharSequence msg)
			throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(short, short, short, short, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(short from, short to) {
		return rangeAndGet(from, to, Short.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(short, short, short, short, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(short from, short to, short max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(short, short, short, short, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(short from, short to, short max, short min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(short from, short to, short max, short min, CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}
	// ===========
	// ===========
	// ===========Integers
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(int, int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(int from, int to) throws IllegalArgumentException {
		range(from, to, Integer.MAX_VALUE);
	}

	/**
	 * @see #range(int, int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(int from, int to, int max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(int, int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(int from, int to, int max, int min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(int from, int to, int max, int min, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(int, int, int, int, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(int from, int to) {
		return rangeAndGet(from, to, Integer.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(int, int, int, int, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(int from, int to, int max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(int, int, int, int, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(int from, int to, int max, int min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(int from, int to, int max, int min, CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}
	// ===========
	// ===========
	// ===========Longs
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(long, long, long, long, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(long from, long to) throws IllegalArgumentException {
		range(from, to, Long.MAX_VALUE);
	}

	/**
	 * @see #range(long, long, long, long, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(long from, long to, long max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(long, long, long, long, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(long from, long to, long max, long min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(long from, long to, long max, long min, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(long, long, long, long, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(long from, long to) {
		return rangeAndGet(from, to, Long.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(long, long, long, long, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(long from, long to, long max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(long, long, long, long, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(long from, long to, long max, long min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(long from, long to, long max, long min, CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}
	// ===========
	// ===========
	// ===========Floats
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(float, float, float, float, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(float from, float to) throws IllegalArgumentException {
		range(from, to, Float.MAX_VALUE);
	}

	/**
	 * @see #range(float, float, float, float, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(float from, float to, float max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(float, float, float, float, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(float from, float to, float max, float min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(float from, float to, float max, float min, CharSequence msg)
			throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(float, float, float, float, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(float from, float to) {
		return rangeAndGet(from, to, Float.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(float, float, float, float, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(float from, float to, float max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(float, float, float, float, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(float from, float to, float max, float min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(float from, float to, float max, float min, CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}
	// ===========
	// ===========
	// ===========Doubles
	// ===========
	// ===========

	/**
	 * @see #rangeAndGet(double, double, double, double, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(double from, double to) throws IllegalArgumentException {
		range(from, to, Double.MAX_VALUE);
	}

	/**
	 * @see #range(double, double, double, double, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(double from, double to, double max) throws IllegalArgumentException {
		range(from, to, max, 0);
	}

	/**
	 * @see #range(double, double, double, double, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static void range(double from, double to, double max, double min) throws IllegalArgumentException {
		range(from, to, max, min, null);
	}

	/**
	 * @throws IllegalArgumentException if from < min || to > max || from >= to
	 */
	public static void range(double from, double to, double max, double min, CharSequence msg)
			throws IllegalArgumentException {
		IllegalArgumentException e = rangeAndGet(from, to, max, min, msg);
		if (e != null)
			throw e;
	}

	// ==================

	/**
	 * @see #rangeAndGet(double, double, double, double, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(double from, double to) {
		return rangeAndGet(from, to, Double.MAX_VALUE);
	}

	/**
	 * @see #rangeAndGet(double, double, double, double, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(double from, double to, double max) {
		return rangeAndGet(from, to, max, 0);
	}

	/**
	 * @see #rangeAndGet(double, double, double, double, CharSequence)
	 */
	public static IllegalArgumentException rangeAndGet(double from, double to, double max, double min) {
		return rangeAndGet(from, to, max, min, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if from < min || to > max || from >=
	 *         to
	 */
	public static IllegalArgumentException rangeAndGet(double from, double to, double max, double min,
			CharSequence msg) {
		if (from < min) {
			return new IllegalArgumentException(String.format("from(%d) < min(%d), %s", from, min, nonull(msg)));
		} else if (to > max) {
			return new IllegalArgumentException(String.format("to(%d) > max(%d), %s", to, max, nonull(msg)));
		} else if (from >= to) {
			return new IllegalArgumentException(String.format("from(%d) >= to(%d), %s", from, to, nonull(msg)));
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== is valid range
	// =================================================
	// =================================================

	// ===========
	// ===========
	// ===========Bytes
	// ===========
	// ===========
	/**
	 * @see #isValidRange(byte, byte, byte, byte)
	 */
	public static boolean isValidRange(byte from, byte to) {
		return isValidRange(from, to, Byte.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(byte, byte, byte, byte)
	 */
	public static boolean isValidRange(byte from, byte to, byte max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(byte from, byte to, byte max, byte min) {
		return from >= min && from < to && to <= max;
	}

	// ===========
	// ===========
	// ===========Shorts
	// ===========
	// ===========
	/**
	 * @see #isValidRange(short, short, short, short)
	 */
	public static boolean isValidRange(short from, short to) {
		return isValidRange(from, to, Short.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(short, short, short, short)
	 */
	public static boolean isValidRange(short from, short to, short max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(short from, short to, short max, short min) {
		return from >= min && from < to && to <= max;
	}

	// ===========
	// ===========
	// ===========Integers
	// ===========
	// ===========
	/**
	 * @see #isValidRange(int, int, int, int)
	 */
	public static boolean isValidRange(int from, int to) {
		return isValidRange(from, to, Integer.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(int, int, int, int)
	 */
	public static boolean isValidRange(int from, int to, int max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(int from, int to, int max, int min) {
		return from >= min && from < to && to <= max;
	}

	// ===========
	// ===========
	// ===========Longs
	// ===========
	// ===========
	/**
	 * @see #isValidRange(long, long, long, long)
	 */
	public static boolean isValidRange(long from, long to) {
		return isValidRange(from, to, Long.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(long, long, long, long)
	 */
	public static boolean isValidRange(long from, long to, long max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(long from, long to, long max, long min) {
		return from >= min && from < to && to <= max;
	}

	// ===========
	// ===========
	// ===========Floats
	// ===========
	// ===========
	/**
	 * @see #isValidRange(float, float, float, float)
	 */
	public static boolean isValidRange(float from, float to) {
		return isValidRange(from, to, Float.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(float, float, float, float)
	 */
	public static boolean isValidRange(float from, float to, float max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(float from, float to, float max, float min) {
		return from >= min && from < to && to <= max;
	}

	// ===========
	// ===========
	// ===========Doubles
	// ===========
	// ===========
	/**
	 * @see #isValidRange(double, double, double, double)
	 */
	public static boolean isValidRange(double from, double to) {
		return isValidRange(from, to, Double.MAX_VALUE);
	}

	/**
	 * @see #isValidRange(double, double, double, double)
	 */
	public static boolean isValidRange(double from, double to, double max) {
		return isValidRange(from, to, max, 0);
	}

	/**
	 * @return true if from >= min && from < to && to < max
	 */
	public static boolean isValidRange(double from, double to, double max, double min) {
		return from >= min && from < to && to <= max;
	}

	// =================================================
	// =================================================
	// =================== index
	// =================================================
	// =================================================

	/**
	 * @see #index(int, int, CharSequence)
	 * @throws IndexOutOfBoundsException
	 */
	public static int index(int index) throws IndexOutOfBoundsException {
		return index(index, Integer.MAX_VALUE);
	}

	/**
	 * @see #index(int, int, CharSequence)
	 * @throws IndexOutOfBoundsException
	 */
	public static int index(int index, int max) throws IndexOutOfBoundsException {
		return index(index, max, null);
	}

	/**
	 * @throws IndexOutOfBoundsException if index < 0 or index >= max
	 */
	public static int index(int index, int max, CharSequence msg) throws IndexOutOfBoundsException {
		IndexOutOfBoundsException e = indexAndGet(index, max, msg);
		if (e != null)
			throw e;
		return index;
	}

	// =================

	/**
	 * @see #indexAndGet(int, int, CharSequence)
	 */
	public static IndexOutOfBoundsException indexAndGet(int index) {
		return indexAndGet(index, Integer.MAX_VALUE);
	}

	/**
	 * @see #indexAndGet(int, int, CharSequence)
	 */
	public static IndexOutOfBoundsException indexAndGet(int index, int max) {
		return indexAndGet(index, max, null);
	}

	/**
	 * @return {@link IndexOutOfBoundsException} if index < 0 or index >= max
	 */
	public static IndexOutOfBoundsException indexAndGet(int index, int max, CharSequence msg) {
		if (index < 0) {
			return new IndexOutOfBoundsException(String.format("index(%d) < 0, %s", index, nonull(msg)));
		} else if (index >= max) {
			return new IndexOutOfBoundsException(String.format("index(%d) >= max(%d), %s", index, max, nonull(msg)));
		}
		return null;
	}

	// =================================================
	// =================================================
	// =================== is valid index
	// =================================================
	// =================================================

	/**
	 * @see #isValidIndex(int, int)
	 */
	public static boolean isValidIndex(int index) {
		return isValidIndex(index, Integer.MAX_VALUE);
	}

	/**
	 * @return true if index >= 0 && index < max
	 */
	public static boolean isValidIndex(int index, int max) {
		return index >= 0 && index < max;
	}

	// =================================================
	// =================================================
	// =================== insert index
	// =================================================
	// =================================================

	/**
	 * @see #insertIndex(int, int, CharSequence)
	 */
	public static int insertIndex(int index, int max) throws IndexOutOfBoundsException {
		return insertIndex(index, max, null);
	}

	/**
	 * @throws IndexOutOfBoundsException if index > max || index < 0
	 */
	public static int insertIndex(int index, int max, CharSequence msg) throws IndexOutOfBoundsException {
		IndexOutOfBoundsException e = insertIndexAndGet(index, max, msg);
		if (e != null)
			throw e;
		return index;
	}

	// ================

	/**
	 * @see #insertIndexAndGet(int, int, CharSequence)
	 */
	public static IndexOutOfBoundsException insertIndexAndGet(int index, int max) {
		return insertIndexAndGet(index, max, null);
	}

	/**
	 * @return {@link IndexOutOfBoundsException} if index > max || index < 0
	 */
	public static IndexOutOfBoundsException insertIndexAndGet(int index, int max, CharSequence msg) {
		if (index > max || index < 0)
			return new IndexOutOfBoundsException(
					String.format("index(%d) > max(%d) || index < 0, %s", index, max, nonull(msg)));
		return null;
	}

	// =================================================
	// =================================================
	// =================== is valid insert index
	// =================================================
	// =================================================

	/**
	 * @return true if index >= 0 && index <= max
	 */
	public static boolean isValidInsertIndex(int index, int max) {
		return index >= 0 && index <= max;
	}

	// =================================================
	// =================================================
	// =================== insert length at
	// =================================================
	// =================================================

	/**
	 * @see #insertLengthAt(int, int, int, CharSequence)
	 * @throws IndexOutOfBoundsException
	 */
	public static int insertLengthAt(int index, int insertLength, int max) throws IndexOutOfBoundsException {
		return insertLengthAt(index, insertLength, max, null);
	}

	/**
	 * Check if <code>index</code> within range of 0 to <code>max</code>
	 * inclusively, and <code>length</code> can be inserted at given
	 * <code>index</code> without exceeding <code>max</code>
	 * 
	 * @throws IndexOutOfBoundsException if index > max || index < 0 || index +
	 *                                   length > max
	 */
	public static int insertLengthAt(int index, int insertLength, int max, CharSequence msg)
			throws IndexOutOfBoundsException {
		IndexOutOfBoundsException e = insertLengthAtAndGet(index, insertLength, max, msg);
		if (e != null)
			throw e;
		return index;
	}

	// =======================

	/**
	 * @see #insertLengthAt(int, int, int, CharSequence)
	 */
	public static IndexOutOfBoundsException insertLengthAtAndGet(int index, int insertLength, int max) {
		return insertLengthAtAndGet(index, insertLength, max, null);
	}

	/**
	 * Check if <code>index</code> within range of 0 to <code>max</code>
	 * inclusively, and <code>length</code> can be inserted at given
	 * <code>index</code> without exceeding <code>max</code>
	 * 
	 * @return {@link IndexOutOfBoundsException} if index > max || index < 0 ||
	 *         index + length > max
	 */
	public static IndexOutOfBoundsException insertLengthAtAndGet(int index, int insertLength, int max,
			CharSequence msg) {
		if (index > max || index < 0)
			return new IndexOutOfBoundsException(
					String.format("index(%d) > max(%d) || index < 0, %s", index, max, nonull(msg)));
		else if (index + insertLength > max)
			return new IndexOutOfBoundsException(
					String.format("index(%d) + length(%d) > max(%d), %s", index, insertLength, max, nonull(msg)));
		return null;
	}

	/**
	 * @return true if (index >= 0 && index <= max) && (index + length <= max)
	 */
	public static boolean isValidInsertLengthAt(int index, int insertLength, int max) {
		return (index >= 0 && index <= max) && (index + insertLength > max);
	}

	// =================================================
	// =================================================
	// =================== Numeric
	// =================================================
	// =================================================

	/**
	 * @see #isValidNumeric(char[], int, int, int, int)
	 */
	public static boolean isValidNumeric(char[] arr, int len) {
		return isValidNumeric(arr, len, 10);
	}

	/**
	 * @see #isValidNumeric(char[], int, int, int, int)
	 */
	public static boolean isValidNumeric(char[] arr, int len, int radix) {
		return isValidNumeric(arr, len, radix, 0);
	}

	/**
	 * @see #isValidNumeric(char[], int, int, int, int)
	 */
	public static boolean isValidNumeric(char[] arr, int len, int radix, int from) {
		return isValidNumeric(arr, len, radix, from, len);
	}

	/**
	 * @return true if given range is valid numeric, e.g: -0.232
	 */
	public static boolean isValidNumeric(char[] arr, int len, int radix, int from, int to) {
		if (len == 0)
			return false;

		int floatAt = -1;

		// .123
		if (arr[from] == '.')
			floatAt = from++;

		// -123
		if (arr[from] == '-') {
			// .-123 not ok
			if (floatAt != -1)
				return false;
			// -.123 is ok
			if (arr[from] == '.')
				floatAt = from++;
		}

		if (len == 0 || Character.digit(arr[from], radix) == -1) {
			return false;
		}

		for (; from < to; from++) {
			if (floatAt == -1 && arr[from] == '.') {
				floatAt = from;
				continue;
			}

			if (Character.digit(arr[from], radix) == -1) {
				return false;
			}
		}

		return true;
	}

	// =================================================
	// =================================================
	// =================== length
	// =================================================
	// =================================================

	/**
	 * Default min: 1<br>
	 * Default max: {@link Lang#ARRAY_SAFE_CAPACITY}<br>
	 * 
	 * @see #length(int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static int length(int length) throws IllegalArgumentException {
		return length(length, 1);
	}

	/**
	 * Default max: {@link Lang#ARRAY_SAFE_CAPACITY}<br>
	 * 
	 * @see #length(int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static int length(int length, int min) throws IllegalArgumentException {
		return length(length, min, ARRAY_SAFE_CAPACITY);
	}

	/**
	 * @see #length(int, int, int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static int length(int length, int min, int max) {
		return length(length, min, max, null);
	}

	/**
	 * @throws IllegalArgumentException if length < min || length > max
	 */
	public static int length(int length, int min, int max, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = lengthAndGet(length, min, max, msg);
		if (e != null)
			throw e;
		return length;
	}

	// ======================

	/**
	 * Default min: 1<br>
	 * Default max: {@link Lang#ARRAY_SAFE_CAPACITY}<br>
	 * 
	 * @see #lengthAndGet(int, int, int, CharSequence)
	 */
	public static IllegalArgumentException lengthAndGet(int length) {
		return lengthAndGet(length, 1);
	}

	/**
	 * Default max: {@link Lang#ARRAY_SAFE_CAPACITY}<br>
	 * 
	 * @see #lengthAndGet(int, int, int, CharSequence)
	 */
	public static IllegalArgumentException lengthAndGet(int length, int min) {
		return lengthAndGet(length, min, ARRAY_SAFE_CAPACITY);
	}

	/**
	 * @see #lengthAndGet(int, int, int, CharSequence)
	 */
	public static IllegalArgumentException lengthAndGet(int length, int min, int max) {
		return lengthAndGet(length, min, max, null);
	}

	/**
	 * @return {@link IllegalArgumentException} if length < min || length > max
	 */
	public static IllegalArgumentException lengthAndGet(int length, int min, int max, CharSequence msg) {
		if (length < min || length > max) {
			return new IllegalArgumentException(
					String.format("length(%d) < min(%d) || length >= max(%d), %s", length, min, max, nonull(msg)));
		}
		return null;
	}

	/**
	 * @see #isValidLength(int, int, int)
	 */
	public static boolean isValidLength(int length) {
		return isValidLength(length, 1);
	}

	/**
	 * @see #isValidLength(int, int, int)
	 */
	public static boolean isValidLength(int length, int min) {
		return isValidLength(length, min, ARRAY_SAFE_CAPACITY);
	}

	/**	
	 * @return true if length >= min && length < max
	 */
	public static boolean isValidLength(int length, int min, int max) {
		return length >= min && length < max;
	}

	// =================================================
	// =================================================
	// =================== bit size
	// =================================================
	// =================================================

	/**
	 * @see #bitSize(int, CharSequence)
	 * @throws IllegalArgumentException
	 */
	public static int bitSize(int size) throws IllegalArgumentException {
		return bitSize(size, null);
	}

	/**
	 * @throws IllegalArgumentException if size < 1
	 */
	public static int bitSize(int size, CharSequence msg) throws IllegalArgumentException {
		IllegalArgumentException e = bitSizeAndGet(size, msg);
		if (e != null)
			throw e;
		return size;
	}

	// ===============

	/**
	 * @see #bitSize(int, CharSequence)
	 */
	public static IllegalArgumentException bitSizeAndGet(int size) {
		return bitSizeAndGet(size, null);
	}

	/**
	 * @return IllegalArgumentException if size < 1
	 */
	public static IllegalArgumentException bitSizeAndGet(int size, CharSequence msg) {
		if (size < 1) {
			return new IllegalArgumentException(String.format("size(%d) < 1, %s", size, nonull(msg)));
		}
		return null;
	}

	/**
	 * @return true if size > 0
	 */
	public boolean isValidBitSize(int size) {
		return size > 0;
	}

	// =================================================
	// =================================================
	// =================== radix
	// =================================================
	// =================================================

	/**
	 * @see #radix(int, CharSequence)
	 * @throws NumberFormatException
	 */
	public static int radix(int radix) throws NumberFormatException {
		return radix(radix, null);
	}

	/**
	 * @throws NumberFormatException if radix < {@link Character#MIN_RADIX} or radix
	 *                               > {@link Character#MAX_RADIX}
	 */
	public static int radix(int radix, CharSequence msg) throws NumberFormatException {
		NumberFormatException e = radixAndGet(radix, msg);
		if (e != null)
			throw e;
		return radix;
	}

	// ==================

	/**
	 * @see #radixAndGet(int, CharSequence)
	 */
	public static NumberFormatException radixAndGet(int radix) {
		return radixAndGet(radix, null);
	}

	/**
	 * @return {@link NumberFormatException} if radix < {@link Character#MIN_RADIX}
	 *         or radix > {@link Character#MAX_RADIX}
	 */
	public static NumberFormatException radixAndGet(int radix, CharSequence msg) {
		if (radix < Character.MIN_RADIX) {
			return new NumberFormatException(
					String.format("radix(%d) < Character.MIN_RADIX(%d), %s", radix, Character.MIN_RADIX, nonull(msg)));
		}
		if (radix > Character.MAX_RADIX) {
			return new NumberFormatException(
					String.format("radix(%d) > Character.MAX_RADIX(%d), %s", radix, Character.MAX_RADIX, nonull(msg)));
		}
		return null;
	}

	/**
	 * @return true if radix >= {@link Character#MIN_RADIX} || radix <=
	 *         {@link Character#MAX_RADIX}
	 */
	public boolean isValidRadix(int radix) {
		return radix >= Character.MIN_RADIX || radix <= Character.MAX_RADIX;
	}

	// =================================================
	// =================================================
	// =================== capacity
	// =================================================
	// =================================================

	/**
	 * @see #capacity(int, int, CharSequence)
	 * @throws IndexOutOfBoundsException
	 */
	public static int capacity(int capacity, int required) throws IndexOutOfBoundsException {
		return capacity(capacity, required, null);
	}

	/**
	 * @throws IndexOutOfBoundsException if capacity < required
	 */
	public static int capacity(int capacity, int required, CharSequence msg) throws IndexOutOfBoundsException {
		IndexOutOfBoundsException e = capacityAndGet(capacity, required, msg);
		if (e != null)
			throw e;
		return capacity;
	}

	// ============

	/**
	 * @see #capacityAndGet(int, int, CharSequence)
	 */
	public static IndexOutOfBoundsException capacityAndGet(int capacity, int required) {
		return capacityAndGet(capacity, required, null);
	}

	/**
	 * @return {@link IndexOutOfBoundsException} if capacity < required
	 */
	public static IndexOutOfBoundsException capacityAndGet(int capacity, int required, CharSequence msg) {
		if (capacity < required)
			return new IndexOutOfBoundsException(
					String.format("capacity(%d) < required(%d), %s", capacity, required, nonull(msg)));
		return null;
	}

	// =================================================
	// =================================================
	// =================== nulled
	// =================================================
	// =================================================

	/**
	 * @see #nulled(int, int, CharSequence)
	 * @throws NullPointerException
	 */
	public static <T>T nulled(T o) throws NullPointerException {
		return nulled(o, null);
	}

	/**
	 * @throws NullPointerException if o == null
	 */
	public static <T>T nulled(T o, CharSequence msg) throws NullPointerException {
		NullPointerException e = nulledAndGet(o, msg);
		if (e != null)
			throw e;
		return o;
	}

	// ============

	/**
	 * @see #nulledAndGet(int, int, CharSequence)
	 */
	public static NullPointerException nulledAndGet(Object o, int required) {
		return nulledAndGet(o, null);
	}

	/**
	 * @return {@link NullPointerException} if o == null
	 */
	public static NullPointerException nulledAndGet(Object o, CharSequence msg) {
		if (o == null)
			return new NullPointerException(nonull(msg).toString());
		return null;
	}

	// -----------------

	private static CharSequence nonull(CharSequence msg) {
		return msg == null ? "" : msg;
	}

	public static void checkCopy(int arrlen, int len, int readFrom, int readTo, int newLength, int writeAtIndex) {
		Check.range(readFrom, readTo, len);
		Check.capacity(newLength, readTo - readFrom);
		Check.index(writeAtIndex, newLength);
	}

}
