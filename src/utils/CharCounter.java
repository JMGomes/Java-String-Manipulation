package utils;


public class CharCounter {
	private int stringId;
	private int occurencies;

	public CharCounter(int stringId, int occurencies) {
		this.stringId = stringId;
		this.occurencies = occurencies;
	}

	public int getStringId() {
		return stringId;
	}

	public void setStringId(int stringId) {
		this.stringId = stringId;
	}

	public int getOccurencies() {
		return occurencies;
	}

	public void setOccurencies(int occurencies) {
		this.occurencies = occurencies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + occurencies;
		result = prime * result + stringId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CharCounter other = (CharCounter) obj;
		if (occurencies != other.occurencies)
			return false;
		if (stringId != other.stringId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CharCounter [stringId=" + stringId + ", occurencies=" + occurencies + "]";
	}

}
