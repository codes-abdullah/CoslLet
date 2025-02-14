package codes.abdullah.digits;
public  class Floats {
		 Floats() {
		}

		/**
		 * very lightweight tool to eliminate numbers after floating point<br>
		 * example:<br>
		 * 1863.38923729333333333333 -> 1863.3892
		 * 
		 * @see #DEFAULT_MAX_FLOATS_LEFTOVER
		 */
		public float round(float d) {
			return round(d, Digits.DEFAULT_MAX_FLOATS_LEFTOVER);
		}

		/**
		 * very lightweight tool to eliminate numbers after floating point<br>
		 * example:<br>
		 * 1863.38923729333333333333 -> 1863.3892
		 * 
		 * @see #DEFAULT_MAX_FLOATS_LEFTOVER
		 */
		public float round(float d, int maxFloatsLeftOver) {
			return (float) (Math.round(d * (float) maxFloatsLeftOver) / (float) maxFloatsLeftOver);
		}

		/**
		 * @return percent
		 */
		public float percentageOf(float max, float current) {
			return current * 100f / max;
		}

		/**
		 * @return current
		 */
		public float amountOf(float max, float percentage) {
			return percentage / 100f * max;
		}

		public float randomPositive() {
			return random(0L, Float.MAX_VALUE);
		}

		public float randomNegative() {
			return random(Float.MIN_VALUE, 0);
		}

		public float random() {
			return random(Float.MIN_VALUE, Float.MAX_VALUE);
		}

		/**
		 * @param min inclusive
		 * @param max exclusive
		 */
		public float random(float min, float max) {
			final float bound = max - min;
			if (bound == 0)
				return Digits.RANDOM.nextBoolean() ? max : min;
			// Specialize boundedNextDouble for origin == 0, bound > 0
			float r = Digits.RANDOM.nextFloat();		
	        r = r * bound;
	        if (r >= bound) // may need to correct a rounding problem
	            r = Float.intBitsToFloat(Float.floatToIntBits(bound) - 1);
	        return r;
		}

		public boolean isValid(CharSequence cs) {
			try {
				Float.parseFloat(cs.toString());
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}

		public int computeHashcode(float v) {
			return (31 * (int) ((int) v ^ ((int) v >>> 32)));
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
	// =========================== doubles
	// ===========================
	// ===========================
	// ===========================
	// ===========================
	// ===========================
	// ===========================
	// ===========================
	// ===========================

	