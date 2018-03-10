/*
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
 * Палиндромом называется строка, которая читается одинаково слева направо и справа
 * налево (в том числе пустая). При определении "палиндромности" строки должны
 * учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр
 * символов должны игнорироваться. Гарантируется, что в метод попадают только строки,
 * состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
 * Т.е. русских, китайских и прочих экзотических символов в строке не будет.
 */

package base.arrayString;

public class Palindrome {
	/**
	 * Checks if given <code>text</code> is a palindrome.
	 *
	 * @param text any string
	 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
	 */
	public static boolean isPalindrome(String text) {
	     String s1 = text;
	     s1 = s1.replaceAll("[^a-zA-Z0-9]","");
	     String s2 = new String();
	     s2 += s1;
	     StringBuilder s3 = new StringBuilder(s2);
	     s3.reverse();
	     s2 = s3.toString();
	     if (s2.equalsIgnoreCase(s1))
	         return true;
	    else
	        return false;
	}
}
