package codes.abdullah.parcel;

import java.io.Serializable;
import java.util.Map;

public class MutableParcel extends AbstractParcel {

	private Map<String, Serializable> m;
	private boolean throwOnNullGet;
	private String arrayItemSeparatorPattern;
	
	
	
	public MutableParcel(Map<String, Serializable> m, boolean throwOnNullGet, String arrayItemSeparatorPattern) {
		this.m = m;
		this.throwOnNullGet = throwOnNullGet;
		this.arrayItemSeparatorPattern = arrayItemSeparatorPattern;
	}

	@Override
	public Parcel throwOnNullGet(boolean enable) {
		this.throwOnNullGet = enable;
		return this;
	}

	@Override
	public Parcel setArrayItemSeparatorPattern(String pattern) {
		this.arrayItemSeparatorPattern = pattern;
		return this;
	}

	@Override
	public String getSplitRegex() {
		return arrayItemSeparatorPattern;
	}

	@Override
	public Map<String, Serializable> getMap() {
		return m;
	}

	@Override
	public boolean isThrowOnNullGet() {
		return throwOnNullGet;
	}

	@Override
	public Parcel toImmutable() {
		return new ImmutableParcel(m, throwOnNullGet, arrayItemSeparatorPattern);
	}

	@Override
	public Parcel toMutable() {
		return this;
	}

	@Override
	public boolean isImmutable() {
		return false;
	}

	@Override
	Parcel assign(Map<String, Serializable> m) {
		this.m = m;
		return this;
	}

}
