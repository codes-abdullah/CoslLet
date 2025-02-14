package codes.abdullah.digits;

import codes.abdullah.parcel.Check;

public class Longs {
	Longs() {

	}

	// ===================
	// =================== to binary
	// ===================



	// ===================
	// =================== parse
	// ===================

	/** @see #parse(CharSequence, int, int, int) */
	public long parse(CharSequence cs) throws NumberFormatException {
		return parse(cs, 0);
	}

	/** @see #parse(CharSequence, int, int, int) */
	public long parse(CharSequence cs, int from) throws NumberFormatException {
		return parse(cs, from, cs.length());
	}

	/** @see #parse(CharSequence, int, int, int) */
	public long parse(CharSequence cs, int from, int to) throws NumberFormatException {
		return parse(cs, from, to, 10);
	}

	/**
	 * This is enhanced version of {@link Long#parseLong(String, int)}<br>
	 * Parse string as long based on given radix and range<br>
	 * e.g:<br>
	 * "7fffffff" -> 2147483647 <br>
	 * Enhanced version which supports: <br>
	 * 1: range scan with {@link CharSequence} instances (could be mutable)<br>
	 * 2: negative numbers by other radixes<br>
	 * 3: will skip any underscore chars<br>
	 * <br>
	 */
	public long parse(CharSequence cs, int from, int to, int radix) throws NumberFormatException {
		if (cs.length() == 0) {
			return 0;
		}
		int srclen = cs.length();
		to = to > srclen ? srclen : to;
		Check.range(from, to, srclen);
		Check.radix(radix);
		char ch = 0;
		int exponent = 0, digit = 0, rangeLen = 0;
		long result = 0, val = 0;
		boolean negative = false;
		int held = 0;
		ch = cs.charAt(from);
		if (ch < '0') { // Possible leading "+" or "-"
			if (ch == '-') {
				negative = true;
			} else if (ch != '+') {
				throw new NumberFormatException(String.format("at(%d), found(%s), src(%s)", from, ch, cs));
			}
			from++;
		} else if (ch == '0') {
			if (radix == 2 && from + 1 < cs.length() && cs.charAt(from + 1) == 'b') {
				from += 2;
			} else if (radix == 8) {
				from += 1;
			} else if (radix == 16 && from + 1 < cs.length() && cs.charAt(from + 1) == 'x') {
				from += 2;
			}
		}
		rangeLen = to - from;
		exponent = rangeLen - 1;
		if ((radix == 2 && exponent == Long.SIZE - 1) || (radix == 8 && exponent == 21)) {
			held = 1;
		}
		while (from < to) {
			ch = cs.charAt(from);
			if (ch == '_') {
				from++;
				continue;
			}
			digit = Character.digit(ch, radix);
			if (digit < 0) {
				throw new NumberFormatException(
						String.format("at(%d), found(%s), radix(%d), src(%s)", from, ch, radix, cs));
			}
			exponent = --rangeLen;
			val = ((long) Math.pow(radix, exponent)) * digit;
			result += val;
			from++;
		}
		result += held;
		return negative ? -result : result;
	}

	/** @see #sub(long, int, int, boolean) */
	public long sub(long n, int from) {
		return sub(n, from, Integer.MAX_VALUE);
	}

	/** @see #sub(long, int, int, boolean) */
	public long sub(long n, int from, int to) {
		return sub(n, from, to, false);
	}

	/**
	 * sub-long range of digits and return them as <code>long</code><br>
	 * <br>
	 * e.g:<br>
	 * 12345678, from 2 to 4, reverse = false -> 34<br>
	 * 12345678, from 1 to 5, reverse = false -> 2345<br>
	 * <br>
	 * 12345678, from 0 to 2, reverse = true -> 78<br>
	 * 12345678, from 5 to 8, reverse = true -> 123<br>
	 * 
	 * @param from    if reverse=false, (left-inclusive), otherwise
	 *                (right-exclusive)
	 * @param to      if reverse=false, (right-exclusive), otherwise
	 *                (left-inclusive), if to = -1, will select the entire digits
	 * @param reverse change selection direction
	 */
	public long sub(long n, int from, int to, boolean reverse) {
		to = to == Integer.MAX_VALUE ? lengthOf(n) : to;
		boolean off = false;
		if (n < 0) {
			if (n == Long.MIN_VALUE) {
				off = reverse && from == 0 || !reverse && to == 10 ? true : false;
				n = Long.MAX_VALUE;
			} else {
				n = -n;
			}
		}

		int len_of = lengthOf(n);
		to = to > len_of ? len_of : to;
		from = from < 0 ? 0 : from;
		if (reverse) {
			int tmp = from;
			from = to;
			to = tmp;
			from = (len_of) - from;
			to = (len_of) - to;
		}

		int r;
		long q, pow = 1, out = 0;
		while (n >= 65536 && len_of > from) {
			q = n / 100;
			r = (int) (n - ((q << 6) + (q << 5) + (q << 2)));
			n = q;

			if (--len_of >= from && len_of < to) {
				out += Digits.ints.toInt(Digits.DIGIT_ONES[r]) * pow;
				pow *= 10;
			}

			if (--len_of >= from && len_of < to) {
				out += Digits.ints.toInt(Digits.DIGIT_TENS[r]) * pow;
				pow *= 10;
			}
		}

		for (; len_of > from;) {
			q = (n * 52429) >>> (16 + 3);
			r = (int) (n - ((q << 3) + (q << 1)));

			if (--len_of >= from && len_of < to) {
				out += Digits.ints.toInt(Digits.DIGITS[r]) * pow;
				pow *= 10;
			}

			n = q;
			if (n == 0) {
				break;
			}
		}

		return off ? out + 1 : out;
	}

	/** @see #format(long, int, char[], int, int, int, char) */
	public int format(long n, int radix, char[] out, int outlen) {
		return format(n, radix, out, outlen, 0);
	}

	/** @see #format(long, int, char[], int, int, int, char) */
	public int format(long n, int radix, char[] out, int outlen, int offset) {
		return format(n, radix, out, outlen, offset, 0);
	}

	/** @see #format(long, int, char[], int, int, int, char) */
	public int format(long n, int radix, char[] out, int outlen, int offset, int delimitation) {
		return format(n, radix, out, outlen, offset, delimitation, ' ');
	}

	/**
	 * Format n as chars based on radix and write it to given buffer<br>
	 * e.g:<br>
	 * n = 2147483647, radix = 16, buffer = codes.abdullah.java.lang, buffer-length
	 * = buffer.length, offset = 0, delimitation = 0, delimiter = 0<br>
	 * output:<br>
	 * codes.abdullah.j7fffffff <br>
	 * assume buffer-length = 19 (exclude .lang), offset = 2, and delimitaion = 4
	 * for delimiter (-) output:<br>
	 * [TEST]
	 * 
	 * <pre>
	 * n = 2147483647
	 * radix = 16
	 * out = "codes.abdullah.java.lang"
	 * outlen = out.length
	 * offset = 0
	 * delimitation = 0
	 * delimiter = 0
	 * formatInt(n, radix, out, out.length, offset, delimitation, delimiter) = 16 && out = codes.abdullah.j7fffffff
	 * 
	 * offset = 2
	 * formatInt(n, radix, out, out.length, offset, delimitation, delimiter) = 14 && out = codes.abdullah7fffffffng
	 * 
	 * outlen = 19 //exclude .lang
	 * delimitation = 4
	 * delimiter = -
	 * formatInt(n, radix, out, out.length, offset, delimitation, delimiter) = 14 && out = codes.abd-7fff-ffff.lang
	 * 
	 * offset = 2
	 * formatInt(n, radix, out, out.length, offset, delimitation, delimiter) = 7 && out = codes.a-7fff-ffffva.lang
	 * </pre>
	 * 
	 * @param n            the number to format
	 * @param radix        writing radix, supported only 2, 8, 10 and 16
	 * @param out          buffer to write at, buffer must be long enough to
	 *                     accommodate writing process
	 * @param outlen       buffer length
	 * @param offset       offset to write (starting from right exclusively)
	 * @param delimitation e.g: delimitation = (4), and delimeter = (_), will insert
	 *                     (_) after each 4 chars, if delimitation = 0, will not
	 *                     inert anything
	 * @param delimiter
	 * @return char-index where stopped writing at
	 */
	public int format(long n, int radix, char[] out, int outlen, int offset, int delimitation, char delimiter) {
		final boolean delim = delimitation > 0 && delimiter > 0;
		if (radix == 10) {
			if (!delim)
				return formatRadix10(n, out, outlen, offset);
			return formatRadix10(n, out, outlen, offset, delimitation, delimiter);
		}
		int charPos = outlen - offset;
		int shift = Digits.ints.findShift(radix);
		int mask = radix - 1;
		int x = delimitation;
		do {
			out[--charPos] = Digits.DIGITS[((int) n) & mask];
			n >>>= shift;
			if (delim && charPos > 0 && --x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
		} while (n != 0);
		return charPos;
	}

	/**
	 * Note: negative sign will not be written to buffer <br>
	 * Enhanced version, can handle MIN_VALUE
	 * 
	 * @param offset index to start writing backwardly
	 */
	private int formatRadix10(long n, char[] out, int outlen, int offset) {
		long q;
		int r;
		int charPos = outlen - offset;
		boolean min_val = n == Long.MIN_VALUE;
		// 922337203685477580(8) -> 922337203685477580(7)
		if (min_val) {
			n = Long.MAX_VALUE;
		}
		n = Math.abs(n);

		// Get 2 digits/iteration using longs until quotient fits into an int
		while (n > Integer.MAX_VALUE) {
			q = n / 100;
			// really: r = i - (q * 100);
			r = (int) (n - ((q << 6) + (q << 5) + (q << 2)));
			n = q;
			out[--charPos] = Digits.DIGIT_ONES[r];
			out[--charPos] = Digits.DIGIT_TENS[r];
		}

		// Get 2 digits/iteration using ints
		int q2;
		int i2 = (int) n;
		while (i2 >= 65536) {
			q2 = i2 / 100;
			// really: r = i2 - (q * 100);
			r = i2 - ((q2 << 6) + (q2 << 5) + (q2 << 2));
			i2 = q2;
			out[--charPos] = Digits.DIGIT_ONES[r];
			out[--charPos] = Digits.DIGIT_TENS[r];
		}

		// Fall thru to fast mode for smaller numbers
		// assert(i2 <= 65536, i2);
		for (;;) {
			q2 = (i2 * 52429) >>> (16 + 3);
			r = i2 - ((q2 << 3) + (q2 << 1)); // r = i2-(q2*10) ...
			out[--charPos] = Digits.DIGITS[r];
			i2 = q2;
			if (i2 == 0)
				break;
		}

		// 922337203685477580(7) -> 922337203685477580(8)
		if (min_val) {
			int at = outlen - offset;
			out[--at] = '8';
		}
		return charPos;
	}

	private int formatRadix10(long n, char[] out, int outlen, int offset, int delimitation, char delimiter) {
		long q;
		int r;
		int charPos = outlen - offset;
		int x = delimitation;
		boolean min_val = n == Long.MIN_VALUE;
		// 922337203685477580(8) -> 922337203685477580(7)
		if (min_val) {
			n = Long.MAX_VALUE;
		}
		n = Math.abs(n);

		// Get 2 digits/iteration using longs until quotient fits into an int
		while (n > Integer.MAX_VALUE) {
			q = n / 100;
			// really: r = i - (q * 100);
			r = (int) (n - ((q << 6) + (q << 5) + (q << 2)));
			n = q;
			out[--charPos] = Digits.DIGIT_ONES[r];
			if (--x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
			out[--charPos] = Digits.DIGIT_TENS[r];
			if (--x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
		}

		// Get 2 digits/iteration using ints
		int q2;
		int i2 = (int) n;
		while (i2 >= 65536) {
			q2 = i2 / 100;
			// really: r = i2 - (q * 100);
			r = i2 - ((q2 << 6) + (q2 << 5) + (q2 << 2));
			i2 = q2;
			out[--charPos] = Digits.DIGIT_ONES[r];
			if (--x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
			out[--charPos] = Digits.DIGIT_TENS[r];
			if (--x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
		}

		// Fall thru to fast mode for smaller numbers
		// assert(i2 <= 65536, i2);
		for (;;) {
			q2 = (i2 * 52429) >>> (16 + 3);
			r = i2 - ((q2 << 3) + (q2 << 1)); // r = i2-(q2*10) ...
			out[--charPos] = Digits.DIGITS[r];
			i2 = q2;
			if (i2 == 0)
				break;
			if (--x % delimitation == 0) {
				out[--charPos] = delimiter;
				x = delimitation;
			}
		}

		// 922337203685477580(7) -> 922337203685477580(8)
		if (min_val) {
			int at = outlen - offset;
			out[--at] = '8';
		}
		return charPos;
	}

	public int numberOfTrailingZeros(long n, int radix) {
		switch (radix) {
		case 2:
			return Long.numberOfTrailingZeros(n);
		case 8:
			return n == 0 ? Digits.RADIX_8_LONG_SIZE : Long.numberOfTrailingZeros(n) / 3;
		case 16:
			return Long.numberOfTrailingZeros(n) / 4;
		default: {
			if (n == Long.MAX_VALUE || n == Long.MIN_VALUE)
				return 0;
			else if (n == 0)
				return Digits.RADIX_10_LONG_SIZE;
			n = n < 0 ? -n : n;
			int count = 0;
			long q;
			do {
				q = n % 10;
				if (q != 0)
					return count;
				count++;
			} while ((n = n / 10L) != 0);
			return count;

		}
		}
	}

	public int numberOfLeadingZeros(long n, int radix) {
		int maxlen = Digits.RADIX_10_LONG_SIZE;
		switch (radix) {
		case 2:
			return Long.numberOfLeadingZeros(n);
		case 8:
			maxlen = Digits.RADIX_8_LONG_SIZE;
			break;
		case 16:
			maxlen = Digits.RADIX_16_LONG_SIZE;
			break;
		}
		return n == 0 ? maxlen : maxlen - lengthOf(n, radix);
	}

	/** @see #lengthOf(long, int) */
	public int lengthOf(long n) {
		return lengthOf(n, 10);
	}

	/**
	 * Light-weight algorithm to calculate length of signed number in string
	 * representation, negative signs are not counted in results<br>
	 * [TEST]
	 * 
	 * <pre>
	 * lengthOf(5678, 2) = 13 //1011000101110
	 * lengthOf(5678, 8) = 5 //13056
	 * lengthOf(5678, 10) = 4 //5678
	 * lengthOf(5678, 16) = 4 //162E
	 * 
	 * // same goes for negative values, will be treated as unsigned, and signs not counted
	 * 
	 * lengthOf(-5678, 2) = 64 //1111111111111111111111111111111111111111111111111110100111010010
	 * lengthOf(-5678, 8) = 22 //1777777777777777764722
	 * lengthOf(-5678, 10) = 4 //-5678
	 * lengthOf(-5678, 16) = 16 //ffffffffffffe9d2
	 * </pre>
	 * 
	 * @param radix supported only 2, 8, 10 and 16
	 */
	public int lengthOf(long n, int radix) {
		if (radix == 10) {
			if (n < 0) {
				if (n == Long.MIN_VALUE)
					return 19;
				n = -n;
			}
			return dolength10(n);
		}

		int shift = Digits.ints.findShift(radix);

		if (n < 0) {
			if (radix == 2)
				return 64;
			else if (radix == 8)
				return 22;
			else
				return 16;
		}

		long m = 1;
		int shifter = shift;
		for (; shift < Long.SIZE; shift += shifter) {
			m = 1L << shift;
			if (m > n || m == Long.MIN_VALUE) {
				break;
			}
		}
		return shift / shifter;
	}

	private int dolength10(long x) {
		long p = 10;
		for (int i = 1; i < 19; i++) {
			if (x < p)
				return i;
			p = 10 * p;
		}
		return 19;
	}

	/**
	 * @return percent
	 */
	public long percentageOf(long max, long current) {
		return current * 100 / max;
	}

	/**
	 * @return current
	 */
	public long amountOf(long max, long percentage) {
		return percentage / 100 * max;
	}

	/**
	 * @return factorial of given n
	 */
	public long factorialOf(long n) {
		if (n >= 1)
			return n * factorialOf(n - 1);
		else
			return 1;
	}

	public long[] rangeOf(int len) {
		return rangeOf(0, len);
	}

	public long[] rangeOf(int from, int to) {
		Check.range(from, to);
		long[] arr = new long[to - from];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = from++;
		}
		return arr;
	}

	/**
	 * i.e: <b>num = 8</b>, return String <b>08</b>
	 */
	public String considerTen(long num) {
		return Digits.numbers.considerZeroing(num, 2);
	}

	/**
	 * 
	 * i.e: <b>num = 8</b>, return String <b>008</b>
	 */
	public String considerHundred(long num) {
		return Digits.numbers.considerZeroing(num, 3);
	}

	/**
	 * i.e: <b>num = 8</b>, return String <b>0008</b>
	 */
	public String considerThousand(long num) {
		return Digits.numbers.considerZeroing(num, 4);
	}

	/**
	 * Check a number is Odd
	 *
	 * @param num The number to check.
	 * @return True if it is Odd number
	 */
	public boolean isOdd(long num) {
		if ((num & 1L) != 0)
			return true;
		return false;
	}

	/**
	 * Function to calculate x raised to the power y
	 * 
	 * Time Complexity: O(n) Space Complexity: O(1) Algorithmic Paradigm: Divide and
	 * conquer.
	 */
	public long pow(long x, long y) {
		// y = y < 0 ? -y : y;
		if (y == 0)
			return 1;
		else if ((y % 2) == 0)
			return pow(x, y / 2) * pow(x, y / 2);
		else
			return x * pow(x, y / 2) * pow(x, y / 2);

	}

	/**
	 * Function to calculate x raised to the power y in O(logn) Time Complexity of
	 * optimized solution: O(logn)
	 */
	public long powV2(long x, long y) {
		// y = y < 0 ? -y : y;
		long temp;
		if (y == 0)
			return 1;

		temp = powV2(x, y / 2);
		if ((y % 2) == 0)
			return temp * temp;
		else
			return x * temp * temp;
	}

	/**
	 * fastest way to find if <b>n</b> is power of <b>2</b> <br>
	 * you can't modify this to find other powers, already tried, works only with
	 * exponent 2
	 */
	//
	public boolean isPowerOf2(long n) {
		return (n > 0) && ((n & (n - 1L)) == 0);
	}

	/**
	 * @return true if <b>n</b> is power of <b>pow</b>
	 */
	public boolean isPowerOf(long n, int pow) {
		while (n > pow - 1L && n % pow == 0)
			n /= pow;
		return n == 1L;
	}

	public boolean isValid(CharSequence cs) {
		return isValid(cs, 10);
	}

	public boolean isValid(CharSequence cs, int radix) {
		return isValid(cs, radix, 0);
	}

	public boolean isValid(CharSequence cs, int radix, int from) {
		return isValid(cs, radix, from, cs.length());
	}

	public boolean isValid(CharSequence cs, int radix, int from, int to) {
		try {
			parse(cs, radix, from, to);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public int computeHashcode(long v) {
		return (31 * (int) ((int) v ^ ((int) v >>> 32)));
	}

	/**
	 * index-level flipper<br>
	 * i.e: say an array.len = 5 and given n = 1 (second number), to flip it
	 * accoding to index-level, will return 3, which is the (second number) from an
	 * opposite perspective
	 * 
	 */
	public long flip(long n, long max) {
		return (max - 1L) - n;
	}

	public boolean isFlagged(long flags, long f) {
		return flags > 0 && (flags & f) == f;
	}

	public boolean isFlagged(long flags, long trueFlags, long falseFlags) {
		return flags > 0 && (flags & falseFlags) != falseFlags && (flags & trueFlags) == trueFlags;
	}

	public long flag(long flags, long flag) {
		return flags | flag;
	}

	public long combineFlags(long[] flags) {
		long flag = 0;
		for (int i = 0; i < flags.length; i++) {
			flag |= flags[i];
		}
		return flag;
	}

	public long unflag(long flags, long flag) {
		return flags & (flags ^ flag);
	}

	public long reflag(boolean b, long flags, long flag) {
		return b ? flag(flags, flag) : unflag(flags, flag);
	}

	/**
	 * find how many head representation in given currentSize<br>
	 * e.g: tabs consider as 8 chars for most consoles, so e.g: [codes] = 5 chars,
	 * headSize = 8, currentSize = 5, will returns 1, it is a broken tab, missing
	 * only 3 chars to complete a tab, e.g: [JAVA_HOME] = 9 chars will return 2, it
	 * represent a full tab (8 chars) + broken tab (3 chars), by fixed the broken
	 * size will get 2 full tabs <br>
	 * <br>
	 * also can be used to organize bits literals and many others
	 */
	public long headsCount(long currentSize, long headSize) {
		currentSize--;
		long n = (long) Math.ceil(currentSize / headSize);
		return n + 1L;
	}

	/**
	 * @return how many remaining for given <b>currentSize</b> to complete full
	 *         <b>headSize</b>, e.g: codes = 5 chars, remaining 3 to complete full
	 *         tab
	 * 
	 */
	public long headMissing(long currentSize, long headSize) {
		if (currentSize <= headSize) {
//				return headSize - currentSize;
		}
		return headSize - (currentSize % headSize);
	}

	/**
	 * level-based digits extractor, i.e: n = 75218<br>
	 * level: 1 return 8<br>
	 * level: 10 return 1<br>
	 * level: 100 return 2<br>
	 * level: 1000 return 5<br>
	 * level: 10000 return 7<br>
	 */
	public long extract(long n, long level) {
		int sign = 1;
		if (n < 0) {
			n = -n;
			sign = -sign;
		}
		long x = n / level;
		if (x / 10 > 0) {
			return (x % 10) * sign;
		}
		return x * sign;
	}

	public long randomPositive() {
		return random(0L, Long.MAX_VALUE);
	}

	public long randomNegative() {
		return random(Long.MIN_VALUE, 0);
	}

	public long random() {
		return random(Long.MIN_VALUE, Long.MAX_VALUE);
	}

	/**
	 * @param min inclusive
	 * @param max exclusive
	 */
	public long random(long min, long max) {
		final long bound = max - min;
		if (bound == 0)
			return Digits.RANDOM.nextBoolean() ? max : min;
		// Specialize boundedNextLong for origin == 0, bound > 0
		final long m = bound - 1;
		long r = Digits.RANDOM.nextLong();
		if ((bound & m) == 0L) {
			// The bound is a power of 2.
			r &= m;
		} else {
			// Must reject over-represented candidates
			/*
			 * This loop takes an unlovable form (but it works): because the first candidate
			 * is already available, we need a break-in-the-middle construction, which is
			 * concisely but cryptically performed within the while-condition of a body-less
			 * for loop.
			 */
			for (long u = r >>> 1; u + m - (r = u % bound) < 0L; u = Digits.RANDOM.nextLong() >>> 1)
				;
		}
		return r;
	}
}

// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// =========================== floats
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
// ===========================
