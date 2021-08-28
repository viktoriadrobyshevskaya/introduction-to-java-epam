package by.jonline.modul03.pattern_matcher.XML;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Дана строка, содержащая следующий текст (xml-документ): 
 
<notes> 
   <note id = "1"> 
       <to>Вася</to> 
       <from>Света</from> 
       <heading>Напоминание</heading> 
       <body>Позвони мне завтра!</body> 
   </note> 
   <note id = "2"> 
       <to>Петя</to> 
       <from>Маша</from> 
       <heading>Важное напоминание</heading> 
       <body/> 
   </note> 
</notes> 
 
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий 
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи 
нельзя. 
 */

public class XMLDocument {

	public static void main(String[] args) {
		String xml = "<notes>\n"
				+ "   <note id = \"1\">\n"
				+ "       <to>Вася</to>\n"
				+ "       <from>Света</from>\n"
				+ "       <heading>Напоминание</heading>\n"
				+ "       <body>Позвони мне завтра!</body>\n"
				+ "   </note>\n"
				+ "   <note id = \"2\">\n"
				+ "       <to>Петя</to>\n"
				+ "       <from>Маша</from> \r\n"
				+ "       <heading>Важное напоминание</heading>\n"
				+ "       <body/>\n"
				+ "   </note>\n"
				+ "</notes> ";

		StringBuilder builder = new StringBuilder();

		Pattern open = Pattern.compile("<\\w.+?>");
		Pattern close = Pattern.compile("</\\w.+?>");
		Pattern body = Pattern.compile(">.+?<");
		Pattern empty = Pattern.compile("<\\w.+?/>");

		String[] lines = xml.split("\n");

		for (String x : lines) {
			Matcher m = open.matcher(x);
			Matcher m1 = close.matcher(x);
			Matcher m2 = body.matcher(x);
			Matcher m3 = empty.matcher(x);

			if (m3.find()) {
				builder.append(m3.group());
				builder.append(" - тег без тела\n");
			} else if (m.find()) {
				builder.append(m.group());
				builder.append(" - открывающий тег\n");
			}
			if (m2.find()) {
				builder.append(m2.group().substring(0));
				builder.append(" - содержимое тега\n");
			}
			if (m1.find()) {
				builder.append(m1.group());
				builder.append(" - закрывающий тег\n");
			}


		}

		System.out.println(builder);

	}
}