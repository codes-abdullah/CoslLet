package codes.abdullah.parcel;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public interface Parcel extends Immutable<Parcel> {

	public static Parcel of() {
		return new MutableParcel(new HashMap<String, Serializable>(), true, ",");
	}

	public static Parcel of(String resource) {
		return of(new String[] { resource });
	}

	public static Parcel of(String[] resources) {
		Parcel p = of();
		for (String file : resources) {
			String name = file;
			if (file.endsWith(".properties")) {
				int i = file.lastIndexOf(".properties");
				name = file.substring(0, i);
			}
			ResourceBundle rb = ResourceBundle.getBundle(name);
			p.putAll(of(rb));
		}
		return p;
	}

	public static Parcel of(ResourceBundle rb) {
		Parcel p = of();
		rb.getBaseBundleName();
		Enumeration<String> e = rb.getKeys();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			String val = rb.getString(key);
			p.put(key, val);
		}
		return p;
	}

	// ====================

	Parcel putAll(ResourceBundle res);

	Parcel putAll(Parcel par);

	Parcel putAll(Map<String, Serializable> m);

	Parcel put(String key, Serializable val);
	

	Parcel throwOnNullGet(boolean enable);

	Parcel setArrayItemSeparatorPattern(String pattern);

	String getSplitRegex();

	Map<String, Serializable> getMap();

	boolean isThrowOnNullGet();

	// ==============
	// ==============boolean
	// ==============
	boolean getBoolean(String key);

	boolean getBoolean(String key, boolean defaultVal);

	// ==============
	// ==============byte
	// ==============
	byte getByte(String key);

	byte getByte(String key, byte defaultVal);

	// ==============
	// ==============short
	// ==============
	short getShort(String key);

	short getShort(String key, short defaultVal);

	// ==============
	// ==============int
	// ==============
	int getInt(String key);

	int getInt(String key, int defaultVal);

	// ==============
	// ==============long
	// ==============
	long getLong(String key);

	long getLong(String key, long defaultVal);

	// ==============
	// ==============float
	// ==============
	float getFloat(String key);

	float getFloat(String key, float defaultVal);

	// ==============
	// ==============double
	// ==============
	double getDouble(String key);

	double getDouble(String key, double defaultVal);

	String getString(String key);

	String getString(String key, String defaultVal);

	// ==============
	// ==============boolean-array
	// ==============
	boolean[] getBooleanArray(String key);

	boolean[] getBooleanArray(String key, boolean[] defaultValue);

	boolean[] getBooleanArray(String key, boolean[] defaultValue, String splitRegex);

	// ==============
	// ==============byte-array
	// ==============
	byte[] getByteArray(String key);

	byte[] getByteArray(String key, byte[] defaultValue);

	byte[] getByteArray(String key, byte[] defaultValue, String splitRegex);

	// ==============
	// ==============short-array
	// ==============
	short[] getShortArray(String key);

	short[] getShortArray(String key, short[] defaultValue);

	short[] getShortArray(String key, short[] defaultValue, String splitRegex);

	// ==============
	// ==============int-array
	// ==============
	int[] getIntArray(String key);

	int[] getIntArray(String key, int[] defaultValue);

	int[] getIntArray(String key, int[] defaultValue, String splitRegex);

	// ==============
	// ==============long-array
	// ==============
	long[] getLongArray(String key);

	long[] getLongArray(String key, long[] defaultValue);

	long[] getLongArray(String key, long[] defaultValue, String splitRegex);

	// ==============
	// ==============float-array
	// ==============
	float[] getFloatArray(String key);

	float[] getFloatArray(String key, float[] defaultValue);

	float[] getFloatArray(String key, float[] defaultValue, String splitRegex);

	// ==============
	// ==============double-array
	// ==============
	double[] getDoubleArray(String key);

	double[] getDoubleArray(String key, double[] defaultValue);

	double[] getDoubleArray(String key, double[] defaultValue, String splitRegex);

	// ==============
	// ==============String-array
	// ==============
	String[] getStringArray(String key);

	String[] getStringArray(String key, String[] defaultValue);

	String[] getStringArray(String key, String[] defaultValue, String splitRegex);

	// ==============
	// ==============String-array
	// ==============

	public Serializable getSerializable(String key);

	public Serializable getSerializable(String key, Serializable defaultValue);

}