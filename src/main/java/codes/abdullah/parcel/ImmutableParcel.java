package codes.abdullah.parcel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ImmutableParcel extends AbstractParcel {

	private final Map<String, Serializable> m;
	private final boolean throwOnNullGet;
	private final String arrayItemSeparatorPattern;
	
	
	
	public ImmutableParcel(Map<String, Serializable> m, boolean throwOnNullGet, String arrayItemSeparatorPattern) {
		this.m = new HashMap<String, Serializable>(m);
		this.throwOnNullGet = throwOnNullGet;
		this.arrayItemSeparatorPattern = arrayItemSeparatorPattern;
	}

	@Override
	public Parcel throwOnNullGet(boolean enable) {
		return new ImmutableParcel(new HashMap<String, Serializable>(m), throwOnNullGet, arrayItemSeparatorPattern);
	}

	@Override
	public Parcel setArrayItemSeparatorPattern(String pattern) {
		return new ImmutableParcel(new HashMap<String, Serializable>(m), throwOnNullGet, arrayItemSeparatorPattern);
	}

	@Override
	public String getSplitRegex() {
		return arrayItemSeparatorPattern;
	}

	@Override
	public Map<String, Serializable> getMap() {
		return new HashMap<String, Serializable>(m);
	}

	@Override
	public boolean isThrowOnNullGet() {
		return throwOnNullGet;
	}

	@Override
	public Parcel toImmutable() {
		return this;
	}

	@Override
	public Parcel toMutable() {
		return new MutableParcel(new HashMap<String, Serializable>(m), throwOnNullGet, arrayItemSeparatorPattern);
	}

	@Override
	public boolean isImmutable() {
		return true;
	}

	@Override
	Parcel assign(Map<String, Serializable> m) {
		return new ImmutableParcel(m, throwOnNullGet, arrayItemSeparatorPattern);
	}

}
