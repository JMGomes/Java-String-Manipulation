package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import utils.CONSTANTS;
import utils.CharCounter;
import utils.CharIdentifier;
import utils.Utils;

public class StringComparatorManager {

	// insert character count in map for a certain string
	private static HashMap<CharIdentifier, Integer> analyseString(String string, int stringId,
			HashMap<CharIdentifier, Integer> hm) {
		for (char c : string.toCharArray()) {
			if (Character.isLowerCase(c)) {
				CharIdentifier ci = new CharIdentifier(c, stringId);
				if (hm.containsKey(ci)) {
					hm.put(ci, hm.get(ci) + 1);
				} else {
					hm.put(ci, 1);
				}
			}
		}

		return hm;
	}

	// get maximum ocurrencies only for every character
	private static HashMap<Character, ArrayList<CharCounter>> getMaximumCounterMap(
			HashMap<CharIdentifier, Integer> hm) {
		HashMap<Character, ArrayList<CharCounter>> res = new HashMap<Character, ArrayList<CharCounter>>();
		for (Entry<CharIdentifier, Integer> pair : hm.entrySet()) {
			char character = pair.getKey().getCharacter();
			int id = pair.getKey().getStringId();
			int occurencies = pair.getValue();

			if (res.containsKey(character)) {
				if (res.get(character).get(0).getOccurencies() < occurencies) {
					ArrayList<CharCounter> aux = new ArrayList<CharCounter>();
					aux.add(new CharCounter(id, occurencies));
					res.put(character, aux);
				} else if (res.get(character).get(0).getOccurencies() == occurencies) {
					res.get(character).add(new CharCounter((char) id, occurencies));
				}
			} else {
				ArrayList<CharCounter> aux = new ArrayList<CharCounter>();
				aux.add(new CharCounter((char) id, occurencies));
				res.put(character, aux);
			}
		}
		return res;
	}

	//extract result in the correct format
	private static String extractResult(HashMap<Character, ArrayList<CharCounter>> hm) {

		// tree set to order string in the correct format
		TreeSet<String> sortedSet = new TreeSet<String>(new StringComparator());
		for (Entry<Character, ArrayList<CharCounter>> pair : hm.entrySet()) {
			StringBuilder sb = new StringBuilder();
			if (pair.getValue().get(0).getOccurencies() == 1)
				continue;
			if (pair.getValue().size() == 1) {
				sb.append(pair.getValue().get(0).getStringId() + CONSTANTS.DELIMITER_SINGLE);
				sb.append(Utils.repeat(pair.getKey(), pair.getValue().get(0).getOccurencies()));
				sortedSet.add(sb.toString());
			} else {
				sb.append(CONSTANTS.DELIMITER_MULTIPLE);
				sb.append(Utils.repeat(pair.getKey(), pair.getValue().get(0).getOccurencies()));
				sortedSet.add(sb.toString());
			}

		}

		//print treeset to string
		StringBuilder sb = new StringBuilder();
		for (String s : sortedSet) {
			sb.append(s);
			sb.append(CONSTANTS.DELIMITER_FINAL_SUBSTRING);
		}
		sb.deleteCharAt(sb.length() - 1);

		return sb.toString();
	}

	public String compareStrings(String string1, String string2) {
		//main map
		HashMap<CharIdentifier, Integer> charStringCounterMap = new HashMap<CharIdentifier, Integer>();

		// analyse first string
		charStringCounterMap = analyseString(string1, 1, charStringCounterMap);
		// analyse second string
		charStringCounterMap = analyseString(string2, 2, charStringCounterMap);

		// get only the maximum occurencies
		HashMap<Character, ArrayList<CharCounter>> finalResult = getMaximumCounterMap(charStringCounterMap);

		// format result
		String res = extractResult(finalResult);
		return res;
	}
}
