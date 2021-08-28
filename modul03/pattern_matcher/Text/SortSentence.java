package by.jonline.modul03.pattern_matcher.Text;

import java.util.Arrays;

//в  каждом  предложении  отсортировать  слова  по  длине;

public class SortSentence {

	public static void sortSentence(String text) {
		String[] arr = text.split("\\.");

		for (String x : arr) {
			sortByWordLength(x);
		}
	}

	public static void sortByWordLength(String x) {
		String[] array = x.split("\\s");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].length() > array[j].length()) {
					String tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				} else if (array[i].length() == array[j].length()) {
					if (array[i].charAt(0) > array[j].charAt(0)) {
						String tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;
					} else if (array[i].charAt(0) == array[j].charAt(0)) {
						int k = 0;
						while (k < Math.min(array[i].length(), array[j].length())
								&& array[i].charAt(k) == array[j].charAt(k)) {
							k++;
						}

						if (k < Math.min(array[i].length(), array[j].length())
								&& array[i].charAt(k) > array[j].charAt(k)) {
							String tmp = array[i];
							array[i] = array[j];
							array[j] = tmp;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
