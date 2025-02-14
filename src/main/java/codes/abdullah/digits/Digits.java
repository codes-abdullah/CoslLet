package codes.abdullah.digits;

import java.util.Random;

// ( +10 ) + ( +5 ) = ( +15 ) add
// ( -10 ) + ( +5 ) = ( -5 ) bigger-sign & dif
// ( +10 ) + ( -5 ) = ( +5 ) bigger-sign & dif
// ( -10 ) + ( -5 ) = ( -15 ) add

// ( +10 ) - ( +5 ) = ( +5 ) dif
// ( -10 ) - ( +5 ) = ( -15 ) bigger-sign & add
// ( +10 ) - ( -5 ) = ( +15 ) bigger-sign & add
// ( -10 ) - ( -5 ) = ( -5 ) dif

// ( +10 ) * ( +5 ) = ( +50 ) always +
// ( -10 ) * ( +5 ) = ( -50 ) always -
// ( +10 ) * ( -5 ) = ( -50 ) always -
// ( -10 ) * ( -5 ) = ( +50 ) always +

// ( +10 ) / ( +5 ) = ( +2 ) always +
// ( -10 ) / ( +5 ) = ( -2 ) always -
// ( +10 ) / ( -5 ) = ( -2 ) always -
// ( -10 ) / ( -5 ) = ( +2 ) always +
public class Digits {

	public static final Random RANDOM = new Random();
	public static final int EOF = -1;
	public static final int BUFFER_SIZE_1024 = 1024 * 1;
	public static final int BUFFER_SIZE_2048 = 1024 * 2;
	public static final int BUFFER_SIZE_4096 = 1024 * 4;
	public static final int BUFFER_SIZE_8192 = 1024 * 8;
	/**
	 * Math.pow(4, 10) == 10000, outputs in round methods will be:
	 * 1863.38923729333333333333 -> 1863.3892
	 */
	static final int DEFAULT_MAX_FLOATS_LEFTOVER = (int) Math.pow(10, 3);
	/**
	 * All possible chars for representing a number as a String
	 */
	static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	static final char[] DIGIT_TENS = { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1',
			'1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3',
			'3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5',
			'5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7',
			'7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9', };

	static final char[] DIGIT_ONES = { //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', //
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', };

	static final int[] SIZE_TABLE = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999,
			Integer.MAX_VALUE };
	private static final char[] int_min_val = "-2147483648".toCharArray();
	private static final char[] long_min_val = "-9223372036854775808".toCharArray();
	static final int RADIX_8_INT_SIZE = 11;
	static final int RADIX_10_INT_SIZE = 10;
	static final int RADIX_16_INT_SIZE = 8;
	static final int RADIX_8_LONG_SIZE = 22;
	static final int RADIX_10_LONG_SIZE = 19;
	static final int RADIX_16_LONG_SIZE = 16;
	public static final Integers ints = new Integers();
	public static final Longs longs = new Longs();
	public static final Floats floats = new Floats();
	public static final Doubles doubles = new Doubles();
	public static final Numbers numbers = new Numbers();

}
