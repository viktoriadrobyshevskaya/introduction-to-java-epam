package by.jonline.modul03.pattern_matcher.Text;

//отсортировать  абзацы  по  количеству  предложений;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortParagraph {

	public static void sortParagraph(String text) {
		String[] arr = text.split("\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (paragraphCount(arr[i]) > paragraphCount(arr[j])) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (String x : arr) {
			System.out.println(x);
		}
	}

	public static int paragraphCount(String text) {
		int count = 0;
		Matcher matcher = Pattern.compile("[\\.!\\?]").matcher(text);
		while (matcher.find()) {
			count++;
		}
		return count;
	}
	
}
