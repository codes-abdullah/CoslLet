package codes.abdullah.digits;

public class Doubles {
	Doubles() {
	}

	/**
	 * very lightweight tool to eliminate numbers after floating point<br>
	 * example:<br>
	 * 1863.38923729333333333333 -> 1863.3892
	 * 
	 * @see #DEFAULT_MAX_FLOATS_LEFTOVER
	 */
	public double round(double d) {
		return round(d, Digits.DEFAULT_MAX_FLOATS_LEFTOVER);
	}

	/**
	 * very lightweight tool to eliminate numbers after floating point<br>
	 * example:<br>
	 * 1863.38923729333333333333 -> 1863.3892
	 * 
	 * @see #DEFAULT_MAX_FLOATS_LEFTOVER
	 */
	public double round(double d, int maxFloatsLeftOver) {
		return Math.round(d * (double) maxFloatsLeftOver) / (double) maxFloatsLeftOver;
	}

	/**
	 * @return percent
	 */
	public double percentageOf(double max, double current) {
		return current * 100 / max;
	}

	/**
	 * @return current
	 */
	public double amountOf(double max, double percentage) {
		return percentage / 100 * max;
	}

	public double randomPositive() {
		return random(0L, Double.MAX_VALUE);
	}

	public double randomNegative() {
		return random(Double.MIN_VALUE, 0);
	}

	public double random() {
		return random(Double.MIN_VALUE, Double.MAX_VALUE);
	}

	/**
	 * @param min inclusive
	 * @param max exclusive
	 */
	public double random(double min, double max) {
		final double bound = max - min;
		if (bound == 0)
			return Digits.RANDOM.nextBoolean() ? max : min;
		// Specialize boundedNextDouble for origin == 0, bound > 0
		double r = Digits.RANDOM.nextDouble();
		r = r * bound;
		if (r >= bound) // may need to correct a rounding problem
			r = Math.nextDown(bound);
		return r;
	}
}