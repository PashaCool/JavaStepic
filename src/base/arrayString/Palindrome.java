/*
 * ���������� �����, �����������, �������� �� �������� ������ �����������.
 * ����������� ���������� ������, ������� �������� ��������� ����� ������� � ������
 * ������ (� ��� ����� ������). ��� ����������� "��������������" ������ ������
 * ����������� ������ ����� � �����. � �������, ����� ����������, � ����� �������
 * �������� ������ ��������������. �������������, ��� � ����� �������� ������ ������,
 * ��������� �� �������� ASCII (�����, ��������� �����, ����� ����������).
 * �.�. �������, ��������� � ������ ������������ �������� � ������ �� �����.
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
