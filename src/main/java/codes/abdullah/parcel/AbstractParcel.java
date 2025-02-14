package codes.abdullah.parcel;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.Set;

import codes.abdullah.digits.Digits;

public abstract class AbstractParcel implements Parcel {

	abstract Parcel assign(Map<String, Serializable> m);

	String getTrimmedString(String key) {
		String str = (String) handleGetSerializable(key);
		return str != null ? str.trim() : null;
	}

	private Serializable handleGetSerializable(String key) {
		Map<String, Serializable> map = getMap();
		Serializable o = map.get(key);
		if (o == null && isThrowOnNullGet())
			throw new NoSuchElementException("no such element for key: " + key);
		return o;
	}

	@Override
	public Serializable getSerializable(String key) {
		return getMap().get(key);
	}

	@Override
	public Serializable getSerializable(String key, Serializable defaultValue) {
		try {
			return getSerializable(key);
		} catch (Exception e) {
		}
		return defaultValue;
	}

	@Override
	public Parcel putAll(ResourceBundle res) {
		Map<String, Serializable> map = getMap();
		Enumeration<String> keys = res.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String val = res.getString(key);
			map.put(key, val);
		}
		return assign(map);
	}

	@Override
	public Parcel putAll(Parcel par) {
		Map<String, Serializable> map = getMap();
		map.putAll(par.getMap());
		return assign(map);
	}

	@Override
	public Parcel putAll(Map<String, Serializable> m) {
		Map<String, Serializable> map = getMap();
		map.putAll(m);
		return assign(map);
	}

	@Override
	public Parcel put(String key, Serializable val) {
		Map<String, Serializable> map = getMap();
		map.put(key, val);
		return assign(map);
	}

	// ==============
	// ==============boolean
	// ==============
	@Override
	public boolean getBoolean(String key) {
		String str = (String) handleGetSerializable(key);
		return Boolean.parseBoolean(str.trim());
	}

	@Override
	public boolean getBoolean(String key, boolean defaultVal) {
		try {
			return getBoolean(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============byte
	// ==============
	@Override
	public byte getByte(String key) {
		String str = (String) handleGetSerializable(key);
		return (byte) Digits.ints.parse(str.trim());
	}

	@Override
	public byte getByte(String key, byte defaultVal) {
		try {
			return getByte(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============short
	// ==============
	@Override
	public short getShort(String key) {
		String str = (String) handleGetSerializable(key);
		return (short) Digits.ints.parse(str.trim());
	}

	@Override
	public short getShort(String key, short defaultVal) {
		try {
			return getShort(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============int
	// ==============
	@Override
	public int getInt(String key) {
		String str = (String) handleGetSerializable(key);
		return Digits.ints.parse(str.trim());
	}

	@Override
	public int getInt(String key, int defaultVal) {
		try {
			return getInt(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============long
	// ==============
	@Override
	public long getLong(String key) {
		String str = (String) handleGetSerializable(key);
		return Long.parseLong(str.trim());
	}

	@Override
	public long getLong(String key, long defaultVal) {
		try {
			return getLong(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============float
	// ==============
	@Override
	public float getFloat(String key) {
		String str = (String) handleGetSerializable(key);
		return Float.parseFloat(str.trim());
	}

	@Override
	public float getFloat(String key, float defaultVal) {
		try {
			return getFloat(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============double
	// ==============
	@Override
	public double getDouble(String key) {
		String str = (String) handleGetSerializable(key);
		return Double.parseDouble(str.trim());
	}

	@Override
	public double getDouble(String key, double defaultVal) {
		try {
			return getDouble(key);
		} catch (Exception e) {
		}
		return defaultVal;
	}

	// ==============
	// ==============String
	// ==============

	@Override
	public String getString(String key) {
		return (String) handleGetSerializable(key);
	}

	@Override
	public String getString(String key, String defaultVal) {
		String val = getString(key);
		return val == null ? defaultVal : val;
	}

	// ==============
	// ==============boolean-array
	// ==============
	@Override
	public boolean[] getBooleanArray(String key) {
		return getBooleanArray(key, null);
	}

	@Override
	public boolean[] getBooleanArray(String key, boolean[] defaultValue) {
		return getBooleanArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public boolean[] getBooleanArray(String key, boolean[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			boolean[] arr2 = new boolean[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = Boolean.parseBoolean(arr[i].trim());
			}
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============byte-array
	// ==============
	@Override
	public byte[] getByteArray(String key) {
		return getByteArray(key, null);
	}

	@Override
	public byte[] getByteArray(String key, byte[] defaultValue) {
		return getByteArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public byte[] getByteArray(String key, byte[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			byte[] arr2 = new byte[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = (byte) Digits.ints.parse(arr[i].trim());
			}
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============short-array
	// ==============
	@Override
	public short[] getShortArray(String key) {
		return getShortArray(key, null);
	}

	@Override
	public short[] getShortArray(String key, short[] defaultValue) {
		return getShortArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public short[] getShortArray(String key, short[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			short[] arr2 = new short[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = (short) Digits.ints.parse(arr[i].trim());
			}
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============int-array
	// ==============
	@Override
	public int[] getIntArray(String key) {
		return getIntArray(key, null);
	}

	@Override
	public int[] getIntArray(String key, int[] defaultValue) {
		return getIntArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public int[] getIntArray(String key, int[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			int[] arr2 = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = Digits.ints.parse(arr[i].trim());
			}
			return arr2;
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============long-array
	// ==============
	@Override
	public long[] getLongArray(String key) {
		return getLongArray(key, null);
	}

	@Override
	public long[] getLongArray(String key, long[] defaultValue) {
		return getLongArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public long[] getLongArray(String key, long[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			long[] arr2 = new long[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = Digits.longs.parse(arr[i].trim());
			}
			return arr2;
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============float-array
	// ==============
	@Override
	public float[] getFloatArray(String key) {
		return getFloatArray(key, null);
	}

	@Override
	public float[] getFloatArray(String key, float[] defaultValue) {
		return getFloatArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public float[] getFloatArray(String key, float[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			float[] arr2 = new float[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = Float.parseFloat(arr[i].trim());
			}
			return arr2;
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============double-array
	// ==============
	@Override
	public double[] getDoubleArray(String key) {
		return getDoubleArray(key, null);
	}

	@Override
	public double[] getDoubleArray(String key, double[] defaultValue) {
		return getDoubleArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public double[] getDoubleArray(String key, double[] defaultValue, String splitRegex) {
		try {
			String[] arr = ((String) handleGetSerializable(key)).split(splitRegex);
			double[] arr2 = new double[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = Double.parseDouble(arr[i].trim());
			}
			return arr2;
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	// ==============
	// ==============String-array
	// ==============
	@Override
	public String[] getStringArray(String key) {
		return getStringArray(key, null);
	}

	@Override
	public String[] getStringArray(String key, String[] defaultValue) {
		return getStringArray(key, defaultValue, getSplitRegex());
	}

	@Override
	public String[] getStringArray(String key, String[] defaultValue, String splitRegex) {
		try {
			String str = ((String) handleGetSerializable(key));
			return str.split(splitRegex);
		} catch (Exception e) {
			if (defaultValue == null) {
				e.printStackTrace();
				return null;
			}
		}
		return defaultValue;
	}

	public final Set<String> getKeys() {
		return getMap().keySet();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Serializable> e : getMap().entrySet()) {
			sb.append(e.getKey() + "=" + e.getValue()).append("\n");
		}
		return sb.toString();
	}

}
