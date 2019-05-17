package com.filter.string;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author msfata ProgrammingHelp 18/05/2019
 */
public class FilterString {
	/*
	 * filters uppercase letters
	 */
	private String getUpperCaseLetters(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
					|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q'
					|| c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y'
					|| c == 'Z') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * filters lowercase letters
	 */
	private String getLowerCaseLetters(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
					|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
					|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
					|| c == 'z') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * filters numbers
	 */
	private String getNumbers(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
					|| c == '9') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * test method
	 */
	@Test
	void test() {
		FilterString r = new FilterString();
		assertEquals("FATA", r.getUpperCaseLetters("mohjhe5ammedshafiqF3A2T1Apar5454wany"));
		assertEquals("mohammed", r.getLowerCaseLetters("moTAHShaJSHmme45d"));
		assertEquals("7861", r.getNumbers("m78djftrr6£1"));
	}
}
