/*
 * –еализуйте метод, позвол€ющий другим методам узнать, откуда их вызвали. ћетод
 * getCallerClassAndMethodName() должен возвращать им€ класса и метода, откуда вызван
 * метод, вызвавший данный утилитный метод. »ли null (нулевую ссылку, а не строку
 * "null"), если метод, вызвавший getCallerClassAndMethodName() €вл€етс€ точкой входа
 * в программу, т.е. его никто не вызывал. Ёто актуально, например, в библиотеках
 * логировани€, где дл€ каждого сообщени€ в логе надо выводить класс и метод, откуда
 * сообщение было залогировано.
 */

package exceptions.introduce;

public class GetCallerClassAndMethodName {
	public static void main(String[] args) {
		System.out.println(getCallerClassAndMethodName());
		anotherMethod();
	}

	private static void anotherMethod() {
		System.out.println(getCallerClassAndMethodName());
	}

	public static String getCallerClassAndMethodName() {
		StackTraceElement[] ste = new Exception().getStackTrace();
		if (ste.length < 3) {
			return null;
		} else {
			return ste[2].getClassName() + "#" + ste[2].getMethodName();
		}
	}
}
