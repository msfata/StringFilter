/**
 * @author msfata ProgrammingHelp 18/05/2019
 */
public class FilterString {
	/*
	 * filters Upper case Letters
	 */
	public static String getUpperCaseLetters(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
					|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q'
					|| c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y'
					|| c == 'Z' || c == ' ') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * filters letters and numbers
	 */
	public static String getLettersAndNumbers(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
					|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q'
					|| c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y'
					|| c == 'Z' || c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g'
					|| c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o'
					|| c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w'
					|| c == 'x' || c == 'y' || c == 'z' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4'
					|| c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == ' ') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * filters lowercase letters
	 */
	public static String getLowerCaseLetters(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
					|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
					|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
					|| c == 'z' || c == ' ') {
				result += c;
			}
		}
		return result;
	}

	/*
	 * filters numbers
	 */
	public static String getNumbers(String string) {
		String result = "";
		char[] ch = string.toCharArray();
		for (char c : ch) {
			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
					|| c == '9' || c == ' ') {
				result += c;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getNumbers("07a4e2 1-1,1 0 3/3&3"));
		System.out.println(getLowerCaseLetters("mohammed shafiq fata"));
		System.out.println(getUpperCaseLetters("MOskkHdkkAM545M5ED SHAFIQ FATA"));
		System.out.println(getLettersAndNumbers("MO.H,A>.M<,M%ED shafiq FATA"));
	}
}
