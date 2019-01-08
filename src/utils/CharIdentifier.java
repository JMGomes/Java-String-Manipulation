package utils;

public class CharIdentifier {
		private char character;
		private int stringId;

		public CharIdentifier(char character, int stringId) {
			this.character = character;
			this.stringId = stringId;
		}

		public char getCharacter() {
			return character;
		}

		public void setCharacter(char character) {
			this.character = character;
		}

		public int getStringId() {
			return stringId;
		}

		public void setStringId(int stringId) {
			this.stringId = stringId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + character;
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
			CharIdentifier other = (CharIdentifier) obj;
			if (character != other.character)
				return false;
			if (stringId != other.stringId)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "CharIdentifier [character=" + character + ", stringId=" + stringId + "]";
		}

	}
